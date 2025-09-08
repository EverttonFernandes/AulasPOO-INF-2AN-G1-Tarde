package Semestre2Ano2025.Aula02Pratica.ResolucaoExercicio15;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Produto> listaDeProdutos = new ArrayList<>();

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pedido(Cliente cliente, List<Produto> listaDeProdutos) {
        this.cliente = cliente;
        this.listaDeProdutos = listaDeProdutos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public void adicionarProduto(Produto produto) {
        this.listaDeProdutos.add(produto);
    }

    public void removerProdutoPorNome(String nomeDoProduto) {
        // REMOVENDO O PRODUTO USANDO REMOVE IF
        // O REMOVE IF FUNCIONA IGUAL AO FOREACH, A DIFERENÇA É QUE ELE FAZ UM FOR COM UM IF DENTRO
        // DEPOIS DA SETA -> É COMO SE ESTIVESSEMOS FAZENDO UM IF
        // ANTES DA SETA -> É apenas o produto que estamos iterando dentro da lista

        this.listaDeProdutos.removeIf(produto -> produto.getNome().equals(nomeDoProduto));

        // REMOVER O PRODUTO USANDO FOREACH
//        for (Produto produto : listaDeProdutos) {
//            if(produto.getNome().equals(nomeDoProduto)){
//                this.listaDeProdutos.remove(produto);
//                break;
//            }
//        }
    }

    private int contarIndisponiveis() {
        int contadorDeProdutosIndisponiveis = 0;
        // PARA CADA PRODUTO DENTRO DA LISTA DE PRODUTOS
        for (Produto produto : this.listaDeProdutos) {
            if (!produto.isDisponivel()) { // PERGUNTAMOS PARA CADA PRODUTO SE ELE NÃO ESTÁ DISPONÍVEL
                contadorDeProdutosIndisponiveis++; // CASO NÃO ESTEJA DISPONÍVEL CONTAMOS COMO INDISPONIVEL
            }
        }
        return contadorDeProdutosIndisponiveis;
    }

    private double calcularTotalGasto() {
        double totalGasto = 0.0;
        for (Produto produto : this.listaDeProdutos) {
            if (produto.isDisponivel()) {
                totalGasto += produto.getPreco();
            }
        }
        return totalGasto;
    }

    private boolean validaSeOPedidoEValido() {
        int quantidadeDeProdutosNaLista = this.listaDeProdutos.size();
        int quantidadeDeProdutosIndisponiveis = this.contarIndisponiveis();
        if (quantidadeDeProdutosNaLista > 0 || quantidadeDeProdutosIndisponiveis == 0) {
            return true;
        }
        return false;
    }

    public void imprimirResumo() {
        System.out.println("#############################");
        System.out.println("INFORMAÇÕES DO PEDIDO");
        System.out.println("Cliente: " + this.getCliente().getNome());
        for (Produto produto : this.listaDeProdutos) {
            System.out.println("Produto: " + produto.descricao());
        }
        System.out.println("Total de produtos indisponíveis: " + this.contarIndisponiveis());
        System.out.println("Total gasto: R$" + this.calcularTotalGasto());
        System.out.println(this.validaSeOPedidoEValido() ? "Pedido Válido" : "Pedido Inválido");
    }
}
