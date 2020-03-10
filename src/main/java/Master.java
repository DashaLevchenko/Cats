import Eceptions.MasterDiedException;
import Eceptions.MasterIsBankruptException;

public class Master {
    private static final int MAX_MOOD = 10;
    private static final int MIN_MONEY = 1;

    private int amountOfMoney;
    private int mood;

    Master(int amountOfMoney, int mood) throws IllegalArgumentException, MasterIsBankruptException {
        setAmountOfMoney(amountOfMoney);
        setMood(mood);
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
            throw new MasterIsBankruptException("Ooops, master is bankrupt, he can't feed cats");
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
      setAmountOfMoney(amountOfMoney--);
    }
}
