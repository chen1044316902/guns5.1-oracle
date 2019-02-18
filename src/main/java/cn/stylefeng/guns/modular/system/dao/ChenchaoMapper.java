package cn.stylefeng.guns.modular.system.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;

import java.util.List;
import cn.stylefeng.guns.modular.system.model.Chenchao;

/**
 * <p>
 *  陈超Mapper
 * </p>
 *
 * @author Gx
 * @Date 2018-12-28 18:11:42
 */
public interface ChenchaoMapper extends BaseMapper<Chenchao> {

  /*
  *@deprecated  查询
  *@author
  *@Date 2018-12-28 18:11:42
  */
	public List<Chenchao> findList(@Param("page")Page<Chenchao> page,@Param("pageMap")Map<String,Object> pageMap,@Param("model")Chenchao model);

}
