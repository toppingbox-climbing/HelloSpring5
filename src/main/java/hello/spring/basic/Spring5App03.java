package hello.spring.basic;

import hello.spring.bean.Spring5Bean03;
import hello.spring.bean.Spring5Bean03Eng;
import hello.spring.bean.Spring5Bean03Jpn;
import hello.spring.bean.Spring5Bean03Kor;

public class Spring5App03 {
    public static void main(String[] args){

        //인터페이스는 불완전 클래스이기 때문에
        //객체화 불가

        // 인터페이스를 도입하면
        // 확장성이 높고 유연한 코드를 작성할 수 있음
        // 또한, 객체간의 tightly coupled를 피할 수 있고
        // 객체간의 의존성을 낮출수도 있음

        // 하지만, new 연산자로 객체를 생성하는 코드가 노출됨
        // 다시 말해, Spring5Bean03은
        // Spring5Bean03Kor, Spring5Bean03Eng,
        // Spring5Bean03Jpn에 의존적이라는 의미

        // 해결 : factory 패턴을 이용해서
        // 객체생성을 전담하는 클래스를 만들어
        // 객체생성 과정을 캡슐화 함


        Spring5Bean03 app03 = null;

        app03 = new Spring5Bean03Kor();
        app03.sayHello("스프링5!!");

        app03 = new Spring5Bean03Eng();
        app03.sayHello("Spring5!!");

        app03 = new Spring5Bean03Jpn();
        app03.sayHello("スプリング.");

//인터페이스로 하게 되면 킄ㄹ래스를 상속받는 다른 하위 클래스들도 다양하게 받을 수 있다?
        //업캐스팅?
    }

}
