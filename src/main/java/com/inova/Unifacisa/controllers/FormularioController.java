package com.inova.Unifacisa.controllers;

import com.inova.Unifacisa.dtos.FormularioDTO;
import com.inova.Unifacisa.models.Formulario;
import com.inova.Unifacisa.services.FormularioService;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/formulario")
public class FormularioController {

    @Autowired
    private FormularioService formularioService;

    @PostMapping
    public ResponseEntity<Formulario> salvarFormulario(@RequestBody FormularioDTO formularioDTO) {
        Formulario formulario = formularioService.salvarFormulario(formularioDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(formulario);
    }

    @PostMapping("/enviar-email")
    public ResponseEntity<Void> enviarEmail(@RequestBody FormularioDTO formularioDTO) {
        try {
            formularioService.enviarEmail(formularioDTO);
            return ResponseEntity.noContent().build();
        } catch (MessagingException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
}
