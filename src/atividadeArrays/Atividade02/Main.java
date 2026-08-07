import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        
        LinkedList<String> filaImpressao = new LinkedList<>();

        filaImpressao.add("Documento_01.pdf");
        filaImpressao.add("Documento_02.docx");
        filaImpressao.add("Documento_03.docx");

        String impresso = filaImpressao.poll(); 
        System.out.println("Documento impresso: " + impresso);

        System.out.println("\nFila de impressão atual: ");
        for (String doc : filaImpressao) {
            System.out.println("- " + doc);
        }
    }
}
