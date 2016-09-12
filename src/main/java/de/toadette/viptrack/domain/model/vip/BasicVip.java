package de.toadette.viptrack.domain.model.vip;


public class BasicVip implements Vip {

    private String userName;
    private int postsCount;

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public int getPostsCount() {
        return postsCount;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPostsCount(int postsCount) {
        this.postsCount = postsCount;
    }
}
