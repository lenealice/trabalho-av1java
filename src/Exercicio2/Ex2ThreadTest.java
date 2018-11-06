
package Exercicio2;

public class Ex2ThreadTest {
    
    public static void main(String[] args) {
        int[][] matriz = new int[3][5];
        
        Ex2Thread[] threads = new Ex2Thread[3];

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                matriz[linha][coluna] = (int) (Math.random() * 10 + 3);
            }
            threads[linha] = new Ex2Thread(linha, matriz[linha]);
        }

        for (int linha = 0; linha < threads.length; linha++) {
            threads[linha].start();
            // método join() para sincronizar as threads
            try {
                threads[linha].join();
            } catch (InterruptedException ex) {
                
            }
        }

    }

}