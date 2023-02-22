import java.util.ArrayList;
import java.util.List;

public class ConcreteBlog implements Blog {
    private List<User> observers;

    public ConcreteBlog() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(User observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(User observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String email, String title, String message) {
        for (User observer : observers) {
            observer.acceptMessage(email, title, message);
        }
    }

    @Override
    public void postNewMessage(String email, String title, String message) {
        //System.out.println("postNewMessage from ConcreteBlog.java");
    	System.out.println("New post by: " + email);
        System.out.println("Title: " + title);
        System.out.println("Message: " + message);
        notifyObservers(email, title, message);
    }

	@Override
	public void postNewMessage(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
}
