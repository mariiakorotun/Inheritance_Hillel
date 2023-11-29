package program;

public class Main {
    public static void main(String[] args) {
        double bet = 100;
        int rolledNumber = 5;

        Game game;

        if (rolledNumber < 3) {
            game = new LowNumberGame(bet);
        } else if (rolledNumber >= 3 && rolledNumber <= 7) {
            game = new MediumNumberGame(bet);
        } else {
            game = new HighNumberGame(bet);
        }

        double winnings = game.calculateWinnings(rolledNumber);
        System.out.println("Your winnings: " + winnings);
    }
}
