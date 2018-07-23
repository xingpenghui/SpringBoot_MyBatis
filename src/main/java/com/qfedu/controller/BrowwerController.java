package com.qfedu.controller;

import com.qfedu.common.vo.R;
import com.qfedu.domain.Browwer;
import com.qfedu.service.BrowwerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/7/23 15:29
 */
//@RestController
    @Controller
public class BrowwerController {
    @Autowired
    private BrowwerService service;
    //新增
    @PostMapping("/browwer")
    @ResponseBody
    public R save(Browwer browwer){
        return service.save(browwer);
    }
    //查询
    @GetMapping("/browwer")
    @ResponseBody
    public List<Browwer> query(){
        return service.qeruyAll();
    }
    //查询
    @GetMapping("/browwertmf")
    public String query(Model model, HttpServletRequest request){
        model.addAttribute("brows",service.qeruyAll());
        //request.setAttribute("brows",service.qeruyAll());
        return "list";
    }
}
