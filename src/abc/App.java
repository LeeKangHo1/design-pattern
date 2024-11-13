package abc;

public class App {

    // Data로 A B C 모두 사용 가능
    public static void start(Data a){
        System.out.println(a.getId());
        System.out.println(a.getEmail());
        System.out.println(a.getAddr());
    }

    public static void main(String[] args) {
        // 통신했다 가정
        A a = new A(1, "ssar@nate.com", "부산진구");
        B b = new B(2, "cos@nate.com", "서울강남");
        C c = new C(3, "love@nate.com", "울산울주");

        start(b);
    }
}