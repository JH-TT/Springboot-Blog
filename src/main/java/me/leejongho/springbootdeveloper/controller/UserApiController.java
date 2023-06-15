package me.leejongho.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import me.leejongho.springbootdeveloper.dto.AddUserRequest;
import me.leejongho.springbootdeveloper.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class UserApiController {

    private final UserService userService;

    @PostMapping("/user")
    public String signup(AddUserRequest request) {
        userService.save(request); // 회원 가입 메서드 호출
        return "redirect:/login";
    }
}
