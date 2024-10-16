package com.inova.Unifacisa.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AvaliacaoDTO {
    private Long id;
    private Long usuarioId;
    private Long empresaId;
    private int nota;
    private String comentario;
    private LocalDateTime dataAvaliacao;

}