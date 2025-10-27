package Semestre2Ano2025.AulaPratica6InterfacesEOPrincipioDeSegregacaoDeInterface.exemploBom;

public class Fusca extends MeioDeTransporteExemploBom {
    // IMPLEMENTAÇÃO APENAS DA FUNCIONALIDADE NECESSÁRIA

    @Override
    protected void acelerar() {
        System.out.println("Fusca acelerando!");
    }

    @Override
    protected void frear() {
        System.out.println("Fusca freiando!");
    }

    @Override
    protected void buzinar() {
        System.out.println("Fusca buzinando!");
    }
}
