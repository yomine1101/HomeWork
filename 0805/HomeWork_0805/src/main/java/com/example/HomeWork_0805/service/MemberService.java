package com.example.HomeWork_0805.service;


import com.example.HomeWork_0805.model.MemberData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {

    private List<MemberData> memberList;


    public MemberService(){
        this.memberList = new ArrayList<>();
        memberList.add(new MemberData(1, "Peter", "au3au3222@gmail.com", "a11111password"));
        memberList.add(new MemberData(2, "Mike", "ttqqqqqq@gmail.com", "C1234password"));
    }

    public List<MemberData> getAllMembers(){
        return this.memberList;
    }

    public MemberData getMemberById(int id){
        for(MemberData memberData: this.memberList){
            if(id == memberData.getId()){
                return memberData;
            }
        }
        return null;
    }

    public MemberData createMember(MemberData memberData){
        this.memberList.add(memberData);
        return memberData;
    }

    public MemberData updateMember(int id, MemberData memberData){
        for(MemberData updatedMember:this.memberList){
            if(id == updatedMember.getId()){
                updatedMember.setName(memberData.getName());
                updatedMember.setEmail(memberData.getEmail());
                updatedMember.setPassword(memberData.getPassword());
                return updatedMember;
            }
        }
        return null;
    }

    public MemberData deleteMember(int id){
        for(MemberData memberData:this.memberList){
            if(id == memberData.getId()){
                this.memberList.remove(memberData);
                return memberData;
            }
        }
        return null;
    }
}
