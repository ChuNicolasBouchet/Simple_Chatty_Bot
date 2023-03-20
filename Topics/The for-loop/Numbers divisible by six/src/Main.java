import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        Integer sum = 0;
        Integer len = scanner.nextInt();
        for (int i = 0; i < len; i++ ) {
            Integer input = scanner.nextInt();
            if (input % 6 == 0) {
                sum += input;
            }
        }
        System.out.println(sum);

    }
}