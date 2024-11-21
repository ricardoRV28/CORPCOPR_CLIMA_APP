package corpcorp_weatherapp;

/**
 *
 * @author ricardo
 */
public class UbicacionDatos {
    private final String nombre;
    private final String ubicacion;
    private final String ciudad;
    private final String pais;
    private final int idCiudad;
    
    public UbicacionDatos(String nombre, String ubicacion, String ciudad, String pais,int idCiudad) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.ciudad = ciudad;
        this.pais = pais;
        this.idCiudad = idCiudad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }
    
    public int getidCiudad() {
        return idCiudad;
    }
}