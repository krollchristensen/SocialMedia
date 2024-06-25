public class EmailFollower extends Follower {
    public EmailFollower(SocialMediaAccount account) {
        this.account = account;
        this.account.addFollower(this);
    }
    public void update() {
        System.out.println("Email notification: " + account.getMessage());
    }
}
