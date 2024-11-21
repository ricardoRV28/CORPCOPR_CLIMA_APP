package corpcorp_weatherapp;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory; 
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation; 
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author ricardo
 */
public class Graficas extends javax.swing.JFrame {
    
    private JFreeChart chartTemperatura;
    private JFreeChart chartViento;
    /**
     * Creates new form Graficas
     */
    public Graficas(DatosGrafica datosGrafica) {
        initComponents(datosGrafica);
    }
    
    public Graficas() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 617, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void initComponents(DatosGrafica datosGrafica) { 
        CategoryDataset datasetTemp = crearDatasetTemperatura(datosGrafica); 
        chartTemperatura = ChartFactory.createLineChart( 
                "Temperatura a lo largo del dia", 
                "Hora", 
                "Temperatura (°C)", 
                datasetTemp, PlotOrientation.VERTICAL, 
                true, true, false); 
        
        CategoryDataset datasetViento = crearDatasetViento(datosGrafica); 
        chartViento = ChartFactory.createLineChart( 
                "Velocidad del Viento a lo largo del dia", 
                "Hora", 
                "Velocidad del Viento (m/s)", 
                datasetViento, PlotOrientation.VERTICAL, 
                true, true, false); 
        
        if (chartTemperatura == null) { 
            System.err.println("Error: La gráfica no se pudo crear.");
            return; 
        }
        
        JPanel panel = new JPanel(new GridLayout(2, 1)); 
        panel.add(new ChartPanel(chartTemperatura)); 
        panel.add(new ChartPanel(chartViento));

        this.add(panel, BorderLayout.CENTER); 
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        this.setSize(800, 600); 
    }
    
    private CategoryDataset crearDatasetTemperatura(DatosGrafica datosGrafica) { 
        DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 
        String serie1 = "Temperatura"; 
        
        for (DatosGrafica.DatosTemp temp : datosGrafica.temperaturas) { 
            dataset.addValue(temp.value, serie1, temp.date); 
        } 
        
        return dataset; 
    }
    
    private CategoryDataset crearDatasetViento(DatosGrafica datosGrafica) { 
        DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 
        String serie1 = "Velocidad del Viento"; 
        
        for (DatosGrafica.DatosTemp temp : datosGrafica.viento) { 
            dataset.addValue(temp.value, serie1, temp.date); 
        } 
        
        return dataset; 
    }
    
    public JFreeChart getChartTemp() { 
        return chartTemperatura; 
    }
    
     public JFreeChart getChartViento() { 
        return chartViento; 
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Graficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graficas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
