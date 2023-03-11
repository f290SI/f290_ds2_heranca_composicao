package domain;

import java.time.LocalDate;
import java.util.List;

public class Desenvolvedor extends Funcionario {

    private List<String> stack;

    public Desenvolvedor(String nome, String email,
                         Integer matricula, LocalDate dataAdmissao,
                         List<String> stack) {
        super(nome, email, matricula, dataAdmissao);
        this.stack = stack;
    }

    public List<String> getStack() {
        return stack;
    }

    public Desenvolvedor setStack(List<String> stack) {
        this.stack = stack;
        return this;
    }

    @Override
    public String getInformacoes() {
        return String.format("""
                        Matricula: %s
                        Nome: %s
                        E-mail: %s
                        Data de admissão: %s
                        Dev Stack: %s
                        """,
                getMatricula(), getNome(),
                getEmail(), getDataAdmissao(), stack
        );
    }
}
