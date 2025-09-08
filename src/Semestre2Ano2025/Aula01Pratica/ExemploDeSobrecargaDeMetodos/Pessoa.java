package Semestre2Ano2025.Aula01Pratica.ExemploDeSobrecargaDeMetodos;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(int idade) {
        this.idade = idade;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void gritar() {
        System.out.println("Gritando");
    }

    // Assinatura diferente que seria 1 ou vários parametros
    public void gritar(String tomDoGrito) {
        if (tomDoGrito.equals("Baixo")) {
            System.out.println("Gritando Baixo");
        }

        if (tomDoGrito.equals("Alto")) {
            System.out.println("Gritando Alto");
        }
    }

    // Assinatura diferente que seria 1 ou vários parametros
    // lógica do método gritar usando decebeis
    public void gritar(int decibeis) {
        if (decibeis > 60) {
            System.out.println("Gritando Alto");
        }
        System.out.println("Gritando Baixo");
    }

    // Assinatura diferente que seria 1 ou vários parametros
    // Assinatura diferente que seria 1 ou vários parametros
    public void gritar(String tomDoGrito, int decibeis) {
        // lógica do método gritar usando decebeis
        if (tomDoGrito.equals("Alto") && decibeis > 60) {
            System.out.println("Gritando Alto");
        }
        System.out.println("Gritando Baixo");
    }

    // lógica do método gritar usando decebeis
    public void gritar(String tomDoGrito, String motivoDoGrito) {
        // lógica do método gritar usando tom do grito e motivo
    }
}
