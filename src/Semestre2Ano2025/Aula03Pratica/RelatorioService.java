package Semestre2Ano2025.Aula03Pratica;

public class RelatorioService {
    private static AlunoRepositorio alunoRepositorio;
    private static AcademicoService academicoService;

    public RelatorioService(AlunoRepositorio alunoRepositorio, AcademicoService academicoService) {
        this.alunoRepositorio = alunoRepositorio;
        this.academicoService = academicoService;
    }

    public static void exportarCSV() {
        System.out.println("[EXPORT] alunos.csv");
        for (Aluno aluno : alunoRepositorio.getListaDeAlunos()) {
            double media = academicoService.calcularMedia(aluno.getRa());
            System.out.println(
                    aluno.getRa() + ";" +
                            aluno.getNome() + ";" +
                            aluno.getEmail() + ";" +
                            aluno.getSerie() + ";" +
                            media
            );
        }
    }
}
