package academy.devdojo.maratonajava.javacore.associacao.model;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this(nome);
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this(nome, especialidade);
        this.seminarios = seminarios;
    }

    public void relatorio() {
        System.out.println("Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if (seminarios == null) return;
        System.out.println("##Seminários Cadastrados##");
        for (Seminario seminario : this.seminarios) {
            System.out.println("Seminário: " + seminario.getTitulo());
            System.out.println("Local: " + seminario.getLocal().getEndereço());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("##Alunos##");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getNome() + "\n" + "Idade do Aluno: " + aluno.getIdade());

            }
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
