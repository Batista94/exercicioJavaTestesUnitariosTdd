package tdd.service;

import java.math.BigDecimal;

import tdd.modelo.Desempenho;
import tdd.modelo.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario funcionario,
			Desempenho desempenho) {
		BigDecimal reajuste = desempenho.percentualReajuste();
		funcionario.reajustarSalario(reajuste);
	}

}




