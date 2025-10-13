package Semestre2Ano2025.AulaPratica5HerancaPolimorfismoEOPrincipioLSP.ExemploRuim;

public abstract class Carro extends MeioDeTransporte {
    protected String placa;

    public Carro(String cor, int quantidadeDePassageiros, int velocidadeMaxima, int velocidadeMinima, String nomeDoTransporte, String placa) {
        super(cor, quantidadeDePassageiros, velocidadeMaxima, velocidadeMinima, nomeDoTransporte);
        this.placa = placa;
    }

    @Override
    protected void acelerar() {
        System.out.println("Carro acelerando!");
    }

    @Override
    protected void frear() {
        System.out.println("Carro freiando!");
    }

    @Override
    protected void buzinar() {
        System.out.println("Carro buzinando!");
    }
}
