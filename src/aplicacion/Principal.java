package aplicacion;

import mates.Numeros;

public class Principal {
    public static void main(String[] args){
        int n = 30;
        Numeros.suma(n);
        Numeros.factorial(n);
        Numeros.potencia(8,6);
        int[] listaNumeros = {1, 2, 3, 4, 5};
        Numeros.sumaLista(listaNumeros);
        Numeros.mediaAritmetica(listaNumeros);
        Numeros.desviacionTipica(listaNumeros);
        Numeros.sumaPares(n);
        int[] listaEnteros = {2, 5, 8, 11, 14};
        Numeros.sumaElementosPares(listaEnteros);
        Numeros.obtenerListaPar(listaEnteros);
        Numeros.listaPar(n);
        int[] listaA = {1, 3, 5};
        int[] listaB = {2, 4, 6};
        Numeros.calcularProductoEscalar(listaA, listaB);
    }
}
