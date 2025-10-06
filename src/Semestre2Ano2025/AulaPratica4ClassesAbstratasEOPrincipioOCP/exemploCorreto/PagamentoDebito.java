package Semestre2Ano2025.AulaPratica4ClassesAbstratasEOPrincipioOCP.exemploCorreto;

public class PagamentoDebito extends PagamentoAbstrato{
    private double saldoDaConta;

    public PagamentoDebito(double saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }

    @Override
    public void pagar() {
        if(this.saldoDaConta > 0){
            System.out.println("Pagamento no cartão de débito!");
        }
    }
}
