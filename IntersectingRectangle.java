public class IntersectingRectangle {
    public static void main(String[] args) {
        int     x1 = 0, y1 = 0,
                x2 = 10, y2 = 8;

        int     x3 = 2, y3 = 3,
                x4 = 7, y4 = 9;

        //funtion call
        findPoints(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    private static void findPoints(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        int x5 = Math.max(x1, x3);
        int y5 = Math.max(y1, y3);

        int x6 = Math.min(x2, x4);
        int y6 = Math.min(y2, y4);

        if (x5 > x6 || y5 > y6) {
            System.out.println("No intersection");
            return;
        }

        System.out.print("(" + x5 + ", " +
                y5 + ") ");

        System.out.print("(" + x6 + ", " +
                y6 + ") ");


        // gives top-left point
        // of intersection rectangle
        int x7 = x5;
        int y7 = y6;

        System.out.print("(" + x7 + ", " +
                y7 + ") ");

        // gives bottom-right point
        // of intersection rectangle
        int x8 = x6;
        int y8 = y5;

        System.out.print("(" + x8 + ", " +
                y8 + ") ");
    }

}
