package leetcode;

import java.awt.event.ItemEvent;
import java.util.PriorityQueue;

public class RecrganizeString {

    public static void main(String[] args) {
        String s = "abbabbsba";
        String rst =  reorganizeString(s);
        System.out.println(rst);
    }



    public static String reorganizeString(String s){
        if(s.length() <= 1){
            return s;
        }
        PriorityQueue<Item> pq = new PriorityQueue<Item>((x,y) -> y.value-x.value);
        int[] record = new int[26];
        for(char ch : s.toCharArray()){
            record[ch -'a']++;
        }
        int limit = s.length() / 2 + s.length() % 2;
        for (int i = 0; i < 25; i++) {
            if(record[i] > limit){
                return " ";
            }
            if (record[i] > 0){
                pq.add(new Item(record[i],(char)(i+ 'a')));
            }
        }
        return greedyBuild(s.length(),pq);
    }

    private static String greedyBuild(int len, PriorityQueue<Item> pq) {
        char[] ans = new char[len];
        int t = 0;
        while (pq.size() > 0 ){
            Item cur = pq.poll();
            for (int i = 0; i < cur.value; i++) {
                if (t > len){
                    t= 1;
                }
                ans[t] = cur.pattern;
                t += 2;

            }

        }
        return new String(ans);
    }

    static class Item{
        int value;

        char pattern;

        public Item() {

        }

        public Item(int value, char pattern) {
            this.value = value;
            this.pattern = pattern;
        }
    }

}
