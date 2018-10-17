/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maq_Bebidas;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author JoeL
 */
public class ControlArchivo
{
    String cadenaAcum="";
    int cont=0;
    public void escrituraFileObj(String archivo, Bebidas bebs)
    {
        File f=new File (archivo);
        ObjectOutputStream ficheroN=null;
        MyObjectOutputStream ficheroA=null;
        try
        {
            if (f.exists())
            {
                ficheroA = new MyObjectOutputStream(new FileOutputStream(f,true));
                ficheroA.writeUnshared(bebs); // se identifica al objeto como uno solo nuevo
            }
            else
            { 
                ficheroN=new ObjectOutputStream(new FileOutputStream(f,true));
                ficheroN.writeObject(bebs);
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
    public void lecturaFileObj(String archivo, Bebidas bebs)
    {
        File f=new File (archivo);
        ObjectInputStream fichero=null;
        try
        {
            fichero=new ObjectInputStream(new FileInputStream(f));
            cadenaAcum+="\nNOMBRE\t\tSTOCK\t\tPRECIO\n";
            cadenaAcum+="---------------------------------------------------------------------------------------------------------------------\n";
            while (true)
            {
                bebs=(Bebidas) fichero.readObject();
                cadenaAcum+=bebs.getNombre()+"\t\t"+bebs.getStock()+"\t\t"+bebs.getPrecio()+"\n";
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
    public Bebidas BusquedaFileObj(String archivo,String nombreBeb, Bebidas bebs)
    {
        File f=new File (archivo);
        ObjectInputStream fichero=null;
        Bebidas datosB=null;
        int pos=1;
        try
        {
            fichero=new ObjectInputStream(new FileInputStream(f));
            while (true)
            {
                bebs=(Bebidas) fichero.readUnshared();
                if(nombreBeb.equals(bebs.getNombre()))
                {
                    datosB=bebs;
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
    public void modificarRegistro(String nombreArch,Bebidas bebs,Bebidas bebs1,int indice)
    {
        int cont2=1;
        //---------------------------------------
        File f=new File (nombreArch);
        File f2=new File("x"+nombreArch);//New
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
                bebs1=(Bebidas) fichero.readUnshared();
                if(indice==cont2)
                {
                    if (f2.exists())
                    {
                        ficheroA.writeUnshared(bebs); // se identifica al objeto como uno solo nuevo
                    }
                    else
                    { 
                        ficheroN.writeObject(bebs);
                    }
                }
                else
                    {
                        if (f2.exists())
                        {
                            ficheroA.writeUnshared(bebs1); // se identifica al objeto como uno solo nuevo
                        }
                        else
                        { 
                            ficheroN.writeObject(bebs1);
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
