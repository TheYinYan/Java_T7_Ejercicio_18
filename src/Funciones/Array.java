package Funciones;

public class Array {
    public static int[] crearArray(int longitud) {
        int[] array = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            array[i] = (int) (Math.random() * 201);
        }
        return array;
    }



    public static void pintarArray(int[] array) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == 0 || i == 2 || i == 4)
                    System.out.print("------");

                if (i == 1 || i == 3)
                    System.out.printf("| %3d%s", (i == 1) ? j : array[j], (j == array.length - 1) ? " |" : " ");
            }
            System.out.println();
        }
    }

    public static int numArray(int[] array) {
        boolean correcto = false;
        int num = 0;
        while (!correcto) {
            num = Integer.parseInt(System.console().readLine("Intruduzca numero que este en la array "));
            for (int i = 0; i < array.length; i++) {
                if (array[i] == num)
                    correcto = true;
            }
            if (!correcto)
                System.out.println("Numero introducido no esta en la array");
        }
        return num;
    }

    public static int nMax(int[] array) {
        int nMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 100) {
                nMax++;
            }
        }
        return nMax;
    }

        public static int nMin(int[] array) {
        int nMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 100) {
                nMin++;
            }
        }
        return nMin;
    }

    public static int posicion(int[] array, int num) {
        int posicion = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                posicion = i;
            }
        }
        return posicion;
    }

    public static int[] moverDerecha(int[] array, int desde, int hasta) {
        int[] aux = array;
        for (int i = hasta; i > desde; i--) {
            aux[i] = aux[i - 1];
        }
        if (hasta == array[array.length - 1]) {
            aux[0] = array[array.length - 1];
        }
        return aux;
    }
}
