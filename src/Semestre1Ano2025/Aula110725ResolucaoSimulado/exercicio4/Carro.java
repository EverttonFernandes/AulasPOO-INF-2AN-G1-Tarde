package Semestre1Ano2025.Aula110725ResolucaoSimulado.exercicio4;

public class Carro {

    private String modelo;
    private String cor;
    private int ano;

    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public Carro(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo + " - Cor: " + cor + " - Ano: " + ano);
    }
}

