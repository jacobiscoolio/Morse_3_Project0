
package morse_3_project0;


public class Morse_3_Project0 {

    
    public static void main(String[] args) {
    for(int i = 1;i < 501; i++) {
         if(isDivisiblebythritythree(i)){
             System.out.println(i + " Herr Derektor");
         }
         else if(isDivisiblebyfiftyfive(i)){
            System.out.println(i + " Animate this");
        }
        
         else if(isDivisiblebytwentytwo(i)){
            System.out.println(i + " ninja");
        }
         else if(isDivisiblebytwo(i) && isDivisiblebythree(i) && isDivisiblebyfive(i)) {
         
             System.out.println(i + " Team Building");
        
             
        }else if(isDivisiblebythree(i) && isDivisiblebyfive(i)){
            System.out.println(i + " Oldschool");
        }
        else if(isDivisiblebytwo(i) && isDivisiblebythree(i)){
            System.out.println(i + " chisme");
        }
        else if(isDivisiblebythree(i)){
            System.out.println(i +" Claughton");
        
        }
        else if(isDivisiblebyfive(i)){
            System.out.println(i + " Vidal");
        }
        
        else if(isDivisiblebytwo(i)){
            System.out.println(i + " Davis");
        }
           
        
    }
    
    
    
    
    
    } 
    static boolean isDivisiblebytwo(int someNumber){
    
    return(someNumber % 2 ==0);

    }
    static boolean isDivisiblebythree(int someNumber){
    
    return(someNumber % 3 ==0);

    }
    static boolean isDivisiblebyfive(int someNumber){
    
    return(someNumber % 5 ==0);

   }
    static boolean isDivisiblebyeleven(int someNumber){
    
    return(someNumber % 11 ==0);

    }    
 static boolean isDivisiblebytwentytwo(int someNumber){
    
    return(someNumber % 22 ==0);

    }  
 static boolean isDivisiblebyfiftyfive(int someNumber){
    
    return(someNumber % 55 ==0);

    }
 static boolean isDivisiblebythritythree(int someNumber){
    
    return(someNumber % 33 ==0);

    }
}
    
