package com.metalindustrias.correospdfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InicioController {
    
    @RequestMapping("/")
    public String inicio(Model model){
        return "index";
    }

    @RequestMapping("/param_estado_cuenta")
    public String param(@RequestParam(name="reportecobranza") String reportecobranza, Model model){
        model.addAttribute("codigo", "reportecobranza"+reportecobranza+".pdf");
        return "index";
    }
}
