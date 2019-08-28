package Behaviour.tennis;

/**
 * @author evelyn
 * @description TODO
 * @date 2019-08-28 14:31
 **/
public class Lose extends TennisState {
    public Lose() {
        this.stateString = "Lose";
    }

    @Override
    void winRound(GameContext context) {
        System.out.format("Round-%d  %s %s! ", context.roundNum, context.getState().stateString, context.getState().stateString);
    }

    @Override
    void loseRound(GameContext context) {

    }
}
