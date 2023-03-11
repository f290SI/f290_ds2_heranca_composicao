package domain;

import java.time.LocalDate;
import java.util.Random;

public class Pediatra extends Medico implements ContratoProcediementoCirurgico{
    public Pediatra(String nome, String email, Integer matricula, LocalDate dataAdmissao, Integer crm) {
        super(nome, email, matricula, dataAdmissao, crm);
    }

    @Override
    public void executaAtendimento(Funcionario funcionario) throws Exception {
        System.out.printf("Iniciando o atendimento de %s...\n", funcionario.getNome());
        aferirTemperatuda(funcionario);
        aferirPressao(funcionario);
    }

    @Override
    public void executarProcedimentoCirurgico(Funcionario funcionario) {
        System.out.println("Realizada a cirirgia em "+funcionario.getNome());
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
