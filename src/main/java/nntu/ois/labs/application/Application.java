package nntu.ois.labs.application;

import nntu.ois.labs.model.AccessPoint;
import nntu.ois.labs.model.BlockGenerator;

public class Application {
    public static void main(String[] args) {

        BlockGenerator.generateInitialScheme(5000, true);

        BlockGenerator.blocks.forEach(System.out::println);

        System.out.println("Сгенерировано точек доступа: " + AccessPoint.ACCESS_POINT_ID);
        System.out.println();
    }
}
