package com.inova.Unifacisa.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoticiaDTO {
    private Long id;
    private String titulo;
    private String conteudo;
    private LocalDateTime dataPublicacao;
}