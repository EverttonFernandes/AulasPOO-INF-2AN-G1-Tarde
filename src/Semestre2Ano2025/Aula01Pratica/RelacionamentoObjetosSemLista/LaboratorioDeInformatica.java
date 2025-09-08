package Semestre2Ano2025.Aula01Pratica.RelacionamentoObjetosSemLista;

public class LaboratorioDeInformatica {
    private String nomeDoLaboratorio;
    private Computador computador;

    public LaboratorioDeInformatica(String nomeDoLaboratorio, Computador computador) {
        this.nomeDoLaboratorio = nomeDoLaboratorio;
        this.computador = computador;
    }

    public String getNomeDoLaboratorio() {
        return nomeDoLaboratorio;
    }

    public Computador getComputador() {
        return computador;
    }

    public void exibirInformacoesSobreOLaboratorio() {
        System.out.println("Nome do laboratorio: " + this.nomeDoLaboratorio);
        System.out.println("Marca do computador: " + this.getComputador().getMarca());
        System.out.println("Modelo do computador: " + this.getComputador().getModelo());
    }
}
