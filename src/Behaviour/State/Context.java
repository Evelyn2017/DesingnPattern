package Behaviour.State;

/**
 * @author evelyn
 * @description user interface
 * @date 2019-08-24 11:40
 **/
public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    /**
     * user method.
     */
    public void request(String userParam) {
        state.handle(userParam);
    }
}
