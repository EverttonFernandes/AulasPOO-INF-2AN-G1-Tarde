package Semestre2Ano2025.Aula01.RelacionamentoObjetosComLista;

import java.util.ArrayList;
import java.util.List;

public class LaboratorioDeInformatica {
    private String nomeDoLaboratorio;
    private List<Computador> listaDeComputadores = new ArrayList<>();

    public LaboratorioDeInformatica(String nomeDoLaboratorio, List<Computador> listaDeComputadores) {
        this.nomeDoLaboratorio = nomeDoLaboratorio;
        this.listaDeComputadores = listaDeComputadores;
    }

    public String getNomeDoLaboratorio() {
        return nomeDoLaboratorio;
    }

    public List<Computador> getListaDeComputadores() {
        return listaDeComputadores;
    }

    public void exibirInformacoesSobreOLaboratorio() {
        System.out.printf("Nome do laboratorio: " + this.nomeDoLaboratorio);
        System.out.printf("Quantidade de computadores: " + this.listaDeComputadores.size());
        System.out.println("#################################");
        System.out.println("MOSTRANDO O MODELO DE CADA COMPUTADOR");
        for (Computador computador : this.listaDeComputadores) {
            System.out.println(computador.getModelo());
        }
    }
}
