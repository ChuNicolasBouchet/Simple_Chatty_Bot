import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        Integer input1 = scanner.nextInt();
        Integer input2 = scanner.nextInt();
        Integer input3 = scanner.nextInt();
        System.out.println((input1 >= input2 && input1 <= input3) || (input1 <= input2 && input1 >= input3));
    }
}