package com.codegym.task.task13.task1328;

public abstract class AbstractRobot implements CanDefend, CanAttack {
    private static int hitCount;

    public BodyPart attack() {
//        BodyPart attackedBodyPart = null;
        hitCount = hitCount + 1;
        switch (hitCount) {
            case 1:
                return BodyPart.HEAD;
            case 2:
                return BodyPart.LEG;
            case 3:
                return BodyPart.CHEST;
            default: {
                hitCount = 0;
                return BodyPart.ARM;
            }
        }
    }

    public BodyPart defend() {
//        BodyPart defendedBodyPart = null;
        hitCount = hitCount + 2;
        switch (hitCount) {
            case 1:
                return BodyPart.HEAD;
            case 2:
                return BodyPart.LEG;
            case 3:
                return BodyPart.CHEST;
            default: {
                hitCount = 0;
                return BodyPart.ARM;
            }
        }

    }
}
