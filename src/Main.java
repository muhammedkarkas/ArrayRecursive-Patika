import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter number :");
        int number = scan.nextInt();
        method1(number, number);

    }
    static void method1(int number, int temp){

        if(number > 0) {
            System.out.print(number + " ");
            method1(number - 5, temp);
        } else{
            method2(number, temp);
        }
    }
    static void method2(int number, int temp){
        if(temp >= number) {
            System.out.print(number + " ");
            method2(number + 5, temp);
        }
    }
}