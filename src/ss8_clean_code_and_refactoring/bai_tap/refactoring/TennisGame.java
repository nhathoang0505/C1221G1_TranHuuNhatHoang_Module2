package ss8_clean_code_and_refactoring.bai_tap.refactoring;

public class TennisGame {


    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        StringBuilder score = new StringBuilder();
        int tempScore = 0;
        if (isScoreEquals(player1Score, player2Score)) {
            switch (player1Score) {
                case 0:
                    score = new StringBuilder("Love-All");
                    break;
                case 1:
                    score = new StringBuilder("Fifteen-All");
                    break;
                case 2:
                    score = new StringBuilder("Thirty-All");
                    break;
                case 3:
                    score = new StringBuilder("Forty-All");
                    break;
                default:
                    score = new StringBuilder("Deuce");
                    break;

            }
        } else if (isDeuce(player1Score, player2Score)) {
            score = checkScore(player1Score, player2Score);
        } else {
            for (int i = 1; i < 3; i++) {
                if (isScoreEquals(i, 1)) tempScore = player1Score;
                else {
                    score.append("-");
                    tempScore = player2Score;
                }
                switch (tempScore) {
                    case 0:
                        score.append("Love");
                        break;
                    case 1:
                        score.append("Fifteen");
                        break;
                    case 2:
                        score.append("Thirty");
                        break;
                    case 3:
                        score.append("Forty");
                        break;
                }
            }
        }
        return score.toString();
    }

    private static StringBuilder checkScore(int player1Score, int player2Score) {
        StringBuilder score;
        int minusResult = player1Score - player2Score;
        if (isScoreEquals(minusResult, 1)) score = new StringBuilder("Advantage player1");
        else if (isScoreEquals(minusResult, -1)) score = new StringBuilder("Advantage player2");
        else if (minusResult >= 2) score = new StringBuilder("Win for player1");
        else score = new StringBuilder("Win for player2");
        return score;
    }

    private static boolean isDeuce(int player1Score, int player2Score) {
        return player1Score >= 4 || player2Score >= 4;
    }

    private static boolean isScoreEquals(int player1Score, int player2Score) {
        return player1Score == player2Score;
    }
}
