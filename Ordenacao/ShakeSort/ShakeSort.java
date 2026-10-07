public class ShakeSort {

    public static void shakesort(int[] array){
        boolean trocou = true;
        int inicio = 0;
        int fim = array.length - 1;

        while(trocou){
            trocou = false;

            // Passagem pra direita
            for(int i = inicio; i < fim; i++){
                if(array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;

                    trocou = true;
                }
            }

            //fim--;

            for(int i = fim-1; i > inicio; i--){
                if(array[i] < array[i-1]){
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                }

                trocou = true;
            }

            inicio++;
            fim--;

            if(!trocou){
                break;
            }
        }
}

    public static void main(String[] args){
        int num[] = {1,3,6,4,7,9,2,10,20,17,19,15,16,12};

        shakesort(num);

        System.out.println("Array Ordenada:");

        for(int n : num) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}
