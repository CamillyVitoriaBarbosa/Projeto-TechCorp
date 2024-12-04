package model;

import view.Gerencia;
import view.Desenvolve;

public class GerenteDesenvolvedor extends Funcionario implements Gerencia, Desenvolve {
	public GerenteDesenvolvedor(int id, String nome, double salario) {
		super(id, nome, salario);
	}
	
	@Override
	public void codar() {
		System.out.println(getNome() + " é responsável por codar e gerenciar.");
	}
	
	@Override 
	public void resolverProblemas() {
		System.out.println(getNome() + " é responsável por resolver problemas técnicos.");
	}
	
	@Override
	public void organizarEquipe() {
		System.out.println(getNome() + " é responsável por organizar equipe de desenvolvimento.");
	}
	
	@Override
	public void conduzirReunioes() {
		System.out.println(getNome() + " é responsável por conduzir reuniões técnicas.");
	}
	
	@Override
	public void mostrarDetalhes() {
		System.out.println("Id: " + getId());
		System.out.println(getNome());
		System.out.println("Cargo: Gerente Desenvolvedor");
		System.out.println("Salário: " + getSalario());
	}
}
