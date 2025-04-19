public class op_comparacao {
    public static void main(String[] args) {
        //Operadores de Comparação
        // ==, !=, >, <, >=, <=
        // == Igualdade
        // != Desigualdade
        // > Maior que
        // < Menor que
        // >= Maior ou igual a
        // <= Menor ou igual a
        // Exemplo de uso dos operadores de comparação
        int a = 10;
        int b = 5;
        boolean igual = (a == b); // Igualdade
        boolean diferente = (a != b); // Desigualdade
        boolean maior = (a > b); // Maior que
        boolean menor = (a < b); // Menor que
        boolean maiorOuIgual = (a >= b); // Maior ou igual a
        boolean menorOuIgual = (a <= b); // Menor ou igual a
        
        // Exibindo os resultados
        System.out.println("Igual: " + igual);
        System.out.println("Diferente: " + diferente);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Maior ou Igual: " + maiorOuIgual);
        System.out.println("Menor ou Igual: " + menorOuIgual);
    }
}
