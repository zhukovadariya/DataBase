package lab01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@AllArgsConstructor
@Getter
@Setter
public class FlowerShop {
    String name;
    String address;
    List<Worker> workers;
    List<Provider> providers;
    List<Flower> flowers;
    List<Client> clients;


}

