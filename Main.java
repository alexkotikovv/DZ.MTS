// Main.java
public class Main {
    public static void main(String[] args) {
        CreateAnimalServiceImpl animalService = new CreateAnimalServiceImpl();

        // Вызов методов создания животных
        animalService.createUniqueAnimals(); // Создание 10 уникальных животных

        System.out.println("\n--- Creating animals with for loop ---");
        animalService.createAnimalsWithForLoop(5); // Создание 5 животных с помощью цикла for

        System.out.println("\n--- Creating animals with do-while loop ---");
        animalService.createAnimalsWithDoWhileLoop(3); // Создание 3 животных с помощью цикла do-while
    }
}
