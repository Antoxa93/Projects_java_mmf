public class dz4_4_19{

    public static void main(String[] args) {

        Nonlinear_eq eq = new Nonlinear_eq();
        eq.solve();


        eq.a = 0.1;
        eq.b = 0.9;

        eq.x_0 = 1;
        eq.x_1 = -3;
        eq.x_2 = 2;
        eq.x_3 = 0;
        eq.x_4 = 0;
        eq.x_5 = 0;
        eq.by_exp = 0;
        eq.by_sin = 0;
        eq.solve_eq();
    }
}
class Nonlinear_eq {

    double a;
    double b;
    double x_0 = 0, x_1 = 0, x_2 = 0, x_3 = 0, x_4 = 0, x_5 = 0;
    double by_exp = 0;
    double by_sin = 0;

    double eps = 0.01;


    double func(double arg) {
        double res = 0;
        res = x_0 + x_1 * arg + x_2 * Math.pow(arg, 2) + x_3 * Math.pow(arg, 3) + x_4 * Math.pow(arg, 4) + x_5 * Math.pow(arg, 5) + by_exp * Math.exp(arg) + by_sin * Math.sin(arg);
        return res;
    }

    void solve() {
        double res = 0;
        res = func(5);
        System.out.println(res);
    }

    double copysign(double a) {
        double res = 1.0;
        if (a > 0.0){
            res = 1.0;
        } else if (a < 0.0){
            res = -1.0;
        } else {
            res = 0.0;
        }
        return res;
    }

    void solve_eq() {
        double xl = 0, xr = 2, xm = 0, xd = 0, signfxl, signfxm;
        int n = 0;
        xd = xr - xl;
        while (Math.abs(func(xl)) > eps || Math.abs(func(xr)) > eps) {
            n = n + 1;
            xd = xd / 2;
            xm = xl + xd;
            signfxl = copysign(func(xl));
            signfxm = copysign(func(xm));

            if (signfxl != signfxm)
                xr = xm;
            else
                xl = xm;
        }
        System.out.printf ("Value of function: %.10f\n", func(xm));
        System.out.printf ("Left bound equal: %.10f\n", xl );
        System.out.printf ("RESULT : %.10f\n", (xl + xr) / 2);
        System.out.printf ("Right bound equal: %.10f\n", xr );
        System.out.printf ("Numbers of iterations equal: %d\n", n );
    }
}

