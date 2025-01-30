package com.hector.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hector.curso.springboot.webapp.springboot_web.dto.ParamDTO;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    //De esta forma podemos acceder a los valores declarados en el application.properties
    @Value("${config.message}")
    private String message;

    
    @GetMapping("/foo")
    public ParamDTO foo(@RequestParam(required = false, defaultValue = "Hola") String message) {
        ParamDTO param = new ParamDTO();
        param.setMessage(message);

        return param;
    }

    @GetMapping("/bar")
    public ParamDTO bar(@RequestParam Integer code) {
        ParamDTO params = new ParamDTO();
        params.setMessage(message);
        params.setCode(code);

        return params;
    }
    
}
