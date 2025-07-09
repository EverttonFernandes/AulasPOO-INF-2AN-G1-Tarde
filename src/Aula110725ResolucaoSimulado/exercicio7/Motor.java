package Aula110725ResolucaoSimulado.exercicio7;

public class Motor {

    private String tipo;
    private int potencia;

    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public String exibirMotor() {
        return "Tipo: " + tipo + " - Potência: " + potencia + "CV";
    }
}
