package com.codegym.task.task14.task1406;

/* 
No mistakes
Set obj equal to an object that allows the main method to run error-free.


Requirements:
1. The GrayMouse class must inherit the Mouse class.
2. The Jerry class must inherit the GrayMouse class.
3. The variable obj should reference an object that is simultaneously a Mouse, a GrayMouse, and a Jerry.
4. The main method must call the printClasses method.

*/

public class Solution {
    public static void main(String[] args) {
        Object obj = new Jerry();// Add your code here

        Mouse mouse = (Mouse) obj;
        GrayMouse grayMouse = (GrayMouse) mouse;
        Jerry jerry = (Jerry) grayMouse;

        printClasses(obj, mouse, grayMouse, jerry);

    }

    public static void printClasses(Object obj, Mouse mouse, GrayMouse grayMouse, Jerry jerry) {
        System.out.println(jerry.getClass().getSimpleName());
        System.out.println(grayMouse.getClass().getSimpleName());
        System.out.println(mouse.getClass().getSimpleName());
        System.out.println(obj.getClass().getSimpleName());
    }

    static class Mouse {
    }

    static class GrayMouse extends Mouse {
    }

    static class Jerry extends GrayMouse {
    }
}
