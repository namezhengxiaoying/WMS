package cn.ying.client;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// ע�⣬��������Ƕ��������������ͨ��whileѭ����������������
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
    }
}