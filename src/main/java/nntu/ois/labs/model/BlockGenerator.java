package nntu.ois.labs.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BlockGenerator {
    private static int blockAmount = 3;
    private static boolean isConsistently = true;
    public static List<Block> blocks = new ArrayList<>();

    private static List<AccessPoint> generateAccessPoints(AccessPointType type, int amount) {
        List<AccessPoint> accessPoints = new ArrayList<AccessPoint>();
        for (int i = 0; i < amount; i++) {
            accessPoints.add(new AccessPoint(type, generatePropertiesList(getRandomInt(1, 4))));
        }
        return accessPoints;
    }

    private static List<DomainProperties> generatePropertiesList(int amount) {
        List<DomainProperties> properties = new ArrayList<DomainProperties>();
        for (int i = 0; i < amount; i++) {
            properties.add(generateProperties());
        }
        return properties;
    }
    private static DomainProperties generateProperties() {
        int i = getRandomInt(0, 2);
        int j = getRandomInt(0, 2);
        String type = String.valueOf(i);
        String restrictions = String.valueOf(j);
        return new DomainProperties(type, restrictions);
    }

    private static int getRandomInt(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min;
    }

    public static List<Block> generateInitialScheme() {
        return generateInitialScheme(blockAmount, isConsistently);
    }

    public static List<Block> generateInitialScheme(int blockAmount,
                                                    boolean isConsistently) {
        BlockGenerator.blockAmount = blockAmount;
        BlockGenerator.isConsistently = isConsistently;

        Block firstBlock = new Block(generateAccessPoints(AccessPointType.IN, getRandomInt(1, 3)),
                                     generateAccessPoints(AccessPointType.OUT, getRandomInt(1, 3)));
        blocks.add(firstBlock);

        for (int i = 1; i < blockAmount; i++) {
            blocks.add(new Block(isConsistently ? blocks.get(i - 1).getOutAccessPoints() :
                                                  generateAccessPoints(AccessPointType.IN, getRandomInt(1, 3)),
                                 generateAccessPoints(AccessPointType.OUT, getRandomInt(1, 3))));
        }

        return blocks;
    }
}
