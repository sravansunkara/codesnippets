import java.util.Scanner;
public class MultiplicationTableForEvenIntegers{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter an even integer: ");
        int num = inp.nextInt();
        while(true){
            if(num%2==0){
                System.out.println("The number " +num+ " is an even integer and the multiplication table for " +num+ " is");
                for(int i=1;i<=10;i++) {
                    System.out.println(num + "x" + i + "=" + (num * i));
                }
                break;
            }
            else {
                System.out.println("The number " + num +" is not an even integer, Try again: ");
                num = inp.nextInt();
            }
        }
    }
}
