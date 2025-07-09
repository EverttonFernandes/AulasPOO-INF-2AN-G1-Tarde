package Aula110725ResolucaoSimulado.exercicio5;

public class Celular {

    private String marca;
    private String modelo;

    public Celular(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void fazerLigacao(String contato) {
        System.out.println("Ligando para " + contato + "...");
    }

    public void enviarMensagem(String contato, String mensagem) {
        System.out.println("Enviando para " + contato + ": " + mensagem);
    }
}

