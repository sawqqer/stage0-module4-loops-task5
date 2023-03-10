package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int size) {
        if (size % 2 == 0) {
            size++;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i == size - j - 1) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}