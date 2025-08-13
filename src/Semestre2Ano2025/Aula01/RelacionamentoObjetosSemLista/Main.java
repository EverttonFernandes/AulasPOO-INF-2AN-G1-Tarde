package Semestre2Ano2025.Aula01.RelacionamentoObjetosSemLista;

public class Main {
    public static void main(String[] args) {
        Computador computador = new Computador("Dell", "Inspiron 14");
        LaboratorioDeInformatica laboratorio = new LaboratorioDeInformatica("Lab 1", computador);
        laboratorio.exibirInformacoesSobreOLaboratorio();
    }
}
