package homework;

import java.util.Map;
import java.util.TreeMap;

public class CustomerService {

    //todo: 3. надо реализовать методы этого класса
                                                                            //важно подобрать подходящую Map-у, посмотрите на редко используемые методы, они тут полезны
    TreeMap<Customer, String> map = new TreeMap<>(new ScoreComparator());

    public Map.Entry<Customer, String> getSmallest() {                      //Возможно, чтобы реализовать этот метод, потребуется посмотреть как Map.Entry сделан в jdk ; это "заглушка, чтобы скомилировать"
        Map.Entry<Customer, String> entry = map.firstEntry();
        if (entry == null) {
            return null;
        }
        Map.Entry<Customer, String> newEntry = new ImmutableCustomerKeyEntry<>(entry.getKey(),entry.getValue());
        return newEntry;
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        Map.Entry<Customer, String> entry = map.higherEntry(customer);
        if (entry == null) {
            return null;
        }
        Map.Entry<Customer, String> newEntry = new ImmutableCustomerKeyEntry<>(entry.getKey(),entry.getValue());
        return newEntry;
    }

    public void add(Customer customer, String data) {
        map.put(customer, data);
    }
}
