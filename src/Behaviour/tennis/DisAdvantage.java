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

    }

    @Override
    void loseRound(GameContext context) {

    }
}
