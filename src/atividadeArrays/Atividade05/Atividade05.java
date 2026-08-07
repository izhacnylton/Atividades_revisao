interface Autenticavel { void login(); }

class Usuario implements Autenticavel {

    @Override
    public void login() {
        System.out.println("Login realizado com sucesso de forma segura!");
    }

    @Deprecated
    public void loginSemSenha() {
        System.out.println("Aviso: Realizando login antigo sem senha...");
    }
}

public class Main{
    
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
      
        Usuario usuario = new Usuario();

        System.out.println("--- Chamando método padrão ---");
        usuario.login();

        System.out.println("\n--- Chamando método depreciado ---");
        usuario.loginSemSenha();
    }
}
