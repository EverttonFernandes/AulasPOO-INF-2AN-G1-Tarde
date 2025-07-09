package Aula110725ResolucaoSimulado.exercicio2;

public class Cachorro {

    private String nome;
    private String raca;

    public Cachorro(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String latir() {
        return "Au Au! Eu sou o " + nome + ", da raça " + raca + "!";
    }
}

