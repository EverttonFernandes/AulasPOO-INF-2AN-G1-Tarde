package Semestre2Ano2025.AulaPratica5HerancaPolimorfismoEOPrincipioLSP.ExemploRuim;

public abstract class MeioDeTransporte {
    // ATRIBUTOS
    protected String cor;
    protected int quantidadeDePassageiros;
    protected int velocidadeMaxima;
    protected int velocidadeMinima;
    protected String nomeDoTransporte;

    // CONSTRUTOR
    protected MeioDeTransporte(String cor, int quantidadeDePassageiros, int velocidadeMaxima, int velocidadeMinima, String nomeDoTransporte) {
        this.cor = cor;
        this.quantidadeDePassageiros = quantidadeDePassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeMinima = velocidadeMinima;
        this.nomeDoTransporte = nomeDoTransporte;
    }

    // COMPORTAMENTOS
    protected abstract void acelerar();
    protected abstract void frear();
    protected abstract void buzinar();
}
