package com.ohgiraffers.chap02.section01.sorting;

import java.util.Arrays;
import java.util.Scanner;

/* 수업목표. 선택 정렬*/
/* 필기.
 *  선택 정렬 O(n^2)
 *   대상 데이터에서 최대나 최소 데이터를 찾아 맨 앞과 교환하는 방법이다.
 *   배열의 모든요소에 대해 반복한다.
 * */
public class Application2 {
    /* 설명.
     *  문제 내용
        : N개의 정수가 주어졌을 때, 선택 정렬 알고리즘을 사용하여 내림차순으로 정렬하는 프로그램을 작성하시오.
       입력
        - 첫 번째 줄에 자연수 N(1 <= N <= 100)이 주어진다.
        - 두 번째 줄에 N개의 정수가 공백으로 구분되어 입력된다. 각 정수는 -10^9 이상, 10^9 이하이다.
       출력
         - 내림차순으로 정렬된 수열을 공백으로 구분하여 출력한다.

      설명.
       예시 입력 1
         - 10
           32 7 34 39 40 41 22 31 23 25
       예시 출력 1
         - 41 40 39 34 32 31 25 23 22 7

      설명.
       예시 입력 2
         - 6
          42 29 34 64 28 12
       예시 출력 2
         - 64 42 34 29 28 12
     * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        /* 설명. 입력 데이터 받기 */
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();          // 공백을 구분자로 숫자 입력 받음
        }

        /* 설명. 알고리즘 실행 */
        solution(length, arr);

        /* 설명. 정렬 결과 출력 */
        for (int i : arr) {
            System.out.print(i + " ");;
        }
    }

    public static void solution(int length, int[] arr) {

//        for (int i = 0; i < length; i++) {
//            System.out.println("arr: " + Arrays.toString(arr));
//            int maxIndex = i;
//
//            for (int j = i; j < length; j++) {
//                if(arr[i] > arr[j]){
//                    maxIndex = j;
//                    int temp = arr[i];
//                    arr[i] = arr[maxIndex];
//                    arr[maxIndex] = temp;
//                }
//            }
//        }

        for (int i = 0; i < length - 1; i++) {
            System.out.println("arr: " + Arrays.toString(arr));
            int minIndex = i;

            for (int j = i + 1; j < length; j++) {
                if(arr[i] > arr[j]){
                    minIndex = j;
                    int temp = arr[i];
                    arr[i] = arr[minIndex];
                    arr[minIndex] = temp;
                }
            }
        }
    }

}
