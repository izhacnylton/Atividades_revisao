import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> alunos = new ArrayList<>();
        
        alunos.add("Marquinho");
        alunos.add("Dollynho");
        alunos.add("Cleitinho");
        
        System.out.println("Lista de alunos:");
        for (String aluno : alunos) {
            System.out.println("- " + aluno);
        }

        alunos.remove(1); 

        System.out.println("\nLista de alunos atuallizada:");
        for (String aluno : alunos) {
            System.out.println("- " + aluno);
        }
    }
}
