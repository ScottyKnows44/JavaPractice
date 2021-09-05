public class DecoratedPatternDemo {
    public static void main(String[] args) {
        Shape shape = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        shape.draw();

        redCircle.draw();
        redRectangle.draw();
    }
}
