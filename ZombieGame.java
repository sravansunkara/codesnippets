import java.util.Scanner;
public class ZombieGame {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("-----------------------");
        System.out.println("WELCOME TO ZOMBIE LAND");
        System.out.println("-----------------------");
        System.out.println("-----------------------");
        System.out.print("Do you want to enter? Press y to continue...... ");
        char c = input.next().charAt(0);
        if(c == 'y' || c == 'Y'){
            System.out.println("Before entering to Zombie land please select your weapon");
            System.out.print("Enter w for weapons list ");
            char c1 = input.next().charAt(0);
            if(c1 == 'w' || c1 == 'W'){
                System.out.println("Enter respective number for your desired weapon");
                System.out.println("1. ︻╦╤─ ");
                System.out.println("2. ︻╦̵̵͇̿̿̿̿╤─── ");
                System.out.println("3. ︻デ═一 ");
                int num = input.nextInt();
                if (num==1){
                    System.out.println("Your weapon "+num+" is selected");
                    System.out.println(" ︻╦╤─ ");
                }
                else if (num==2){
                    System.out.println("Your weapon "+num+" is selected");
                    System.out.println(" ︻╦̵̵͇̿̿̿̿╤─── ");
                }
                else if (num==3) {
                    System.out.println("Your weapon "+num+" is selected");
                    System.out.println(" ︻デ═一 ");
                }
                System.out.println("Beware Zombies are coming.....");
                System.out.println("[¬º-°]¬ [¬º-°]¬ [¬º-°]¬ [¬º-°]¬ [¬º-°]¬");
                System.out.println("Press s to shoot, Continue pressing s till all zombies are dead ");
                char c2 = input.next().charAt(0);
                switch (c2) {
                    case 's':
                        System.out.println("[¬º-°]¬ [¬º-°]¬ [¬º-°]¬ [¬º-°]¬");
                }
                char c3 = input.next().charAt(0);
                switch (c3){
                    case 's':
                        System.out.println("[¬º-°]¬ [¬º-°]¬ [¬º-°]¬");
                }
                char c4 = input.next().charAt(0);
                switch (c4){
                    case 's':
                        System.out.println("[¬º-°]¬ [¬º-°]¬");
                }
                char c5 = input.next().charAt(0);
                switch (c5){
                    case 's':
                        System.out.println("[¬º-°]¬");
                }
                char c6 = input.next().charAt(0);
                switch (c6){
                    case 's':
                        System.out.println("YOU WON!!!!!");
                        System.out.println("Thanks for playing the game!");
                }
            }
        }
        else{
            System.out.println("You Exited the game...");
        }
    }
}