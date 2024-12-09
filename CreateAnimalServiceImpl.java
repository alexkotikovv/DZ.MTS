// CreateAnimalServiceImpl.java
import java.util.Random;

public class CreateAnimalServiceImpl implements CreateAnimalService {

    private Random random = new Random();

    @Override
    public void createAnimal(int index) {
        String[] names = {"Bella", "Charlie", "Max", "Luna", "Oliver", "Milo", "Sophie", "Chloe", "Rocky", "Zoe"};
        String[] characters = {"Playful", "Calm", "Aggressive", "Friendly", "Shy"};

        String name = names[index % names.length];
        Double cost = 100 + (random.nextDouble() * 200); // случайная цена от 100 до 300
        String character = characters[random.nextInt(characters.length)];

        AbstractAnimal animal;
        if (random.nextBoolean()) { // случайно выбираем между кошкой и собакой
            animal = new Cat(name, cost, character);
        } else {
            animal = new Dog(name, cost, character);
        }

        System.out.println("Created animal: " + animal.getName() + ", Breed: " + animal.getBreed() +
                ", Cost: " + animal.getCost() + ", Character: " + animal.getCharacter());
    }

    public void createAnimalsWithForLoop(int n) {
        System.out.println("Creating " + n + " animals using for loop...");
        for (int i = 0; i < n; i++) {
            createAnimal(i);
        }
    }

    public void createAnimalsWithDoWhileLoop(int n) {
        System.out.println("Creating " + n + " animals using do-while loop...");
        int count = 0;
        do {
            createAnimal(count);
            count++;
        } while (count < n);
    }
}
