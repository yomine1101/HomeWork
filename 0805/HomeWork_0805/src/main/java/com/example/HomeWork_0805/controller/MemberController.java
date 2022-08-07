package com.example.HomeWork_0805.controller;

import com.example.HomeWork_0805.model.MemberData;
import com.example.HomeWork_0805.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    MemberService memberService;

    @GetMapping
    public List<MemberData> getAllMembers(){
        List<MemberData> memberList = this.memberService.getAllMembers();
        return memberList;
    }

    @GetMapping("/{id}")
    public MemberData getMemberById(@PathVariable int id){
        MemberData getMember = this.memberService.getMemberById(id);
        return getMember;
    }


    @PostMapping()
    public MemberData createMember(@RequestBody MemberData memberData){
        MemberData createdMember = this.memberService.createMember(memberData);
        return createdMember;
    }

    @PutMapping("/{id}")
    public MemberData updateMember(@PathVariable int id,@RequestBody MemberData memberData) {
        MemberData updatedMember = this.memberService.updateMember(id, memberData);
        return updatedMember;
    }

    @DeleteMapping("/{id}")
    public MemberData deleteMember(@PathVariable int id){
        MemberData deletedMember = this.memberService.deleteMember(id);
        return deletedMember;
    }
}
