import Exceptions.MasterDiedException;
import Exceptions.MasterIsBankruptException;

public class Master {
    private static final int MAX_MOOD = 10;
    private static final int MIN_MONEY = 1;

    private int amountOfMoney;
    private int health = 10;
    private int mood;
    private String name;

    Master(String name, int amountOfMoney, int mood) throws IllegalArgumentException, MasterIsBankruptException {
        this.name = name;
        setAmountOfMoney(amountOfMoney);
        setMood(mood);
    }

    @Override
    public String toString() {
        return name;
    }

    private void setMood(int mood) throws IllegalArgumentException {
        if (mood < 0) {
            throw new IllegalArgumentException("Mood can't be negative");
        } else {
            this.mood = mood;
        }
    }

    private void setAmountOfMoney(int amountOfMoney) throws MasterIsBankruptException {
        if (amountOfMoney < MIN_MONEY) {
            throw new MasterIsBankruptException("Ooops, master is bankrupt.");
        } else {
            this.amountOfMoney = amountOfMoney;
        }
    }

    public void increaseMood() throws MasterDiedException {
        if (mood > MAX_MOOD) {
            throw new MasterDiedException("Master died by happy");
        } else {
            mood++;
        }
    }

    public void decreaseAmountOfMoney() throws MasterIsBankruptException {
        amountOfMoney -= 10;
        setAmountOfMoney(amountOfMoney);
    }

    public void reduceHealth() throws MasterDiedException {
        if (health > 0) {
            health--;
        } else {
            throw new MasterDiedException(name+" died!");
        }
    }

}
