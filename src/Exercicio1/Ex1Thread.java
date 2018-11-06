
package Exercicio1;


public class Ex1Thread extends Thread{
    private int valorInicial;
    private int valorFinal;
    
    public Ex1Thread(int valorInicial, int valorFinal) {
        this.valorInicial = valorInicial;
        this.valorFinal = valorFinal;
    }
  
  
    @Override
    public void run() {
        for(int x = valorInicial; x <= valorFinal;x++){
            System.out.println(x);
        }
    }
 
}
    

