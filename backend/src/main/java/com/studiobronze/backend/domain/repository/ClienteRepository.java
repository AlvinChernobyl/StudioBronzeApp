package com.studiobronze.backend.domain.repository;

import com.studiobronze.backend.domain.model.Cliente;
import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface ClienteRepository {


    List<Cliente> findAll();

    Cliente save(Cliente cliente);

    void delete(Long id);

    Cliente findById(Long id);
}

