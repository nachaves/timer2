/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timer;

/**
 *
 * @author ESTUDIANTE
 */
import java.util.logging.Level;
import java.util.logging.Logger;


public class horas extends Thread{
    
        static int flag;
        
        public horas (int flag){
            this.flag = flag;          
        }
       
        @Override
        public void run(){
            int hora = 0;
            while (true){                
                System.out.println("Cambio efectuado " + flag);            
                if (flag == 1){                 
                    hora += 1;
                    Timer.sethora(hora);
                    System.out.println("Incremento min....");
                    flag = 0;
                }
                try {
                    segundos.sleep(1);
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(segundos.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (hora==59){
                    
                    hora = 0;
                    horas.flag = 1;             
            }           
        }
        }
}



