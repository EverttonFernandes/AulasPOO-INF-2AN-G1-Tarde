package Semestre2Ano2025.AulaPratica7TratamentoDeExcecoes.ExemploComExcecaoPersonalizada;

public class SemBateriaException extends RuntimeException {
    public SemBateriaException(String message) {
        super(message);
    }
}
