package com.studiobronze.backend.application.service;


import com.studiobronze.backend.domain.model.Cliente;
import com.studiobronze.backend.domain.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Cliente salvarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void excluirCliente(Long id) {
        clienteRepository.delete(id);
    }

    public Cliente buscarClientePorId(Long id) {
        return clienteRepository.findById(id);
    }
}
