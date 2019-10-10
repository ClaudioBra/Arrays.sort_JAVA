package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int num[] = {3, 5, 1, 8, 4};

        Arrays.sort(num);

        for(int valor: num){
            System.out.println(valor);
        }
    }
}
