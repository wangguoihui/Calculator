package com.cn.amway;

public abstract class Command {

    protected Calculator cal;

    protected char op;

    protected int num;

    public Command(Calculator cal, char op, int num) {
        this.cal = cal;
        this.op = op;
        this.num = num;
    }

    abstract void Execute();
    abstract void UnExecute();

}
