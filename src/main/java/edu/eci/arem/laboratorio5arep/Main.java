/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arem.laboratorio5arep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 2115253
 */
@RestController
public class Main {
    @Autowired
    static UsuarioRepository usr;
    
    
    public static void main(String[] args){
          System.out.println(usr);
          
    }
}
