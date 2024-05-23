package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Example {

    // 1. Método para sumar dos números
    public int sumar(int a, int b) {
        return a + b;
    }

    // 2. Método que lanza una excepción si el argumento es negativo
    public boolean checkPositivo(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        return true;
    }

    // 3. Método para contar el número de letras 'a' en una cadena
    public int contarLetrasA(String cadena) {
        return (int) cadena.chars()
                .filter(letra -> letra == 'a')
                .count();
    }

    // 4. Método que retorna un valor booleano si la lista contiene el elemento
    public boolean contieneElemento(List<String> lista, String elemento) {
        return lista.contains(elemento);
    }

    // 5. Método para revertir una cadena
    public String revertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }

    // 6. Método que calcula el factorial de un número
    public long factorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Factorial no definido para números negativos");
        }
        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // 7. Método para verificar si un número es primo
    public boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 8. Método que simula un retraso y retorna un mensaje
    public String mensajeConRetraso() throws InterruptedException {
        Thread.sleep(5000);
        return "Listo después de retraso";
    }

    // 9. Método para convertir una lista de enteros a lista de strings
    public List<String> convertirAString(List<Integer> lista) {
        return lista.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
    }

    // 10. Método que calcula la media de una lista de enteros
    public double calcularMedia(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede ser nula o vacía");
        }
        return lista.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
    }

    // 11. Método para convertir una lista de enteros a lista de strings
    public String convertirListaAString(List<String> lista) {
        return lista.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));
    }
}
