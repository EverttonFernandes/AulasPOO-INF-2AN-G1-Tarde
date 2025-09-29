package Semestre2Ano2025.Aula03Pratica;

public class Main {
    public static void main(String[] args) {
        AlunoRepositorio alunoRepositorio = new AlunoRepositorio();
        AcademicoService academicoService = new AcademicoService(alunoRepositorio);
        FinanceiroService financeiroService = new FinanceiroService(alunoRepositorio);
        RelatorioService relatorioService = new RelatorioService(alunoRepositorio, academicoService);
        RegistrarAdvertenciaService registrarAdvertenciaService = new RegistrarAdvertenciaService(alunoRepositorio);

        ProcessadorAluno processadorAluno = new ProcessadorAluno(academicoService, financeiroService, alunoRepositorio, relatorioService, registrarAdvertenciaService);
        processadorAluno.getAlunoRepositorio().cadastrarAluno("2025001", "Ana", "ana@ifsul.edu", Serie.PRIMEIRO);
        processadorAluno.getAcademicoService().registrarNota("2025001", 8);
        processadorAluno.getAcademicoService().registrarNota("2025001", 4.5);
        processadorAluno.getFinanceiroService().registrarPagamento("2025001", 250.00);

        StatusPagamento status = processadorAluno.getFinanceiroService().verificarStatusPagamento("2025001", 250.00);
        System.out.println("Status financeiro: " + status.getRotulo());

        processadorAluno.getRegistrarAdvertenciaService().registrarAdvertenciaPorFaltaEmAvaliacao("2025001", true);
        processadorAluno.getRelatorioService().exportarCSV();
    }
}
