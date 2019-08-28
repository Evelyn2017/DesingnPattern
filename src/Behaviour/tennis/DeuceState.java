package Behaviour.tennis;

/**
 * @author evelyn
 * @description TODO
 * @date 2019-08-28 14:30
 **/
public class DeuceState extends TennisState {
    public DeuceState() {
        this.stateString = "Deuce";
        this.nextStateWin = new AdvantageState();
        this.nextStateLose = new DisAdvantage();
    }

    @Override
    void winRound(GameContext context) {

    }

    @Override
    void loseRound(GameContext context) {

    }
}
