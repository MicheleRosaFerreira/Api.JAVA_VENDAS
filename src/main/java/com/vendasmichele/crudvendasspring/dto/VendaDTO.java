package com.vendasmichele.crudvendasspring.dto;

import java.time.LocalDate;

import com.vendasmichele.crudvendasspring.pagamento.TipoPagamentoEnum;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class VendaDTO {

    private Integer idVenda;
    private Integer idFuncionario;
    private String nomeFuncionario;
    private LocalDate dataVenda;
    private TipoPagamentoEnum formaPagamento;

}
