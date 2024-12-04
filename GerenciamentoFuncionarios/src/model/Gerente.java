package model;

import view.Gerencia;

public class Gerente extends Funcionario implements Gerencia{
	public Gerente(int id, String nome, double salario) {
		super(id, nome, salario);
	}
	
	@Override
	public void organizarEquipe() {
		System.out.println(getNome() + " é responsável por organizar equipe.");
	}
	
	@Override
	public void conduzirReunioes() {
		System.out.println(getNome() + " é responsável por conduzir reuniões.");
	}
	
	@Override
	public void mostrarDetalhes() {
		System.out.println("Id: " + getId());
		System.out.println(getNome());
		System.out.println("Cargo: Gerente");
		System.out.println("Salário: " + getSalario());
	}
}
