package com.spring.aop;

public class TankProxy implements Move{
    private Move t;

    public TankProxy(Move t) {
        this.t = t;
    }

    public void move() {
        System.out.println("star");
        t.move();
        System.out.println("stop");
    }
}
