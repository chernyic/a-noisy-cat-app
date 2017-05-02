package com.panxing.cat.controller;


import com.panxing.cat.service.ITestService;
import com.panxing.cat.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/test")
public class TestController {


    @Resource(name = "testService")
    private ITestService testService;


    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public Result test() {
        return testService.test();
    }


}
