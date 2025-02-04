package edu.vedoque.seguridadbase.service;

public interface EmailService {
    public void enviarCorreo(String destinatario, String asunto, String mensaje);
}
