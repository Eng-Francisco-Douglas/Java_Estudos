public class ControleEstoquePadaria {
    public static void main(String[] args) {
        // Variáveis para controle de estoque
        int quantidadePao = 100;
        int quantidadeBolo = 50;
        double precoPao = 0.50;
        double precoBolo = 2.00;

        // Exibindo informações do estoque
        System.out.println("Quantidade de Pão: " + quantidadePao);
        System.out.println("Quantidade de Bolo: " + quantidadeBolo);
        System.out.println("Preço do Pão: R$" + precoPao);
        System.out.println("Preço do Bolo: R$" + precoBolo);

        // Cálculo do valor total do estoque
        double valorTotalEstoque = (quantidadePao * precoPao) + (quantidadeBolo * precoBolo);
        System.out.println("Valor Total do Estoque: R$" + valorTotalEstoque);
    }
}
