package Behaviour.tennis;

/**
 * @author evelyn
 * @description TODO
 * @date 2019-08-28 14:30
 **/
public class FortyState extends TennisState {
    public FortyState() {
        this.stateString = "forty";
        this.nextState = new DeuceState();
    }
    @Override
    void winRound(GameContext context) {
        System.out.println("nothing in forty win");
    }

    @Override
    void loseRound(GameContext context) {
        System.out.println("nothing in forty win");
    }
}
