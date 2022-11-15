import random.Randoms;

public class Main {

    public static void main(String[] args) {
        printRandomNumber(new Randoms(35, 75), 37);
    }

    private static void printRandomNumber(Randoms randoms, int limitIndex) {
        if (limitIndex > randoms.getMax()
            || limitIndex < randoms.getMin()) {
            throw new RuntimeException("число " + limitIndex + " не входит в диапозон min и max чисел");
        }

        for (int i : randoms) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Случайное число: " + i);
            if (i == limitIndex) {
                System.out.printf("Выпало число %d, давайте на этом закончим", limitIndex);
                break;
            }
        }
    }
}

