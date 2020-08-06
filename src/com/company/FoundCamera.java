package com.company;

public class FoundCamera <T> implements Zoomable {
    private String Camera;
    T year;
    private int levelling;

    public FoundCamera(String camera, T year, int levelling) {
        Camera = camera;
        this.year = year;
        this.levelling = levelling;
    }

    public String getCamera() {
        return Camera;
    }

    public void setCamera(String camera) {
        Camera = camera;
    }

    public T getYear() {
        return year;
    }

    public void setYear(T year) {
        this.year = year;
    }

    public int getLevelling() {
        return levelling;
    }

    public void setLevelling(int levelling) {
        this.levelling = levelling;
    }

    @Override
    public Object WritingYear() {
        return year;
    }

    @Override
    public Object levelling() {
        return levelling;
    }
}
