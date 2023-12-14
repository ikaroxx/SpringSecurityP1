package com.example.demo.controller;

import com.example.demo.dto.JoinDTO;
import com.example.demo.service.JoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JoinController {
    
    @Autowired
    //나중에 생성자로 바꿔서 주입받자
    private JoinService joinService;
    
    
    @GetMapping("/join")
    public String joinP(){

        return "join";

    }

    @PostMapping("/joinProc")
    public String joinProcess(JoinDTO joinDTO){
        
        // 출력체크
        System.out.println(joinDTO.getUsername());
        joinService.joinProcess(joinDTO);


        return "redirect:/login";

    }

}
