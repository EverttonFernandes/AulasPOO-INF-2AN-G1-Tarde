package Aula110725ResolucaoSimulado.exercicio7;

public class Main {

    public static void main(String[] args) {

        Motor motor = new Motor("2.0", 150);
        Carro carro = new Carro("Jeep", motor);

        carro.exibirFichaTecnica();
    }
}
