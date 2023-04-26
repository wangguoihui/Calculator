package com.cn.amway;

public class Calculator {

    private int total;

    public Calculator() {
        this.total = 0;
    }

    public void Operation(char op, int num) {
        switch(op) {
            case '+':
                total += num;
                break;
            case '-':
                total -= num;
                break;
            case '*':
                total *= num;
                break;
            case '/':
                total /= num;
                break;
            default:
                System.out.println("不支持的操作");
                break;
        }
        System.out.println(op+" "+num+"="+total);
    }

}
