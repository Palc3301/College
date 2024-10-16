package com.inova.Unifacisa.controllers;

import com.inova.Unifacisa.dtos.EmpresaDTO;
import com.inova.Unifacisa.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @GetMapping
    public List<EmpresaDTO> getAll() {
        return empresaService.findAll();
    }

}