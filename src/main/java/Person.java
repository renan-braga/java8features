public interface Person {

    String getName();

    default void greeting() {
        System.out.println("Hi my name is " + getName());
    }
}
