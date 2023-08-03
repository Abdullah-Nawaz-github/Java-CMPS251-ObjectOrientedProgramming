
public class ShapeTest {
	public static void main(String[] args) {
		Shape shapes[] = new Shape[2];

		shapes[0] = new Square(71, 96, 10);
		shapes[1] = new Cube(79, 61, 8);

		for (int i = 0; i < 2; i++) {
			Shape currentShape = shapes[i];

			System.out.printf("%s: %s", currentShape.getName(), currentShape);

			if (currentShape instanceof ThreeDimensionalShape) {
				ThreeDimensionalShape threeDs = (ThreeDimensionalShape) currentShape;

				System.out.println("\nArea of the threeDimensionalShape = "+threeDs.getArea()); 

				System.out.println("Volume of the threeDimensionalShape = "+threeDs.getVolume());

			}

			System.out.println();
		}
	}
}