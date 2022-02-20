//1. Write a program that demonstrates exception handling mechanism.
//(a) Arithmetic exception


package Cycle6;

public class Arithmatic {

    public static void main (String args[]){
        
        try
        {
            int a = 21/0;
            

        }catch(ArithmeticException e){System.out.println("Error : Cannot Divide by Zero");}
    }
    
}
