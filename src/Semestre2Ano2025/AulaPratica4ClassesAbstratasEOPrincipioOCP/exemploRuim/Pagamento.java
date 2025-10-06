package Semestre2Ano2025.AulaPratica4ClassesAbstratasEOPrincipioOCP.exemploRuim;

public class Pagamento {
    private String chavePixDoDestinatario;
    private double valorDoPix;
    private double saldoDaConta;
    private double limiteCartaoDeCredito;
    private TipoPagamento tipoPagamento;

    public Pagamento(String chavePixDoDestinatario, double valorDoPix, double saldoDaConta, double limiteCartaoDeCredito, TipoPagamento tipoPagamento) {
        this.chavePixDoDestinatario = chavePixDoDestinatario;
        this.valorDoPix = valorDoPix;
        this.saldoDaConta = saldoDaConta;
        this.limiteCartaoDeCredito = limiteCartaoDeCredito;
        this.tipoPagamento = tipoPagamento;
    }

    public String getChavePixDoDestinatario() {
        return chavePixDoDestinatario;
    }

    public double getValorDoPix() {
        return valorDoPix;
    }

    public double getSaldoDaConta() {
        return saldoDaConta;
    }

    public double getLimiteCartaoDeCredito() {
        return limiteCartaoDeCredito;
    }

    public void pagamento(){
        if (this.tipoPagamento.equals(TipoPagamento.PIX)){
            if (this.chavePixDoDestinatario != null && !this.chavePixDoDestinatario.isEmpty()){
                if (this.valorDoPix > 0.0){
                    if (this.saldoDaConta >= this.valorDoPix){
                        System.out.println("Pix no valor de " + this.valorDoPix + " foi efetuado para a chave " + this.chavePixDoDestinatario);
                    }
                }
            }
        }

        if (this.tipoPagamento.equals(TipoPagamento.CREDITO)){
            if(this.limiteCartaoDeCredito > 0){
                System.out.println("Pagamento no cartão de crédito!");
            }
        }

        if (this.tipoPagamento.equals(TipoPagamento.DEBITO)){
            if(this.saldoDaConta > 0){
                System.out.println("Pagamento no cartão de débito!");
            }
        }
    }







}
