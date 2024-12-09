// CreateAnimalService.java
public interface CreateAnimalService {
    default void createUniqueAnimals() {
        System.out.println("Creating 10 unique animals...");
        int count = 0;
        while (count < 10) {
            createAnimal(count);
            count++;
        }
    }

    void createAnimal(int index);
}
