package Pruebas;
import java.io.*;

/**
 *
 * @author JoeL Ludeña
 */
public class Productos implements Serializable
{
    protected final static double PRECIO_DEF=600;
    String cod_producto;
    String nombreProd;
    double PR_venta;
    
    public Productos()
    {
        this ("", "", PRECIO_DEF);
    }
    
    public Productos(String cod, String nombre, double precio)
    {
        this.cod_producto=nombre;
        this.nombreProd=nombre;
        this.PR_venta=precio;
    }

    public String getCod_producto() 
    {
        return cod_producto;
    }

    public void setCod_producto(String cod_producto) 
    {
        this.cod_producto = cod_producto;
    }

    public String getNombreProd() 
    {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) 
    {
        this.nombreProd = nombreProd;
    }

    public double getPR_venta() 
    {
        return PR_venta;
    }

    public void setPR_venta(double PR_venta) 
    {
        this.PR_venta = PR_venta;
    }
}
