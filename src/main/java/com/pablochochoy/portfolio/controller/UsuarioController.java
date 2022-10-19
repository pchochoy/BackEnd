/*
package com.pablochochoy.portfolio.controller;

import com.pablochochoy.portfolio.model.UsuarioCopia;
import com.pablochochoy.portfolio.service.IUsuarioService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    
    @Autowired
    private IUsuarioService usuServ;
    
    @CrossOrigin(origins="http://localhost:4200/")
    @PostMapping("/login")
    public Map Login(@RequestBody UsuarioCopia usuario) {
        System.out.println("BackEnd LLego a Login de UsuarioController " + "Usuario :" + usuario.getUsuario() + "Paswword : " + usuario.getPassword() + "Token" + usuario.getNotificationToken());
        return usuServ.Login(usuario.getUsuario(), usuario.getPassword());
    }
    
}
*/