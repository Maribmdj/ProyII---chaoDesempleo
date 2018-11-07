package Utilidades;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;


/**
 *
 * @author Ignacio
 */
public class CreateChart extends JFrame{
    
    public CreateChart(String appTitle, String chartTitle, Object[] lista, int modo){
        PieDataset dataset = createDataset(lista, modo);
        JFreeChart chart = createChart(dataset, chartTitle);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 300));
        setContentPane(chartPanel);
    }
    
    private PieDataset createDataset(Object[] lista, int modo){
        DefaultPieDataset result = new DefaultPieDataset();
        
        switch(modo) {
            case 1: result.setValue("0-18", (Number) lista[1]); // Edades
                    result.setValue("19-30", (Number) lista[2]);
                    result.setValue("31-45", (Number) lista[3]);
                    result.setValue("46-55", (Number) lista[4]);
                    result.setValue("56-65", (Number) lista[5]);
                    result.setValue("66-75", (Number) lista[6]);
                    result.setValue("76-85", (Number) lista[7]);
                    result.setValue("85+", (Number) lista[8]);
            break;
            
            case 2: result.setValue("Niños",5);
                    result.setValue("Jóvenes",5);
                    result.setValue("Adultos Mayores",5);
                    result.setValue("Público General",5);
                    result.setValue("Jóvenes",5);
            break;
            
            default: break;
        }
        return result;
    }
    
    private JFreeChart createChart(PieDataset dataset, String title){
        JFreeChart chart = ChartFactory.createPieChart3D(title, dataset, true, true, true);
        
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(0);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        return chart;
    }
}
