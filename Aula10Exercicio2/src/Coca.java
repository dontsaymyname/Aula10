import java.util.Objects;

public class Coca {

    private Integer tamanho;
    private Double preco;

    public Coca(Integer tamanho, Double preco) {
        this.tamanho = tamanho;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object cocaTeste) {
        if (this == cocaTeste) return true;
        if (cocaTeste == null || getClass() != cocaTeste.getClass()) return false;
        Coca coca = (Coca) cocaTeste;
        return
                Objects.equals(preco, coca.preco);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tamanho, preco);
    }
}
