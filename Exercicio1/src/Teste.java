public class Teste {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Barry Allen", 100000000);
        Pessoa pessoa2 = new Pessoa("Wally West", 100000000);

        if (pessoa1.equals(pessoa2)){
            System.out.println("É o mesmo Flash");
        }else {
            System.out.println("Não é o mesmo Flash");
        }

    }
}
