package org.example.memberprofliepage.service;

import org.example.memberprofliepage.domain.ExpAndLevelDTO;
import org.example.memberprofliepage.domain.MemberProfile;
import org.example.memberprofliepage.repository.MemberProfileRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberProfileService {
    private final MemberProfileRepository memberProfileRepository;

    public MemberProfileService(MemberProfileRepository memberProfilePageRepository) {
        this.memberProfileRepository = memberProfilePageRepository;
    }

    public MemberProfile findProfile(int member_id) {
        MemberProfile memberProfile = memberProfileRepository.findByMemberProfileByMemberId(member_id);
        if (memberProfile == null) {
            throw new IllegalArgumentException("id " + member_id + "에 대한 프로필 페이지가 없습니다.");
        }
        return memberProfile;
    }

    public ExpAndLevelDTO findExpAndLevelById(int id) {
        ExpAndLevelDTO expAndLevelDTO = memberProfileRepository.findExpAndLevelById(id);
        if (expAndLevelDTO == null) {
            throw new IllegalArgumentException("id " + id + " 에 대한 경험치, 레벨이 없습니다.");
        }
        return expAndLevelDTO;
    }
}
