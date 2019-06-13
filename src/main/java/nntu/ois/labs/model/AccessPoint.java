package nntu.ois.labs.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class AccessPoint {
    public static long ACCESS_POINT_ID = 0;

    private long id;
    private AccessPointType accessPointType;
    private List<DomainProperties> params;

    public AccessPoint(AccessPointType accessPointType, List<DomainProperties> params) {
        id = ACCESS_POINT_ID++;
        this.accessPointType = accessPointType;
        this.params = new ArrayList<>(params);
    }

    @Override
    public String toString() {
        return "\n\t\tAccessPoint{" +
                "id=" + id +
                ", accessPointType=" + accessPointType +
                ", params=" + params +
                '}';
    }
}

