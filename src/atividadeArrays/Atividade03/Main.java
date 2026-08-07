import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
      
        Set<Integer> numerosSorteados = new HashSet<>();
        Random random = new Random();

        while (numerosSorteados.size() < 5) {
            int numero = random.nextInt(10) + 1;
            numerosSorteados.add(numero); 
        }

        System.out.println("Números sorteados: " + numerosSorteados);
    }
}
