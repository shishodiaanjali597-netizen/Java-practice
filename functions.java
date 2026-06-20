/*public class functions {

    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x +y) * 5;
        }
        x = 566;
        return z;
    }


    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        // Method invocation using Object creation
        //cwh_31_methods obj = new cwh_31_methods();
        //c = obj.logic(a, b);
        c = logic(a, b);
        System.out.println(a + " "+ b);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
        //to show that the value of a and b is not changed because we are passing the value of a and b not the reference of a and b
        System.out.println(a + " "+ b);     
    }
}*/

//to print the multiplication of two numbers using function
/*public class functions {

    static int multiplication(int x, int y){
        int z = x * y;
        return z;
    }*/

// to print the maximum of two numbers using function
/*public class functions {
    
    static int maximum(int x, int y){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }*/
   // to print reverse of a number using function
/*public class functions {
    
    static int reverse(int x){
        int rev = 0;
        while(x>0){
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        return rev;
    }
}*/
// to check whether the number is prime or not using function
/*public class functions {
    
    static boolean isPrime(int x){
        if(x<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
}*/
// to check whether the number is palindrome or not using function
/*public class functions {
    
    static boolean isPalindrome(int x){
        int original = x;
        int rev = 0;
        while(x>0){
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        return original == rev;
    }
}*/
// to check whether the number is armstrong or not using function   
/*public class functions {
    
    static boolean isArmstrong(int x){
        int original = x;
        int sum = 0;
        while(x>0){
            int rem = x % 10;
            sum = sum + rem * rem * rem;
            x = x / 10;
        }
        return original == sum;
    }
}*/