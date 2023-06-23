package hello.spring.basic;

import hello.spring.bean.Spring5Bean01;
import hello.spring.bean.Spring5Bean02;

public class SpringApp02 {
//    public static void main(String[] args) {
//
//        Spring5Bean02 app02 = new Spring5Bean02();
//        //메서드 호출: 변수명.메서드명
//        app02.sayHelloKor("스프링5");
//
//        Spring5Bean02 app03 = new Spring5Bean02();
//        //메서드 호출: 변수명.메서드명
//        app03.sayHelloEng("Spring5");
//
//        Spring5Bean02 app04 = new Spring5Bean02();
//        //메서드 호출: 변수명.메서드명
//        app04.sayHelloJpn("スプリング.");
//
//    }
//}
public static void main(String[] args) {

    Spring5Bean02 app02 = new Spring5Bean02();
    //메서드 호출: 변수명.메서드명
    app02.sayHelloKor("스프링5");
    app02.sayHelloEng("Spring5");
    app02.sayHelloJpn("スプリング.");

    }
}

// 객체지향,다형성,캡슐화,