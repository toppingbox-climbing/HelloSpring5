package hello.spring.basic;

public class Spring5App00 {

    // 첫번째 사례
    // 간단한 인삿말을 출력하는 프로그램 작성


    public static void main(String[] args) {

        // sayHello 메서드를 호출하기 위해서는
        // Spring5App00의 객체화 필요
        //클래스를 쓰려면 클래스의 객체화를 동반 해야만 한다
        Spring5App00 app00 = new Spring5App00();
        app00.sayHello("스프링5!!");

    }
    private void sayHello(String msg) {
        System.out.println("안녕하세요," + msg);
    }
}
