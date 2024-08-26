package com.gti.sgr.DTO.entitie;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class UsuarioDTO {
    private UUID id;
    private String nome;
    private String login;
    private String email;
    private String role;
    private Boolean status;


}