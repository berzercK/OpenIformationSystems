package nntu.ois.labs.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Block {
    private List<AccessPoint> inAccessPoints;
    private List<AccessPoint> outAccessPoints;

    @Override
    public String toString() {
        return "Block{\n\t" +
                "inAccessPoints=" + inAccessPoints +
                ",\n\toutAccessPoints=" + outAccessPoints +
                '}';
    }
}
