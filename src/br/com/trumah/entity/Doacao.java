package br.com.trumah.entity;

import java.util.Date;

public class Doacao {

	private int Numero;

	private Date dataPedido;

	private Date dataOferta;

	private Date dateEntrega;

	private PessoaJuridica pessoaJuridica;

	private PessoaFisica pessoaFisica;

	private StatusDoacoes statusDoacoes;

	private Itens[] itens;

	private Rota rota;

}
