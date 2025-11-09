public class InstagramAccount {
    public static void main(String[] args) {
        Instagram user1 = new Instagram("Pranav", 1234567890, "abc");
        System.out.println("UserName : " + user1.username);
        System.out.println("Password : " + user1.getPassword());
        System.out.println("Contact : " + user1.getContact());
        user1.setPassword("1234");
        user1.setContact(988765821);
        System.out.println("UserName : " + user1.username);
        System.out.println("Password : " + user1.getPassword());
        System.out.println("Contact : " + user1.getContact());
    }
}
