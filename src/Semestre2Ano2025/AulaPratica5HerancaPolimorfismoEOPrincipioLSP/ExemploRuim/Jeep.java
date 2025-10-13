package Semestre2Ano2025.AulaPratica5HerancaPolimorfismoEOPrincipioLSP.ExemploRuim;

public class Jeep extends Carro {
    public Jeep(String cor, int quantidadeDePassageiros, int velocidadeMaxima, int velocidadeMinima, String nomeDoTransporte, String placa) {
        super(cor, quantidadeDePassageiros, velocidadeMaxima, velocidadeMinima, nomeDoTransporte, placa);
    }

    @Override
    protected void acelerar() { // HERANÇA ACONTECENDO
        super.acelerar();
    }

    @Override
    protected void frear() { // HERANÇA ACONTECENDO
        super.frear();
    }

    @Override
    protected void buzinar() { // POLIMORFISMO ACONTECENDO
        System.out.println("Jeep está buzinando!");;
    }
}
