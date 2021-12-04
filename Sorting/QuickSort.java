package Sorting;

public class QuickSort {

    public static void main(String[] args) {
        QuickSort ordenar = new QuickSort();
        int vector3[] = {15,67,8,16,44,27,12,35};
        System.out.println("Arreglo Original");
        ordenar.mostrararreglo(vector3);
        System.out.println("Arreglo Ordenado");
        ordenar.quick(vector3, 0, vector3.length - 1);
        System.out.println(vector3.length / 2);

    }
    public void myOrder(int[] array){
        int low = 0;
        int high = array.length;
        int pivot = array[high];
        int[] outputArray = array;


    }

    public void mostrararreglo(int[] arreglo) {
        int k;
        for (k = 0; k < arreglo.length; k++) {
            System.out.print("[" + arreglo[k] + "]");
        }
        System.out.println();
    }
    public void swap (int[] arreglo, int i, int j){
        int auxiliar = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = auxiliar;
    }
    public void quick(int[] arreglo, int primero, int ultimo) {
        int i, j, pivote, auxiliar;
        i = primero;
        j = ultimo;
        // toma como pivote al elemento más al medio o la mediana
        pivote = arreglo[(primero + ultimo) / 2];
        do {
            while (arreglo[i] < pivote) { // recorrido left to right
                i++;
            }
            while (arreglo[j] > pivote) { // recorrido right to left
                j--;
            }
            //aqui hacemos el intercambio
            if (i <= j) {
                this.swap(arreglo, i, j);
                i++;
                j--;
            }
        } while (i <= j);
        //es lo que hace la subdivicion
        if (primero < j) {
            quick(arreglo, primero, j);
        }
        if (i < ultimo) {
            quick(arreglo, i, ultimo);
        }
        mostrararreglo(arreglo);
    }

}
