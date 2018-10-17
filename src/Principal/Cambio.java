/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JTextArea;

/**
 *
 * @author JoeL
 */
public class Cambio extends Thread
{
    JTextArea txtA;
    Thread hilo;

    int valor=0;
    ArrayList<String> lista = new ArrayList<String>();
    public Cambio(JTextArea txtA1,int val,ArrayList list)
    {
        txtA=txtA1;
        hilo=new Thread();
        valor=val;
        lista=list;
    }
    public void run()
    {
        if(hilo!=null)
        {
           
            for (int i = 0; i < valor; i++)
            {
                txtA.append("\nN°"+i+": "+lista.get(i));
                tiempo();
            }
            
        }
    } 
    public void tiempo()
    {
        try 
        {
            sleep(600);
        } catch (InterruptedException e)
        {
            System.out.println("Interrupcion hilo ");
        } 
    }
}