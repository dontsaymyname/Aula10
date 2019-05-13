import java.util.Objects;

public class Pessoa {

    private String nome;
    private Integer rg;

    public Pessoa(String nome, Integer rg) {
        this.nome = nome;
        this.rg = rg;
    }



    @Override
    public boolean equals(Object pessoaTeste) {
        if (this == pessoaTeste) return true;
        if (pessoaTeste == null || getClass() != pessoaTeste.getClass()) return false;
        Pessoa pessoa = (Pessoa) pessoaTeste;
        return Objects.equals(nome, pessoa.nome) &&
                Objects.equals(rg, pessoa.rg);

    }



}
