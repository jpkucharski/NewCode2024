package builderWithLombok;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {
    private String street, city, zipCode;
}
