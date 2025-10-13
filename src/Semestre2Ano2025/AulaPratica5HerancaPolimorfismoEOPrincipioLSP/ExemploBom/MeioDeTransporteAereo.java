package Semestre2Ano2025.AulaPratica5HerancaPolimorfismoEOPrincipioLSP.ExemploBom;

public abstract class MeioDeTransporteAereo extends MeioDeTransporte {

    protected MeioDeTransporteAereo(String cor, int quantidadeDePassageiros, int velocidadeMaxima, int velocidadeMinima, String nomeDoTransporte) {
        super(cor, quantidadeDePassageiros, velocidadeMaxima, velocidadeMinima, nomeDoTransporte);
    }

    @Override
    protected void acelerar() {
        System.out.println("Meio de transporte aéreo acelerando!");
    }

    @Override
    protected void frear() {
        System.out.println("Meio de transporte aéreo freiando!");
    }
}
