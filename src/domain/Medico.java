package domain;

import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.ExecutionException;

public abstract class Medico extends Funcionario{

    private Integer crm;

    public Integer getCrm() {
        return crm;
    }

    public Medico(String nome, String email, Integer matricula, LocalDate dataAdmissao, Integer crm) {
        super(nome, email, matricula, dataAdmissao);
        this.crm = crm;
    }

    public Medico setCrm(Integer crm) {
        this.crm = crm;
        return this;
    }

    public abstract void executaAtendimento(Funcionario funcionario) throws Exception;

    public void aferirPressao(Funcionario funcionario) throws Exception{
        System.out.println("Aferindo a pressão arterial..\n");
        Thread.sleep(2000);
        System.out.printf("Pressão: %s por %s.\n", new Random().nextInt(16),
                new Random().nextInt(16));
    }

    public void aferirTemperatuda(Funcionario funcionario) throws Exception {
        System.out.printf("Aferindo temperatura de %s...\n", funcionario.getNome());
        Thread.sleep(2000);
        System.out.println("Medindo a temperatura..\n");
        Thread.sleep(2000);
        System.out.printf("Temperatura: %s graus.\n", new Random().nextInt(40));
    }
}
