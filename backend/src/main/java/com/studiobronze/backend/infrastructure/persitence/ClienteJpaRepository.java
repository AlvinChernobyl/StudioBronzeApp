package com.studiobronze.backend.infrastructure.persitence;

import com.studiobronze.backend.domain.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteJpaRepository extends JpaRepository<Cliente, Long> {
}
