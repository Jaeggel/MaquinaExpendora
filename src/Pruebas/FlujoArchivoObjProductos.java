package Pruebas;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Joel Ludeña
 */
public class FlujoArchivoObjProductos 
{
    String cadenaAcum="";
    int cont=0;
    public void escrituraFileObj(String ruta,String archivo, Productos prod)
    {
        File f=new File (archivo);
        ObjectOutputStream ficheroN=null;
        MyObjectOutputStream ficheroA=null;
        try
        {
            if (f.exists())
            {
                ficheroA = new MyObjectOutputStream(new FileOutputStream(f,true));
                ficheroA.writeUnshared(prod); // se identifica al objeto como uno solo nuevo
            }
            else
            { 
                ficheroN=new ObjectOutputStream(new FileOutputStream(f,true));
                ficheroN.writeObject(prod);
            }
        } catch (FileNotFoundException ex) 
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        catch (IOException ex1) 
        {
            JOptionPane.showMessageDialog(null,ex1.getMessage());
        }finally 
        {
            try 
            {
                if (ficheroN != null) 
                {
                    ficheroN.close();
                }
                if (ficheroA != null) 
                {
                    ficheroA.close();
                }
            } catch (IOException e) 
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
    }
    public void lecturaFileObj(String ruta,String archivo, Productos prod)
    {
        File f=new File (ruta, archivo);
        ObjectInputStream fichero=null;
        try
        {
            fichero=new ObjectInputStream(new FileInputStream(f));
            cadenaAcum+="\nCODIGO\t\tNOMBRE\t\tPRECIO\n";
            cadenaAcum+="---------------------------------------\n";
            while (true)
            {
                prod=(Productos) fichero.readObject();
                cadenaAcum+=prod.cod_producto+"\t\t"+prod.nombreProd+"\t\t"+prod.PR_venta+"\n";
            }
        } catch (ClassNotFoundException e1)
        {
            JOptionPane.showMessageDialog(null,e1.getMessage());
        } catch (FileNotFoundException e2) 
        {
            JOptionPane.showMessageDialog(null,e2.getMessage());
        } catch (IOException e3) 
        {
            //JOptionPane.showMessageDialog(null,e3.getMessage());
        }finally 
        {
            try 
            {
                if (fichero != null) 
                {
                    fichero.close();
                }
            } catch (IOException e) 
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
    }
    public Productos BusquedaFileObj(String ruta,String archivo,String codProd, Productos prod)
    {
        File f=new File (ruta, archivo);
        ObjectInputStream fichero=null;
        Productos datosB=null;
        int pos=1;
        try
        {
            fichero=new ObjectInputStream(new FileInputStream(f));
            while (true)
            {
                prod=(Productos) fichero.readUnshared();
                if(codProd.equals(prod.getCod_producto()))
                {
                    datosB=prod;
                    cont=pos;
                }     
            pos++;  
            }
        } catch (ClassNotFoundException e1)
        {
            JOptionPane.showMessageDialog(null,e1.getMessage());
        } catch (FileNotFoundException e2) 
        {
            JOptionPane.showMessageDialog(null,e2.getMessage());
        } catch (IOException e3) 
        {
            //JOptionPane.showMessageDialog(null,e3.getMessage());
        }finally 
        {
            try 
            {
            if (fichero != null) 
            {
                fichero.close();
            }
            } catch (IOException e) 
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        return datosB;
    }
    public Productos BusquedaFileCombo(String ruta,String archivo,String nombreProd, Productos prod)
    {
        File f=new File (ruta, archivo);
        ObjectInputStream fichero=null;
        Productos datosB=null;
        int pos=1;
        try
        {
            fichero=new ObjectInputStream(new FileInputStream(f));
           
            while (true)
            {
                prod=(Productos) fichero.readUnshared();
                if(nombreProd.equals(prod.getNombreProd()))
                {
                    datosB=prod;
                    cont=pos;
                }
            pos++;  
            }
        } catch (ClassNotFoundException e1)
        {
            JOptionPane.showMessageDialog(null,e1.getMessage());
        } catch (FileNotFoundException e2) 
        {
            JOptionPane.showMessageDialog(null,e2.getMessage());
        } catch (IOException e3) 
        {
            //JOptionPane.showMessageDialog(null,e3.getMessage());
        }finally 
        {
            try 
            {
            if (fichero != null) 
            {
                fichero.close();
            }
            } catch (IOException e) 
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        return datosB;
    }
    
    public void modificarRegistro(String ruta,String nombreArch,Productos prod,Productos datos1,int indice)
    {
        int cont2=1;
        //---------------------------------------
        File ruta2=new File(ruta);
        File f=new File (ruta, nombreArch);
        File f2=new File(ruta2,"x"+nombreArch);//New
        ObjectInputStream fichero=null;
        //---------------------------------------
        //----------------------------------------ESCRITURA
        ObjectOutputStream ficheroN=null;
        MyObjectOutputStream ficheroA=null;
        
        //----------------------------------------
        try
        {
            fichero=new ObjectInputStream(new FileInputStream(f));//Apertura para el archivo completo
            ficheroA = new MyObjectOutputStream(new FileOutputStream(f2,true));
            ficheroN=new ObjectOutputStream(new FileOutputStream(f2,true));
            while (true)
            {
                datos1=(Productos) fichero.readUnshared();
                if(indice==cont2)
                {
                    if (f2.exists())
                    {
                        ficheroA.writeUnshared(prod); // se identifica al objeto como uno solo nuevo
                    }
                    else
                    { 
                        ficheroN.writeObject(prod);
                    }
                }
                else
                    {
                        if (f2.exists())
                        {
                            ficheroA.writeUnshared(datos1); // se identifica al objeto como uno solo nuevo
                        }
                        else
                        { 
                            ficheroN.writeObject(datos1);
                        }    
                    }
            cont2++;
            }
        } catch (ClassNotFoundException e1)
        {
            JOptionPane.showMessageDialog(null,e1.getMessage());
        } catch (FileNotFoundException e2) 
        {
            JOptionPane.showMessageDialog(null,e2.getMessage());
        } catch (IOException e3) 
        {
            //JOptionPane.showMessageDialog(null,e3.getMessage());
        }finally 
        {
            try 
            {
                if (ficheroN != null) 
                {
                    ficheroN.close();
                }
                if (ficheroA != null) 
                {
                    ficheroA.close();
                }
            } catch (IOException e) 
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
            try 
            {
                if (fichero != null) 
                {
                    fichero.close();
                }
            } catch (IOException e) 
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
            f.delete();
            f2.renameTo(f);
        }
    }
    public String pantalla()
    {
        return cadenaAcum;
    }
    public int contadorBusqueda()
    {
        return cont;
    }
    public ArrayList<Productos> productosCMB(String ruta,String archivo)
    {
        File f=new File (ruta, archivo);
        
        ObjectInputStream objeto2=null;
        ArrayList<Productos> array=new ArrayList<Productos>();
        try
        {	
            objeto2=new ObjectInputStream(new FileInputStream(f));
            Productos datos=  new Productos();
            while(true)
            {
                    datos= (Productos) objeto2.readObject();
                    array.add(datos);
            }

        }catch (EOFException fin) 
        {	
            System.out.println(fin.getMessage()+"FIN DE ARCHIVO");
        }
        catch (Exception e) 
        {	
                System.out.println("error al leer el objeto");	
        }
        finally
        {
            try 
            {
                if (objeto2!=null) 
                {
                        objeto2.close();
                }
            } catch (Exception e1) 
            {
                System.out.println(e1.getMessage());
            }
        }    
    return array;
    }
    public Productos BusquedaCosto(String ruta,String archivo,String nombreProd, Productos prod)
    {
        File f=new File (ruta, archivo);
        ObjectInputStream fichero=null;
        Productos datosB=null;
        int pos=1;
        try
        {
            fichero=new ObjectInputStream(new FileInputStream(f));
            while (true)
            {
                prod=(Productos) fichero.readUnshared();
                if(nombreProd.equals(prod.getNombreProd()))
                {
                    datosB=prod;
                    cont=pos;
                }   
            pos++;  
            }
        } catch (ClassNotFoundException e1)
        {
            JOptionPane.showMessageDialog(null,e1.getMessage());
        } catch (FileNotFoundException e2) 
        {
            JOptionPane.showMessageDialog(null,e2.getMessage());
        } catch (IOException e3) 
        {
            //JOptionPane.showMessageDialog(null,e3.getMessage());
        }finally 
        {
            try 
            {
            if (fichero != null) 
            {
                fichero.close();
            }
            } catch (IOException e) 
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        return datosB;
    }
    //-----------------------------------------------------------
    //SUBCLASE
    public class MyObjectOutputStream extends ObjectOutputStream
    {
        public MyObjectOutputStream() throws IOException
        {
            super();
        }
        public MyObjectOutputStream (OutputStream out) throws IOException
        {
            super(out);
        }
        public void writeStreamHeader() throws IOException
        {
           
        }
    }
}

