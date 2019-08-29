package Behaviour.tennis;

/**
 * @author evelyn
 * @description 状态转换上下文
 * @date 2019-08-28 14:29
 **/
public class GameContext {
    private TennisState state;
    private TennisState opponentState;
    int roundNum = 1;

    /*主场选手名字*/
    String playerName;
    /*客场选手名字*/
    String opponentName;

    public GameContext(TennisState state, TennisState opponentState, String playerName, String opponentName) {
        this.state = state;
        this.opponentState = opponentState;
        this.playerName = playerName;
        this.opponentName = opponentName;
    }

    public String getOpponentName() {
        return opponentName;
    }

    public void setOpponentName(String opponentName) {
        this.opponentName = opponentName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public TennisState getOpponentState() {
        return opponentState;
    }

    public void setOpponentState(TennisState opponentState) {
        this.opponentState = opponentState;
    }

    public GameContext(TennisState state) {
        this.state = state;
    }

    public GameContext() {

    }

    public TennisState getState() {
        return state;
    }

    public void setState(TennisState state) {
        this.state = state;
    }

    public void winRound() {
        state.winRound(this);
        roundNum += 1;
    }

    public void loseRound() {
        state.loseRound(this);
        roundNum += 1;
    }

    public static void main(String[] args) {
        String a1 = "evelyn";
        String a2 = "iotto";
        GameContext context1 = new GameContext(new DeuceState(), new DeuceState(), a1, a2);
        context1.loseRound();
//        context1.loseRound();
//        context1.loseRound();
        context1.winRound();
        context1.winRound();
//        context1.winRound();
        context1.loseRound();
//        context1.loseRound();
//        context1.loseRound();
        context1.winRound();
        context1.winRound();
//        context1.loseRound();
        context1.winRound();
//        context1.winRound();
//        context1.winRound();
//        context1.loseRound();
//        context1.loseRound();
    }
}
