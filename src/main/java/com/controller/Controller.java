package com.controller;


import com.pojo.BaseResult;
import com.service.getProbServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
@RequestMapping("/do")
public class Controller {
    @Autowired
    private getProbServiceImpl getProbService;
    @ResponseBody
    @RequestMapping("/getProb")
    public BaseResult getProb(){
        return new BaseResult().builder()
                .data(getProbService.getProb())
                .total(getProbService.getProb().size())
                .code("success")
                .build();
    }
}
