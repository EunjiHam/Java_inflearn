// 10000000원을 가진 변수를 천단위로 콤마를 찍어서 출력시켜보시오.
// 이 문제는 천단위로 콤마(,)를 찍는 문제인데 여러가지 방법 중 손쉽게 할 수 있는 방법으로 풀어본다.
// 아래는 앞서의 FarmMachine 클래스 문제인데 가격을 천단위로 콤마 찍어서 출력해보세요.

class FarmMachine{
	
	// [1]: 속성(특징)
	int price;		// 가격
	int year;		// 연식
	String color;	// 색상
	
	// [2]: 동작/기능/행동(method) --> 농기계마다 동작이 다양할 것이므로 처음에는 공통적인 동작을 생각해본다.
	void move(){
		System.out.println("Farm machine is moving.");
	}
		
	void dig(){
		System.out.println("Farm machine is digging");
	}
	
	void grind(){
		System.out.println("Farm Machine is grinding");
	}

    String priceComma(){
        String strPrice = Integer.toString(price);
        String strPriceComma = "";

        int len_strPrice = strPrice.length();
        int cnt_strPrice = 0;

        while (len_strPrice > 3){
            String tmpStr = strPrice.substring(len_strPrice - 3, len_strPrice);
            strPriceComma = "," + tmpStr + strPriceComma;

            len_strPrice -= 3;
            cnt_strPrice += 1;
        }

        strPriceComma = strPrice.substring(0, strPrice.length() - cnt_strPrice * 3) + strPriceComma;

        return strPriceComma;
    }
}

public class Java100_oop_Example003{
	public static void main(String[] args){
		
		// [1]: 객체 생성 
		FarmMachine farmMachine = new FarmMachine();
		
		// [2]: 생성된 객체에 속성 값 입력하기
		farmMachine.price = 10000000;
		farmMachine.year = 2022;
		farmMachine.color = "pink";
		
		// [3]: 속성 값 출력하기

        // 자바 내에서 컴마를 출력할 수 있게끔 지원함
        // String fm_price = String.format("%,d", farmMachine.price);
		// System.out.println("farmMachine price: " + fm_price);
		System.out.println("farmMachine price: " + String.format("%,d", farmMachine.price));

        // 내가 구현한 코드
        System.out.println("price: " + farmMachine.priceComma());

		System.out.println("farmMachine year: " + farmMachine.year);
		System.out.println("farmMachine color: " + farmMachine.color);
		
		// [4]: 동작 수행하기
		farmMachine.move();
		farmMachine.dig();
		farmMachine.grind();

		
	}
}
