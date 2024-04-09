package br.com.carlos;

public class Calcular {
    int calcularMedia(int[] array){
        int divisor = array.length;
        int media = 0;
        for(int i = 0; i < divisor; i++){
            int nota = array[i];
            media += nota;
        }
        return media = media / divisor;
    }
}
