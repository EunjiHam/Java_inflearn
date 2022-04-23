// continue label이란 무엇인지 설명해보고 관련 예제를 코드로 구현해보시오.
// 이중 반복분내에서 특정 조건이 맞으면 바깥쪽 반복문으로 분기하여 그 반복문의 다음 단계부터 다시 시작할 때 사용한다.
// 이 문제는 생각보다 까다로운 continue와 continue label 사용에 대해서 아는지를 묻는 문제이다.

public class Java100_license_CosPattern4 {
    public static void main(String[] args) {

        // [1]: 이중 반복문
        outerloop: for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {

                // 출력값
                int output = i * 10 + j;

                // 짝수만 출력
                if (output % 2 != 0) {
                    // j가 1이면 outerloop label이 선언된 바깥쪽 for문으로 분기하여 그 다음 단계부터 다시 수행
                    if (j == 1) {
                        System.out.println();
                        continue outerloop;
                    }
                    continue;
                } else {
                    System.out.print(output + " ");
                }
            }
            System.out.println();
        }
    }
}