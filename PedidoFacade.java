public class PedidoFacade {
    
    public void processarPedido(Produto produto) {
        System.out.println("--- Iniciando Processamento do Pedido ---");
        
        boolean disponivel = ServicoEstoque.isAvailable(produto);
        
        if (disponivel) {
            boolean pago = ServicoPagamento.makePayment();
            
            if (pago) {
                ServicoRemessa.shipProduct(produto);
                System.out.println("--- Pedido Concluído com Sucesso ---");
            } else {
                System.out.println("Erro: Falha no pagamento.");
            }
        } else {
            System.out.println("Erro: Produto indisponível.");
        }
    }
}