package ar.com.ada.online.second.subclass;

import ar.com.ada.online.second.interfaces.Communication;

public class Paper implements Communication {
    public boolean isRecycled;
    public String type;

    public Paper(boolean isRecycled, String type) {
        this.isRecycled = isRecycled;
        this.type = type;
    }

    @Override
    public void communicate() {
        if (isRecycled == true) {
            System.out.println("I'm writing a novel on recycled paper, type " + type + ".");
        } else {
            System.out.println("I'm writing a novel on paper, type " + type + ".");
        }
    }

    @Override
    public void express() {
        System.out.println("I'm expressing how my life would be if I was rich.");
    }
}
