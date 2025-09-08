package Semestre2Ano2025.Aula02Pratica.ResolucaoExercicio15;

public class Produto {
    private String nome;
    private double preco;
    private boolean disponivel;

    public Produto(String nome, double preco, boolean disponivel) {
        this.nome = nome;
        this.preco = preco;
        this.disponivel = disponivel;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public String descricao(){
        String disponibilidade = this.isDisponivel() ? "{Disponível}" : "{Indisponível}"; // operador ternário
        return "Nome: " + this.getNome() + " - " + " com o preco: R$" + this.getPreco() + " - " + "e com o status de disponibilidade " + disponibilidade;
    }
}
