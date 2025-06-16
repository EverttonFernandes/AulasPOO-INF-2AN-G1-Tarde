public class Carro {
    private String placa;
    private String modelo;
    private String cor;

    // USAMOS PARA CRIAR O OBJETO
    public Carro(String placa, String modelo, String cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
    }

    public Carro(String placa, String cor) {
        this.placa = placa;
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
