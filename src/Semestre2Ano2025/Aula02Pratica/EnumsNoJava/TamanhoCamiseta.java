package Semestre2Ano2025.Aula02Pratica.EnumsNoJava;

// CHAMOS DE ENUMERADORES
// USAMOS PARA PADRONIZAR A ENTRADA DOS DADOS
public enum TamanhoCamiseta {
    PP(0, "Extra Pequeno"),
    P(1, "Pequeno"),
    M(2, "Médio"),
    G(3, "Grande"),
    GG(4, "Extra Grande");

    // O FINAL VOU EXPLICAR SOMENTE EM HERANÇA (NOS PRINCIPIOS SOLID)
    private final int codigo;
    private final String descricao;

    TamanhoCamiseta(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}
