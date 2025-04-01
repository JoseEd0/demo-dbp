package org.example.semana2_demo.application;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/mensaje-bienvenida")
    public String getMensajeBienvenida() {
        return "¡Bienvenidos a Desarrollo Basado en Plataformas (DBP)! Este endpoint devuelve un saludo de bienvenida.";
    }

    @GetMapping("/mensaje-despedida")
    public String getMensajeDespedida() {
        return "¡Adiós desde DBP! Este endpoint devuelve un mensaje de despedida.";
    }

    @GetMapping("/estado-aplicacion")
    public String getEstadoAplicacion() {
        return "Estado: OK. Este endpoint devuelve el estado actual de la aplicación.";
    }

    @GetMapping("/enlaces")
    public String getEnlaces() {
        return "<html>" +
                "<body>" +
                "<h1>Enlaces a otros endpoints</h1>" +
                "<ul>" +
                "<li><a href='/demo/mensaje-bienvenida'>Mensaje de Bienvenida</a></li>" +
                "<li><a href='/demo/mensaje-despedida'>Mensaje de Despedida</a></li>" +
                "<li><a href='/demo/estado-aplicacion'>Estado de la Aplicación</a></li>" +
                "</ul>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/response-entity")
    public ResponseEntity<String> getResponseEntity() {
        return new ResponseEntity<>("¡Hola desde DBP! Este endpoint devuelve un saludo de bienvenida.", HttpStatus.OK);
    }
}