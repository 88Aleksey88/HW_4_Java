package org.example;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/*
1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
2. Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
 */

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer>list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        // task1(list);
        task2(list);
        }

        static void task1 (LinkedList<Integer> list){
            Stack<Integer> stack = new Stack<>();
            while (!list.isEmpty()){
                stack.add(list.pop());
            }
            LinkedList<Integer>list2 = new LinkedList<>();
            while (!stack.isEmpty()){
                list2.add(stack.pop());
            }
            list = list2;
            System.out.println(list);
        }
        static void enqueue(LinkedList<Integer> list, int num){
            list.add(num);
        }
        static int dequeue (LinkedList<Integer> list){
            int num = 0;
            num = list.get(0);
            list.remove(0);
            return num;
        }
        static int first(LinkedList<Integer> list){
            int num = 0;
            num = list.get(0);
            return num;
        }
        static void task2(LinkedList<Integer> list){
            enqueue(list, 6);
            System.out.println(list);
            dequeue(list);
            System.out.println(list);
            System.out.println(first(list));
        }

    }
