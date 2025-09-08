package Semestre2Ano2025.Aula02Pratica.EnumsNoJava;

public class Main {
    public static void main(String[] args) {
        Camiseta camiseta1 = new Camiseta(TamanhoCamiseta.M, "Azul", "Superman");
        Camiseta camiseta2 = new Camiseta(TamanhoCamiseta.GG, "Vermelha", "Batman");

        camiseta1.mostrarInformacoesDaCamiseta();
        System.out.println("#####################");
        camiseta2.mostrarInformacoesDaCamiseta();
    }
}
