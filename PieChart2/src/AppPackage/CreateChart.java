package AppPackage;

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
    public CreateChart(String appTitle, String chartTitle, int modo){
        PieDataset dataset = createDataset(modo);
        JFreeChart chart = createChart(dataset, chartTitle);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 300));
        setContentPane(chartPanel);
    }
    
    private PieDataset createDataset(int modo){
        DefaultPieDataset result = new DefaultPieDataset();
        
        switch(modo) {
            case 1: result.setValue("0-18",0); // Edades
                    result.setValue("19-30",5);
                    result.setValue("31-45",6);
                    result.setValue("46-55",5);
                    result.setValue("56-65",1);
                    result.setValue("66-75",1);
                    result.setValue("76-85",0);
                    result.setValue("85+",0);
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
