package Behaviour.tennis;

import com.sun.tools.javac.util.Assert;

/**
 * @author evelyn
 * @description TODO
 * @date 2019-08-28 14:30
 **/
public class ThirtyState extends TennisState {
    public ThirtyState() {
        this.stateString = "thirty";
        this.nextState = new FortyState();
        this.nextStateWin = new DeuceState();
    }

    @Override
    void winRound(GameContext context) {
        if (context.getOpponentState() instanceof FortyState) {
            context.setState(nextStateWin);
            context.setOpponentState(nextStateWin);
            assert context.getOpponentState().stateString.equals(context.getState().stateString);
            System.out.format("Round-%d  %s\n", context.roundNum, context.getState().stateString);
            return;
        }
        context.setState(nextState);
        System.out.format("Round-%d  %s : %s\n", context.roundNum, context.getState().stateString, context.getOpponentState().stateString);
    }

    @Override
    void loseRound(GameContext context) {
        if (context.getOpponentState() instanceof FortyState) {
            context.setState(new Lose());
            System.out.format("Round-%d  ------- GAME OVER! -------\n", context.roundNum);
            System.out.format("      %s  home game %s.\n", context.getPlayerName(), context.getState().stateString);
            System.out.format("------------------------------------\n");
            return;
        }
        else {
            System.out.println(context.getOpponentState().stateString);
            context.setOpponentState(context.getOpponentState().nextState);
            System.out.format("Round-%d  %s : %s\n", context.roundNum, context.getState().stateString, context.getOpponentState().stateString);
        }
    }
}
