package Behaviour.tennis;

/**
 * @author evelyn
 * @description TODO
 * @date 2019-08-28 14:30
 **/
public class FortyState extends TennisState {
    private TennisState nextStateLose2;
    public FortyState() {
        this.stateString = "forty";
        this.nextStateWin = new Win();
        this.nextStateLose = this;
        this.nextStateLose2 = new DeuceState();
    }
    @Override
    void winRound(GameContext context) {
        context.setState(nextStateWin);
        context.setOpponentState(new Lose());
        assert context.getState().stateString.equals("Win");
        assert context.getOpponentState().stateString.equals("Lose");
        System.out.format("Round-%d  ------- GAME OVER! -------\n", context.roundNum);
        System.out.format("      %s  home game %s.\n", context.getPlayerName(), context.getState().stateString);
        System.out.format("------------------------------------\n");
    }

    @Override
    void loseRound(GameContext context) {
        TennisState now = context.getOpponentState();
        /*客场选手得分为0， 1，显示具体比分*/
        if (now instanceof LoveState || now instanceof FifteenState) {
            context.setOpponentState(context.getOpponentState().nextState);
            System.out.format("Round-%d  %s : %s\n", context.roundNum, context.getState().stateString, context.getOpponentState().stateString);
            return;
        }
        /*客场选手得分为2分， 双方同时进入 Deuce*/
        context.setOpponentState(context.getOpponentState().nextStateLose2);
        context.setState(nextStateLose2);
        assert context.getState().stateString.equals(context.getOpponentState().stateString);
        System.out.format("Round-%d  %s\n", context.roundNum, context.getState().stateString);
    }
}
