package homework;

import java.util.Map;

public class ImmutableCustomerKeyEntry<V> implements Map.Entry<Customer, V> {
    private final Customer key;
    private V value;

    public ImmutableCustomerKeyEntry(Customer key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public Customer getKey() {
        try {
            return key.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V value) {
        return this.value = value;
    }
}
