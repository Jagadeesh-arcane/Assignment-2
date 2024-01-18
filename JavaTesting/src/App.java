// Area Calculator Program

public class App {

    public int calculateCircleArea(int radius) {
        if(radius < 0) {
            System.out.println("Radius cannot be negative");
            return 0;
        }
        return (22/7) * radius * radius;
    }

    public int calculateRectangleArea(int length, int width) {
        if(length < 0 || width < 0) {
            throw new Error("Length or Width cannot be negative!");
        }
        return length * width;
    }

    public int calculateTriangleArea(int base, int height) {
        if(base < 0 || height < 0) {
            throw new Error("Base or height cannot be negative!");
        }
        return (base * height) / 2;
    }
}
