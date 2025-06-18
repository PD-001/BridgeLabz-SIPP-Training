package Strings;

import java.util.Scanner;

public class RockPaperScissorsGame {

    // Choices
    static String[] choices = { "Rock", "Paper", "Scissors" };

    // Method to generate computer choice using Math.random()
    public static String getComputerChoice() {
        int index = (int) (Math.random() * 3);
        return choices[index];
    }

    // Method to determine the winner
    public static String findWinner(String user, String computer) {
        if (user.equalsIgnoreCase(computer)) {
            return "Draw";
        }

        switch (user.toLowerCase()) {
            case "rock":
                return computer.equalsIgnoreCase("Scissors") ? "User" : "Computer";
            case "paper":
                return computer.equalsIgnoreCase("Rock") ? "User" : "Computer";
            case "scissors":
                return computer.equalsIgnoreCase("Paper") ? "User" : "Computer";
            default:
                return "Invalid";
        }
    }

    // Method to calculate stats and return 2D String array
    public static String[][] calculateStats(int totalGames, int userWins, int computerWins) {
        int draws = totalGames - userWins - computerWins;
        double userWinPercent = (userWins * 100.0) / totalGames;
        double computerWinPercent = (computerWins * 100.0) / totalGames;

        String[][] resultTable = {
                { "Player Wins", String.valueOf(userWins), userWinPercent + "%" },
                { "Computer Wins", String.valueOf(computerWins), computerWinPercent + "%" },
                { "Draws", String.valueOf(draws), "-" }
        };

        return resultTable;
    }

    // Method to display each game result and final stats
    public static void displayResults(String[] userChoices, String[] computerChoices, String[] outcomes,
            String[][] stats) {
        System.out.println("\n--- Game Results ---");
        for (int i = 0; i < userChoices.length; i++) {
            System.out.println("Game " + (i + 1) + ": User chose " + userChoices[i] + ", Computer chose "
                    + computerChoices[i] + " => " + outcomes[i]);
        }
        System.out.println("\n--- Final Stats ---");
        for (String[] row : stats) {
            System.out.println("" + row[0] + ": " + row[1] + " (" + row[2] + ")");
        }

    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userWins = 0, computerWins = 0;

        System.out.print("Enter number of games to play: ");
        int games = sc.nextInt();
        sc.nextLine();

        String[] userChoices = new String[games];
        String[] computerChoices = new String[games];
        String[] outcomes = new String[games];

        for (int i = 0; i < games; i++) {
            System.out.print("Enter your choice (Rock/Paper/Scissors) for game " + (i + 1) + ": ");
            String userChoice = sc.nextLine().trim();
            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            userChoices[i] = userChoice;
            computerChoices[i] = computerChoice;
            outcomes[i] = winner;

            if (winner.equals("User"))
                userWins++;
            else if (winner.equals("Computer"))
                computerWins++;
        }

        String[][] stats = calculateStats(games, userWins, computerWins);
        displayResults(userChoices, computerChoices, outcomes, stats);
        sc.close();
    }
}
