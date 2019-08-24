package Behaviour.State;

/**
 * @author evelyn
 * @description User
 * @date 2019-08-24 11:49
 **/
public class Client {
    public static void main(String[] args) {
        State stateA = new ConcreteStateA();

        Context context = new Context();
        context.setState(stateA);

        context.request("test");
    }
}
