package com.whh.com.whh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * SpringfoxDemo
 * Created by xuzhuo on 2017/8/8.
 */
@Controller
@RequestMapping("swagger-ui")
public class SwaggerUIController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "redirect:/static/swagger-ui/index.html";
    }
}
