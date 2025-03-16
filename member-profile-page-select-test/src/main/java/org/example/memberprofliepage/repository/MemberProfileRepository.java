package org.example.memberprofliepage.repository;

import org.apache.ibatis.annotations.Mapper;
import org.example.memberprofliepage.domain.ExpAndLevelDTO;
import org.example.memberprofliepage.domain.MemberProfile;

@Mapper
public interface MemberProfileRepository {
    MemberProfile findByMemberProfileByMemberId(int memberId);

    ExpAndLevelDTO findExpAndLevelById(int Id);
}
