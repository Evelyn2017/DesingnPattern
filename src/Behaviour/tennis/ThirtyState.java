package Behaviour.tennis;

/**
 * @author evelyn
 * @description TODO
 * @date 2019-08-28 14:30
 **/
public class ThirtyState extends TennisState {
    public ThirtyState() {
        this.stateString = "thirty";
        this.nextState = new FortyState();
    }

    @Override
    void winRound(GameContext context) {
        context.setState(new FortyState());
        System.out.format("Round-%d  %s : %s\n", context.roundNum, context.getState().stateString, context.getOpponentState().stateString);
    }

    @Override
    void loseRound(GameContext context) {
        System.out.println("nothing in thirty lose");
    }
}
