package cn.stylefeng.guns.modular.system.controller;

import cn.stylefeng.roses.core.base.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baomidou.mybatisplus.plugins.Page;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.stylefeng.guns.core.common.constant.factory.PageFactory;
import cn.stylefeng.guns.core.common.page.PageInfoBT;
import cn.stylefeng.guns.core.log.LogObjectHolder;
import org.springframework.web.bind.annotation.RequestParam;
import cn.stylefeng.guns.modular.system.model.Chenchao;
import cn.stylefeng.guns.modular.system.model.OperationLog;
import cn.stylefeng.guns.modular.system.service.IChenchaoService;

/**
 * 陈超控制器
 *
 * @author fengshuonan
 * @Date 2018-12-28 18:11:42
 */
@Controller
@RequestMapping("/chenchao")
public class ChenchaoController extends BaseController {

    private String PREFIX = "/system/chenchao/";

    @Autowired
    private IChenchaoService chenchaoService;

    /**
     * 跳转到陈超首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "chenchao.html";
    }

    /**
     * 跳转到添加陈超
     */
    @RequestMapping("/chenchao_add")
    public String chenchaoAdd() {
        return PREFIX + "chenchao_add.html";
    }

    /**
     * 跳转到修改陈超
     */
    @RequestMapping("/chenchao_update/{chenchaoId}")
    public String chenchaoUpdate(@PathVariable String chenchaoId, Model model) {
        Chenchao chenchao = chenchaoService.selectById(chenchaoId);
        model.addAttribute("item",chenchao);
        model.addAttribute("display","none"); 
        LogObjectHolder.me().set(chenchao);
        return PREFIX + "chenchao_edit.html";
    }
    /**
     * 跳转到详情陈超
     */
    @RequestMapping("/chenchao_detail/{chenchaoId}")
    public String chenchaoDetail(@PathVariable String chenchaoId, Model model) {
        Chenchao chenchao = chenchaoService.selectById(chenchaoId);
        model.addAttribute("item",chenchao);
        model.addAttribute("display","none"); 
        return PREFIX + "chenchao_edit.html";
    }

    /**
     * 获取陈超列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(Chenchao chenchao) {
	 	Page<Chenchao> page = new PageFactory<Chenchao>().defaultPage();
    	List<Chenchao> findList = chenchaoService.findList(page,chenchao);
    	page.setRecords(findList);
    	return new PageInfoBT<>(page);
    }

    /**
     * 新增陈超
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(Chenchao chenchao) {
        chenchaoService.insert(chenchao);
        return SUCCESS_TIP;
    }

    /**
     * 删除陈超
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam String chenchaoId) {
        chenchaoService.deleteById(chenchaoId);
        return SUCCESS_TIP;
    }

    /**
     * 修改陈超
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(Chenchao chenchao) {
        chenchaoService.updateById(chenchao);
        return SUCCESS_TIP;
    }

    /**
     * 陈超详情
     */
    @RequestMapping(value = "/detail/{chenchaoId}")
    @ResponseBody
    public Object detail(@PathVariable("chenchaoId") String chenchaoId) {
        return chenchaoService.selectById(chenchaoId);
    }
}
