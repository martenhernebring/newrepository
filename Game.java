import java.io.Console;
public class Game {
    public static void main(String[] args) {
        System.out.println("Welcome to the Countries game.");
        Console console = System.console();
        String answer = console.readLine("Which continent does Sweden belong to? ");
        String continent= "Europe";
        if (answer.equals(continent)) {
            System.out.println("Correct!");
        } else {
   		System.out.println("No, the answer is " + continent);
	}

    }
}
