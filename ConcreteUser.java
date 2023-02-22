public class ConcreteUser implements User {
    private String email;
    private Strategy strategy;

    public ConcreteUser(String email, Strategy strategy) {
        this.setEmail(email);
        this.strategy = strategy;
    }

    @Override
    public void acceptMessage(String email, String title, String message) {
        strategy.processMessage(email, title, message);
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
