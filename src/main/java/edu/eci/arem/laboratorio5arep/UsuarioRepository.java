/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arem.laboratorio5arep;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author 2115253
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,String>{
    
}
