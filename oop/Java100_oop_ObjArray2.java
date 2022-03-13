// 반복문(for)을 사용하여 객체 배열을 생성하고 출력해보시오.
// 이 문제는 객체의 주소를 지정하고 있는 객체 배열을 반복문을 사용하여 만들 수 있는지를 묻는 문제이다.

class Person{
    // Field
    private String name;
    private int age;

    // Constructor
    Person() {}
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Method
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }
    
    public int getAge() { return this.age; }
    public void setAge(int age) { this.age = age; }
}

public class Java100_oop_ObjArray2 {
    public static void main(String[] args){

        // [1]: 객체 생성
        Person[] pa; // Person 타입의 객체 배열 변수 pa 선언
        pa = new Person[5];    // Person 객체의 참조값을 원소로 가지는 배열 공간을 5개 생성 -> 5명의 객체를 생성할테니 주소를 저장해라

        // [2]: 반복문(for)을 돌면서 Person() 객체 생성
        for (int i = 0; i < pa.length; i++){
            pa[i] = new Person(i + "번 후보자", i+20);
            
            // [2-1]: getter, setter 메서드를 사용해서 출력
            System.out.println(pa[i].getName() + "---> 나이: " + pa[i].getAge());

            // [2-3]: printf()
            // System.out.printf("%s의 나이는 %d살입니다.\n", pa[i].getName(), pa[i].getAge());
        }
    }
}
