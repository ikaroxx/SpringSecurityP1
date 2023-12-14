package com.example.demo.controller;

import com.example.demo.dto.JoinDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JoinController {

    @GetMapping("/join")
    public String joinP(){

        return "join";

    }

    @PostMapping("/joinProc")
    public String joinProcess(JoinDTO joinDTO){
        
        // 출력체크
        System.out.println(joinDTO.getUsername());


        return "redirect:/login";

    }

}
