package corpcorp_weatherapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ricardo
 */

//Almacenar datos de API
public class DatosGrafica {
    public List<DatosTemp> temperaturas = new ArrayList<>();
    public List<DatosTemp> viento = new ArrayList<>();
    
    public static class DatosTemp { 
        public String date; 
        public double value; 
        
        public DatosTemp(String date, double value) { 
            this.date = date; 
            this.value = value; 
        } 
    }
}
