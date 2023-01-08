package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int middle = height / 2;
        for (int i = 0; i < height; i++) {

            if (i < middle) {
                for (int j = 0; j < height; j++) {
                    if (j < i || j >= height - i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("8");
                    }
                }
                System.out.println();
                continue;
            }
            int skip = height - i;
            for (int j = 0; j < height; j++) {
                if (j < skip - 1 || j > height - skip) {
                    System.out.print(" ");
                    continue;
                }
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
