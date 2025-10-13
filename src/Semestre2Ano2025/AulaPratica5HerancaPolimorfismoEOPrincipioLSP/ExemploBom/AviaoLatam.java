package Semestre2Ano2025.AulaPratica5HerancaPolimorfismoEOPrincipioLSP.ExemploBom;

public class AviaoLatam extends MeioDeTransporteAereo {
    protected AviaoLatam(String cor, int quantidadeDePassageiros, int velocidadeMaxima, int velocidadeMinima, String nomeDoTransporte) {
        super(cor, quantidadeDePassageiros, velocidadeMaxima, velocidadeMinima, nomeDoTransporte);
    }

    @Override
    protected void frear() {
        super.frear();
    }

    @Override
    protected void acelerar() {
        super.acelerar();
    }
}
