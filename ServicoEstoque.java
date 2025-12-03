public class ServicoEstoque {
    public static boolean isAvailable(Produto product) {
        System.out.println("Estoque: Verificando disponibilidade do produto " + product.name + "...");
        return true; // Simula que sempre tem estoque
    }
}