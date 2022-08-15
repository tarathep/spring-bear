package com.tarathep.springbear;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BearController {
    @Autowired
    BearService bearService;

    @RequestMapping("/")
    @ResponseBody
    public String SayMessage(){
        bearService = new BearService(new Bear());
        return bearService.say();
    }
}
