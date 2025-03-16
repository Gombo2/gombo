package org.example.memberprofliepage.service;

import org.example.memberprofliepage.domain.ExpAndLevelDTO;
import org.example.memberprofliepage.domain.MemberProfile;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberProfileServiceTest {

    @Autowired
    private MemberProfileService memberProfileService;

    @Test
    public void testFindProfile() {
        MemberProfile memberProfile = memberProfileService.findProfile(1);
        assertEquals(1, memberProfile.getMemberId());
        System.out.println(memberProfile.toString());
    }

    @Test
    public void testFindExpAndLevel() {
        ExpAndLevelDTO expAndLevelDTO = memberProfileService.findExpAndLevelById(1);
        ExpAndLevelDTO expectedDto = new ExpAndLevelDTO(100, 5);
        assertEquals(expectedDto, expAndLevelDTO);
        System.out.println("expectedDto = " + expectedDto.toString());
    }
}