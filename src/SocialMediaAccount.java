import java.util.ArrayList;
import java.util.List;

public class SocialMediaAccount {
    private List<Follower> followers = new ArrayList<>();
    private String message;
    
    public String getMessage() {
        return message;
    }
    
    public void postMessage(String message) {
        this.message = message;
        notifyAllFollowers();
    }
    
    public void addFollower(Follower follower) {
        followers.add(follower);
    }
    
    private void notifyAllFollowers() {
        for (Follower follower : followers) {
            follower.update();
        }
    }
}