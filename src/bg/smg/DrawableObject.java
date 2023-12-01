package bg.smg;

import javax.swing.*;

public abstract class DrawableObject {
    private int xCoord;
    private int yCoord;
    private int width;
    private int height;

    public DrawableObject() {
        xCoord = 100;
        yCoord = 100;
        width = 100;
        height = 100;
    }

    public abstract JPanel draw();

    public int getxCoord() {
        return xCoord;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
