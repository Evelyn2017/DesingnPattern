package Behaviour.tennis;

/**
 * @author evelyn
 * @description
 * @date 2019-08-28 14:29
 **/
public class LoveState extends TennisState {
    public LoveState() {
        stateString = "love";
        nextState = new FifteenState();
    }

    @Override
    public void winRound(GameContext context) {
        context.setState(new FifteenState());
        System.out.format("Round-%d  %s : %s\n", context.roundNum, context.getState().stateString, context.getOpponentState().stateString);
    }

    @Override
    public void loseRound(GameContext context) {
        context.setOpponentState(context.getOpponentState().nextState);
        System.out.format("Round-%d  %s : %s\n", context.roundNum, context.getState().stateString, context.getOpponentState().stateString);
    }
}
