// 문자열을 숫자로 변환시 진수를 지정해서 출력해보시오.
// 이 문제는 Integer.parseInt()의 두 번째 인자값으로 진수를 지정하여 출력하는 것에 대해서 묻는 문제이다.

// 문자열을 숫자로 바꿔서 연산해보시오.
// 이때, 인자값으로 진수를 지정해서 출력해보시오.
// 이 문제는 자바 프로그래밍시 문자열을 숫자로 변환시키는 것에 대해서 아는지를 묻는 문제이다.

// [!]: 왜 변환이 필요한가?
// 1+2 숫자끼리의 연산은 3이지만, 문자열끼리의 연산은 12가 되기 때문에 숫자로 변환 후 연산을 수행해야 한다.
// 문자열로 숫자를 변환시키는 방법 --> Integer.parseInt() 사용.
// parseInt() --> Integer 클래스의 static으로 지정 --> 따라서, 객체의 생성 없이 바로 "클래스명.parseInt()"로 직접 사용이 가능.
// 두 번째 인자 값으로 진수를 지정 --> 해당 진수에 맞는 값이 됨 --> Integer.parseInt("1000" , 2);

public class Java100_oop_Parseint2 {
    public static void main(String[] args){

        // [1]: 숫자끼리의 연산
        int a = 1;
        int b= 2;
        int c = a + b;
        System.out.println("a + b = " + c);

        // [2]: 문자열끼리의 연산
        String a1 = "1";
        String b1 = "2";
        String c1 = a1 + b1;
        System.out.println("a1 + b1 = " + c1);
        System.out.println(c1.getClass().getName());

        // [3]: 문자열 --> 숫자로 변환 후 연산
        int a2 = Integer.parseInt(a1);
        int b2 = Integer.parseInt(b1);
        System.out.println("a2 + b2 = " + (a2 + b2));

        // [4]: 진수 지정
        System.out.println("----------------------------- [진수 지정]");

        System.out.println(Integer.parseInt("2022"));       // 진수를 지정하지 않으면 10진수
        System.out.println(Integer.parseInt("2022", 10));   // 2022를 10진수로 출력 (2022)
        System.out.println(Integer.parseInt("2022", 8));    // 2022를 8진수로 출력 (1042)

        System.out.println(Integer.parseInt("1", 2));       // 1을 2진수로 출력 (1)
        System.out.println(Integer.parseInt("1001", 2));    // 1004를 2진수로 출력 (9)
        System.out.println(Integer.parseInt("1004", 8));    // 1004를 8진수로 출력 (516)

        System.out.println(Integer.parseInt("A", 16));      // A를 16진수로 출력 (10)
        System.out.println(Integer.parseInt("F", 16));      // F를 16진수로 출력 (15)
        System.out.println(Integer.parseInt("FF", 16));      // F를 16진수로 출력 (15)

        System.out.println("----------------------------- [진수 지정]");
    }
}
