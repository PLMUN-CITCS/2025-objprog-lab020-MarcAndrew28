import java.util.Scanner;
public class MenuDrivenProgram {
    public static void main(String[] args){

   handleMenuChoice();
    
    }

    public static void displaymenu(){
        System.out.println("Menu:");
        System.out.println("1.Greet User");
        System.out.println("2.Check Even/Odd");
        System.out.println("3. Exit");
    }
    public static void handleMenuChoice(){


        Scanner cram = new Scanner(System.in);
        int choice;

      while(true) {

      displaymenu();


        System.out.print("Enter your choice (1-3): ");
        choice = cram.nextInt();

        
        if (choice == 1) {

            System.out.println("Hello! Welcome!");
            System.out.print("\n");
        }
        
        else if (choice == 2){

            int n;

            System.out.print("Enter an integer: ");
            n = cram.nextInt();

            if(n % 2 == 0){
                System.out.println(n+ " is an Even number.");
                System.out.print("\n");
            }
            else{
                System.out.println(n+ " is an Odd number.");

                System.out.print("\n");
            }
        }

        else if (choice == 3) {
            System.out.println("Exiting the Program. Goodbye!");
            System.out.print("\n");
            break;

        }

        else{

            System.out.println("Error input!");
            System.out.print("\n");
        }


      } // while loop bracket

    }
}