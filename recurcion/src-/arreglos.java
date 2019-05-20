public static void recorridoRecusivo(int[][] arreglo, int longI, int longJ) {
        //caso base
        int j = longJ;
        String fila;

        if (longI == 0) {

        } else {
            fila = recorridoColumnas(arreglo[longI - 1], longJ);
            recorridoRecusivo(arreglo, longI - 1, longJ);
            System.out.println(fila);
        }

    }

    public static String recorridoColumnas(int[] arreglo, int i) {
        //recorremos las columnas de una matriz
        String retorno;
        if (i == 1) {
            retorno = arreglo[i - 1] + "";
        } else {
            retorno = recorridoColumnas(arreglo, i - 1) + " " + arreglo[i - 1];
        }

        return retorno;
    }
