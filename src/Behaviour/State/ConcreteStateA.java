package Behaviour.State;

/**
 * @author evelyn
 * @description Concrete state A
 * @date 2019-08-24 11:41
 **/
public class ConcreteStateA implements State{
    @Override
    public void handle(String stateAExp) {
        System.out.println(stateAExp + " Now in StateA");
    }
}
