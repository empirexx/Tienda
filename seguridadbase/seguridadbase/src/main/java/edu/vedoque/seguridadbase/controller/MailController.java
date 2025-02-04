package edu.vedoque.seguridadbase.controller;

import edu.vedoque.seguridadbase.entity.Alumno;
import edu.vedoque.seguridadbase.repository.RepositoryAlumno;
import edu.vedoque.seguridadbase.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MailController {
    @Autowired
    private RepositoryAlumno repoAlumno;
    @Autowired
    private EmailService emailService;

    @GetMapping("/pruebacorreo")
    public String pruebaCorreo(){
        for(Alumno alumno:repoAlumno.findAll()){
            emailService.enviarCorreo(alumno.getEmail(), "Tienes muchas faltas", "Cuidado que viene");
        }
        return "redirect:/";
    }
}
