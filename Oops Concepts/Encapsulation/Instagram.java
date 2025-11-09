public class Instagram {
    public String username;
    private long contact;
    private String password;

    Instagram(String username, long contact, String password) {
        this.username = username;
        this.contact = contact;
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public long getContact() {
        return contact;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setContact(long contact) {
        this.contact = contact;
    }
}
