package cn.stylefeng.guns.modular.system.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import cn.stylefeng.guns.modular.system.dao.ChenchaoMapper;
import cn.stylefeng.guns.modular.system.dao.DictMapper;
import cn.stylefeng.guns.modular.system.model.Chenchao;
import cn.stylefeng.guns.modular.system.model.Dict;
import cn.stylefeng.guns.modular.system.service.IChenchaoService;

/**
 * <p>
 *  陈超服务实现类
 * </p>
 *
 * @author cc
 * @Date 2018-12-28 18:11:42
 */
@Service
@Transactional
public class ChenchaoServiceImpl extends ServiceImpl<ChenchaoMapper, Chenchao> implements IChenchaoService {
  
   @Resource
   private ChenchaoMapper chenchaoMapper;
   
   @Resource
   private DictMapper dictMapper;
  
  /*
  *@deprecated  查询
  *@author
  *@Date 2018-12-28 18:11:42
  */
   @Override
   public List<Chenchao> findList(Page<Chenchao> page,Chenchao model){
		Map<String,Object> pMap=new HashMap<String,Object>();
	    pMap.put("orderByField", page.getOrderByField());
		pMap.put("isAsc", page.isAsc());
		List<Chenchao> listReport=this.baseMapper.findList(page,pMap,model);
	    return listReport;
	}

  
  
    /*
  *@deprecated  实体通过数据词典进行封装
  *@author
  *@Date 2018-12-28 18:11:42
  */
  @Override
  public void warpperObj(Object obj){
	  if(obj instanceof Chenchao){
		  Chenchao model=(Chenchao)obj;
		  
		  List<Dict> codeList = dictMapper.selectByCode("");
 loop:	  for(int i=0;i<codeList.size();i++){
			  Dict dict = codeList.get(i);
			  if((dict.getNum()+"").equals("")){
				  
				  break loop;
			  }
		  }
		  
	  }
	  
	  if(obj instanceof List){
		  ArrayList<Chenchao> listChenchao=(ArrayList<Chenchao>)obj;
		  if(null !=listChenchao && listChenchao.size()>0){
			  for(Chenchao model:listChenchao){
				  
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
