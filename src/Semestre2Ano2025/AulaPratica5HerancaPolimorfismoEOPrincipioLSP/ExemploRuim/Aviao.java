package Semestre2Ano2025.AulaPratica5HerancaPolimorfismoEOPrincipioLSP.ExemploRuim;

public class Aviao extends MeioDeTransporte {

    protected Aviao(String cor, int quantidadeDePassageiros, int velocidadeMaxima, int velocidadeMinima, String nomeDoTransporte) {
        super(cor, quantidadeDePassageiros, velocidadeMaxima, velocidadeMinima, nomeDoTransporte);
    }

    @Override
    protected void acelerar() {
        System.out.println("Aviao acelerando antes de decolar!");
    }

    @Override
    protected void frear() {
        System.out.println("Aviao freiando ao pousar!");
    }

    @Override
    protected void buzinar() { // ESTOU QUEBRANDO O PRINCÍPIO LSP (DEVIDO A NÃO RESPEITAR PRÉ CONDIÇÕES)
        throw new UnsupportedOperationException("Aviao não pode buzinar!");
    }
}
