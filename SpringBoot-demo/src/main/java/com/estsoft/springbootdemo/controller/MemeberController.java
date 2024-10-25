package com.estsoft.springbootdemo.controller;

import com.estsoft.springbootdemo.repository.Member;
import com.estsoft.springbootdemo.repository.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemeberController {
    private final MemberService service;

    public MemeberController(MemberService service) {
        this.service = service;
    }

    @GetMapping("/members")
    public List<Member> getMembers() {
        return service.getAllMembers();
    }
    // HTTP Post Method 요청(/members) 받는 메소드
    @PostMapping("/members")
    public Member saveMember(@RequestBody Member member) {
        //member저장하는 service코드 호출
        return service.saveMember(member);
    }
}
