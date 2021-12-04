package Searching;

public class BinarySearch {

    public static int iterativeSearch(int[] vector, int left, int right, int objective) {
        while (left >= right) {
            int mid = left + (right + left) / 2;
            if (vector[mid] == objective) return mid;
            if (vector[mid] < objective) left = mid++;
            else right = mid--;
        }
        return -1;
    }

    public int recursiveSearch(int[] array, int left, int right, int objective) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (array[mid] == objective) return mid;
            else if (array[mid] > objective) return this.recursiveSearch(array, left, mid - 1, objective);
            return this.recursiveSearch(array, mid + 1, right, objective);
        }
        return -1;//t(n) <= t(n-1)
    }
    // a1 = a2 = new char[N] hace que ambos esten copiados todo el tiempo

    public static void main(String[] args) {
        int[] vec = {1, 2, 3, 5, 6, 7};
        BinarySearch bs = new BinarySearch();
        int result = bs.recursiveSearch(vec, 0, vec.length - 1, 5);
        System.out.println(result);

        /*
        Scanner teclado = new Scanner(System.in); // Clase que permite utilizar la consola
        System.out.print("Escriba el tamaño del arreglo A: ");
        int a = teclado.nextInt();
        System.out.print("Escriba el tamaño del arreglo B: ");
        int b = teclado.nextInt();

        char[] A = new char[a];
        char[] B = new char[b];
        ArrayList<Character> C = new ArrayList<>(); // arreglo dinámico

        for (int i = 0; i < a; i++) {
            System.out.println("Ingrese el valor "+(i+1)+" para A");
            String ch = teclado.next();
            A[i] = ch.charAt(0);
        }
        for (int i = 0; i < b; i++) {
            System.out.println("Ingrese el valor "+(i+1)+" para B");
            String ch = teclado.next();
            B[i] = ch.charAt(0);
        }
        for (int i = 0; i < a; i++) {
            int j;
            for (j = 0; j < b; j++) {
                // si no hay valores iguales de A[i] en B se detiene el bucle actual
                if (A[i] == B[i]) break;
            }
            if (j == b) C.add(A[i]); // se agrega el valor de A a C
        }
        System.out.print("Valores de C: ");
        for (int i = 0; i < C.size(); i++)
            System.out.print(C.get(i)+" ");
        */

    }

}
