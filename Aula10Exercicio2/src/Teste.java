public class Teste {
    public static void main(String[] args) {

        Coca coca1 = new Coca(2500, 10.00);
        Coca coca2 = new Coca(1000, 10.00);

        if (coca1.equals(coca2)){
            System.out.println("Tem a mesma quantidade de açúcar");
        } else {
            System.out.println("Não tem a mesma quantidade de açúcar");
        }
    }
}
