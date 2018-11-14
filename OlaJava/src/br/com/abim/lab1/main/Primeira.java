package br.com.abim.lab1.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.abim.lab1.entity.Pessoa;

public class Primeira {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("João Bosco");
		p.setId(200L);
		SimpleDateFormat dateformat3 = new SimpleDateFormat("dd/MM/yyyy");
		Date dataNasc=null;
		try {
		dataNasc = dateformat3.parse("23/07/1958");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		p.setDataNasc(dataNasc);
		
		mostrarPessoa(p);
	}
	

	public static void mostrarPessoa(Pessoa pessoa) {
		System.out.println("A pessoa é "+pessoa);
	}

	
}
