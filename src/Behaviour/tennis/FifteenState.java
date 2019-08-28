package Behaviour.tennis;

import Behaviour.State.Context;

/**
 * @author evelyn
 * @description TODO
 * @date 2019-08-28 14:30
 **/
public class FifteenState extends TennisState {
    public FifteenState() {
        this.stateString = "fifteen";
        this.nextState = new ThirtyState();
    }

    @Override
    void winRound(GameContext context) {
        context.setState(new ThirtyState());
        System.out.format("Round-%d  %s : %s\n", context.roundNum, context.getState().stateString, context.getOpponentState().stateString);
    }

    @Override
    void loseRound(GameContext context) {
        if (context.getOpponentState() instanceof FortyState) {
            context.setState(new Lose());
            System.out.format("Round-%d  %s\n", context.roundNum, context.getState().stateString);
        }
        else {
            context.setOpponentState(context.getOpponentState().nextState);
            System.out.format("Round-%d  %s : %s\n", context.roundNum, context.getState().stateString, context.getOpponentState().stateString);
        }
    }
}
