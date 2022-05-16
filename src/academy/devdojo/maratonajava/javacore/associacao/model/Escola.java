package academy.devdojo.maratonajava.javacore.associacao.model;

public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola(String nomme) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprimeEscola() {
        System.out.println(nome);
        if (professores == null) {
            return;
        } else {
            for (Professor professor : professores) {
                System.out.println(professor.getNome());
            }
        }
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public Professor[] getProfessores() {
        return this.professores;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}
