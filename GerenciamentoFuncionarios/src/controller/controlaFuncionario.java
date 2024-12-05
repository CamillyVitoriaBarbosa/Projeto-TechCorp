package controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import model.*;
import view.*;

public class controlaFuncionario {
	public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int op;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Desenvolvedor");
            System.out.println("2. Adicionar Gerente");
            System.out.println("3. Adicionar Treinador");
            System.out.println("4. Adicionar GerenteDesenvolvedor");
            System.out.println("5. Listar Funcionários");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
		    adicionarDesenvolvedor(funcionarios, scanner);
		    break;
                case 2:
		    adicionarGerente(funcionarios, scanner);
		    break;
                case 3:
		    adicionarTreinador(funcionarios, scanner);
		    break;
                case 4: 
		    adicionarGerenteDesenvolvedor(funcionarios, scanner);
		    break;
                case 5:
		    listarFuncionarios(funcionarios);
		    break;
                case 0:
		    System.out.println("Saindo.");
		    break;
		default: 
		    System.out.println("Opção inválida.");
		    break;
            }
        } while (op != 0);

        scanner.close();
    }

    private static void adicionarDesenvolvedor(ArrayList<Funcionario> funcionarios, Scanner scanner) {
        System.out.print("Nome do Desenvolvedor: ");
        String nome = scanner.nextLine();
        System.out.print("Salário do Desenvolvedor: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();

	int id = random.nextInt(10000);
        funcionarios.add(new Desenvolvedor(id, nome, salario));
        System.out.println("Novo Desenvolvedor adicionado!");
    }

    private static void adicionarGerente(ArrayList<Funcionario> funcionarios, Scanner scanner) {
        System.out.print("Nome do Gerente: ");
        String nome = scanner.nextLine();
        System.out.print("Salário do Gerente: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();

	int id = random.nextInt(10000);
        funcionarios.add(new Gerente(id, nome, salario));
        System.out.println("Novo Gerente adicionado!");
    }

    private static void adicionarTreinador(ArrayList<Funcionario> funcionarios, Scanner scanner) {
        System.out.print("Nome do Treinador: ");
        String nome = scanner.nextLine();
        System.out.print("Salário do Treinador: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();

	int id = random.nextInt(10000);
        funcionarios.add(new Treinador(id, nome, salario));
        System.out.println("Novo Treinador adicionado!");
    }

    private static void adicionarGerenteDesenvolvedor(ArrayList<Funcionario> funcionarios, Scanner scanner) {
        System.out.print("Nome do GerenteDesenvolvedor: ");
        String nome = scanner.nextLine();
        System.out.print("Salário do GerenteDesenvolvedor: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();

	int id = random.nextInt(10000);
        funcionarios.add(new GerenteDesenvolvedor(id, nome, salario));
        System.out.println("Novo Gerente Desenvolvedor adicionado!");
    }

    private static void listarFuncionarios(ArrayList<Funcionario> funcionarios) {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }

        for (Funcionario funcionario : funcionarios) {
            funcionario.mostrarDetalhes();

            if (funcionario instanceof Desenvolve desenvolvedor) {
                desenvolvedor.codar();
                desenvolvedor.resolverProblemas();
            }

            if (funcionario instanceof Gerencia gerente) {
                gerente.organizarEquipe();
                gerente.conduzirReunioes();
            }

            if (funcionario instanceof Treina treinador) {
                treinador.ensinarTecnologia();
                treinador.motivarEquipe();
            }

            System.out.println("\n");
        }
    }
}
