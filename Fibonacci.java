package fibonacci;


public class Fibonacci {
    
    public static int numeros(int num1){
        if (num1 == 0){
           
            return 0;
        }else if (num1 == 1){
            return 1; 
        }else{
            return numeros(num1-1)+ numeros(num1-2);
        }
        
    }

    
    public static void main(String[] args) {
        
        for(int i=0; i<10; i++){
        System.out.println( "Numeros ("+ i+") = "+numeros(i));
        }
        
    }
    
}
