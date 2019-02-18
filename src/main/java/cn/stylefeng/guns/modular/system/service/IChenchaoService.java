package cn.stylefeng.guns.modular.system.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;

import cn.stylefeng.guns.modular.system.model.Chenchao;

/**
 * <p>
 *  陈超服务类
 * </p>
 *
 * @author Gx
 * @Date 2018-12-28 18:11:42
 */
public interface IChenchaoService extends IService<Chenchao> {
  
  /*
  *@deprecated  查询
  *@author
  *@Date 2018-12-28 18:11:42
  */
	public List<Chenchao> findList(Page<Chenchao> page,Chenchao model);
  
  
  
 /*@deprecated  通过数据词典封装实体类数据
  *@author
  *@Date 2018-12-28 18:11:42
  *@param obj  传入对象  直接生成的经支持本类对象和本类对象的list
  */
  public void warpperObj(Object obj);

}
