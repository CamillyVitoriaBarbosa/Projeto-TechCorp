package model;

import view.Desenvolve;

public class Desenvolvedor extends Funcionario implements Desenvolve {
	public Desenvolvedor(int id, String nome, double salario) {
		super(id, nome,salario);
	}
	
	@Override
	public void codar() {
		System.out.println(getNome() + " é responsável por codar.");
	}
	
	@Override 
	public void resolverProblemas() {
		System.out.println(getNome() + " é responsável por resolver problemas.");
	}
	
	@Override
	public void mostrarDetalhes() {
		System.out.println("Id: " + getId());
		System.out.println(getNome());
		System.out.println("Cargo: Desenvolvedor");
		System.out.println("Salário: " + getSalario());
	}
}
