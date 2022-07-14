package com.vendasmichele.crudvendasspring.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Funcionario")
public class FuncionarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdFuncionario")
    private Integer id;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "DataNascimento")
    private LocalDate dataNascimento;
    @Column(name = "Cpf")
    private String cpf;
    @Column(name = "Rg")
    private String rg;
    @Column(name = "Telefone")
    private String telefone;
    @Column(name = "Cidade")
    private String cidade;
    @Column(name = "Estado")
    private String estado;
    @Column(name = "Endereco")
    private String endereco;
}




