package model;

import view.Treina;

public class Treinador extends Funcionario implements Treina{
	public Treinador(int id, String nome, double salario) {
		super(id, nome, salario);
	}
	
	@Override
	public void ensinarTecnologia() {
		System.out.println(getNome() + " é responsável por ensinar tecnologia.");
	}
	
	@Override
	public void motivarEquipe() {
		System.out.println(getNome() + " é responsável por motivar a equipe.");
	}
	
	@Override
	public void mostrarDetalhes() {
		System.out.println("Id: " + getId());
		System.out.println(getNome());
		System.out.println("Cargo: Treinador");
		System.out.println("Salário: " + getSalario());
	}
}
