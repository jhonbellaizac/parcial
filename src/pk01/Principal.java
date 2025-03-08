package pk01;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
public class Principal {
    


    public static void main(String[] args) {
             
       
    
    
    
          Paquete paquetico [] = new Paquete[2];
         
          for (int k=0; k<2; k=k+1){
              
              paquetico [k] = new Paquete();
              
              paquetico[k].setCodeSeguimiento(Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo de guia")));
              paquetico[k].setDestino(JOptionPane.showInputDialog("Digite destino"));
              
          
          
              
          }
          
           String cadena= " ";
          
          for (int k=0; k<2; k=k+1){
              
              cadena = cadena +"Paquete: " + paquetico 
                      [k].getCodeSeguimiento() + " " + paquetico [k].getDestino();
          }
          
            JOptionPane.showMessageDialog(null, cadena);
        
    
    }
            
             
    }











    
    

