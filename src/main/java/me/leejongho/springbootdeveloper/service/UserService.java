package me.leejongho.springbootdeveloper.service;


import lombok.RequiredArgsConstructor;
import me.leejongho.springbootdeveloper.domain.User;
import me.leejongho.springbootdeveloper.dto.AddUserRequest;
import me.leejongho.springbootdeveloper.repsitory.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public Long save(AddUserRequest dto) {
        return userRepository.save(User.builder()
                .email(dto.getEmail())
                // 패스워드 암호화
                .password(bCryptPasswordEncoder.encode(dto.getPassword()))
                .build()).getId();
    }


}