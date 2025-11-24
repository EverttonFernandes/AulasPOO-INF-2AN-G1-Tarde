package Semestre2Ano2025.AulaPratica7TratamentoDeExcecoes.ExemploComTryCatch;

public class Database {
    private ConexaoBD conexaoBD;

    public void salvar(Usuario usuario) {
        try {
            conexaoBD.salvar(usuario);
        } catch (Exception e) {
            System.out.println("Erro ao salvar usuário: " + e.getMessage());
        } finally {
            System.out.println("Operação de salvar usuário finalizada.");
        }
    }
}
