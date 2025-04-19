/**
 * Classe que demonstra o uso de inferência de tipos com a palavra-chave `var` no Java.
 * A inferência de tipos permite que o compilador determine automaticamente o tipo da variável
 * com base no valor atribuído a ela.
 */
public class inferencia_var {
    public static void main(String[] args) {
        // A variável `nome` é inferida como String
        var nome = "Lucas";

        // A variável `idade` é inferida como int
        var idade = 20;

        // A variável `altura` é inferida como double
        var altura = 1.80;

        // A variável `maiorDeIdade` é inferida como boolean
        var maiorDeIdade = true;

        // Exibe os valores das variáveis no console
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Maior de Idade: " + maiorDeIdade);
    }
}