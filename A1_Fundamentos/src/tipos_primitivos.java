//Tipos Primitivos em Java
public class tipos_primitivos {
    public static void main(String[] args){
        // Tipos primitivos em Java
        // byte, short, int, long, float, double, char, boolean

        // byte: 8 bits
        byte b = 127; // -128 a 127
        System.out.println("byte: " + b);

        // short: 16 bits
        short s = 32767; // -32768 a 32767
        System.out.println("short: " + s);

        // int: 32 bits
        int i = 2147483647; // -2147483648 a 2147483647
        System.out.println("int: " + i);

        // long: 64 bits
        long l = 9223372036854775807L; // -9223372036854775808 a 9223372036854775807
        System.out.println("long: " + l);

        // float: 32 bits
        float f = 3.14f; // -3.40282347E+38 a 3.40282347E+38
        System.out.println("float: " + f);

        // double: 64 bits
        double d = 3.14; // -1.79769313486231570E+308 a 1.79769313486231570E+308
        System.out.println("double: " + d);

        // char: 16 bits (Unicode)
        char c = 'A'; // 'A' a 'Z'
        System.out.println("char: " + c);

        // boolean: true ou false
        boolean bool = true;
        System.out.println("boolean: " + bool);
    } 
}
