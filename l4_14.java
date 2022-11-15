import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class l4_14 {
    static final double eps = 1.0E-3;
    public static class Vector{

        private int n;
        private double[] vector1;
        private double[] vector2;

        public double[] vector_add;

        private double[] vector_minus;


        public Vector ( int n) {
            this.n = n;
        }

        public void SetVectors(double[] a , double[] b){
            this.vector1 = a;
            this.vector2 = b;
        }

        public void print_vector1 (){
            for (int i = 0; i < n; i++){
                System.out.printf("%.2f\t", vector1[i]);
            }
            System.out.printf("\n");
        }

        public void print_vector2 (){
            for (int i = 0; i < n; i++){
                System.out.printf("%.2f\t", vector2[i]);
            }
            System.out.printf("\n");
        }


        public double norma1 (){
            double res = 0;
            for (int i = 0; i < n; i++){
                res += vector1[i] * vector1[i];
            }
            return Math.sqrt(res);
        }

        public double norma2 (){
            double res = 0;
            for (int i = 0; i < n; i++){
                res += vector2[i] * vector2[i];
            }
            return Math.sqrt(res);
        }

        public double scal_prod (){
            double res = 0;
            for (int i = 0; i < n; i++){
                res += vector1[i] * vector2[i];
            }
            return res;
        }

        public double[] add (){
            double[] res = new double[n];
            for (int i = 0; i < n; i++){
                res[i] += vector1[i] + vector2[i];
            }
            return res;
        }

        public double[] minus (){
            double[] res = new double[n];
            for (int i = 0; i < n; i++){
                res[i] += vector1[i] - vector2[i];
            }
            return res;
        }

        public boolean is_ort (){
            boolean res = false;
            if (Math.abs (scal_prod()) < eps){
                res = true;
            }
            return res;
        }

        public boolean is_colin (){
            boolean res = false;
            int count = 0;
            double[] otnosheniya = new double[n];
            for (int i = 0; i < n; i++){
                otnosheniya[i] = vector1[i] / vector2[i];
            }
            for (int i = 1; i < n; i++){
                if (Math.abs(otnosheniya[0] - otnosheniya[i]) > eps){
                    count++;
                }
            }
            if (count == 0){
                res = true;
            }
            return res;
        }

        }

    public static void print (double[] vector){
        for (int i = 0; i < vector.length; i++){
            System.out.printf("%.2f\t", vector[i]);
        }
        System.out.printf("\n");
    }


    public static void main(String[] args){
        double[] a = new double[] {1, -2, -7};
        double[] b = new double[] {-7, 14, 49};
        Vector v = new Vector (3);
        v.SetVectors(a, b);
        System.out.printf("Vectors: \n");
        v.print_vector1();
        v.print_vector2();
        System.out.printf("Norma vector 1 : %.2f \n", v.norma1());
        System.out.printf("Norma vector 2 : %.2f \n", v.norma2());
        System.out.printf("Scalar Product : %.2f \n", v.scal_prod());
        System.out.printf("Adding : ");
        print(v.add());
        System.out.printf("Minnus : ");
        print(v.minus());
        System.out.printf("Is ortogonal : %b \n", v.is_ort());
        System.out.printf("Is colinear : %b \n", v.is_colin());
    }

}
