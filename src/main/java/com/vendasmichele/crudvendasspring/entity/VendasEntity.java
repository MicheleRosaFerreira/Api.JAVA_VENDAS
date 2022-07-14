package com.vendasmichele.crudvendasspring.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.vendasmichele.crudvendasspring.dto.VendaDTO;
import com.vendasmichele.crudvendasspring.pagamento.TipoPagamentoEnum;

public class VendasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdVenda")
    private Integer id;
    @Column(name = " idFuncionario")
    private VendaDTO idFuncionario;
    @Column(name = "nomeFuncionario")
    private String nomeFuncionario;
    @Column(name = "DataNascimento")
    private LocalDate dataVenda;
    @Column(name = "FormaPagamento")
    @Enumerated(value = EnumType.STRING)
    private TipoPagamentoEnum formaPagamento;


}
 