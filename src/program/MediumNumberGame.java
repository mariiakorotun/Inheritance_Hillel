package program;

public class MediumNumberGame extends Game{
    public MediumNumberGame(double bet) {
        super(bet);
    }
    @Override
    public double calculateWinnings(int rolledNumber) {
        if (rolledNumber >= 3 && rolledNumber <= 7) {
            return bet * 1.25 - 0.05 * bet;
        } else {
            return super.calculateWinnings(rolledNumber);
        }
    }
}
