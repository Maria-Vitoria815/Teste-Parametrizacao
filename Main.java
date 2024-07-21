public class Main {

    public static void main(String[] args) {
        Cadastros<Conta> cadastros = new Cadastros<>();

        Conta conta1 = new Conta("user1", "user1@example.com", "senha1");
        Conta conta2 = new Conta("user2", "user2@example.com", "senha2");
        
        cadastros.adicionarConta(conta1);
        cadastros.adicionarConta(conta2);
        
        System.out.println("Listando contas após adição:");
        cadastros.listarContas();

        cadastros.removerConta(conta1);
        
        System.out.println("Listando contas após remoção:");
        cadastros.listarContas();

        Conta encontrada = cadastros.procurarContaPorUsername("user2");
        System.out.println("Conta encontrada: " + encontrada);
    }
}
    

