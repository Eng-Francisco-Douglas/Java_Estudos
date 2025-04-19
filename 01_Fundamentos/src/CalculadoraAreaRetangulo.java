public class CalculadoraAreaRetangulo {
    public static void main(String[] args) {
        double base = 5.0;
        double altura = 10.0;
        double area = calcularArea(base, altura);
        System.out.println("A área do retângulo é: " + area);
    }

    public static double calcularArea(double base, double altura) {
        return base * altura;
    }
}
