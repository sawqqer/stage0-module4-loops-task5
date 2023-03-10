package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height < 3 || height % 2 == 0) {
            System.out.println("");
            return;
        }

        // Top half
        for (int i = 0; i < height / 2; i++) {
            geth(height, i);
        }

        // Middle line
        for (int i = 0; i < height / 2; i++) {
            System.out.print(" ");
        }
        System.out.println("8");

        // Bottom half
        for (int i = height / 2 - 1; i >= 0; i--) {
            geth(height, i);
        }
    }

    private void geth(int height, int i) {
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k < height - 2 * i; k++) {
            System.out.print("8");
        }
        System.out.println();
    }
}
