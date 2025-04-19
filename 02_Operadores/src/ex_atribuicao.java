public class ex_atribuicao {
    public static void main(String[] args) {
        // Atribuição simples
        int a = 10; // a recebe o valor 10
        System.out.println("Valor de a: " + a); // Imprime o valor de a

        // Atribuição composta
        a += 5; // a = a + 5, agora a é 15
        System.out.println("Valor de a após += 5: " + a); // Imprime o novo valor de a

        a -= 3; // a = a - 3, agora a é 12
        System.out.println("Valor de a após -= 3: " + a); // Imprime o novo valor de a

        a *= 2; // a = a * 2, agora a é 24
        System.out.println("Valor de a após *= 2: " + a); // Imprime o novo valor de a

        a /= 4; // a = a / 4, agora a é 6
        System.out.println("Valor de a após /= 4: " + a); // Imprime o novo valor de a

        a %= 5; // a = a % 5, agora a é 1
        System.out.println("Valor de a após %= 5: " + a); // Imprime o novo valor de a
    }
}
