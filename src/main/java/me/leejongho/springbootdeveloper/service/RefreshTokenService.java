package me.leejongho.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.leejongho.springbootdeveloper.domain.RefreshToken;
import me.leejongho.springbootdeveloper.repsitory.RefreshTokenRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RefreshTokenService {

    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken findByRefreshToken(String refreshToken) {
        return refreshTokenRepository.findByRefreshToken(refreshToken)
                .orElseThrow(() -> new IllegalArgumentException("Unexpected token"));
    }
}
