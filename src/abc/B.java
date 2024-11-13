package abc;

public class B extends Data{
    private int no;
    private String email;
    private String address;

    public B(int no, String email, String address) {
        this.no = no;
        this.email = email;
        this.address = address;
    }

    @Override
    public int getId() {
        return no;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getAddr() {
        return address;
    }
}