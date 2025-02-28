package edd;

public class PesquisaBinaria {

    public static void main(String[] args) {

        pesquisaBinaria(new int[] {1, 2, 3, 4, 5, 6, 7}, 6);

    }

    public static Integer pesquisaBinaria(int[] list, int item) {

        int baixo = 0;
        int alto = list.length - 1;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            int chute = list[meio];

            if (chute == item) {
                System.out.println("Item encontrado");
                return meio;
            }

            if (chute > item) {
                alto = meio + 1;
            } else {
                baixo = meio - 1;
            }

        }

        return null;

    }



}
