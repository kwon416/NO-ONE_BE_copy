package com.techconnection.noone.biz.user.controller;

import com.techconnection.noone.biz.content.dto.ContentModel;
import com.techconnection.noone.biz.user.dto.UserDtoRes;
import com.techconnection.noone.biz.user.service.UserService;
import com.techconnection.noone.common.dto.PageEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("/cms/user")
public class UserAdminController {

    private final UserService userService;

    @GetMapping(path = {"", "/"})
    public String index(Pageable pageable, Model model) throws Exception {
//        UserDtoRes.UserRes userRes = userService.getUser();
//        log.info("# userRes = {}", userRes);
//        model.addAttribute("userRes", userRes);
        return "noone/user/index";
    }
}
