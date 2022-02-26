package ss8_clean_code_and_refactoring.bai_tap.refactoring;


public class TennisGame {
    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FORTY = 3;
    public static final int FiNALPOINT = 4;

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score = "";
        int tempScore = LOVE;
        if (scorePlayer1 == scorePlayer2) {
            score = displayDrawScore(scorePlayer1);
        } else if (scorePlayer1 >= FiNALPOINT || scorePlayer2 >= FiNALPOINT) {
            score = displayWinner(scorePlayer1, scorePlayer2);
        } else {
            score = displayScore(scorePlayer1, scorePlayer2, score);
        }
        return score;
    }

    private static String displayDrawScore(int scorePlayer1) {
        String score;
        switch (scorePlayer1) {
            case LOVE:
                score = "Love-All";
                break;
            case FIFTEEN:
                score = "Fifteen-All";
                break;
            case THIRTY:
                score = "Thirty-All";
                break;
            case FORTY:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }

    private static String displayScore(int scorePlayer1, int scorePlayer2, String score) {
        int tempScore;
        for (int i = FIFTEEN; i < FORTY; i++) {
            if (i == FIFTEEN) tempScore = scorePlayer1;
            else {
                score += "-";
                tempScore = scorePlayer2;
            }
            switch (tempScore) {
                case LOVE:
                    score += "Love";
                    break;
                case FIFTEEN:
                    score += "Fifteen";
                    break;
                case THIRTY:
                    score += "Thirty";
                    break;
                case FORTY:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }

    private static String displayWinner(int scorePlayer1, int scorePlayer2) {
        String score;
        int minusResult = scorePlayer1 - scorePlayer2;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }
}
