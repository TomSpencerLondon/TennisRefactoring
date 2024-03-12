public class Result {

  public String gameOn(int tempScore) {
      if (tempScore == 0) {
          return "Love";
      } else if (tempScore == 1) {
          return "Fifteen";
      } else if (tempScore == 2) {
          return "Thirty";
      }

      return "Forty";
  }

  public String winning(int result) {
    if (result == 1) {
      return "Advantage player1";
    } else if (result == -1) {
      return "Advantage player2";
    } else if (result >= 2) {
      return "Win for player1";
    } else {
      return "Win for player2";
    }
  }

  String drawingScore(int m_score1) {
      return switch (m_score1) {
        case 0 -> "Love-All";
        case 1 -> "Fifteen-All";
        case 2 -> "Thirty-All";
        default -> "Deuce";
      };
  }
}
