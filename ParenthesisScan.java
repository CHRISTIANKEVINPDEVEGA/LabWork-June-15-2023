import java.util.Scanner;


public class ParenthesisScan {
        public static void main(String[] args) {

        // Create Scanner object    
        Scanner scanner = new Scanner(System.in);

        // ouput create
        boolean isBal = false;

        // Ask user for input    
        System.out.print("Enter N: ");
        int Ntimes = scanner.nextInt();

        //Create a stackarray
        String stackarray[] = new String[Ntimes];

        //loop for asking input N times on the user
        for (int i=0; i < Ntimes; i++){
            System.out.print("Enter Sets of Parenthesis: ");
            String Userinput = scanner.next();
            stackarray[i] = Userinput;
        };
        
        System.out.println("______________");

        //Output of the system
        for(String array : stackarray){
            if (array.length()%2 == 0){
                isBal = true;
                char[] charArray = array.toCharArray();

                int forward_count = 0;
                int backward_count = charArray.length - 1;

                isBal = true;

                while(forward_count < backward_count){

                    if (charArray[forward_count] == '{' & charArray[backward_count] != '}'){
                                isBal=false;
                                break;
                            } 
                    else if (charArray[forward_count] == '[' & charArray[backward_count] != ']'){
                                isBal=false;
                                break;
                            } 
                    else if (charArray[forward_count] == '(' & charArray[backward_count] != ')'){
                                isBal=false;
                                break;
                            }
                    else{
                        isBal = false;
                    }                    
                        

                    forward_count ++;
                    backward_count --;
                };

                                
                
            };

            //print 
            if(isBal) {
                System.out.println("Balanced");
            } else {
                System.out.println("Not balanced");
            }

            //reset the boolean value
            isBal = false;
        }
        
        //Destroy the scanner object
        scanner.close();
    }
}
