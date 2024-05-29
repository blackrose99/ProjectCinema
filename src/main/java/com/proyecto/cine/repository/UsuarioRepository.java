package com.proyecto.cine.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.proyecto.cine.entity.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

    Usuario findByUserAndPassword(String user, String password);

    Usuario findByUser(String user);

  
}
