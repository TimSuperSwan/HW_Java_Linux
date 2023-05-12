import java.util.Scanner;

public class Program {

    public static void main(final String[] args) {
        
        ToyStore toyStore = new ToyStore();

        Toy toy1 = new Toy(1, "Лего", 5, 0.5);
        Toy toy2 = new Toy(2, "Кукла", 3, 0.3);
        Toy toy3 = new Toy(3, "Машинка", 2, 0.2);

        toyStore.addToy(toy1);
        toyStore.addToy(toy2);
        toyStore.addToy(toy3);

        Toy winner = toyStore.getToyWinner();
        System.out.println("Победитель: " + winner.getName());
        System.out.println("Осталось игрушек: " + winner.getQuantity());
    }
}