import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Sullivan", 1234);
        Funcionario funcionario2 = new Funcionario("Wazowski", 2341);
        Funcionario funcionario3 = new Funcionario("Randall", 3412);
        Funcionario funcionario4 = new Funcionario("Celia Mae", 4123);

        List<Funcionario> listaFuncionarios = new ArrayList<>();

        Funcionario funcionario5 = new Funcionario("Waternoose", 0000);
        listaFuncionarios.add(funcionario5);

        if (listaFuncionarios.equals(funcionario5)){
            System.out.println("Waternoose é o manda chuva.");
        } else {
            System.out.println("Waternoose não trabalha mais na Monsters, Inc.");
            System.out.println("Wazowski no comando agora!");
        }



    }
}
