package Unit1;
//program to show use of string operations
public class af {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Hello";
        // Concatenation
        String result = str1 + " " + str2;
        System.out.println("Concatenation: " + result);
        // Length
        System.out.println("Length of str1: " + str1.length());
        // Character at index
        System.out.println("Character at index 1 of str1: " + str1.charAt(1));
        // Substring
        System.out.println("Substring of str1 from index 1 to 4: " + str1.substring(1, 4));

        // Comparison
        System.out.println("str1 equals str3: " + str1.equals(str3));

        // Uppercase and Lowercase
        System.out.println("Uppercase of str1: " + str1.toUpperCase());
        System.out.println("Lowercase of str2: " + str2.toLowerCase());
        
        // Replace
        String replacedStr = str1.replace('l', 'p');
        System.out.println("Replaced str1 (l -> p): " + replacedStr);
        //Searching for a substring
        String searchStr = "lo";
        if (str1.contains(searchStr)) {
            System.out.println("str1 contains '" + searchStr + "'");
        } else {
            System.out.println("str1 does not contain '" + searchStr + "'");
        }
        //Starts with and Ends with
        System.out.println("str1 starts with 'He': " + str1.startsWith("He"));
        System.out.println("str2 ends with 'ld': " + str2.endsWith("ld"));
    }
}
