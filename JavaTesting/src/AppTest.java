// Area Calculator Test Program

import org.junit.*;

public class AppTest {

    @Test
    public void circleTest1() {
        App calculator = new App();
        Assert.assertEquals(12,calculator.calculateCircleArea(2));
    }

    @Test
    public void circleTest2() {
        App calculator = new App();
        Assert.assertEquals(0,calculator.calculateCircleArea(-2));
    }

    @Test
    public void rectangleTest1() {
        App calculator = new App();
        Assert.assertEquals(32,calculator.calculateRectangleArea(4,8));
    }

    @Test
    public void rectangleTest2() {
        App calculator = new App();
        Assert.assertEquals(0,calculator.calculateRectangleArea(0,3));
    }

    @Test
    public void triangleTest1() {
        App calculator = new App();
        Assert.assertEquals(6,calculator.calculateTriangleArea(6,2));
    }

    @Test
    public void triangleTest2() {
        App calculator = new App();
        Assert.assertEquals(0,calculator.calculateTriangleArea(7,0));
    }

}
