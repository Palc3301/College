package com.inova.Unifacisa.services;

import com.inova.Unifacisa.dtos.NoticiaDTO;
import com.inova.Unifacisa.models.Noticia;
import com.inova.Unifacisa.repositories.NoticiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NoticiaService {

    @Autowired
    private NoticiaRepository noticiaRepository;

    public List<NoticiaDTO> findAll() {
        return noticiaRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private NoticiaDTO convertToDTO(Noticia noticia) {
        NoticiaDTO dto = new NoticiaDTO();
        dto.setId(noticia.getId());
        dto.setTitulo(noticia.getTitulo());
        dto.setConteudo(noticia.getConteudo());
        dto.setDataPublicacao(noticia.getDataPublicacao());
        return dto;
    }

}