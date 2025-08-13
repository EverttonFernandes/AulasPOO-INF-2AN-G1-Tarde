package Semestre2Ano2025.Aula01.RelacionamentoObjetosComLista;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Computador computador1 = new Computador("Dell", "Inspiron 14");
        Computador computador2 = new Computador("Dell", "Inspiron 15");
        Computador computador3 = new Computador("Dell", "Inspiron 16");

        LaboratorioDeInformatica laboratorio = new LaboratorioDeInformatica("Lab 1", List.of(computador1, computador2, computador3));
        laboratorio.exibirInformacoesSobreOLaboratorio();
    }
}
