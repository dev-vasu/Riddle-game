import java.util.Scanner;

public class Riddle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        String[] riddles = {
            "I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?",
            "The more you take, the more you leave behind. What am I?",
            "I'm not alive, but I can grow; I don't have lungs, but I need air; I don't have a mouth, but water kills me. What am I?",
            "What has keys but can't open locks?",
            "I’m tall when I’m young, and I’m short when I’m old. What am I?",
            "What has to be broken before you can use it?",
            "What has many rings but no fingers?",
            "What can travel around the world while staying in the same spot?",
            "What has a heart that doesn’t beat?",
            "What has hands but can’t clap?"
        };

        String[] answers = {
            "An echo",
            "Footsteps",
            "A fire",
            "A piano",
            "A candle",
            "An egg",
            "A tree",
            "A stamp",
            "An artichoke",
            "A clock"
        };

        String[] hints = {
            "Hint: This thing is known for its ability to reflect sound.",
            "Hint: Think about what you leave behind when you walk.",
            "Hint: It produces heat and light.",
            "Hint: It’s a musical instrument.",
            "Hint: It’s often used for light.",
            "Hint: It’s something you eat for breakfast.",
            "Hint: It’s found in nature and has bark.",
            "Hint: It’s used to send mail.",
            "Hint: It’s a vegetable.",
            "Hint: It tells time."
        };

        int totalRiddles = riddles.length;

        while (true) {
            int randomIndex = (int) (Math.random() * totalRiddles);
            String currentRiddle = riddles[randomIndex];
            String correctAnswer = answers[randomIndex];
            String currentHint = hints[randomIndex];

            System.out.println("Riddle: " + currentRiddle);

            String userResponse = scanner.nextLine();

            if (userResponse.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Would you like a hint? (yes/no)");
                String hintChoice = scanner.nextLine().toLowerCase();
                if (hintChoice.equals("yes")) {
                    System.out.println(currentHint);
                }
            }

            System.out.println("Continue playing? (yes/no)");
            String continuePlaying = scanner.nextLine().toLowerCase();
            if (!continuePlaying.equals("yes")) {
                break;
            }
        }

        System.out.println("Your final score: " + score);
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}