import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a placa do carro");
        String placa = scanner.nextLine();

        System.out.println("Digite o modelo do carro");
        String modelo = scanner.nextLine();

        System.out.println("Digite a cor do carro");
        String cor = scanner.nextLine();

        Carro carro = new Carro(placa, modelo, cor);
        System.out.println(carro.getPlaca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getCor());

        scanner.close();
    }
}