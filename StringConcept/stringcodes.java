public class stringcodes{
    public static void main(String[] args) {
        String name = "John Doe";
        System.out.println("Name: " + name);

        // String concatenation
        /*(String greeting = "Hello, " + name + "!";
        System.out.println(greeting);

        // String length
        int length = name.length();
        System.out.println("Length of name: " + length);

        // Substring
        String firstName = name.substring(0, 4);
        System.out.println("First Name: " + firstName);

        // String comparison
        String anotherName = "john doe";
        boolean isEqual = name.equalsIgnoreCase(anotherName);
        System.out.println("Is the name equal to anotherName? " + isEqual);*/

        //to print each character of the string
        /*for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }*/
       //to print vowel in the string
       /*for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                 System.out.println(ch);
            }
            else{
                System.out.println("not a vowel" +ch);
            }           
       
        }*/
       //to count the number of vowels in the string
         /*int count = 0;
            for(int i=0;i<name.length();i++){
                char ch = name.charAt(i);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                    count++;
                }
}
        System.out.println("Number of vowels in the name: " + count);*/

        // to check string is palindrome or not
        /*String original = "madam";
        String reversed = "";
        for(int i=original.length()-1;i>=0;i--){

            reversed = reversed + original.charAt(i);
        }
        if(original.equals(reversed)){
            System.out.println("The string is a palindrome.");
        }
        else{
            System.out.println("The string is not a palindrome.");
        }*/
       // to remove all whitespace from the string
         /*String stringWithWhitespace = "  Hello World  ";
          String stringWithoutWhitespace = stringWithWhitespace.replaceAll("\\s", "");
          System.out.println("String without whitespace: '" + stringWithoutWhitespace + "'");*/

          //convert string to uppercase withou method
            /*String lowerCaseString = "hello world";
            String upperCaseString = "";
            for(int i=0;i<lowerCaseString.length();i++){
                char ch = lowerCaseString.charAt(i);
                if(ch>='a' && ch<='z'){
                    upperCaseString = upperCaseString + (char)(ch - ('a' - 'A'));
                }
                else{
                    upperCaseString = upperCaseString + ch;
                }
            }
            System.out.println("Uppercase String: " + upperCaseString);*/
            // to print first repeating character in the string
            /*String s = "hello world";

for(int i = 0; i < s.length(); i++) {
    char ch = s.charAt(i);
    int count = 0;

    for(int j = 0; j < s.length(); j++) {
        if(ch == s.charAt(j)) {
            count++;
        }
    }

    if(count > 1) {
        System.out.println("The first repeating character is: " + ch);
        break;*/

        // to print first non repeating character in the string
        /*String s = "hello world";
for(int i = 0; i < s.length(); i++) {
    char ch = s.charAt(i);
    int count = 0;
    for(int j = 0; j < s.length(); j++) {
        if(ch == s.charAt(j)) {
            count++;
        }


    }
    if(count == 1) {
        System.out.println("The first non-repeating character is: " + ch);
        break;*/
// to remove all duplicate in given string and print remaining string//
/*String s ="hello world";
String result="";
for ( int i=0;i<s.length();i++){
    char ch=s.charAt(i);
    if (result.indexOf(ch)==-1){
        result=result+ch;

    }

}
System.out.println("String after removing duplicates: " + result);*/



}
}
    