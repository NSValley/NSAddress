package com.address.controller;

import com.address.domain.Member;
import com.address.repository.MemberRepo;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 1004w455 on 2016. 10. 14..
 */
@Slf4j
@RestController
public class BaseCtrl {

    @Autowired
    private MemberRepo memberRepo;

    private static final Gson GSON = new Gson();

    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }

    @RequestMapping(value = "/api/member", method = RequestMethod.GET)
    public List<Member> searchAll() {
        return memberRepo.findAll();
    }

    @RequestMapping(value = "/api/member/id/{memberId}", method = RequestMethod.GET)
    public Member searchMember(@PathVariable Long memberId) {
        return memberRepo.findOne(memberId);
    }

}
