package hello.jeju.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jeju")
public class TestController {

    @GetMapping("/hello")
    public String test() {
        return "hello";
    }

    @GetMapping("/oauth2/authorization/naver")
    public String test2(){
        return "naver";
    }
}