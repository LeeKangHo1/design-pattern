package abc;

public class A extends Data {
    private int id;
    private String email;
    private String address;

    public A(int id, String email, String address) {
        this.id = id;
        this.email = email;
        this.address = address;
    }

    @Override
    public int getId() {
        return id;
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
