package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            System.out.print("8");
            for (int j = 1; j <= i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
