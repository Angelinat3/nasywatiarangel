import java.util.Scanner;

public class TriangleClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input angles
        System.out.print("Enter the first angle: ");
        int angle1 = scanner.nextInt();
        System.out.print("Enter the second angle: ");
        int angle2 = scanner.nextInt();
        System.out.print("Enter the third angle: ");
        int angle3 = scanner.nextInt();

        // Classify the triangle
        String result = classifyTriangle(angle1, angle2, angle3);
        System.out.println(result);
    }

    public static String classifyTriangle(int angle1, int angle2, int angle3) {
        // Check if the angles form a valid triangle
        if (angle1 + angle2 + angle3 != 180 || angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
            return "The angles do not form a valid triangle.";
        }

        // Equiangular check
        if (angle1 == angle2 && angle2 == angle3) {
            return "The triangle is equiangular.";
        }

        // Right-angled check
        if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
            return "The triangle is right-angled.";
        }

        // Obtuse-angled check
        if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
            return "The triangle is obtuse-angled.";
        }

        // If none of the above, the triangle is acute-angled
        return "The triangle is acute-angled.";
    }
}
