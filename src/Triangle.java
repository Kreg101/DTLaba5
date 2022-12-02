public class Triangle {
    final private int a;
    final private int b;
    final private int c;

    public Triangle() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isTriangle() {
        return (a < b + c) && (b < a + c) && (c < a + b);
    }
    public double halfPerimeter() {
        double scale = Math.pow(10, 2);
        return Math.ceil(((double)(a + b + c)/2)*scale)/scale;
    }

    public double square() {
        if (isTriangle()) {
            double p = halfPerimeter();
            double scale = Math.pow(10, 2);
            return Math.ceil(Math.sqrt(p*(p-a)*(p-b)*(p-c))*scale)/scale;
        }
        return 0.0;
    }

}
