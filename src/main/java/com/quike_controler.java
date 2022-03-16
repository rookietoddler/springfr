package com;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class quike_controler {

    @RequestMapping("/quike")
    @ResponseBody
    public String quike() {

        return "Hello  Springboot!";
    }
}
