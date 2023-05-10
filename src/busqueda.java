public class busqueda {
    public int searchBinary(int[] nums, int target) {
        int izquierda = nums[0];
        int derecha = nums[nums.length - 1];

        while (izquierda < derecha) {
            int medio = izquierda + derecha / 2;
            if (target == nums[medio]) {
                return medio;
            } else if (target > nums[medio]) {
                return medio + 1;
            } else {
                return medio - 1;
            }
        }
        return -1;
    }

    public int busquedaLineal(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            }
        }
        return -1;
    }

    public int[] crearArreglo(int tamanio, int valorMin) {
        int[] arreglo= new int[tamanio];
        for (int i =0; i < tamanio; i++) {
            arreglo[i] = valorMin+i;
        }
        return arreglo;
    }


    public String calcularTiempo(){
        String texto=" ";
        int size=100;
        int valorinicial=10;

        for (int i =0; i < 4; i++) {

            int[]arreglo= crearArreglo(size,valorinicial);

            //Busqueda lineal
            long tiempoinicio1=System.nanoTime();
            busquedaLineal(arreglo,-20);
            long tiempofinal1=System.nanoTime();
            long tiempoTotal1=tiempofinal1-tiempoinicio1;

            //Busqueda Binaria
            long tiempoinicio2=System.nanoTime();
            searchBinary(arreglo,-20);
            long tiempofinal2=System.nanoTime();
            long tiempoTotal2=tiempofinal2-tiempoinicio2;
            int x=i+1;
            texto +="\nARREGLO "+x+": "+"Tamaño: "+arreglo.length+" Valor inicial: "+valorinicial+"\nBusqueda Lineal: "+tiempoTotal1+"\nBusqueda Binaria: "+tiempoTotal2;

            size=size*10;

        }
        return texto;
    }


}
