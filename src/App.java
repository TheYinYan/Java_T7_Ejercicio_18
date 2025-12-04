import Funciones.Array;

public class App {
    public static void main(String[] args) throws Exception {
        int[] num = Array.crearArray(10);
        Array.pintarArray(num);

        int nMax = Array.nMax(num);
        int[] posicionMax = new int[nMax];
        int nPosicionmax = 0;

        int nMin = Array.nMin(num);
        int[] posicionMin = new int[nMin];
        int nPosicionMin = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > 100) {
                posicionMax[nPosicionmax++] = num[i];
            }
            if (num[i] <= 100) {
                posicionMin[nPosicionMin++] = num[i];
            }
        }

        System.out.println("Max:");
        Array.pintarArray(posicionMax);

        System.out.println("Min");
        Array.pintarArray(posicionMin);

        int[] aux = new int[10];
        int min = 0;
        int max = 0;
        for (int i = 0; i < aux.length; i++) {
            if (i % 2 == 0) {
                if (nMin > min) {
                    aux[i] = posicionMin[min++];
                } else {
                    aux[i] = posicionMax[max++];
                }
            } else {
                if (nMax > max) {
                    aux[i] = posicionMax[max++];
                } else {
                    aux[i] = posicionMin[min++];
                }
            }
        }
        Array.pintarArray(aux);
    }
}
