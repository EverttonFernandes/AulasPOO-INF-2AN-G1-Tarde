package Semestre2Ano2025.AulaPratica5HerancaPolimorfismoEOPrincipioLSP.ExemploBom;

public abstract class MeioDeTransporteAquatico extends MeioDeTransporte{
    protected MeioDeTransporteAquatico(String cor, int quantidadeDePassageiros, int velocidadeMaxima, int velocidadeMinima, String nomeDoTransporte) {
        super(cor, quantidadeDePassageiros, velocidadeMaxima, velocidadeMinima, nomeDoTransporte);
    }

    @Override
    protected void acelerar() {
        System.out.println("Meio de transporte aquático acelerando!");
    }

    @Override
    protected void frear() {
        System.out.println("Meio de transporte aquático freiando!");
    }
}
