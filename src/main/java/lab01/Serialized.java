package lab01;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

//import static jdk.vm.ci.amd64.AMD64.*;

public class Serialized {
    //@SneakyThrows
    public static void serializeToXML() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        XmlMapper xmlMapper = new XmlMapper();

        // serialize our Object into XML string
        String xmlStringClient = xmlMapper.writeValueAsString(new Client("Роберто", 876, 10));
        String objectStringClient = objectMapper.writeValueAsString(new Client("Роберто", 876, 10));

        String xmlStringFlower = xmlMapper.writeValueAsString(new Flower("Розы", 1500, 7));
        String objectStringFlower = objectMapper.writeValueAsString(new Flower("Розы", 1500, 7));


        Worker worker1 = new Worker("Вася", 8134, 40000, "Администратор");
        Worker worker2 = new Worker("Петя", 8119, 20000, "Уборщик");
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(worker1);
        workers.add(worker2);

        Flower flower1 = new Flower("Розы", 100, 70);
        Flower flower2 = new Flower("Тюльпаны", 80, 100);
        ArrayList<Flower> flowers = new ArrayList<>();
        flowers.add(flower1);
        flowers.add(flower2);

        Provider provider1 = new Provider(9876, flowers,78,30000);
        Provider provider2 = new Provider(9856, flowers,195,100000);
        ArrayList<Provider> providers = new ArrayList<>();
        providers.add(provider1);
        providers.add(provider2);

        Client client1 = new Client("Владимир", 8157, 500);
        Client client2 = new Client("Ольга", 8157, 5300);
        ArrayList<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);


        String xmlStringFlowerShop = xmlMapper.writeValueAsString(new FlowerShop("Цвеочки",
                "Улица Пушкина, дом Колотушкина", workers, providers, flowers, clients));
        String objectStringFlowerShop = objectMapper.writeValueAsString(new FlowerShop("Цвеочки",
                "Улица Пушкина, дом Колотушкина", workers, providers, flowers, clients));

        String xmlStringProvider = xmlMapper.writeValueAsString(new Provider(9876, flowers,
                78,30000));
        String objectStringProvider = objectMapper.writeValueAsString(new Provider(9876, flowers,
                78,30000));

        Date date = new Date(1212121212121L);

        String xmlStringPurchases = xmlMapper.writeValueAsString(new Purchases("Розы",
                "Владимир", 7, date));
        String objectStringPurchases = objectMapper.writeValueAsString(new Purchases("Розы",
                "Владимир", 7, date));

        String xmlStringWorker = xmlMapper.writeValueAsString(new Worker("Вася",
                8134, 40000, "Администратор"));
        String objectStringWorker = objectMapper.writeValueAsString(new Worker("Вася",
                8134, 40000, "Администратор"));

        // write to the console
        System.out.println(xmlStringClient);
        System.out.println(xmlStringFlower);
        System.out.println(xmlStringFlowerShop);
        System.out.println(xmlStringProvider);
        System.out.println(xmlStringPurchases);
        System.out.println(xmlStringWorker);

        System.out.println(objectStringClient);
        System.out.println(objectStringFlower);
        System.out.println(objectStringFlowerShop);
        System.out.println(objectStringProvider);
        System.out.println(objectStringPurchases);
        System.out.println(objectStringWorker);

        // write XML string to file
        File xmlOutputClient = new File("serializedClient.xml");
        FileWriter fileWriterClient = new FileWriter(xmlOutputClient);
        fileWriterClient.write(xmlStringClient);
        fileWriterClient.close();

        File objectOutputClient = new File("serializedClient.json");
        FileWriter fileWriterClient1 = new FileWriter(objectOutputClient);
        fileWriterClient1.write(String.valueOf(objectOutputClient));
        fileWriterClient1.close();


        File xmlOutputFlower = new File("serializedFlower.xml");
        FileWriter fileWriterFlower = new FileWriter(xmlOutputFlower);
        fileWriterFlower.write(xmlStringFlower);
        fileWriterFlower.close();

        File objectOutputFlower = new File("serializedFlower.json");
        FileWriter fileWriterFlower1 = new FileWriter(objectOutputFlower);
        fileWriterFlower1.write(String.valueOf(objectOutputFlower));
        fileWriterFlower1.close();


        File xmlOutputFlowerShop = new File("serializedFlowerShop.xml");
        FileWriter fileWriteFlowerShop = new FileWriter(xmlOutputFlowerShop);
        fileWriteFlowerShop.write(xmlStringFlowerShop);
        fileWriteFlowerShop.close();

        File objectOutputFlowerShop = new File("serializedFlowerShop.json");
        FileWriter fileWriteFlowerShop1 = new FileWriter(objectOutputFlowerShop);
        fileWriteFlowerShop1.write(String.valueOf(objectOutputFlowerShop));
        fileWriteFlowerShop1.close();


        File xmlOutputProvider = new File("serializedProvider.xml");
        FileWriter fileWriterProvider = new FileWriter(xmlOutputProvider);
        fileWriterProvider.write(xmlStringProvider);
        fileWriterProvider.close();

        File objectOutputProvider = new File("serializedProvider.json");
        FileWriter fileWriterProvider1 = new FileWriter(objectOutputProvider);
        fileWriterProvider1.write(String.valueOf(objectOutputProvider));
        fileWriterProvider1.close();


        File xmlOutputPurchases = new File("serializedPurchases.xml");
        FileWriter fileWriterPurchases = new FileWriter(xmlOutputPurchases);
        fileWriterPurchases.write(xmlStringPurchases);
        fileWriterPurchases.close();

        File objectOutputPurchases = new File("serializedPurchases.json");
        FileWriter fileWriterPurchases1 = new FileWriter(objectOutputPurchases);
        fileWriterPurchases1.write(String.valueOf(objectOutputPurchases));
        fileWriterPurchases1.close();


        File xmlOutputWorker = new File("serializedWorker.xml");
        FileWriter fileWriterWorker = new FileWriter(xmlOutputWorker);
        fileWriterWorker.write(xmlStringWorker);
        fileWriterWorker.close();

        File objectOutputWorker = new File("serializedWorker.json");
        FileWriter fileWriterWorker1 = new FileWriter(objectOutputWorker);
        fileWriterWorker1.write(String.valueOf(objectOutputWorker));
        fileWriterWorker1.close();


        try {
            System.out.println("Конец");
        }catch (Exception e){
            System.out.println (e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Serializing to XML...");
        serializeToXML();
    }

}
