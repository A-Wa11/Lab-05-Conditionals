import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your party affiliation (D, R, I): ");
        String input = in.nextLine().trim();

        if (input.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (input.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (input.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get an Other.");
        }
    }
}
