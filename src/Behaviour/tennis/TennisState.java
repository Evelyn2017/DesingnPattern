package Behaviour.tennis;

/**
 * @author evelyn
 * @description TODO
 * @date 2019-08-28 15:14
 **/
public abstract class TennisState {

    /**
     * [love, fifteen, thirty, forty, deuce, ad, dis_ad, win, lose]
     */
    String stateString;
    TennisState nextState;
    TennisState nextStateWin;
    TennisState nextStateLose;
    TennisState nextStateLose2;

    abstract void winRound(GameContext context);
    abstract void loseRound(GameContext context);

}
