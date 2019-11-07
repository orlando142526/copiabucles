
package exemplobucles;
import java.util.Scanner;

public class Metodos {
   
    private int num;
    Scanner sc=new Scanner (System.in);
    
    public int pedirDatos(){
         System.out.println("teclea numero:");
       num = sc.nextInt();
       return num;
    }
            
              
   public void verDatos(){
     num = pedirDatos();
       while(num !=0){
           System.out.println(num);
   num = pedirDatos();
       
    
      
           
           
       }
       System.out.println("rematamos");
       
       
       
       
   }
   
    
}
