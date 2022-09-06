package ru.netology.graphics.image;

public class ColorSchema implements TextColorSchema {
    public static final char[] value = {'#', '$', '@', '%', '*', '+', '-', '\''};

    @Override
    public char convert(int color) {
        return value[color/32];
    }
}
