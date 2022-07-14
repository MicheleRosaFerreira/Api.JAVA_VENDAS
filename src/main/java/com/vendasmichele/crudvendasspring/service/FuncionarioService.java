package com.vendasmichele.crudvendasspring.service;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vendasmichele.crudvendasspring.dto.FuncionarioDTO;
import com.vendasmichele.crudvendasspring.entity.FuncionarioEntity;
import com.vendasmichele.crudvendasspring.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

@Autowired
FuncionarioRepository funcionarioRepository;

public FuncionarioEntity cadastrarFuncionario(FuncionarioDTO funcionario){
    
    String nome = funcionario.getNome();
    LocalDate dataNascimento = funcionario.getDataNascimento();
    String cpf = funcionario.getCpf();
    String rg = funcionario.getRg();
    String telefone = funcionario.getTelefone();
    String cidade = funcionario.getCidade();
    String estado = funcionario.getEstado();
    String endereco = funcionario.getEndereco();

    FuncionarioEntity novoFuncionario = new FuncionarioEntity();
    novoFuncionario.setNome(nome);
    novoFuncionario.setDataNascimento(dataNascimento);
    novoFuncionario.setCpf(cpf);
    novoFuncionario.setRg(rg);
    novoFuncionario.setTelefone(telefone);
    novoFuncionario.setCidade(cidade);
    novoFuncionario.setEstado(estado);
    novoFuncionario.setEndereco(endereco);

    return funcionarioRepository.save(novoFuncionario);
}
    
    public FuncionarioDTO buscarPorId(String id){
    FuncionarioEntity funcionario = funcionarioRepository.findById(Integer.valueOf(id)).get();
    FuncionarioDTO funcionarioRetorno = new FuncionarioDTO();
    funcionarioRetorno.setId(funcionario.getId());
    funcionarioRetorno.setNome(funcionario.getNome());
    funcionarioRetorno.setDataNascimento(funcionario.getDataNascimento());
    funcionarioRetorno.setCpf(funcionario.getCpf());
    funcionarioRetorno.setRg(funcionario.getRg());
    funcionarioRetorno.setTelefone(funcionario.getTelefone());
    funcionarioRetorno.setCidade(funcionario.getCidade());
    funcionarioRetorno.setEstado(funcionario.getEstado());
    funcionarioRetorno.setEndereco(funcionario.getEndereco());
    
    return funcionarioRetorno;
    }

    public void deletarPorId(Integer id){

        if(funcionarioRepository.existsById(id)){
         funcionarioRepository.deleteById(id);
   
        }
}
}

