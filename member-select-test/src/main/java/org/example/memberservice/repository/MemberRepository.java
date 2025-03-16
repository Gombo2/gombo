package org.example.memberservice.repository;

import org.apache.ibatis.annotations.Mapper;
import org.example.memberservice.domain.Member;

import java.util.List;

@Mapper
public interface MemberRepository {
    String findEmailByNameAndPhone(String name, String phoneNumber);

    String findPasswordByNamePhoneAndEmail(String name, String phoneNumber, String email);

    List<Member> findAllMembers();

    Member findMemberById(int id);
}