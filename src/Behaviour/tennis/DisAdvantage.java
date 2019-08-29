package Behaviour.tennis;

/**
 * @author evelyn
 * @description TODO
 * @date 2019-08-28 14:30
 **/
public class DisAdvantage extends TennisState{
    public DisAdvantage() {
        this.stateString = "DisAd";
    }

    public DisAdvantage(String stateStr) {
        this.stateString = stateStr;
    }

    @Override
    void winRound(GameContext context) {
        context.setState(new DeuceState());
        context.setOpponentState(new DeuceState());
        System.out.format("Round-%d  %s %s\n", context.roundNum, context.playerName, context.getState().stateString);
    }

    @Override
    void loseRound(GameContext context) {
        context.setState(new Lose());
        context.setOpponentState(new Win());
        System.out.format("Round-%d  ------- GAME OVER! -------\n", context.roundNum);
        System.out.format("      %s  home game %s.\n", context.getPlayerName(), context.getState().stateString);
        System.out.format("------------------------------------\n");
    }
}
