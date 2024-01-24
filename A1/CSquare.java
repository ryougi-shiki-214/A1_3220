/**
 * Class representing a square, which is a specific type of rectangle.
 */
public class CSquare extends CRectangle {
    /**
     * Constructor for initializing a square with a given side length.
     *
     * @param sideLength The side length of the square.
     */
    public CSquare(int sideLength) {
        super(sideLength, sideLength);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getShapeInfo() {
        return "SQUARE " + length + "x" + width;
    }
}
