import java.util.*;

public class QuizzApl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quizz obj = new Quizz();
        int score;

        while (true) {
            score = 0;
            System.out.println("Welcome to Quiz!");
            System.out.println("\nYou will be asked 5 questions. Each question is worth 10 points.");

            for (int i = 0; i < 5; i++) {
                char correctAnswer = obj.questions(i);
            //Here it prints all the statements and returns the char value into this variable.
                System.out.print("\nYour answer: ");
                char opt = sc.next().charAt(0);

                if (opt == correctAnswer) {
                    System.out.println("\nCorrect answer\nYou earned 10 points\n");
                    score += 10;
                } else {
                    System.out.println("\nWrong answer\n");
                }
            }

            System.out.println("\nQuiz over");
            System.out.printf("Your score: %d%n", score);

            if (score > 0) {
                System.out.println("Congratulations!");
            } else {
                System.out.println("Better luck next time.");
            }

            while (true) {
                System.out.print("\nWould you like to play again (yes/no): ");
                String str = sc.next();
                if (str.equalsIgnoreCase("no")) {
                    System.out.println("Thank you for playing!");
                    return; //is used to exit the main program.
                } else if (str.equalsIgnoreCase("yes")) {
                    break; //exit this loop.
                } else {
                    System.out.println("Invalid response, enter again");
                }
            }
        }
    }
}

class Quizz {
    public char questions(int index) {
        String[][] arr = {
            {"1. What is the capital of France?", "a) Berlin", "b) Madrid", "c) Paris", "d) Rome"},
            {"2. Which planet is known as the Red Planet?", "a) Venus", "b) Mars", "c) Jupiter", "d) Saturn"},
            {"3. How many days are there in a leap year?", "a) 365", "b) 366", "c) 364", "d) 367"},
            {"4. What is the square root of 49?", "a) 5", "b) 6", "c) 7", "d) 8"},
            {"5. Which animal is known as the King of the Jungle?", "a) Elephant", "b) Tiger", "c) Lion", "d) Cheetah"}
        };

        char[] answers = {'c', 'b', 'b', 'c', 'c'};

        for (String option : arr[index]) {
            System.out.println(option);
        }

        return answers[index];
    }
}

    
    


 
    
    


