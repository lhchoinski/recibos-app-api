package com.gti.sgr.DTO.request;

import com.gti.sgr.enums.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
