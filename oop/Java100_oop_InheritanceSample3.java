// 클래스의 상속을 코드로 구현해보시오.
// 이 문제는 자바 OOP 문법에서 상속에 대한 개념과 그것을 코드로 구현할 수 있는지를 묻는 문제이다.


class Person{
    // Field
    int gender;
    int power;

    // Constructor
    Person() {
        this.gender = 1;    // 1: 남성, 2: 여성
        this.power = 100;   // 기본 파워
    }

    // Method
    void walk() {
        System.out.println("걸어가고 있어요~");
    }
}

class Hero extends Person{
    // Field
    String name;
    int age;

    // Constructor
    Hero() {}
    Hero(String name, int age){
        super();    // 명시적으로 부모 클래스의 생성자를 호출하는 것 (super를 적지 않아도 부모 클래스의 생성자가 자동으로 수행됨)
        this.name = name;
        this.age = age;
    }

    // Method
    // void walk(){
    //     System.out.println("2배로 빨리 걸어가고 있어요~");
    // }

    void eat(){
        System.out.println("밥먹고 있어요~");
    }

    void displayPerson(){
        System.out.println("이름: " + name + ", 나이: " + age + ", 성별: " + gender + ", 파워: " + power);
    }
}

class Villain {

}

public class Java100_oop_InheritanceSample3 {
    public static void main(String[] args) {

        // [1] 객체 생성
        Person p1 = new Person();
        p1.walk();
        // p1.eat();   // error

        // [2] 상속을 통한 슈퍼맨 객체 생성
        Hero h1 = new Hero("슈퍼맨", 20);
        System.out.println(h1.name);
        System.out.println(h1.age);
        System.out.println(h1.gender);  // 부모 클래스 필드(변수)
        System.out.println(h1.power);   // 부모 클래스 필드(변수)
        h1.displayPerson();
    }
}


