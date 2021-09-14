import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        String output;
        output = (age >= 16)
                ? "You are old enough to legally drive."
                : "You are not old enough to legally drive";
        System.out.println(output);

    }
}
