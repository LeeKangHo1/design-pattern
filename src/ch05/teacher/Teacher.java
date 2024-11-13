package ch05.teacher;

public abstract class Teacher implements TeacherAble {
    protected void 입장하기() {
        System.out.println("입장하기");
    }
    protected void 출석부르기() {
        System.out.println("출석부르기");
    }
    protected void 퇴장하기() {
        System.out.println("퇴장하기");
    }

    // 하위 클래스에서 반드시 구현해야 하는 메서드
    protected abstract void 강의하기();

    public void 수업하기() {
        입장하기();
        출석부르기();
        강의하기();
        퇴장하기();
    }
}
