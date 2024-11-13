package ch03;

// TigerAdapter 생성 과정
// 1. TigerAdapter의 타입을 Animal로 일치
// 2. getName() 메서드를 오버라이드
// 3. OuterTiger는 누구도 만들 책임이 없는 객체 -> main에서 생성해야 한다.

// OuterTiger와 Cat, Mouse 등과의 이질적인 것을 동일하게 맞추는 역할
public class TigerAdapter extends Animal{
    // OuterTiger에 의존
    private OuterTiger outerTiger;

    public TigerAdapter(OuterTiger outerTiger) {
        this.outerTiger = outerTiger;
    }

    @Override
    public String getName() {
        return outerTiger.getFullname();
    }
}
