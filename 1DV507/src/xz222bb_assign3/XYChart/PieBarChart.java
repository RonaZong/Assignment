package xz222bb_assign3.XYChart;

import org.knowm.xchart.*;
import org.knowm.xchart.style.Styler;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PieBarChart {
    public static void main(String[] args) throws IOException {
        File file = new File("1DV507/src/xz222bb_assign3/XYChart/integers.dat");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String string;
        int n;
        int n10 = 0;
        int n20 = 0;
        int n30 = 0;
        int n40 = 0;
        int n50 = 0;
        int n60 = 0;
        int n70 = 0;
        int n80 = 0;
        int n90 = 0;
        int n100 = 0;

        while ((string = br.readLine()) != null){
            n = Integer.parseInt(string);
            if (n < 10){
                n10++;
            }
            else if (n < 20){
                n20++;
            }
            else if (n < 30){
                n30++;
            }
            else if (n < 40){
                n40++;
            }
            else if (n < 50){
                n50++;
            }
            else if (n < 60){
                n60++;
            }
            else if (n < 70){
                n70++;
            }
            else if (n < 80){
                n80++;
            }
            else if (n < 90){
                n90++;
            }
            else if (n < 100){
                n100 ++;
            }
        }


        CategoryChart categoryChart = new CategoryChartBuilder().width(800).height(600).title("Integer Bar Chart").xAxisTitle("Intervals").yAxisTitle("Count").build();
        categoryChart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);
        categoryChart.getStyler().setHasAnnotations(true);

        categoryChart.addSeries("Integer Intervals",
                new ArrayList<String>(Arrays.asList("<10", "<20", "<30", "<40", "<50", "<60", "<70", "<80", "<90", "<100")),
                new ArrayList<Integer>(Arrays.asList(n10, n20, n30, n40, n50, n60, n70, n80, n90, n100)));
        new SwingWrapper<>(categoryChart).displayChart();



        PieChart pieChart = new PieChartBuilder().width(600).height(400).title("Integer Pie Chart").build();
        Color[] sliceColors = new Color[] { new Color(0, 102, 204), new Color(255, 153, 91), new Color(178, 102, 255),
                new Color(0, 255, 0), new Color(255, 51, 51),new Color(255, 255, 102),
                new Color(255, 0, 255), new Color(255, 153, 204), new Color(224, 224, 224),
                new Color(51, 255, 255)};
        pieChart.getStyler().setSeriesColors(sliceColors);

        // Series
        pieChart.addSeries("<10", n10);
        pieChart.addSeries("<20", n20);
        pieChart.addSeries("<30", n30);
        pieChart.addSeries("<40", n40);
        pieChart.addSeries("<50", n50);
        pieChart.addSeries("<60", n60);
        pieChart.addSeries("<70", n70);
        pieChart.addSeries("<80", n80);
        pieChart.addSeries("<90", n90);
        pieChart.addSeries("<100", n100);

        pieChart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);

        new SwingWrapper<>(pieChart).displayChart();

    }
}
