package abc;

public class C extends Data{
    private int id;
    private String email;
    private String addr;

    public C(int id, String email, String addr) {
        this.id = id;
        this.email = email;
        this.addr = addr;
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
        return addr;
    }
}