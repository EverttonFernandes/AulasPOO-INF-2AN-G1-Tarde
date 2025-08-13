package Semestre2Ano2025.Aula01.ExemploDeSobrecargaDeMetodos;

public class Main {
    public static void main(String[] args) {
        Pessoa pedro = new Pessoa("Pedro");
        Pessoa mauro = new Pessoa("Mauro", 40);
        Pessoa desconhecidoCom40Anos = new Pessoa(40);

        mauro.gritar("Alto");
    }
}
