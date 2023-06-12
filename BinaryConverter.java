import java.util.Scanner;

public class BinaryConverter {
     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter N: ");
            int Ntimes = scanner.nextInt();

            String stackarray[] = new String[Ntimes]; 
            
            for (int i=0; i < Ntimes; i++){
                System.out.print("Enter Binary: ");
                String Userinput = scanner.next();
                stackarray[i] = Userinput;
            };       
            
            for (String array : stackarray){
                char[] charArray = array.toCharArray();
                int len = charArray.length; 
                double converterArray = 0;
                int Exponent = len-1;
                for (int i=0; i<=len-1;i++){
                    int binary = Character.getNumericValue(charArray[i]);
                    converterArray += binary*(Math.pow(2, Exponent));
                    Exponent--;
                }
                System.out.println((int)converterArray);
            }

            scanner.close();
     }
}
