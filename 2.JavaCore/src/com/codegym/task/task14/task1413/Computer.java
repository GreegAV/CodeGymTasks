package com.codegym.task.task14.task1413;

public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }
}