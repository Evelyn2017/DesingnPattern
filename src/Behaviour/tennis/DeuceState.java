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
    }

    public DeuceState(String stateStr) {
        this.stateString = stateStr;
    }

    @Override
    void winRound(GameContext context) {
        System.out.println("Nothing in Deuce win");
    }

    @Override
    void loseRound(GameContext context) {
        System.out.println("Nothing in Deuce lose");
    }
}
