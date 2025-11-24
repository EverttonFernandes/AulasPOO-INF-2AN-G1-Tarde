package Semestre2Ano2025.AulaPratica7TratamentoDeExcecoes.ExemploComExcecaoPersonalizada;

public class Iphone {
    private boolean temBateria;

    public Iphone(boolean temBateria) {
        this.temBateria = temBateria;
    }

    public void ligarIphone(){
        if (temBateria){
            System.out.println("Iphone ligado com sucesso!");
        } else {
            throw new SemBateriaException("Erro: Iphone sem bateria!");
        }
    }
}
