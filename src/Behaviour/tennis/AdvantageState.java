package Behaviour.tennis;

/**
 * @author evelyn
 * @description TODO
 * @date 2019-08-28 14:30
 **/
public class AdvantageState extends TennisState {
    public AdvantageState() {
        this.stateString = "Ad";
//        this.nextStateWin = new Win();
        this.nextStateLose = new DeuceState("Deuce");
    }

    public AdvantageState(String stateString) {
        this.stateString = stateString;
    }

    @Override
    void winRound(GameContext context) {

    }

    @Override
    void loseRound(GameContext context) {

    }
}
