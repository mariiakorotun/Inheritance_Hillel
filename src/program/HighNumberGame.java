package program;

public class HighNumberGame extends Game{
    public HighNumberGame(double bet) {
        super(bet);
    }
    @Override
    public double calculateWinnings(int rolledNumber) {
        if (rolledNumber > 7) {
            return 2 * bet * (1 - 0.1);
        } else {
            return super.calculateWinnings(rolledNumber);
        }
    }
}
