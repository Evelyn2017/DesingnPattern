package Behaviour.vote;

/**
 * @author evelyn
 * @description TODO
 * @date 2019-08-26 18:22
 **/
public class BlackVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.format("Warning: user %s in black list !\n", user);
    }
}
