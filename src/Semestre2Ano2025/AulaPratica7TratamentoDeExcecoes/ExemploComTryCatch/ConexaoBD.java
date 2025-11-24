package Semestre2Ano2025.AulaPratica7TratamentoDeExcecoes.ExemploComTryCatch;

public class ConexaoBD {

    public void salvar(Usuario usuario){
        System.out.println("Salvando usuário " + usuario.getNome() + " no banco de dados.");
    }
}
