package Semestre2Ano2025.AulaPratica4ClassesAbstratasEOPrincipioOCP.exemploCorreto;

public class PagamentoCredito  extends  PagamentoAbstrato{
    private double limiteCartaoDeCredito;

    public PagamentoCredito(double limiteCartaoDeCredito) {
        this.limiteCartaoDeCredito = limiteCartaoDeCredito;
    }

    @Override
    public void pagar() {
        if(this.limiteCartaoDeCredito > 0){
            System.out.println("Pagamento no cartão de crédito!");
        }
    }
}
