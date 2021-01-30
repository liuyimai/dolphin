package com.mozi.pink.dolphin.controller;

import com.mozi.pink.dolphin.model.Term;
import com.mozi.pink.dolphin.service.TermService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: liuyimai
 * @Date: 2021/1/30/0030 20:01
 * @Desc:
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TermService termService;

    @RequestMapping(value = "info", method = {RequestMethod.GET, RequestMethod.POST})
    public String getInfo() {
        return "success";
    }

    @RequestMapping(value = "listTerms", method = {RequestMethod.GET, RequestMethod.POST})
    public List<Term> listTerms() {
        List<Term> terms = termService.listTerms();
        return terms;
    }

}
