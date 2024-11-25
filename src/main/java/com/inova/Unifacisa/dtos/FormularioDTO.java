package com.inova.Unifacisa.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FormularioDTO {
    private String nome;
    private String email;
    private String mensagem;
}
