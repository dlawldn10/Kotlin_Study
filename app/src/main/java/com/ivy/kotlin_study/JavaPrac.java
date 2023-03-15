package com.ivy.kotlin_study;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class JavaPrac {

    // 나머지가 1이 되는 수 찾기
//    public int solution(int n) {
//        int x = 2;
//        while(n % x != 1){
//            x++;
//        }
//        return x;
//    }


    // 자연수 뒤집어 배열로 만들기
    // 7:44
    // 8:11
//    public int[] solution(long n) {
//        char[] arr = Long.toString(n).toCharArray();
//        int[] answer = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            answer[i] = Character.getNumericValue(arr[arr.length-1-i]);
//        }
//
//        return answer;
//    }


    // 약수 구하기
    // 8:17
    // 8:24
//    public int[] solution(int n) {
////        ArrayList<Integer> list = new ArrayList<>();
////        int i = 1;
////        while (i <= n){
////            if (n % i == 0){
////                list.add(i);
////            }
////            i++;
////        }
////        int[] answer = new int[list.size()];
////        for (int j = 0; j <list.size(); j++) {
////            answer[j] = list.get(j);
////        }
////        return answer;
//
//        // mapToInt() 활용한 풀이
//        List<Integer> answer = new ArrayList<>();
//        for(int i=1; i<=n; i++){
//            if(n % i == 0){
//                answer.add(i);
//            }
//        }
//        return answer.stream().mapToInt(x -> x).toArray();
//
//    }


    // 영어가 싫어요
    // 8:26
    // --
    // replace 사용하기
//    public long solution(String numbers) {
//        String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//
//        for (int i = 0; i < numbers_arr.length; i++) {
//            numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
//        }
//
//        long answer = Long.parseLong(numbers);
//        return answer;
//    }


    // 인덱스 바꾸기
//    public String solution(String my_string, int num1, int num2) {
//        String[] strArray = my_string.split("");
//        String chrNum1 = strArray[num1];
//        strArray[num1] = strArray[num2];
//        strArray[num2] = chrNum1;
//
//        return String.join("", strArray);
//    }


    // 배열 두배 만들기
    // map 사용법
//    public int[] solution(int[] numbers) {
//        return Arrays.stream(numbers).map(it -> it * 2).toArray();
//    }


    // 최빈값 구하기
    // hashmap 사용하기
    // map을 list로 만들고 정렬하기
//    public int solution(int[] array) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < array.length; i++) {
//            map.put(array[i], map.getOrDefault(array[i] + 1, 0));
//        }
//
//        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
//        entries.sort((a, b) -> b.getValue() - a.getValue());
//
//        return entries.get(0).getKey();
//    }


    // 짝수는 싫어요
    // 배열로 변환안하고 리턴 타입 바꿔도 된다는 사실...
//    public int[] solution(int n) {
//        List<Integer> answer = new ArrayList();
//        for (int i = 1; i <= n; i+=2) {
//            answer.add(i);
//        }
//        return answer.stream().mapToInt(it -> it).toArray();
//
////        // + stream과 filter 사용법
////        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
//    }


    // 배열의 평균값
//    public double solution(int[] numbers) {
////        return Arrays.stream(numbers).sum()/(double)numbers.length;
//
//        // 평균 구하는 average 함수
//        return Arrays.stream(numbers).average().orElse(0);
//    }


    // 배열 뒤집기
//    public ArrayList<Integer> solution(int[] num_list) {
//        // for문 이용한 reverse
//        ArrayList<Integer> answer = new ArrayList<Integer>();
//        for (int i = 0; i < num_list.length; i++) {
//            answer.add(num_list[num_list.length-1-i]);
//        }
//        return answer;
//    }


    // 문자열 뒤집기
//    public String solution(String my_string) {
////        String answer = "";
////        char[] charArray = my_string.toCharArray();
////        for (int i = 0; i < charArray.length; i++) {
////            answer += charArray[charArray.length-1-i];
////        }
////        return answer;
//
//        // StringBuilder 사용하기
//        StringBuilder sb = new StringBuilder();
//        sb.append(my_string);
//        sb.reverse();
//
//        return sb.toString();
//
//        // 더 간단히
//        return new StringBuilder(my_string).reverse().toString();
//    }


    // 짝수 홀수 개수
//    public int[] solution(int[] num_list) {
//        int[] answer = {0, 0};
////        for (int i = 0; i < num_list.length; i++) {
////            if (num_list[i] % 2 == 0) answer[0] += 1;
////            else answer[1] += 1;
////        }
//
//        // 더 간단히
//        for(int i = 0; i < num_list.length; i++)
//            answer[num_list[i] % 2]++;
//
//        return answer;
//    }


    // 문자 반복 출력하기
//    public String solution(String my_string, int n) {
////        String answer = "";
////        char[] charArray = my_string.toCharArray();
////        for (int i = 0; i < my_string.length(); i++) {
////            for (int j = 0; j < n; j++) {
////                answer += charArray[i];
////            }
////        }
////        return answer;
//
//        // repeat 사용하기
//        String answer = "";
//        String[] str = my_string.split("");
//        for(int i=0; i<my_string.length(); i++){
//            answer += str[i].repeat(n);
//        }
//        return answer;
//    }


    // 특정 문자 제거하기
//    public String solution(String my_string, String letter) {
//        return my_string.replace(letter, "");
//    }


    // 배열 자르기
//    public int[] solution(int[] numbers, int num1, int num2) {
////        int[] answer = new int[num2-num1];
////        int j = 0;
////        for (int i = num1; i <= num2; i++) {
////            answer[j] = numbers[i];
////            j++;
////        }
////
////        return answer;
//
//        // 좀더 간단히
//        return Arrays.copyOfRange(numbers, num1, num2 + 1);
//    }


    // 같은 숫자는 싫어
    // 1:35
    // 1:44
    // 순서 유지해야한다 -> 스택 문제일 수도?
//    public int[] solution(int []arr) {
//        Stack<Integer> stk = new Stack<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (stk.empty()) stk.push(arr[i]);
//            else if (stk.peek() != arr[i]) stk.push(arr[i]);
//        }
//
//        return stk.stream().mapToInt(x -> x).toArray();
//    }


    // 올바른 괄호
    // 1:46
    // --
    // str.charAt()을 기억하자
//    boolean solution(String s) {
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '(') {
//                stack.push('(');
//            } else if (s.charAt(i) == ')') {
//                if (stack.isEmpty()) {
//                    return false;
//                }
//                stack.pop();
//            }
//        }
//        return stack.isEmpty();
//    }


    // 다리를 지나는 트럭
    // 2:15
    // --
    class Solution {
        public int solution(int bridge_length, int weight, int[] truck_weights) {
            Queue<Integer> queue = new LinkedList<>();
            int sum = 0;
            int time = 0;

            for(int i = 0; i < truck_weights.length; i++) { // 향상된 for문을 쓰는게 좋을 것
                int truck = truck_weights[i];

                while(true) {
                    // 큐에 아무것도 없는 경우 = 어떠한 트럭도 다리위에 없음
                    if(queue.isEmpty()) {
                        queue.add(truck);
                        sum += truck;
                        time++; // 다리에 오를 때만 시간 추가
                        break;
                    } else if(queue.size() == bridge_length) { // 큐에 다리 길이만큼 트럭이 다 찬 경우
                        sum -= queue.poll();
                    } else  { // 다리 길이만큼 큐가 차지않았음
                        // weight 값을 넘지 않는 선에서 새로운 트럭을 다리에 올려줌
                        if(sum + truck <= weight) {
                            queue.add(truck);
                            sum += truck;
                            time++;
                            break;
                        } else {
                            // 넘는다면 0을 넣어 이미 큐에 있는 트럭이 다리를 건너게 만듬
                            queue.add(0);
                            time++;
                        }
                    }
                }
            }

            // 마지막 트럭에서 반복문이 끝나는데, 마지막 역시 다리 길이만큼 지나가야하기에 + 다리 길이
            return time + bridge_length;
        }
    }


}
