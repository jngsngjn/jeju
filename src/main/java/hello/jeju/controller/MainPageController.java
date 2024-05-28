package hello.jeju.controller;

import hello.jeju.dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Member;

@RestController
public class MainPageController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {

        MemberDTO memberDTO = new MemberDTO(123456,"sm","smkim060811@gmail.com","010-1234-5678","USER");

        return memberDTO.toString();
    }
}
