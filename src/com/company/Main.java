package com.company;

public class Main {

    public static void main(String[] args) {
        FoundCamera foundCamera = new FoundCamera("Canon EF", 2020, 1);
        FoundCamera foundCamera2 = new FoundCamera("Nikon DF", 2019, 4);
        recordCamera(foundCamera);
        recordCamera(foundCamera2);
    }

    public static <T extends Number> void recordCamera(FoundCamera<T> foundCamera) {
        System.out.println(foundCamera.getCamera() + " Year : " + foundCamera.WritingYear());
        System.out.println(foundCamera.getCamera() + " Levelling : " + foundCamera.levelling());
    }
}
//6)  Создать обобщенный класс и обобщенный интерфейс и реализовать этот интерфейс классом.
// Ограничить параметры типов классом Number.
// В главном классе создать несколько экземпляров обобщенного класса.
