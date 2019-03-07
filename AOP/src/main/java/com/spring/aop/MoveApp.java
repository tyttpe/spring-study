package com.spring.aop;

public class MoveApp {
    public static void main(String[] args) {
        Move tank = new Tank();
        Move moveproxy = new TankProxy(tank);
        moveproxy.move();
    }
}
