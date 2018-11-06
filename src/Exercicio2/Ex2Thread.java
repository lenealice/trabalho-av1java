
package Exercicio2;


public class Ex2Thread  extends Thread{
     
    int id;
    int[] linha;
    int soma = 0;

    public Ex2Thread(int id, int[] linha) {
        this.linha = linha;
        this.id = id;
    }

    @Override
    public void run() {

        System.out.print("[ ");
        for (int x = 0; x < linha.length; x++) {
            soma += linha[x];
            System.out.print(linha[x] + " ");
        }
        System.out.print("] Thread Id: " + id + " Soma = " + soma + "\n");

    }

}