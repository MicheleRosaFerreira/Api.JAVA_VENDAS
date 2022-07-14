package com.vendasmichele.crudvendasspring.service;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vendasmichele.crudvendasspring.dto.ClienteDTO;
import com.vendasmichele.crudvendasspring.entity.ClienteEntity;
import com.vendasmichele.crudvendasspring.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public ClienteEntity cadastrar(ClienteDTO cliente){
       
        String nome = cliente.getNome();
        LocalDate dataNascimento = cliente.getDataNascimento();
        String cpf = cliente.getCpf();
        String rg = cliente.getRg();
        String telefone = cliente.getTelefone();
        String cidade = cliente.getCidade();
        String estado = cliente.getEstado();
        String endereco = cliente.getEndereco();
       
       ClienteEntity clienteParaSalvar = new ClienteEntity();
       clienteParaSalvar.setNome(nome); 
       clienteParaSalvar.setDataNascimento(dataNascimento); 
       clienteParaSalvar.setCpf(cpf); 
       clienteParaSalvar.setRg(rg); 
       clienteParaSalvar.setTelefone(telefone); 
       clienteParaSalvar.setCidade(cidade); 
       clienteParaSalvar.setEstado(estado); 
       clienteParaSalvar.setEndereco(endereco); 

       return clienteRepository.save(clienteParaSalvar);
    }

    public ClienteDTO buscarPorId(String id){

        ClienteEntity cliente = clienteRepository.findById(Integer.valueOf(id)).get();
        ClienteDTO clienteretorno = new ClienteDTO();
        clienteretorno.setId(cliente.getId());
        clienteretorno.setNome(cliente.getNome());
        clienteretorno.setDataNascimento(cliente.getDataNascimento());
        clienteretorno.setCpf(cliente.getCpf());
        clienteretorno.setRg(cliente.getRg());
        clienteretorno.setTelefone(cliente.getTelefone());
        clienteretorno.setCidade(cliente.getCidade());
        clienteretorno.setEstado(cliente.getEstado());
        clienteretorno.setEndereco(cliente.getEndereco());

        return clienteretorno;
    }

    public void deletarPorId(Integer id){

         if(clienteRepository.existsById(id)){
          clienteRepository.deleteById(id);
    }

    }

    
}
