import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        //System.out.println("enter a number");
        int input = scanner.nextInt();
        int out = input + (2 - (input % 2));
        System.out.println(out);
    }
}