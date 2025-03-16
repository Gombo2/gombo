package org.example.memberservice.service;

import org.example.memberservice.domain.Member;
import org.example.memberservice.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public String findEmail(String name, String phoneNumber) {
        String email = memberRepository.findEmailByNameAndPhone(name, phoneNumber);
        if (email == null) {
            throw new IllegalArgumentException("일치하는 회원이 없습니다.");
        }
        return email;
    }

    public String findPassword(String name, String phoneNumber, String email) {
        String password = memberRepository.findPasswordByNamePhoneAndEmail(name, phoneNumber, email);
        if (password == null) {
            throw new IllegalArgumentException("일치하는 회원이 없습니다.");
        }
        return password;
    }

    public List<Member> findAllMembers() {
        List<Member> members = memberRepository.findAllMembers();
        if (members.isEmpty()) {
            throw new IllegalStateException("회원이 존재하지 않습니다.");
        }
        return members;
    }

    public Member findMember(int id) {
        Member member = memberRepository.findMemberById(id);
        if(member == null) {
            throw new IllegalArgumentException("해당 회원이 존재하지 않습니다.");
        }
        return member;
    }
}