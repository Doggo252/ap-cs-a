public class NestedLoops { // NestedLoop class that goes nested loops to carry out operations
    public void drawFilledBox() { // Method to draw 5x5 grid
        for (int height = 1; height <= 5; height++) {
            for (int width = 1; width <= 5; width++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void drawFilledBox(int w, int h) { // Method to draw a grid based on the width and height passed in
        int height = 1;
        while (height <= h) {
            int width = 1;
            while (width <= w) {
                System.out.print("*");
                width += 1;
            }
            height += 1;
            System.out.println();
        }
    }

    public void drawMultiChart() { // Method to draw a 3 by 4 multiplication chart
        for (int outer = 1; outer <= 3; outer++) {
            for (int inner = 1; inner <= 4; inner++) {
                System.out.print(inner * outer + " ");
            }
            System.out.println();
        }
    }

    public void drawTriangle(int rows) { // method that draws a triangle with custom dimensions
        for (int outer = 1; outer <= rows; outer++) {
            for (int inner = 1; inner <= outer; inner++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}