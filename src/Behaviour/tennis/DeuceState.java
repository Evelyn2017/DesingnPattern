package Behaviour.tennis;

/**
 * @author evelyn
 * @description TODO
 * @date 2019-08-28 14:30
 **/
public class DeuceState extends TennisState {
    public DeuceState() {
        this.stateString = "Deuce";
        this.nextStateWin = new AdvantageState("Ad");
        this.nextStateLose = new DisAdvantage("DisAd");
    }

    public DeuceState(String stateStr) {
        this.stateString = stateStr;
    }

    @Override
    void winRound(GameContext context) {
        context.setState(new AdvantageState());
        context.setOpponentState(new DisAdvantage());
        System.out.format("Round-%d  %s %s\n", context.roundNum, context.playerName, context.getState().stateString);
    }

    @Override
    void loseRound(GameContext context) {
        context.setState(new DisAdvantage());
        context.setOpponentState(new AdvantageState());
        System.out.format("Round-%d  %s %s\n", context.roundNum, context.playerName, context.getState().stateString);
    }
}
