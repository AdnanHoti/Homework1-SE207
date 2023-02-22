public class DisplayStrategy implements Strategy {
    @Override
    public void processMessage(String email, String title, String message) {
        //System.out.println("Displaying message from DisplayStrategy.java");
    	System.out.println("Displaying message:");
        System.out.println("From: " + email);
        System.out.println("Title: " + title);
        System.out.println("Message: " + message);
    }
}



