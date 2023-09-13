package lab01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@AllArgsConstructor
@Getter
@Setter
public class Provider {
    Integer contacts;
    List<Flower> flowers;
    Integer count;
    Integer price;
}
