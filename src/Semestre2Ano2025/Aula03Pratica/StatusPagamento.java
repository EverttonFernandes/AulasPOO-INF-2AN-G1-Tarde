package Semestre2Ano2025.Aula03Pratica;

public enum StatusPagamento {
    EM_DIA("Em dia"), ATRASADO("Atrasado");
    private final String rotulo;

    StatusPagamento(String rotulo) {
        this.rotulo = rotulo;
    }

    public String getRotulo() {
        return rotulo;
    }
}
