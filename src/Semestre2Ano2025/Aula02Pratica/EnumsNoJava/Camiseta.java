package Semestre2Ano2025.Aula02Pratica.EnumsNoJava;

public class Camiseta {

    private TamanhoCamiseta tamanhoCamiseta;
    private String cor;
    private String estampa;

    public Camiseta(TamanhoCamiseta tamanhoCamiseta, String cor, String estampa) {
        this.tamanhoCamiseta = tamanhoCamiseta;
        this.cor = cor;
        this.estampa = estampa;
    }

    public TamanhoCamiseta getTamanhoCamiseta() {
        return tamanhoCamiseta;
    }

    public String getCor() {
        return cor;
    }

    public String getEstampa() {
        return estampa;
    }

    public void mostrarInformacoesDaCamiseta() {
        System.out.println("Cor " + this.cor);
        System.out.println("Estampa " + this.estampa);
        System.out.println("Tamanho' " + this.tamanhoCamiseta.getDescricao());
    }
}
