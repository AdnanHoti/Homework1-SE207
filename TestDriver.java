public class TestDriver {
    public static void main(String[] args) {
        Blog blog = new ConcreteBlog();

        User user1 = new ConcreteUser("user1@gmail.com", new DisplayStrategy());
        User user2 = new ConcreteUser("user2@gmail.com", new SaveStrategy());
        User user3 = new ConcreteUser("user3@gmail.com", new TextStrategy());

        blog.registerObserver(user1);
        blog.registerObserver(user2);
        blog.registerObserver(user3);

        blog.postNewMessage("admin@gmail.com", "New blog post", "This is a new blog post!");

        blog.removeObserver(user2);

        blog.postNewMessage("admin@gmail.com", "titletest", "mssgtest");
        
    }
}
