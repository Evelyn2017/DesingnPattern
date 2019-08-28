package Behaviour.tennis;

/**
 * @author evelyn
 * @description
 * @date 2019-08-28 14:29
 **/
public class LoveState extends TennisState {
    public LoveState() {
        this.stateString = "love";
        this.nextState = new FifteenState();
        this.nextStateLose = null;
    }

    @Override
    public void winRound(GameContext context) {
        context.setState(new FifteenState());
        System.out.format("Round-%d  %s : %s\n", context.roundNum, context.getState().stateString, context.getOpponentState().stateString);
    }

    @Override
    public void loseRound(GameContext context) {
        if (context.getOpponentState() instanceof FortyState) {
            context.setState(new Lose());
            System.out.format("Round-%d  ------- GAME OVER! -------\n", context.roundNum);
            System.out.format("      %s  home game %s.\n", context.getPlayerName(), context.getState().stateString);
            System.out.format("------------------------------------\n");
            return;
        }
        context.setOpponentState(context.getOpponentState().nextState);
        System.out.format("Round-%d  %s : %s\n", context.roundNum, context.getState().stateString, context.getOpponentState().stateString);
    }
}
