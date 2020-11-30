package model;

import java.awt.*;
import java.util.EnumMap;

public class colorenum {
    private static final colorenum instance = new colorenum();
    private final EnumMap<ShapeColor, Color> colorenum;

    private colorenum() {
        this.colorenum = new EnumMap<>(ShapeColor.class);
        this.insertcolorfunc();
    }

    private void insertcolorfunc() {
        colorenum.put(ShapeColor.BLUE, Color.BLUE);
        colorenum.put(ShapeColor.GREEN, Color.GREEN);
        colorenum.put(ShapeColor.BLACK, Color.BLACK);
        colorenum.put(ShapeColor.WHITE, Color.WHITE);
        colorenum.put(ShapeColor.CYAN, Color.CYAN);
        colorenum.put(ShapeColor.DARK_GRAY, Color.DARK_GRAY);
        colorenum.put(ShapeColor.GRAY, Color.GRAY);
        colorenum.put(ShapeColor.LIGHT_GRAY, Color.LIGHT_GRAY);
        colorenum.put(ShapeColor.MAGENTA, Color.MAGENTA);
        colorenum.put(ShapeColor.ORANGE, Color.ORANGE);
        colorenum.put(ShapeColor.PINK, Color.PINK);
        colorenum.put(ShapeColor.RED, Color.RED);
        colorenum.put(ShapeColor.YELLOW, Color.YELLOW);
    }

    public EnumMap<ShapeColor, Color> getcolorenum() {
        return this.colorenum;
    }

    public static colorenum getInstance() {
        return instance;
    }
}