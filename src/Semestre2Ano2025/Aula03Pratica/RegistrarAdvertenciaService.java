package Semestre2Ano2025.Aula03Pratica;

public class RegistrarAdvertenciaService {
    private AlunoRepositorio alunoRepositorio;

    public RegistrarAdvertenciaService(AlunoRepositorio alunoRepositorio) {
        this.alunoRepositorio = alunoRepositorio;
    }

    public void registrarAdvertenciaPorFaltaEmAvaliacao(String ra, boolean faltou) {
        Aluno aluno = alunoRepositorio.validarExistencia(ra);
        if (aluno == null) return;

        if (faltou) {
            System.out.println("[OCORRENCIA] RA " + ra + " recebeu advertência por falta em avaliação.");
            NotificaoService.enviarEmail(aluno.getEmail(),
                    "Advertência registrada",
                    "Compareça à coordenação para ciência.");
        }
    }
}
