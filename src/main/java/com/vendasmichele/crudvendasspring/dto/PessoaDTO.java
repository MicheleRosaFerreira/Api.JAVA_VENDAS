package com.vendasmichele.crudvendasspring.dto;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class PessoaDTO  {
    
    private Integer id;
    private String nome;
    private LocalDate dataNascimento;
    private String cpf;
    private String rg;
    private String telefone;
    private String cidade;
    private String estado;
    private String endereco;
    
}
