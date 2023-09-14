package lab01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Purchases {
    String nameOfFlowers;
    String nameOfClient;
    Integer count;
    Date time;
    Flower flowers;
    Client client;

    public Purchases(String nameOfFlowers, String nameOfClient, Integer count, Date time) {
        this.nameOfFlowers = nameOfFlowers;
        this.nameOfClient = nameOfClient;
        this.count = count;
        this.time = time;
    }
}