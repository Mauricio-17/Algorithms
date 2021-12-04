package Sorting;

public class MergeSort {
    public void mostrararreglo(int[] arreglo) {
        int k;
        for (k = 0; k < arreglo.length; k++) {
            System.out.print("[" + arreglo[k] + "]");
        }
        System.out.println();
    }

    public int[] mezclaDirecta(int[] arreglo) {
        int i, j, k;
        if (arreglo.length > 1) {
            int nElementosIzq = arreglo.length / 2;
            int nElementosDer = arreglo.length - nElementosIzq;
            int arregloIzq[] = new int[nElementosIzq];
            int arregloDer[] = new int[nElementosDer];
            //copiando los elementos de parte primera al arregloIzq
            for (i = 0; i < nElementosIzq; i++) {
                arregloIzq[i] = arreglo[i];
            }
            //copiando los elementos de parte segunda al arregloDer
            for (i = 0; i < nElementosIzq; i++) {
                arregloIzq[i] = arreglo[i];
            }
            for (i = nElementosIzq; i < nElementosIzq + nElementosDer; i++) {
                arregloDer[i - nElementosIzq] = arreglo[i];
            }
            //Recursividad
            arregloIzq = mezclaDirecta(arregloIzq);
            arregloDer = mezclaDirecta(arregloDer);
            i = 0;
            j = 0;
            k = 0;
            while (arregloIzq.length != j && arregloDer.length != k) {
                if (arregloIzq[j] < arregloDer[k]) {
                    arreglo[i] = arregloIzq[j];
                    i++;
                    j++;
                } else {
                    arreglo[i] = arregloDer[k];
                    i++;
                    k++;
                }
            }
            //arreglo final
            while (arregloIzq.length != j) {
                arreglo[i] = arregloIzq[j];
                i++;
                j++;
            }
            while (arregloDer.length != k) {
                arreglo[i] = arregloDer[k];
                i++;
                k++;
            }
        }//fin del if
        return arreglo;
    }

    public static void main(String[] args) {
        MergeSort ordenar = new MergeSort();
        int vector2[] = {55, 4, 43, 44, 2, 10, 4567, 638, 3, 0, -5, -9};
        System.out.println("Arreglo vector2 original");
        ordenar.mostrararreglo(vector2);
    }
}
