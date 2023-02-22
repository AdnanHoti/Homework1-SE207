public class TextStrategy implements Strategy {
    @Override
    public void processMessage(String email, String title, String message) {
        //System.out.println("Texting strategy from processMessage");
    	System.out.println("Texting message:");
        System.out.println("From: " + email);
        System.out.println("Title: " + title);
        System.out.println("Message: " + message);
    }
}
