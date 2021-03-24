package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <Integer> all = new ArrayList<Integer>();
        ArrayList <Integer> list1 = new ArrayList<Integer>();
        ArrayList <Integer> list2 = new ArrayList<Integer>();
        ArrayList <Integer> list3 = new ArrayList<Integer>();
        //напишите тут ваш код
        for (int x = 0; x < 20 ; x++) {
            all.add(Integer.parseInt(br.readLine()));
        }
        for (int x = 0; x < 20 ; x++) {
            if ((all.get(x)%3==0) && (all.get(x)%2==0)){
                list2.add(all.get(x));
                list1.add(all.get(x));
            }
            else if( all.get(x)%3 == 0){
                list1.add(all.get(x));
            }
            else if (all.get(x)%2== 0){
                list2.add(all.get(x));
            }

            else {
                list3.add(all.get(x));
            }
        }
        printList(list1);
        printList(list2);
        printList(list3);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for(Integer x :list){
            System.out.println(x);
        }
    }
}
