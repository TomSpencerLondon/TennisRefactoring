import java.util.Objects;

public class TennisGame1 implements TennisGame {

    private final Result result;
    private int player1Score = 0;
    private int player2Score = 0;
    private final String player1Name;
    private final String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        this.result = new Result();
    }

    public void addPointTo(String playerName) {
        if (Objects.equals(playerName, this.player1Name))
            player1Score += 1;
        else if (Objects.equals(playerName, this.player2Name))
            player2Score += 1;
    }

    public String score() {
        if (drawing())
        {
            return result.drawingScore(player1Score);
        }

        else if (winning())
        {
            return result.winning(difference());
        }
        else
        {
            return String.format("%s-%s" , result.gameOn(player1Score), result.gameOn(player2Score));
        }
    }

    private int difference() {
        return player1Score - player2Score;
    }

    private boolean winning() {
        return player1Score >= 4 || player2Score >= 4;
    }

    private boolean drawing() {
        return player1Score == player2Score;
    }
}
