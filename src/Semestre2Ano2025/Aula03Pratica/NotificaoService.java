package Semestre2Ano2025.Aula03Pratica;

public class NotificaoService {

    public static void enviarEmail(String destinatario, String assunto, String conteudo) {
        System.out.println("[EMAIL] Para: " + destinatario + " | " + assunto + " | " + conteudo);
    }

}
