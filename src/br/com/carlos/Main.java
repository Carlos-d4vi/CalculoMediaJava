package br.com.carlos;

public class Main {
    public static void main(String[] args) {
        int[] notas = new int[]{5,7,8,5,6,4,8,7,5,5};

         Calcular obj = new Calcular();

         int mediaCalculada = obj.calcularMedia(notas);

         System.out.println(mediaCalculada);

    }
}
