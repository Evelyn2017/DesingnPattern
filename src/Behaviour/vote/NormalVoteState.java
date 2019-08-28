package Behaviour.vote;

/**
 * @author evelyn
 * @description TODO
 * @date 2019-08-26 18:21
 **/
public class NormalVoteState implements VoteState{
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.format("User %s success voted to %s !\n", user, voteItem);
    }
}
