package Semestre2Ano2025.Aula01Pratica.RelacionamentoObjetosComLista;

import java.util.ArrayList;
import java.util.List;

public class LaboratorioDeInformatica {
    private String nomeDoLaboratorio;
    private List<Computador> listaDeComputadores = new ArrayList<>();

    public LaboratorioDeInformatica(String nomeDoLaboratorio, List<Computador> listaDeComputadores) {
        this.nomeDoLaboratorio = nomeDoLaboratorio;
        this.listaDeComputadores = listaDeComputadores;
    }

    public LaboratorioDeInformatica(String nomeDoLaboratorio) {
        this.nomeDoLaboratorio = nomeDoLaboratorio;
    }

    public String getNomeDoLaboratorio() {
        return nomeDoLaboratorio;
    }

    public List<Computador> getListaDeComputadores() {
        return listaDeComputadores;
    }

    // este método adiciona o computador a lista e valida se o computador já existe na lista
    public void adicionarComputador(Computador computadorInformado) {
        // antes de adicionar a lista vamos verificar se o computador já existe na lista!

        // Para cada computador que está na lista de computadores, nós vamos verificar um a um se é realmente o computador informado no parâmetro!
        for (Computador computadorDaLista : this.listaDeComputadores) {
            if (computadorDaLista.equals(computadorInformado)) {
                System.out.println("Computador da Dell no modelo + " + computadorInformado.getModelo() + " já existe na lista!");
                return;
            }
        }
        listaDeComputadores.add(computadorInformado);
    }

    public void removerComputador(Computador computador) {
        listaDeComputadores.removeIf(computador::equals);
    }

    public void exibirInformacoesSobreOLaboratorio() {
        System.out.println("Nome do laboratorio: " + this.nomeDoLaboratorio);
        System.out.println("Quantidade de computadores: " + this.listaDeComputadores.size());
        System.out.println("################################# \n");
        System.out.println("MOSTRANDO O MODELO DE CADA COMPUTADOR");
        for (Computador computador : this.listaDeComputadores) {
            System.out.println(computador.getModelo());
        }
    }
}
