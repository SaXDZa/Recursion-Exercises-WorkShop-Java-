public class Main {
    public static void main(String[] args) {

        // 1. Factorial
        System.out.println("Factorial de (12): " + Funciones.point1Factorial(12));

        // 2. Suma del 1 al N
        System.out.println("Suma del 1 al 20: " + Funciones.point2Sumar(20));

        // 3. Potencia
        System.out.println("(3) elevado a la (5): " + Funciones.point3Potencia(3, 5));

        // 4. Contar dígitos
        System.out.println("Dígitos de (123456): " + Funciones.point4contar(123456));

        // 5. Invertir cadena
        System.out.println("Invertir \"profe\": " + Funciones.point5InvertirCadena("profe"));
    }
}