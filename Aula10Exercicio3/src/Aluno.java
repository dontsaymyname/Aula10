import java.util.Objects;

public class Aluno {

    private String nome;
    private Integer numeroDeAluno;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroDeAluno() {
        return numeroDeAluno;
    }

    public void setNumeroDeAluno(Integer numeroDeAluno) {
        this.numeroDeAluno = numeroDeAluno;
    }

    public Aluno(String nome, Integer numeroDeAluno) {
        this.nome = nome;
        this.numeroDeAluno = numeroDeAluno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(numeroDeAluno, aluno.numeroDeAluno);
    }

    @Override
    public int hashCode() {

        return Objects.hash(numeroDeAluno);
    }


}
