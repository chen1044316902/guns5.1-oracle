package cn.stylefeng.guns.modular.system.controller;

import cn.stylefeng.roses.core.base.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import cn.stylefeng.guns.core.log.LogObjectHolder;
import org.springframework.web.bind.annotation.RequestParam;
import cn.stylefeng.guns.modular.system.model.JczxChkbillMes;
import cn.stylefeng.guns.modular.system.service.IJczxChkbillMesService;

/**
 * bill控制器
 *
 * @author fengshuonan
 * @Date 2019-01-19 21:45:31
 */
@Controller
@RequestMapping("/jczxChkbillMes")
public class JczxChkbillMesController extends BaseController {

    private String PREFIX = "/system/jczxChkbillMes/";

    @Autowired
    private IJczxChkbillMesService jczxChkbillMesService;

    /**
     * 跳转到bill首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "jczxChkbillMes.html";
    }

    /**
     * 跳转到添加bill
     */
    @RequestMapping("/jczxChkbillMes_add")
    public String jczxChkbillMesAdd() {
        return PREFIX + "jczxChkbillMes_add.html";
    }

    /**
     * 跳转到修改bill
     */
    @RequestMapping("/jczxChkbillMes_update/{jczxChkbillMesId}")
    public String jczxChkbillMesUpdate(@PathVariable String jczxChkbillMesId, Model model) {
        JczxChkbillMes jczxChkbillMes = jczxChkbillMesService.selectById(jczxChkbillMesId);
        model.addAttribute("item",jczxChkbillMes);
        model.addAttribute("display",""); 
        LogObjectHolder.me().set(jczxChkbillMes);
        return PREFIX + "jczxChkbillMes_edit.html";
    }
    /**
     * 跳转到详情bill
     */
    @RequestMapping("/jczxChkbillMes_detail/{jczxChkbillMesId}")
    public String jczxChkbillMesDetail(@PathVariable String jczxChkbillMesId, Model model) {
        JczxChkbillMes jczxChkbillMes = jczxChkbillMesService.selectById(jczxChkbillMesId);
        model.addAttribute("item",jczxChkbillMes);
        model.addAttribute("display","none"); 
        return PREFIX + "jczxChkbillMes_edit.html";
    }

    /**
     * 获取bill列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(JczxChkbillMes jczxChkbillMes) {
        return jczxChkbillMesService.findList(jczxChkbillMes);
    }

    /**
     * 新增bill
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(JczxChkbillMes jczxChkbillMes) {
        jczxChkbillMesService.insert(jczxChkbillMes);
        return SUCCESS_TIP;
    }

    /**
     * 删除bill
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam String jczxChkbillMesId) {
        jczxChkbillMesService.deleteById(jczxChkbillMesId);
        return SUCCESS_TIP;
    }

    /**
     * 修改bill
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(JczxChkbillMes jczxChkbillMes) {
        jczxChkbillMesService.updateById(jczxChkbillMes);
        return SUCCESS_TIP;
    }

    /**
     * bill详情
     */
    @RequestMapping(value = "/detail/{jczxChkbillMesId}")
    @ResponseBody
    public Object detail(@PathVariable("jczxChkbillMesId") String jczxChkbillMesId) {
        return jczxChkbillMesService.selectById(jczxChkbillMesId);
    }
}
