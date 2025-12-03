public class MainLogistica {
    public static void main(String[] args) {
        // Criando um produto
        Produto meuProduto = new Produto(1, "Notebook Gamer");
        
        // Usando o Facade para não ter que chamar cada serviço manualmente
        PedidoFacade facade = new PedidoFacade();
        facade.processarPedido(meuProduto);
    }
}