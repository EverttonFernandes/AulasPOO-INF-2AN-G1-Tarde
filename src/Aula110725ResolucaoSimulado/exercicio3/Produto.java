package Aula110725ResolucaoSimulado.exercicio3;

public class Produto {

    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibir() {
        System.out.println("Produto: " + this.getNome() + " - Preço: " + this.getPreco());
    }
}

