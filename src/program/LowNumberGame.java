package program;

public class LowNumberGame extends Game{
    public LowNumberGame(double bet) {
        super(bet);
    }
    @Override
    public double calculateWinnings(int rolledNumber) {
        if (rolledNumber < 3) {
            return bet * 1.25;
        } else {
            return super.calculateWinnings(rolledNumber);
        }
    }
}
