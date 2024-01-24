/**
 * Class representing a rectangle, which is a specific type of shape.
 */
public class CRectangle extends CShape {
    protected int length;
    protected int width;

    /**
     * Constructor for initializing a rectangle with given length and width.
     *
     * @param length The length of the rectangle.
     * @param width  The width of the rectangle.
     */
    public CRectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getShapeInfo() {
        return "RECTANGLE " + length + "x" + width;
    }
}
