package Behaviour.vote;

public interface VoteState {
    /**
     *
     * @param user 投票人
     * @param voteItem 投票项
     * @param voteManager 投票上下文
     */
    void vote(String user, String voteItem, VoteManager voteManager);
}
