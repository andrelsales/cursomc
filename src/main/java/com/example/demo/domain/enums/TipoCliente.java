package com.example.demo.domain.enums;

import java.util.Iterator;

public enum TipoCliente {
	
	PESSOAFISICA(1,"PESSOA FISICA"),
	PESSOAJURIDICA(2, "PESSOA JURIDICA");

	private int codigo;
	private String nome;
	
	private TipoCliente(int cod, String nome)
	{
		this.codigo = cod;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}
	
	public static TipoCliente toEnum(Integer codigo)
	{
		if (codigo == null) {
			return null;
		}
		
		for (TipoCliente tipo : TipoCliente.values() ) {
			
			if (codigo.equals(tipo.getCodigo())) {
				return tipo;
			}
		}
		
		throw new IllegalArgumentException("ID INVALIDO: " + codigo);
	}


}
