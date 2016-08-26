package org.springframework.sandbox.mvc;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class TestController {

    @RequestMapping(value="/foo", produces = "text/html; charset=utf-8")
    @ResponseBody 
    public String getShopInJSON(HttpServletRequest request) {
        return "{\"hello\":\"world\"}";
    }

}
