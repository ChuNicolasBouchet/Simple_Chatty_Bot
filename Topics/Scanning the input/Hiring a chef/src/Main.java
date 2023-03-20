import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String firstName = scanner.next();
        String year = scanner.next();
        String dishes = scanner.next();

        System.out.print("The form for ");
        System.out.print(firstName);
        System.out.print(" is completed. We will contact you if we need a chef who cooks ");
        System.out.print(dishes);
        System.out.print(" dishes and has ");
        System.out.print(year);
        System.out.println(" years of experience.");


    }
}