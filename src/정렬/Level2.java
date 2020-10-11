package 정렬;

import java.util.Arrays;
import java.util.Comparator;

class Level2 {
    public static void main(String[] args) {
        Level2 level2 = new Level2();

        int numbers[] = {6, 10, 2};
        int numbers2[] = {3, 30, 34, 5, 9};

        System.out.println(level2.solution(numbers));
        System.out.println(level2.solution(numbers2));

    }
    public String solution(int[] numbers) {
        // 숫자를 문자열로 변환
        String[] result = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = String.valueOf(numbers[i]);
        }

        // 정렬
        Arrays.sort(result, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        // 0만 여러개 있는 배열의 경우 하나의 0만 리턴
        if (result[0].equals("0")) {
            return "0";
        }

        String answer = "";
        // 정렬된 문자 하나로 합치기
        for (String a : result) {
            answer += a;
        }
        return answer;
    }
}