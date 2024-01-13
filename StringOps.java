public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
       //System.out.println(capVowelsLowRest("One two tHRee world")); 
       System.out.println(allIndexOf("Hello world",'l'));
       //System.out.println(camelCase("tWo    wordS"));
    }

    public static String capVowelsLowRest (String str) {
        String ans = "";
        int i = 0; 
        while (i < str.length()){
            char c = str.charAt(i);

            if (c =='a'||c == 'e'||c == 'i'|| c == 'o' || c == 'u' ){
                ans =  ans + (char) (c - 32); 
          
           }else if (c==32 || ((c > 96) && (c < 123))) {
                ans =  ans + c; 
           } else{
               ans =  ans + (char) (c + 32);
           }
       i++;
      
        }

        return ans;
    }

    public static String camelCase(String str) {
    
        String result = "";
        boolean isFirstLet = false;
        boolean iscapital = false;

        for (int i = 0; i < str.length(); i++) {
            if (!isFirstLet && str.charAt(i)!= ' ') {
                result += toLowercase(str.charAt(i));
                isFirstLet = true;
                iscapital =false;
                continue;
            }
            if (iscapital && str.charAt(i) != ' ') {
                result += toUppercase(str.charAt(i));
                iscapital = false;
            }else if (!iscapital && str.charAt(i) != ' ') {
                result += toLowercase(str.charAt(i));
            }
            if (str.charAt(i) == ' ') {
                iscapital = true;
            }
        }return result;
        
    }

    public static char toLowercase(char inputChar) {
        // Check if the character is an uppercase letter
        if (inputChar >= 'A' && inputChar <= 'Z') {
            // Convert to lowercase using ASCII values
            return (char) (inputChar + ('a' - 'A'));
        }
        // If the character is already lowercase, return as is
        return inputChar;
    }

    public static char toUppercase(char inputChar) {
        // Check if the character is a lowercase letter
        if (inputChar >= 'a' && inputChar <= 'z') {
            // Convert to uppercase using ASCII values
            return (char) (inputChar - ('a' - 'A'));
        }
        // If the character is already uppercase, return as is
        return inputChar;
    }

    public static int[] allIndexOf (String str, char chr) {
        int p = 0;
        int[] RepsArray = new int[CountReps(str, chr)];
        for(int i =0 ; i < str.length();i++){
            if (str.charAt(i) == chr) {
                RepsArray[p] = i;
                p++;
            }else{
                continue;
            }
        }
        
        return RepsArray;
    }
    public static int CountReps (String str, char chr) {
        int count = 0;
        for(int i = 0;i<str.length();i++){
            if (str.charAt(i)==chr) {
                count++;
            }
        }

        
        return count;
    }
}
