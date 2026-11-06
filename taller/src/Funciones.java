import java.util.Scanner;

public class Funciones {



    static int point1Factorial(int n) { //Factorial de un Numero
        if (n == 0) { // "Caso base" este detiene la recursividad, porque !0=1.
            return 1; //Si n=0 entonces devuelve 1
        }
        int resultado = point1Factorial(n - 1) * n; //Se llama a si misma la funcion con n-1, al devolver el valor, esta la multiplico por n.
        return resultado; //Devuelvo el valor calculado que pusieron en la funcion.
    }


    static int point2Sumar(int n) {//Suma de los números del 1 al N
        if (n == 1) { //Detiene la recursion, La suma de 1 hasta 1 es simplemente 1
            return 1; //Es 1 y no 0 porque la suma empieza desde 1
        }
        int resultado = point2Sumar(n - 1) + n; // Se llama con n-1 hasta llegar a n=1, y ahi se devuelven las llamadas, esta suma su n al resultado recibido
        return resultado;

    }

    static int point3Potencia(int base, int exponente) { //Potencia de un Numero
        if (exponente == 0) {
            return 1;
        }
        return base * point3Potencia(base, exponente - 1); //Se llama con la misma base y exponente -1
        //Con devolver la llamada, se multiplica por la base que es fija.
    }

    static int point4contar(int n) { //Contar digitos de un numero
        if (n < 10) { //"Caso base" Al ser un numero menor que 9, fijamente tiene solo un digito.
            return 1;
        }
        int cuentahastaelMomento = 1 + point4contar(n / 10); //el n/10 me descarta el ultimo digito y se vuelve a llamar pero con un numero mas corto.
        return cuentahastaelMomento; //Me devuelve el conteo acumulado, al final dandome la cantidad de digitos segun las veces que se devolvio +1.
    }

    static String point5InvertirCadena(String cadena) { //Invertir una cadena
        if (cadena.length() <= 1) {  //la cadena al tener 1 caracter ya es igual al reves.
            return cadena;
        }
        return point5InvertirCadena(cadena.substring(1)) + cadena.charAt(0);
        //cadena.substring(1) me devuelve la cadena sin el primer caracter, esta se llama a si misma con esa cadena mas corta.
        // el + me une la cadena ya invertida y despues el primer caracter. El tenerlo asi permite la inversion.
    }
}
