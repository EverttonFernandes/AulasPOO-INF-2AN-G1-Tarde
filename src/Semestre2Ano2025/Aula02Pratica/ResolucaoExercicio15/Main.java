package Semestre2Ano2025.Aula02Pratica.ResolucaoExercicio15;

public class Main {
    public static void main(String[] args) {
        Cliente maria = new Cliente("Maria");
        Produto sucoDeUva = new Produto("Suco de Uva", 10.00, true);
        Produto boloDeChocolate = new Produto("Bolo de chocolate", 10.00, true);
        Produto coberturaExtraDeChocolate = new Produto("Cobertura Extra de chocolate", 5.00, true);
        Produto coberturaExtraDeMorango = new Produto("Cobertura Extra de morango", 5.00, false);

        Pedido pedido = new Pedido(maria);
        pedido.adicionarProduto(sucoDeUva);
        pedido.adicionarProduto(boloDeChocolate);
        pedido.adicionarProduto(coberturaExtraDeChocolate);
        pedido.adicionarProduto(coberturaExtraDeMorango);
        pedido.removerProdutoPorNome(coberturaExtraDeChocolate.getNome());
        pedido.imprimirResumo();
    }
}
