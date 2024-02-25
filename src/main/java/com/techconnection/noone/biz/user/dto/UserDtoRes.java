package com.techconnection.noone.biz.user.dto;

import com.techconnection.noone.biz.user.domain.User;
import lombok.*;

public class UserDtoRes {
    @Getter
    @Setter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class TokenDto {
        private String access_token;
        private String refresh_token;
        private String name;
        private String email;
        private Long userId;
    }

    @Getter
    public static class UserRes {
        private String email;

        private String name;

        private String phone;

        private Integer point;

        @Builder
        public UserRes(User user) {
            this.email = user.getEmail();
            this.name = user.getName();
            this.phone = user.getPhone();
            this.point = user.getPoint();
        }
    }
}
