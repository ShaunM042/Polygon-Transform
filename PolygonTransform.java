/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author:
 *
 *************************************************************************/

public class PolygonTransform {   

    public static double[] copy(double[] array) {     
        double[] newArray = new double[array.length];
        for(int i=0;i<array.length;i++)
        {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static void scale(double[] x, double[] y, double alpha){
        for(int i=0;i<x.length;i++) 
        {
            x[i] *= alpha;
            y[i] *= alpha;
        }
    }
    public static void translate(double[] x, double[] y, double dx, double dy) {
    
        for(int i=0;i<x.length;i++)
        {
            x[i] += dx;
            y[i] += dy;
        }
    }
    public static void rotate(double[]x, double[]y,double theta) {
    
        double rad = Math.toRadians(theta);
        for (int i=0;i<x.length;i++){ 
            double s= x[i]*Math.cos(rad) - y[i]*Math.sin(rad);
            double m= y[i]*Math.cos(rad) + x[i]*Math.sin(rad);  
            x[i] = s;
            y[i] = m;
        }
    }
    public static void main(String[] args) 
    {
        double[]x = new double[]{ 0, 1, 1, 0 };
        double[]y = new double[]{ 0, 0, 2, 1 };
        StdDraw.setScale(-5.0, +5.0);
        double alpha = 2.0;
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(x, y);
        scale(x, y, alpha);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);

         StdDraw.setScale(-5.0, +5.0);
        double[] i = new double[]{ 0, 1, 1, 0 };
        double[] j =new double[] { 0, 0, 2, 1 };
        double dx = 2.0, dy = 1.0;
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(i, j);
        translate(i, j, dx, dy);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(i, j); 
        
        StdDraw.setScale(-5.0, +5.0);
        double[] k =new double[] { 0, 1, 1, 0 };
        double[] l =new double[] { 0, 0, 2, 1 };
      double theta = 45.0;
      StdDraw.setPenColor(StdDraw.RED);
      StdDraw.polygon(k, l);
      rotate(k, l, theta);
      StdDraw.setPenColor(StdDraw.BLUE);
      StdDraw.polygon(k, l);
    }
}
    
