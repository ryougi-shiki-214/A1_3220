/**
 * Abstract class representing a generic shape.
 */
public abstract class CShape {
    private static int counter = 0;
    protected int id;

    /**
     * Constructor for initializing a shape with a unique ID.
     */
    public CShape() {
        this.id = ++counter;
    }

    /**
     * Abstract method to get the type and dimensions of the shape.
     *
     * @return String representation of the shape.
     */
    public abstract String getShapeInfo();
}
