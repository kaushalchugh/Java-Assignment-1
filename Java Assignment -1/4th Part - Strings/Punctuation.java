
//Java Program to count the total numbers of punctuation characters exist in a string

public class Punctuation {  
    public static void main (String [] args) {   
        int countPunc = 0;  
        String str = "Good Morning! Sir, Have your tea?";  
        for (int i = 0; i < str.length(); i++) {   
            if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' || str.charAt(i) == '?' || str.charAt(i) == '-' ||  str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':') {  
                countPunc++;  
            }  
        }  
        System.out.println("Total number of punctuation characters exists in string: " +  countPunc);  
    }  
}  
