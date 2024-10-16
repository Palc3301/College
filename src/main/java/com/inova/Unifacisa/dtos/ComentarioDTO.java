package com.inova.Unifacisa.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComentarioDTO {
    private Long id;
    private Long usuarioId;
    private Long noticiaId;
    private String conteudo;
    private LocalDateTime dataComentario;

}