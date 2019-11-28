import java.io.*;
import java.util.*;

public class FunctionGraph {
    public void man() {
        Scanner scanner=null;
        try {
            scanner = new Scanner(new File("output1.txt"));
        }
        catch (Exception e){};
        float [] tall = new float[1010];
        int k = 0;
        while(scanner.hasNextFloat()) {
            tall[k++] = scanner.nextFloat();
        }
        //System.out.println(tall[3]);
        // number of line segments to plot
        //int n = tall.length;//Integer.parseInt("1");

        /*for(int i=0;i<k;i++)
        {
            System.out.println(tall[i]);
        }
        */
        // the function y = sin(4x) + sin(20x), sampled at n+1 points
        // between x = 0 and x = pi
        double[] x = new double[k+1];
        float[] y = new float[k+1];
        x[0]=0;
        for (int i = 1; i <= k; i++) {
            x[i] = x[i-1] + 0.001;
            //y[i] = tall[i];
        }
        for(int i=0;i<=k;i++) {
            y[i] = tall[i];
        }

        // rescale the coordinate system
        StdDraw.setXscale(0,0.5);
        StdDraw.setYscale(-10, +10.0);

        // plot the approximation to the function
        for (int i = 0; i < k; i++) {
            StdDraw.line(x[i], y[i], x[i+1], y[i+1]);
        }
    }
}
