package controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class Controller {
    @RequestMapping(value = "/jenkins", method = RequestMethod.GET)
    public void viewBusiness() {
        System.out.println("hello world 2");
    }
}
