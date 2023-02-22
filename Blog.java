
public interface Blog {
    void registerObserver(User observer);
    void removeObserver(User observer);
    void notifyObservers(String email, String title, String message);
    void postNewMessage(String email, String title, String message);
	void postNewMessage(String string, String string2);
}
