// write a java program that prints "HAHA" during arithmetic exception and "HEHE" during illegal argument exception 
/*public class exceptionconcept{
    public static void main(String[]args){
        try{
            int a=10/0;
        }
        catch(ArithmeticException e){
            System.out.println("HAHA");
        }
        catch(IllegalArgumentException e){
            System.out.println("HEHE");
        }
        finally{
            System.out.println("This is finally block");
        }
    }
}*/

// wriite a java program that allows you to keep acessing an array until a valid index is given . if max retries exceed 5 print "false"
/*import java.util.*;
public class exceptionconcept{
    public static void main(String[]args){
        boolean Flag=true;
        int [] marks=new int [3];
        marks[0]=10;
        marks[1]=20;
        marks[2]=30;
        Scanner sc =new Scanner(System.in);
        int index;
        int i=0;
        while(Flag && i<5){
            
            try{
                System.out.println("Enter the index of the array");
                index=sc.nextInt();
                System.out.println("The value at index  is " + marks[index]);
                break;
            }
            catch(Exception e){
                System.out.println("Invalid index, please try again");
                i++;
            }
        }
        if(i==5){
            System.out.println("false");
        }
       
    }
}*/

//wriite a java program that allows you to keep acessing an array until a valid index is given . if max retries exceed 5 print "false" is max retreis are achieved throws custom exception
/*import java.util.*;
public class exceptionconcept{
    public static class MaxRetriesExceededException extends RuntimeException {
        public MaxRetriesExceededException(String message) {
            super(message);
        }
    }
    public static void main(String[]args){
        boolean Flag=true;
        int [] marks=new int [3];
        marks[0]=10;
        marks[1]=20;
        marks[2]=30;
        Scanner sc =new Scanner(System.in);
        int index;
        int i=0;
        while(Flag && i<5){
            
            try{
                System.out.println("Enter the index of the array");
                index=sc.nextInt();
                System.out.println("The value at index  is " + marks[index]);
                break;
            }
            catch(Exception e){
                System.out.println("Invalid index, please try again");
                i++;
            }
        }
        if(i==5){
            throw new MaxRetriesExceededException("Max retries exceeded");
        }
}}*/
