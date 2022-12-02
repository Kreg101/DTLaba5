import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class TriangleTest {

    private Triangle triangle1;
    private Triangle triangle2;
    private Triangle triangle3;
    private Triangle triangle4;

    @Before
    public void SetUp() {
        triangle1 = new Triangle(0, 1, 0);
        triangle2 = new Triangle(3, 4, 5);
        triangle3 = new Triangle(8, 3, 3);
        triangle4 = new Triangle(5, 5, 5);
    }

    @Test
    public void isTriangle() {

        Vector<Boolean> expected = new Vector<>();
        expected.add(false);
        expected.add(true);
        expected.add(false);
        expected.add(true);

        Vector<Boolean> actual = new Vector<>();
        actual.add(triangle1.isTriangle());
        actual.add(triangle2.isTriangle());
        actual.add(triangle3.isTriangle());
        actual.add(triangle4.isTriangle());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void halfPerimeter() {

        Vector<Double> expected = new Vector<>();
        expected.add(0.5);
        expected.add(6.0);
        expected.add(7.0);
        expected.add(7.5);

        Vector<Double> actual = new Vector<>();
        actual.add(triangle1.halfPerimeter());
        actual.add(triangle2.halfPerimeter());
        actual.add(triangle3.halfPerimeter());
        actual.add(triangle4.halfPerimeter());

        Assert.assertEquals(expected, actual);
    }

    @Test

    public void square() {

        Vector<Double> expected = new Vector<>();
        expected.add(0.0);
        expected.add(6.0);
        expected.add(0.0);
        expected.add(10.83);

        Vector<Double> actual = new Vector<>();
        actual.add(triangle1.square());
        actual.add(triangle2.square());
        actual.add(triangle3.square());
        actual.add(triangle4.square());

        Assert.assertEquals(expected, actual);
    }
}