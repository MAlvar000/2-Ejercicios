package mates;

public class Numeros{

    public static int suma(int n){
        return suma(n, 0, 0);
    }
    public static int suma(int n, int contador, int resultado){
        if(n == contador){
            System.out.println("La suma de los números del 1 al "+n+" es: "+resultado);
            return resultado;
        } else {
            resultado++;
            return suma(n, contador + 1, contador + resultado);
        }
    }


    public static int factorial(int fact){
        if(fact == 0 || fact == 1){
            return 1;
        } else {
            return fact * factorial(fact - 1);
        }
    }

    
    public static int potencia(int num, int n){
        if(n == 0){
            return 1;
        } else {
            return num * potencia(num, n - 1);
        }
    }

    
    public static int sumaLista(int[] lista){
        return sumaLista(lista, 0);
    }
    public static int sumaLista(int[] lista, int indice){
        if(indice == lista.length){
            return 0;
        } else {
            return lista[indice] + sumaLista(lista, indice + 1);
        }
    }

    public static double mediaAritmetica(int[] lista){
        int suma = sumaLista(lista);
        double media = (double) suma / lista.length;
        System.out.println("La media aritmética de la lista es: " + media);
        return media;
    }

    public static double desviacionTipica(int[] lista){
        double media = mediaAritmetica(lista);
        return desviacionTipica(lista, media, 0);
    }
    public static double desviacionTipica(int[] lista, double media, int indice){
        if(indice == lista.length){
            double varianza = desviacionTipica(lista, media, 0, 0) / lista.length;
            double desviacion = Math.sqrt(varianza);
            System.out.println("La desviación típica de la lista es: " + desviacion);
            return desviacion;
        } else {
            return desviacionTipica(lista, media, indice + 1);
        }
    }
    public static double desviacionTipica(int[] lista, double media, int indice, double sumaDesviaciones){
        if(indice == lista.length){
            return sumaDesviaciones;
        } else {
            sumaDesviaciones += Math.pow(lista[indice] - media, 2);
            return desviacionTipica(lista, media, indice + 1, sumaDesviaciones);
        }
    }

   
    public static int sumaPares(int n){
        if(n <= 1){
            return 0;
        } else if(n % 2 == 0){
            return n + sumaPares(n - 2);
        } else {
            return sumaPares(n - 1);
        }
    }

 
    public static int sumaElementosPares(int[] lista){
        return sumaElementosPares(lista, 0);
    }
    public static int sumaElementosPares(int[] lista, int indice){
        if(indice == lista.length){
            return 0;
        } else if(lista[indice] % 2 == 0){
            return lista[indice] + sumaElementosPares(lista, indice + 1);
        } else {
            return sumaElementosPares(lista, indice + 1);
        }
    }

  
    public static int[] obtenerListaPar(int[] lista){
        int contadorPares = contarPares(lista, 0);
        int[] pares = new int[contadorPares];
        obtenerListaPar(lista, pares, 0, 0);
        System.out.print("La lista de números pares es: ");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println();
        return pares;
    }
    public static int contarPares(int[] lista, int indice){
        if(indice == lista.length){
            return 0;
        } else if(lista[indice] % 2 == 0){
            return 1 + contarPares(lista, indice + 1);
        } else {
            return contarPares(lista, indice + 1);
        }
    }
    public static void obtenerListaPar(int[] lista, int[] pares, int indiceLista, int indicePares){
        if(indiceLista < lista.length){
            if(lista[indiceLista] % 2 == 0){
                pares[indicePares] = lista[indiceLista];
                obtenerListaPar(lista, pares, indiceLista + 1, indicePares + 1);
            } else {
                obtenerListaPar(lista, pares, indiceLista + 1, indicePares);
            }
        }
    }

    
    public static int[] listaPar(int n){
        int tamaño = n / 2;
        int[] pares = new int[tamaño];
        listaPar(pares, n, 0);
        System.out.print("La lista de números pares hasta " + n + " es: ");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println();
        return pares;
    }
    public static void listaPar(int[] pares, int n, int indice){
        if(n <= 1){
            return;
        } else if(n % 2 == 0){
            pares[indice] = n;
            listaPar(pares, n - 2, indice + 1);
        } else {
            listaPar(pares, n - 1, indice);
        }
    }

    public static int calcularProductoEscalar(int[] lista1, int[] lista2){
        return calcularProductoEscalar(lista1, lista2, 0);
    }
    public static int calcularProductoEscalar(int[] lista1, int[] lista2, int indice){
        if(indice == lista1.length){
            return 0;
        } else {
            return lista1[indice] * lista2[indice] + calcularProductoEscalar(lista1, lista2, indice + 1);
        }
    }
}
