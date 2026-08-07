import java.util.HashMap;
import java.util.Map;

public class Atividade04 {
    public static void main(String[] args) {
        Map<String, Double> produtos = new HashMap<>();

        produtos.put("Teclado", 150.0);
        produtos.put("Mouse", 80.0);
        produtos.put("Monitor", 900.0);

        produtos.put("Mouse", 95.50);

        String produtoBuscado = "Mouse";
        Double preco = produtos.get(produtoBuscado);

        System.out.println("O preço atual do " + produtoBuscado + " é: R$ " + preco);
    }
}
