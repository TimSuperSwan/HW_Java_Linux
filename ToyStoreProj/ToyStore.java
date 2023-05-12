import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyStore {
    public List<Toy> toys = new ArrayList<>();

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void removeToy(int toyNumber) {
        Toy toyToRemove = null;
        for (Toy toy : toys) {
            if (toy.getNumber() == toyNumber) {
                toyToRemove = toy;
                break;
            }
        }
        toys.remove(toyToRemove);
    }

    public Toy getToyWinner() {
        Random random = new Random();
        int index = random.nextInt(toys.size());
        Toy winner = toys.get(index);
        winner.setQuantity(winner.getQuantity() - 1);
        return winner;
    }
}