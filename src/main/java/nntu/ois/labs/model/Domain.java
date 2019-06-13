package nntu.ois.labs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true, exclude = {"accessPointsId"})
public class Domain extends DomainProperties {
    private List<Long> accessPointsId;
    private AccessPointType pointType;

    private void addAccessPoint(Long id) {
        accessPointsId.add(id);
    }
}

