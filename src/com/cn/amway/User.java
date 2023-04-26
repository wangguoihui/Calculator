package com.cn.amway;

import java.util.ArrayList;
import java.util.List;

public class User {

    private Calculator cal = new Calculator();

    private List<Command> commands = new ArrayList<>();
    private int count = 0;
    public void Compute(char operator, int operand) {
        Command command = new CalCommand(cal, operator, operand);
        command.Execute();
        count++;
        commands.add(command);
    }

    public void Redo(int levels) {
        for (int i = 0; i < levels; i++) {
            if (count < commands.size()) {
                count++;
                commands.get(count-1).Execute();
            }
        }
    }

    public void Undo(int levels) {
        for  (int i = 0; i < levels; i++) {
            if (count > 0) {
                commands.get(count - 1).UnExecute();
                count--;
            }
        }
    }

    public static void main(String[] args) {
        User user = new User();
        System.out.println("------加减乘除-------");
        user.Compute('+', 100);
        user.Compute('-', 50);
        user.Compute('*', 10);
        user.Compute('/', 2);
        System.out.println("------撤销-------");
        user.Undo(4);
        System.out.println("------重做-------");
        user.Redo(4);
    }

}
