package Behaviour.tennis;

/**
 * @author evelyn
 * @description 状态转换上下文
 * @date 2019-08-28 14:29
 **/
public class GameContext {
    private TennisState state = new LoveState();
    private TennisState opponentState = new LoveState();
    int roundNum = 1;

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
        GameContext context1 = new GameContext();
        context1.loseRound();
        context1.loseRound();
        context1.loseRound();
        context1.loseRound();
    }
}
