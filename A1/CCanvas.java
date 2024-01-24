import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Class representing a canvas containing a list of shapes.
 */
public class CCanvas {
    private List<CShape> shapes;

    /**
     * Constructor for initializing a canvas with 10 random non-duplicate shapes.
     */
    public CCanvas() {
        this.shapes = generateRandomShapes();
    }

    /**
     * Private method to generate 10 random non-duplicate shapes.
     *
     * @return List of random shapes.
     */
    private List<CShape> generateRandomShapes() {
        List<CShape> randomShapes = new ArrayList<>();
        Random random = new Random();

        while (randomShapes.size() < 10) {
            CShape shape = getRandomShape(random);
            if (!randomShapes.contains(shape)) {
                randomShapes.add(shape);
            }
        }

        return randomShapes;
    }

    /**
     * Private method to get a random shape.
     *
     * @param random Random object for generating random values.
     * @return Randomly generated shape.
     */
    private CShape getRandomShape(Random random) {
        int shapeType = random.nextInt(4); // 0: Rectangle, 1: Square, 2: Circle, 3: Oval

        switch (shapeType) {
            case 0:
                return new CRectangle(random.nextInt(100) + 1, random.nextInt(100) + 1);
            case 1:
                return new CSquare(random.nextInt(100) + 1);
            case 2:
                return new CCircle(random.nextInt(100) + 1);
            case 3:
                return new COval(random.nextInt(100) + 1, random.nextInt(100) + 1);
            default:
                throw new IllegalStateException("Unexpected value: " + shapeType);
        }
    }

    /**
     * Method to display the shapes on the canvas.
     */
    public void displayShapes() {
        System.out.println("Canvas has the following random shapes:\n");

        for (CShape shape : shapes) {
            System.out.println("Shape " + shape.id + ": " + shape.getShapeInfo());
        }
    }
}
