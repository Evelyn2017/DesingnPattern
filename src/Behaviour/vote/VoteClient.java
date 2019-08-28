package Behaviour.vote;

import java.util.*;

/**
 * @author evelyn
 * @description
 * @date 2019-08-26 18:42
 **/
public class VoteClient {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "love");
        map.put(1, "fifteen");
        map.put(2, "thirty");
        map.put(3, "forty");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 0 && b == 0)
            System.out.format("Start state! %s : %s.",map.get(a), map.get(b));
        
    }
}
