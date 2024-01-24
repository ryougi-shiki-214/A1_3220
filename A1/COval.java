/**
 * Class representing an oval, which is a specific type of shape.
 */
public class COval extends CShape {
    protected int horizontalRadius;
    protected int verticalRadius;

    /**
     * Constructor for initializing an oval with given horizontal and vertical radii.
     *
     * @param horizontalRadius The horizontal radius of the oval.
     * @param verticalRadius   The vertical radius of the oval.
     */
    public COval(int horizontalRadius, int verticalRadius) {
        this.horizontalRadius = horizontalRadius;
        this.verticalRadius = verticalRadius;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getShapeInfo() {
        return "OVAL " + horizontalRadius + "x" + verticalRadius;
    }
}
