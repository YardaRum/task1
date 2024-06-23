import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Как тебя зовут?\n");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.printf("Привет, " + name + "!");

    }
}