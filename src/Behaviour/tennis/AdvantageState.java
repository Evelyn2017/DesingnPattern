package Behaviour.tennis;

/**
 * @author evelyn
 * @description TODO
 * @date 2019-08-28 14:30
 **/
public class AdvantageState extends TennisState {
    public AdvantageState() {
        this.stateString = "Ad";
        this.nextStateWin = new Win();
        this.nextStateLose = new DeuceState("Deuce");
        this.nextStateLose2 = new DisAdvantage("DisAs");
    }

    public AdvantageState(String stateString) {
        this.stateString = stateString;
    }

    @Override
    void winRound(GameContext context) {
        context.setState(new Win());
        context.setOpponentState(new Lose());
        System.out.format("Round-%d  ------- GAME OVER! -------\n", context.roundNum);
        System.out.format("      %s  home game %s.\n", context.getPlayerName(), context.getState().stateString);
        System.out.format("------------------------------------\n");
    }

    @Override
    void loseRound(GameContext context) {
        context.setState(nextStateLose);
        context.setOpponentState(nextStateLose);
        System.out.format("Round-%d  %s %s\n", context.roundNum, context.playerName, context.getState().stateString);
    }
}
