import java.util.Scanner;

public class CommandLine {
    static String arr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void main(String args[]){
        int counter = 0;
        while (counter < 10) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your Number : ");
            int containt = input.nextInt();
            System.out.println(arr[containt]);

            counter++;
        }


    }
}
