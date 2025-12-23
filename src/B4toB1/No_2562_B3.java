package B4toB1;

import java.util.Scanner;

public class No_2562_B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxNum = 0;
        int position = 0;

        for (int i = 0; i < 9; i++) {
            int nums = sc.nextInt();
            if (nums > maxNum) {
                maxNum = nums;
                position = i + 1;
            }
        }
        System.out.println(maxNum);
        System.out.println(position);
    }
}

/*
배열 이용하는 줄 알았는데 아니었다.
최대값 변수(maxNum), 최대값이 위치해 있는 지점의 변수(position)을 0으로 초기화하고
9번 입력 받게 for 반복문으로 0부터 9까지 돌리고
만약 입력한 숫자(nums)가 maxNum보다 크다면 그 숫자가 최대값으로 갱신되고
그 숫자가 위치한 곳이 여기서 i가 0부터 시작이었기에 +1을 해줘야 한다.
그런 다음 출력하면 문제 해결
*/
