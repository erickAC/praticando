package pesquisabinaria;

public class PesquisaBinaria {
    public static void main(String[] args) {
        System.out.println(pesquisabinaria(new int[]{ 1, 3, 5, 7, 9 }, 9));
    }

    public static int pesquisabinaria(int[] lista, int item) {
        int baixo = 0;
        int alto = lista.length - 1;

        while(baixo <= alto) {
            int meio = (baixo + alto) / 2;
            int chute = lista[meio];
            if (chute == item) {
                return meio;
            }
            if (chute > item) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }
        return 0;
    }
}