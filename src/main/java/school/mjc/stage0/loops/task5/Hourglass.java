package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height < 3 || height % 2 == 0) {
            System.out.println("Invalid input. Height must be an odd integer greater than or equal to 3.");
            return;
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == height - 1 || i == j || i + j == height - 1) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
