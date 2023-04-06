package org.week1.day3.allotment;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Conference> con_list = new ArrayList<>();

        for(int i = 0; i < N; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            con_list.add(new Conference(start, end));
        }
        //	종료시간을 기준으로 정렬
        Collections.sort(con_list);

        int cur_end = -1;
        int answer = 0;
        //	회의 카운트
        for(Conference c : con_list){
            if(cur_end <= c.start){
                cur_end = c.end;
                answer++;
            }
        }
        System.out.println(answer);
    }

    static class Conference implements Comparable<Conference>{
        int start;
        int end;
        public Conference(int start, int end){
            this.start = start;
            this.end = end;
        }
        //  종료시간이 같다면 시작시간을 기준으로 정렬
        @Override
        public int compareTo(Conference conference){
            if(conference.end < end){
                return 1;
            }
            else if(conference.end > end){
                return -1;
            }
            else if(conference.start < start){
                return 1;
            }
            else if(conference.start > start){
                return -1;
            }
            return 0;
        }
    }
}
