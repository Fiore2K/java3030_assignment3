package Main;

/**
 * Container class which can hold any type and return it
 * @param <type>
 */

public class Container<type> {
    private final type value;

    public Container(type value) {
        this.value = value;
    }

    public type getValue() {
        return value;
    }
}
