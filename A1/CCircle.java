/**
 * Class representing a circle, which is a specific type of oval.
 */
public class CCircle extends COval {
    /**
     * Constructor for initializing a circle with a given radius.
     *
     * @param radius The radius of the circle.
     */
    public CCircle(int radius) {
        super(radius, radius);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getShapeInfo() {
        return "CIRCLE " + horizontalRadius;
    }
}
