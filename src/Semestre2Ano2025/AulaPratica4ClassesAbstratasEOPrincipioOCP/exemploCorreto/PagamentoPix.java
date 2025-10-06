package Semestre2Ano2025.AulaPratica4ClassesAbstratasEOPrincipioOCP.exemploCorreto;

import Semestre2Ano2025.AulaPratica4ClassesAbstratasEOPrincipioOCP.exemploRuim.TipoPagamento;

public class PagamentoPix extends PagamentoAbstrato{

    private String chavePixDoDestinatario;
    private double valorDoPix;
    private double saldoDaConta;

    public PagamentoPix(String chavePixDoDestinatario, double valorDoPix, double saldoDaConta) {
        this.chavePixDoDestinatario = chavePixDoDestinatario;
        this.valorDoPix = valorDoPix;
        this.saldoDaConta = saldoDaConta;
    }

    @Override
    public void pagar() {
        if (this.chavePixDoDestinatario != null && !this.chavePixDoDestinatario.isEmpty()){
            if (this.valorDoPix > 0.0){
                if (this.saldoDaConta >= this.valorDoPix){
                    System.out.println("Pix no valor de " + this.valorDoPix + " foi efetuado para a chave " + this.chavePixDoDestinatario);
                }
            }
        }
    }
}
