package Semestre2Ano2025.AulaPratica5HerancaPolimorfismoEOPrincipioLSP.ExemploRuim;

public class Main {
    public static void main(String[] args) {
        Jeep jeep = new Jeep("Branco", 5, 180, 0, "Jeep", "ABC-1234");
        jeep.acelerar();
        jeep.buzinar();
        jeep.frear();

        System.out.println("---------------------");

        Aviao aviao = new Aviao("Prata", 150, 900, 0, "Boeing 737");
        aviao.acelerar();
        aviao.frear();
        aviao.buzinar();

    }
}
