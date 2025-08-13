package Semestre1Ano2025.Aula110725ResolucaoSimulado.exercicio4;

public class Main {

    public static void main(String[] args) {

        Carro carroCompleto = new Carro("Civic", "Preto", 2022);
        Carro carroSemAno = new Carro("Gol", "Vermelho");
        Carro carroSomenteModelo = new Carro("Fusca");

        carroCompleto.exibirInformacoes();
        carroSemAno.exibirInformacoes();
        carroSomenteModelo.exibirInformacoes();
    }
}

