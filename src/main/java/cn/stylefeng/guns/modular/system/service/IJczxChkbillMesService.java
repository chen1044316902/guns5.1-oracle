package cn.stylefeng.guns.modular.system.service;

import java.util.List;
import com.baomidou.mybatisplus.service.IService;
import cn.stylefeng.guns.modular.system.model.JczxChkbillMes;

/**
 * <p>
 *  bill服务类
 * </p>
 *
 * @author Gx
 * @Date 2019-01-19 21:45:32
 */
public interface IJczxChkbillMesService extends IService<JczxChkbillMes> {
  
  /*
  *@deprecated  查询
  *@author
  *@Date 2019-01-19 21:45:32
  */
  public List<JczxChkbillMes> findList(JczxChkbillMes model);
  
  
  
 /*@deprecated  通过数据词典封装实体类数据
  *@author
  *@Date 2019-01-19 21:45:32
  *@param obj  传入对象  直接生成的经支持本类对象和本类对象的list
  */
  public void warpperObj(Object obj);

}
