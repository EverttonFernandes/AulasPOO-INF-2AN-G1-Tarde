package Aula110725ResolucaoSimulado.exercicio1;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + " - Idade: " + idade);
    }
}

