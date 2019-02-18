package cn.stylefeng.guns.modular.system.dao;

import java.util.List;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import cn.stylefeng.guns.modular.system.model.JczxChkbillMes;

/**
 * <p>
 *  billMapper
 * </p>
 *
 * @author Gx
 * @Date 2019-01-19 21:45:32
 */
public interface JczxChkbillMesMapper extends BaseMapper<JczxChkbillMes> {

  /*
  *@deprecated  查询
  *@author
  *@Date 2019-01-19 21:45:32
  */
  public List<JczxChkbillMes> findList(JczxChkbillMes model);

}
