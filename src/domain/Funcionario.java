package domain;

import java.time.LocalDate;

public abstract class Funcionario {

    private String nome;
    private String email;
    private Integer matricula;
    private LocalDate dataAdmissao;

    public Funcionario(String nome, String email, Integer matricula, LocalDate dataAdmissao) {
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
        this.dataAdmissao = dataAdmissao;
    }

    public String getNome() {
        return nome;
    }

    public Funcionario setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Funcionario setEmail(String email) {
        this.email = email;
        return this;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public Funcionario setMatricula(Integer matricula) {
        this.matricula = matricula;
        return this;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public Funcionario setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
        return this;
    }

    public abstract String getInformacoes();
}
