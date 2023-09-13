package lab01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@AllArgsConstructor
@Getter
@Setter
public class Purchases {
    String nameOfFlowers;
    String nameOfClient;
    Integer count;
    Date time;
}