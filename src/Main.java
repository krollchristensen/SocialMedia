public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        SocialMediaAccount account = new SocialMediaAccount();

        new EmailFollower(account);
        new SMSFollower(account);

        account.postMessage("New post available!");
    }
}