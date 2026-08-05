package projeto10;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Como ser aviaozinho de sucesso.", "Marquinho", "789-9288377499");
      
        l1.exibirInfo();
      
        l1.emprestar();
        l1.exibirInfo();

        l1.devolver();
        l1.exibirInfo();
    }
}
