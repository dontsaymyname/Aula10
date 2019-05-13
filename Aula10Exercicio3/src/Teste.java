import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Teste {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Mutano", 1234);
        Aluno aluno2 = new Aluno("Ciborg", 2341);
        Aluno aluno3 = new Aluno("Ravena", 3412);
        Aluno aluno4 = new Aluno("Robin", 4123);
        Aluno aluno5 = new Aluno("Estelar", 4321);

        List<Aluno> listaAlunos = new ArrayList<>();
        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);
        listaAlunos.add(aluno3);
        listaAlunos.add(aluno4);
        listaAlunos.add(aluno5);



        if (listaAlunos.contains(aluno5)){
            System.out.println("O(a) aluno(a) " + aluno5.getNome() + " está na turma");
        } else{
            System.out.println("O(a) aluno(a) não está na turma");

        }


        Set<Aluno> conjuntoAlunos = new HashSet<>();
        conjuntoAlunos.addAll(listaAlunos);


        if (listaAlunos.size() > conjuntoAlunos.size()){
            System.out.println("Clones estão entre nós");
        } else{
            System.out.println("Nenhum aluno clonado");
        }



    }
}
