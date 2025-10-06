package Semestre2Ano2025.AulaPratica4ClassesAbstratasEOPrincipioOCP.exemploCorreto;

public class Main {
    public static void main(String[] args) {
        System.out.println("###################################");

        PagamentoPix pagamentoPix = new PagamentoPix("888.213.450-65", 300.0, 400.0);
        pagamentoPix.pagar();

        System.out.println("###################################");

        PagamentoCredito pagamentoCredito = new PagamentoCredito(1000.0);
        pagamentoCredito.pagar();

        System.out.println("###################################");

        PagamentoDebito pagamentoDebito = new PagamentoDebito(1000.0);
        pagamentoDebito.pagar();
        System.out.println("###################################");
    }
}
