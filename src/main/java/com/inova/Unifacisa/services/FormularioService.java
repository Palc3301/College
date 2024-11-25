package com.inova.Unifacisa.services;

import com.inova.Unifacisa.dtos.FormularioDTO;
import com.inova.Unifacisa.models.Formulario;
import com.inova.Unifacisa.repositories.FormularioRepository;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class FormularioService {

    @Autowired
    private FormularioRepository formularioRepository;

    @Autowired
    private JavaMailSender mailSender;

    public Formulario salvarFormulario(FormularioDTO formularioDTO) {
        Formulario formulario = new Formulario();
        formulario.setNome(formularioDTO.getNome());
        formulario.setEmail(formularioDTO.getEmail());
        formulario.setMensagem(formularioDTO.getMensagem());
        return formularioRepository.save(formulario);
    }

    public void enviarEmail(FormularioDTO formularioDTO) throws MessagingException {
        var mensagem = mailSender.createMimeMessage();
        var helper = new MimeMessageHelper(mensagem, "utf-8");

        helper.setTo(formularioDTO.getEmail());
        helper.setSubject("Confirmação de Contrato");
        helper.setText("Olá " + formularioDTO.getNome() + ",\n\n" + formularioDTO.getMensagem(), false);

        mailSender.send(mensagem);
    }
}
