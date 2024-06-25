public class SMSFollower extends Follower {
    public SMSFollower(SocialMediaAccount account) {
        this.account = account;
        this.account.addFollower(this);
    }
    
    public void update() {
        System.out.println("SMS notification: " + account.getMessage());
    }
}