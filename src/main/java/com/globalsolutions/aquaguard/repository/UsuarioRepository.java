package com.globalsolutions.aquaguard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globalsolutions.aquaguard.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
