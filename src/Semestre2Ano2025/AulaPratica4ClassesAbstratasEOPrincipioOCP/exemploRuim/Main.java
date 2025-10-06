package Semestre2Ano2025.AulaPratica4ClassesAbstratasEOPrincipioOCP.exemploRuim;

public class Main {
    public static void main(String[] args) {
        System.out.println("###################################");

        Pagamento pagamentoPix = new Pagamento("888.213.450-65", 300.0, 400.0, 1000.0, TipoPagamento.PIX);
        pagamentoPix.pagamento();

        System.out.println("###################################");

        Pagamento pagamentoCredito = new Pagamento(null, 0.0, 400.0, 1000.0, TipoPagamento.CREDITO);
        pagamentoCredito.pagamento();

        System.out.println("###################################");
        Pagamento pagamentoDebito = new Pagamento(null, 0.0, 400.0, 1000.0, TipoPagamento.DEBITO);
        pagamentoDebito.pagamento();
    }
}
