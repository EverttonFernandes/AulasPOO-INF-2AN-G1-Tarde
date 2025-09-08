package Semestre2Ano2025.Aula01Pratica.RelacionamentoObjetosComLista;

public class Main {
    public static void main(String[] args) {
        Computador computador1 = new Computador("Dell", "Inspiron 14");
        Computador computador2 = new Computador("Dell", "Inspiron 15");
        Computador computador3 = new Computador("Dell", "Inspiron 16");
        Computador computador4 = new Computador("Dell", "Inspiron 17");
        Computador computador5 = new Computador("Dell", "Inspiron 18");
        Computador computador6 = new Computador("Dell", "Inspiron 19");

        // podemos colocar os objetos na lista diretamente pelo construtor (ou seja colocando mais de um numa única vez)!!!
//        LaboratorioDeInformatica laboratorio = new LaboratorioDeInformatica("Lab 1", List.of(computador1, computador2, computador3));
        LaboratorioDeInformatica laboratorio = new LaboratorioDeInformatica("Lab 1");
        laboratorio.adicionarComputador(computador1);
        laboratorio.adicionarComputador(computador1);
        laboratorio.adicionarComputador(computador2);
        laboratorio.adicionarComputador(computador3);
        // colocando os computadores novos de forma manual (um de cada vez)
        laboratorio.adicionarComputador(computador4);
        laboratorio.adicionarComputador(computador5);
        laboratorio.adicionarComputador(computador6);

        // maneira de como remover um objeto da lista!!!
        laboratorio.removerComputador(computador6);

        laboratorio.exibirInformacoesSobreOLaboratorio();
    }
}
