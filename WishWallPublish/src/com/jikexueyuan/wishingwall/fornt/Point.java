package com.jikexueyuan.wishingwall.fornt;

/**
 * Created by wwtliu on 6/17/15.
 */
public class Point {

    public Point(int x,int y){
        setX(x);
        setY(y);
    }

    int x,y = 0;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
