package com.imooc.idea;

public class Helloworld {
    private String val;

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Helloworld{" +
                "val='" + val + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("Hello,world");
    }
}
