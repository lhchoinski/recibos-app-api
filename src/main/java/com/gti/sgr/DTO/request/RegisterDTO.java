package com.gti.sgr.DTO.request;

import com.gti.sgr.enums.UserRole;

public record RegisterDTO(

        String nome,
        String login,
        String email,
        String password,
        UserRole role) {
}
