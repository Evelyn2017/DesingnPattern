package Behaviour.vote;

import java.util.HashMap;
import java.util.Map;

/**
 * @author evelyn
 * @description
 * @date 2019-08-26 18:22
 **/
public class VoteManager {
    private Map<String, String> voteMap = new HashMap<>();
    private Map<String, Integer> voteCount  = new HashMap<>();

    private VoteState state = null;

    public Map<String, String> getVoteMap() {
        return voteMap;
    }

    public void vote(String user, String voteItem) {

        //增加一次投票记录
        Integer oldVoteCount = voteCount.get(user);

        if (oldVoteCount == null)
            oldVoteCount = 0;

        oldVoteCount += 1;
        voteCount.put(user, oldVoteCount);

        //判断投票状态
        // normal=1，1<repeat<=5,5<spite<8,black>8
        if (oldVoteCount == 1)
            state = new NormalVoteState();
        else if (oldVoteCount > 1 && oldVoteCount <= 5)
            state = new RepeatVoteState();
        else if (oldVoteCount > 5 && oldVoteCount <= 8)
            state = new SpiteVoteState();
        else
            state = new BlackVoteState();

        state.vote(user, voteItem, this);
    }
}
