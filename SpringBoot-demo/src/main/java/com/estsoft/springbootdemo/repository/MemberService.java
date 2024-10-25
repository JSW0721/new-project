package com.estsoft.springbootdemo.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository reppository;

    /*lomboc으로 대체
    public MemberService(MemberRepository repository) {
        this.reppository = repository;
    }*/

    public List<Member> getAllMembers() {
        return reppository.findAll();// Member 테이블 모든 정보 조회
        //SELECT * FROM member;
    }
    public Member saveMember(Member member) {
        return reppository.save(member);
    }
}
