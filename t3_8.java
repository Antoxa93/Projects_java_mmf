import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Point {
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public final double x;
    public final double y;

}

class Quadrangle {
    public Point a, b, c, d;
    static final double eps = 1.0E-6;
    public double diagonal1, diagonal2;

    public double angle(Point a_, Point b_, Point c_){
        double firstLength = findLength(a_, b_);
        double secondLength= findLength(b_, c_);
        double diagonal = findLength( a_, c_);
        double d = -((Math.pow((diagonal), 2) - Math.pow((secondLength), 2) - Math.pow((firstLength), 2)) /
                (2 * firstLength * secondLength));
        double radianAngle = Math.acos(d);
        return Math.toDegrees(radianAngle);

    }
    public boolean feq(double x, double y){
        return (Math.abs(x-y) < eps);
    }

    public boolean IsParallel(Point a_, Point b_, Point c_, Point d_) {
        if (feq(a_.x - b_.x ,0) && feq(c_.x - d_.x , 0)) {
            return true;
        }
        else return feq((a_.y - b_.y) / (a_.x - b_.x), (d_.y - c_.y) / (d_.x - c_.x));
    }
    public Quadrangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        diagonal1 = findLength(a, c);
        diagonal2 = findLength(b, d);

    }

    public double findLength(Point a1, Point a2){
        return Math.sqrt(Math.pow(a2.x - a1.x, 2) + Math.pow(a2.y - a1.y, 2));
    }

    public double findSquare() {
        return 0.25 * Math.sqrt( 4 * Math.pow(findLength(a,c), 2) * Math.pow(findLength(b,d), 2) -
                Math.pow(Math.pow(findLength(a, b), 2) + Math.pow(findLength(c,d), 2) - Math.pow(findLength(b, c), 2) -
                        Math.pow(findLength(d, a), 2),2));
    }

    public double findPerimeter() {
        return findLength(a, b) + findLength(b, c) + findLength(c, d) + findLength(d, a);
    }
}

 class Rectangle extends Quadrangle {
    public Rectangle(Point a, Point b, Point c, Point d) {
        super(a, b, c, d);
    }

    @Override
    public double findSquare() {
        return findLength(a, b) *
                findLength(c, b);
    }

    @Override
    public double findPerimeter() {
        return 2 * findLength(a, b) +
                2 * findLength(c, b);
    }
}


class Rhombus extends Quadrangle {

    public Rhombus(Point a, Point b, Point c, Point d) {
        super(a, b, c, d);

    }

    @Override
    public double findSquare() {
        return (double) (findLength(a,c) * findLength(b,d) ) / 2;
    }

    @Override
    public double findPerimeter() {
        return 4 * findLength(a, b);
    }
}


class Square extends Quadrangle {
    public Square(Point a, Point b, Point c, Point d) {
        super(a, b, c, d);
    }

    @Override
    public double findSquare() {
        return findLength(a, b);
    }

    @Override
    public double findPerimeter() {
        return 4 * findLength(a, b);
    }
}


public class t3_8 {
    public static boolean checkRectangle(Quadrangle quadrangle){
        double angleA = quadrangle.angle(quadrangle.a, quadrangle.b, quadrangle.c);
        double angleB = quadrangle.angle(quadrangle.b,quadrangle.c,quadrangle.d);
        double angleC = quadrangle.angle(quadrangle.b, quadrangle.a, quadrangle.d);
        double angleD = quadrangle.angle(quadrangle.a, quadrangle.d, quadrangle.c);
        return quadrangle.feq(angleA, 90) && quadrangle.feq(angleB, 90) && quadrangle.feq(angleC, 90)
                && quadrangle.feq(angleD, 90);
    }

    public static boolean checkSquare(Quadrangle quadrangle){
        double firstLength = quadrangle.findLength(quadrangle.a, quadrangle.b);
        double secondLength = quadrangle.findLength(quadrangle.b, quadrangle.c);
        double thirdLength = quadrangle.findLength(quadrangle.c, quadrangle.d);
        double fourthLength = quadrangle.findLength(quadrangle.a, quadrangle.d);
        return checkRectangle(quadrangle) && quadrangle.feq(firstLength, secondLength)
                && quadrangle.feq(firstLength, thirdLength) && quadrangle.feq(firstLength, fourthLength);
    }



        static boolean checkRhombus(Quadrangle quadrangle){
            double firstLength = quadrangle.findLength(quadrangle.a, quadrangle.b);
            double secondLength = quadrangle.findLength(quadrangle.b, quadrangle.c);
            double thirdLength = quadrangle.findLength(quadrangle.c, quadrangle.d);
            double fourthLength = quadrangle.findLength(quadrangle.a, quadrangle.d);
            return quadrangle.feq(firstLength, secondLength) && quadrangle.feq(firstLength, thirdLength)
                    && quadrangle.feq(firstLength, fourthLength)
                    && quadrangle.IsParallel(quadrangle.a, quadrangle.d, quadrangle.b, quadrangle.c)
                    && quadrangle.IsParallel(quadrangle.a, quadrangle.b, quadrangle.c, quadrangle.d);
        }

        public static List<Quadrangle> generateArr(){
            return new ArrayList<>() {
                {
                    add(new Quadrangle(new Point(1, 2), new Point(4, 5), new Point(6, 7),
                            new Point(4, 7)));
                    add(new Quadrangle(new Point(-8, 1), new Point(-5, 1), new Point(-4, 4),
                            new Point(-7, 4)));
                    add(new Quadrangle(new Point(-4, 0), new Point(0, -5), new Point(4, 0),
                            new Point(0, 5)));
                }
            };
        }

        public static void main(String[] args) {
            List<Quadrangle> quadrangles = generateArr();
            List<Square> squareList = new ArrayList<>();
            List<Rectangle> rectangles = new ArrayList<>();
            List<Rhombus> rhombuses = new ArrayList<>();
            List<Quadrangle> anyQuadrangles = new ArrayList<>();
            for (Quadrangle quadrangle : quadrangles) {
                if (checkSquare(quadrangle)) {
                    squareList.add(new Square(quadrangle.a, quadrangle.b, quadrangle.c, quadrangle.d));
                } else if (checkRectangle(quadrangle)) {
                    rectangles.add(new Rectangle(quadrangle.a, quadrangle.b, quadrangle.c, quadrangle.d));
                } else if (checkRhombus(quadrangle)) {
                    rhombuses.add(new Rhombus(quadrangle.a, quadrangle.b, quadrangle.c, quadrangle.d));
                } else {
                    anyQuadrangles.add(quadrangle);
                }
            }
        }
}
