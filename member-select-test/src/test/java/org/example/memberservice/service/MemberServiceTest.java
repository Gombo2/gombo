package org.example.memberservice.service;

import org.example.memberservice.domain.Member;
import org.example.memberservice.domain.Status;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MemberServiceTest {

    @Autowired
    private MemberService memberService;

    @Test
    public void testFindEmail() {
        String email = memberService.findEmail("고성연", "010-3791-8329");
        assertEquals("rhtjddus0502@gmail.com", email);
        System.out.println("email = " + email);
    }

    @Test
    public void testFindPassword() {
        String password = memberService.findPassword("고성연", "010-3791-8329", "rhtjddus0502@gmail.com");
        assertEquals("testpassword", password);
        System.out.println("password = " + password);
    }
    
    @Test
    public void testFindAllMember() {
        List<Member> members = memberService.findAllMembers();
        assertEquals(3, members.size());
        System.out.println("members = " + members.toString());
    }

    @Test
    public void testFindMember() {
        Member member = memberService.findMember(1);
        assertEquals(1, member.getId());
        System.out.println("member = " + member.toString());
    }

    @Test
    public void testCheckStatus() {
        Status status = memberService.checkStatus(3);
        assertEquals(Status.ACTIVE, status); // Enum으로 확인
        System.out.println("현재 회원의 상태는: " + status + " 입니다");
    }
}