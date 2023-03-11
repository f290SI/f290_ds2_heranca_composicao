package domain;

import java.time.LocalDate;
import java.util.Random;

public class ClinicoGeral extends Medico{

    public ClinicoGeral(String nome, String email, Integer matricula, LocalDate dataAdmissao, Integer crm) {
        super(nome, email, matricula, dataAdmissao, crm);
    }

    @Override
    public void executaAtendimento(Funcionario funcionario) throws Exception {
        System.out.printf("Iniciando o atendimento de %s...\n", funcionario.getNome());
        aferirTemperatuda(funcionario);
        aferirPressao(funcionario);
        executarAtendimentoHumanizado();
    }

    private void executarAtendimentoHumanizado() throws Exception{
        System.out.println("Iniciando atendimento humanizado...");
        Thread.sleep(1000);
        System.out.println("Qual seu cotidiano...");
        Thread.sleep(1000);
        System.out.println("Como é sua alimentacão...");
        Thread.sleep(1000);
        System.out.println("Esta passando por problemas pessoais...");
        Thread.sleep(1000);
        System.out.println("Huummm...");
        Thread.sleep(1000);
        System.out.println("Acabou a criatividade...");
        System.out.println("=)");
    }

    @Override
    public String getInformacoes() {
        return String.format("""
                        Matricula: %s
                        Nome: %s
                        E-mail: %s
                        Data de admissão: %s
                        CRM: %s
                        """,
                getMatricula(), getNome(),
                getEmail(), getDataAdmissao(), getCrm()
        );
    }
}
