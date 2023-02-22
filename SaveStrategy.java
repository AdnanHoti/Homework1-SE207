
public class SaveStrategy implements Strategy {
    @Override
    public void processMessage(String email, String title, String message) {
        //System.out.println("Saving message in SaveStrategy.java");
    	System.out.println("Saving message:");
        System.out.println("From: " + email);
        System.out.println("Title: " + title);
        System.out.println("Message: " + message);
    }
}