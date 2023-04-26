package com.cn.amway;

public class CalCommand extends Command {

    public CalCommand(Calculator cal, char op, int num) {
        super(cal, op, num);
    }

    @Override
    public void Execute() {
        cal.Operation(op, num);
    }

    @Override
    public void UnExecute() {
        cal.Operation(undo(op), num);
    }

    private char undo(char op) {
        char undo=' ';
        switch(op) {
            case '+':
                undo='-';
                break;
            case '-':
                undo='+';
                break;
            case '*':
                undo='/';
                break;
            case '/':
                undo='*';
                break;
            default:
                System.out.println("不支持的操作");
                break;
        }
        return undo;
    }

}
