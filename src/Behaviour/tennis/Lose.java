package Behaviour.tennis;

/**
 * @author evelyn
 * @description TODO
 * @date 2019-08-28 14:31
 **/
public class Lose extends TennisState {
    public Lose() {
        this.stateString = "lose";
    }

    @Override
    void winRound(GameContext context) {

    }

    @Override
    void loseRound(GameContext context) {

    }
}
