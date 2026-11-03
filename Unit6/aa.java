//Program to convert primitive data types to object and use associated methodsof wrapper class
package Unit6;
public class aa {
    public static void main(String args[]){
        int a = 10;
        char c = 'S';
        double d = 17.5;
        Integer iobj = Integer.valueOf(a);
        Character ch = Character.valueOf(c);
        Double db = Double.valueOf(d);
        String str = "Wrapper Class in Java";
        System.out.println("Wrapper Object:");
        System.out.println("Integer object: " + iobj);
        System.out.println("Character object: " + ch);
        System.out.println("Double object: " + db);
        System.out.println("String object: " + str);
        System.out.println("Associated methods:");
        System.out.println("Integer to binary: " + Integer.toBinaryString(iobj));
        System.out.println("Character is letter: " + Character.isLetter(ch));
        System.out.println("Lower case Character: " + Character.toLowerCase(ch));
        System.out.println("Double parsed from String: " + Double.parseDouble("190.5"));
        System.out.println("String length: " + str.length());
        System.out.println("String to upper case: " + str.toUpperCase());
    }
}