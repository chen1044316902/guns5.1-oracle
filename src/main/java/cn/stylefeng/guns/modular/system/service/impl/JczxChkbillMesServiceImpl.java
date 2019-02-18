package cn.stylefeng.guns.modular.system.service.impl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.transaction.annotation.Transactional;
import cn.stylefeng.guns.modular.system.model.Dict;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.stylefeng.guns.modular.system.model.JczxChkbillMes;
import cn.stylefeng.guns.modular.system.dao.JczxChkbillMesMapper;
import cn.stylefeng.guns.modular.system.dao.DictMapper;
import cn.stylefeng.guns.modular.system.service.IJczxChkbillMesService;

/**
 * <p>
 *  bill服务实现类
 * </p>
 *
 * @author cc
 * @Date 2019-01-19 21:45:32
 */
@Service
@Transactional
public class JczxChkbillMesServiceImpl extends ServiceImpl<JczxChkbillMesMapper, JczxChkbillMes> implements IJczxChkbillMesService {
  
   @Resource
   private JczxChkbillMesMapper jczxChkbillMesMapper;
   
   @Resource
   private DictMapper dictMapper;
  
  /*
  *@deprecated  查询
  *@author
  *@Date 2019-01-19 21:45:32
  */
  public List<JczxChkbillMes> findList(JczxChkbillMes model){
  	  List<JczxChkbillMes> listJczxChkbillMes =jczxChkbillMesMapper.findList(model);
	  warpperObj(listJczxChkbillMes);
      return listJczxChkbillMes;
  }
  
  
    /*
  *@deprecated  实体通过数据词典进行封装
  *@author
  *@Date 2019-01-19 21:45:32
  */
  @Override
  public void warpperObj(Object obj){
	  if(obj instanceof JczxChkbillMes){
		  JczxChkbillMes model=(JczxChkbillMes)obj;
		  
		  List<Dict> codeList = dictMapper.selectByCode("");
 loop:	  for(int i=0;i<codeList.size();i++){
			  Dict dict = codeList.get(i);
			  if((dict.getNum()+"").equals("")){
				  
				  break loop;
			  }
		  }
		  
	  }
	  
	  if(obj instanceof List){
		  ArrayList<JczxChkbillMes> listJczxChkbillMes=(ArrayList<JczxChkbillMes>)obj;
		  if(null !=listJczxChkbillMes && listJczxChkbillMes.size()>0){
			  for(JczxChkbillMes model:listJczxChkbillMes){
				  
				  List<Dict> codeList = dictMapper.selectByCode("");
		 loop:	  for(int i=0;i<codeList.size();i++){
					  Dict dict = codeList.get(i);
					  if((dict.getNum()+"").equals("")){
						  
						  break loop;
					  }
				  }
				  
				  
			  }
		  }
	  }
  }

}
