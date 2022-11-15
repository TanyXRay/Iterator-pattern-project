package random;

import java.util.Iterator;
import java.util.Random;

/**
 * Класс, расширяющий Iterable<Integer>, по которому мы будем итерироваться
 */
public class Randoms implements Iterable<Integer> {
    private Random random;
    private int min;
    private int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        this.random = new Random();
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    /**
     * Метод, с помощью которого будет происходить итерация
     *
     * @return объект-итератор
     */
    @Override
    public Iterator<Integer> iterator() {
        return new RandomIterator();
    }

    /**
     * Класс-итератор, расширяющий Iterator<Integer> для работы класса Randoms
     */
    private class RandomIterator implements Iterator<Integer> {
        private final int range = max - min + 1;

        @Override
        public boolean hasNext() {
            return random.nextInt(range) + min <= max;
        }

        @Override
        public Integer next() {
            return random.nextInt(range) + min;
        }
    }
}

