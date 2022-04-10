// 학생들의 성적을 1등부터 순위를 매겨서 출력해보시오.
// 이 문제는 순위(Ranking) 알고리즘에 대해서 알고 있는지를 묻는 문제이다.

public class Java100_algorithm_RankAlgorithm {
    public static void main(String[] args) {

        // [1]: 배열 선언 --> 성적 배열, 순위 배열
        int[] scores = { 88, 50, 38, 100, 90, 100, 99, 75 };
        int[] ranking = new int[scores.length];

        // [2]: 반복문을 돌면서 랭킹 처리
        for (int i = 0; i < scores.length; i++) {

            // 랭킹 초기화 --> 일단은 전부 1등으로 초기화
            ranking[i] = 1;

            // 중첩 반복문
            for (int j = 0; j < scores.length; j++) {
                if (scores[i] < scores[j])
                    ranking[i]++;
            }
        }

        // [3]: 출력
        for (int i = 0; i < scores.length; i++)
            System.out.print(ranking[i] + " ");
        System.out.println();
    }
}
