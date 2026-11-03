/* Program to implement try, catch and throw in exception handling */
package Unit4;
public class ad {
    public static void main(String[] args){
        int result = 0;
        try{
            result = 10/0;
        } catch(ArithmeticException e){
            System.out.println("Exception occured: "+e);
            result = 0;
        } finally{
            System.out.println("Result: "+result +"\nFinally block executed");
        }
        int marks = -100;
        if(marks<0){
            throw new ArithmeticException("Marks cannot be negative\n Marks must be:"+Math.abs(marks));
        }
    }        
}