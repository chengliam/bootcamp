public class Ball {
    private static private Color color;

    public Ball(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }



    public static enum Color {
        BLUE, RED, YELLOW,;
    }

    public static void main(String[] args) {
        Ball b1 = new Ball(Ball.Color.BLUE);
        System.out.println(b1.getColor());
        Ball b2 = new Ball(Ball.Color.YELLOW);
        System.err.println(b2.getColor());
    }

}
