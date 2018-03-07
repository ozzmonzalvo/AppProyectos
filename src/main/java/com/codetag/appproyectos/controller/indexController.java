/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetag.appproyectos.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author proy-dim
 */
@Controller

public class indexController {

    private String mensaje = "Bienvenido al sistema de proyectos";

    @GetMapping("/")
    public String index(Map<String, Object> modelo) {
        modelo.put("mensaje", this.mensaje);
        return "index";
    }

}
