
package Exercicio1;


public class Ex1ThreadTest {
    
     public static void main(String[] args) {
        
        
        Ex1Thread t1 = new Ex1Thread(7,17);
       
        Ex1Thread t2 = new Ex1Thread(13,33);
     
        Ex1Thread t3 = new Ex1Thread(12,72);
        
        Ex1Thread t4 = new Ex1Thread(8,36);

        Ex1Thread t5 = new Ex1Thread(12,120);
      
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();  
        t5.start();
    }
}
