package com.inova.Unifacisa.controllers;

import com.inova.Unifacisa.dtos.NoticiaDTO;
import com.inova.Unifacisa.services.NoticiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/noticias")
public class NoticiaController {

    @Autowired
    private NoticiaService noticiaService;

    @GetMapping
    public List<NoticiaDTO> getAll() {
        return noticiaService.findAll();
    }

}