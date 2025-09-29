package Semestre2Ano2025.Aula03Pratica;

public class ProcessadorAluno {
    private AcademicoService academicoService;
    private FinanceiroService financeiroService;
    private AlunoRepositorio alunoRepositorio;
    private RelatorioService relatorioService;
    private RegistrarAdvertenciaService registrarAdvertenciaService;

    public ProcessadorAluno(AcademicoService academicoService, FinanceiroService financeiroService, AlunoRepositorio alunoRepositorio, RelatorioService relatorioService, RegistrarAdvertenciaService registrarAdvertenciaService) {
        this.academicoService = academicoService;
        this.financeiroService = financeiroService;
        this.alunoRepositorio = alunoRepositorio;
        this.relatorioService = relatorioService;
        this.registrarAdvertenciaService = registrarAdvertenciaService;
    }

    public AcademicoService getAcademicoService() {
        return academicoService;
    }

    public FinanceiroService getFinanceiroService() {
        return financeiroService;
    }

    public AlunoRepositorio getAlunoRepositorio() {
        return alunoRepositorio;
    }

    public RelatorioService getRelatorioService() {
        return relatorioService;
    }

    public RegistrarAdvertenciaService getRegistrarAdvertenciaService() {
        return registrarAdvertenciaService;
    }
}
