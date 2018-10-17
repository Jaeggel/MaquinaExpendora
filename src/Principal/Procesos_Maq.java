/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Maq_Bebidas.Bebidas;
import Maq_Monedas.Monedas;
import static Principal.Ventana_Principal.hilo;
import static Principal.Ventana_Principal.txtA;
import VentanasBebida.VentanaCC;
import VentanasBebida.VentanaFanta;
import VentanasBebida.VentanaPepsi;
import VentanasBebida.VentanaSprite;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author JoeL
 */
public class Procesos_Maq 
{
    public Publicidad hilo;
    int opBebidad;
    int cant5;
    int cant10;
    int cant25;
    double valor;
    int acum,acum2=0;
    ArrayList<String> monedas;
    boolean sw=false;

    public Procesos_Maq(int opBebidad, int cant5, int cant10, int cant25, double valor, int acum, ArrayList<String> monedas) {
        this.opBebidad = opBebidad;
        this.cant5 = cant5;
        this.cant10 = cant10;
        this.cant25 = cant25;
        this.valor = valor;
        this.acum = acum;
        this.monedas = monedas;
        acum2+=acum;
    }
    
    
    public void q0()
    {
        //Hilo que muestra los anuncios de cada bebida que se está vendidendo
        hilo=new Publicidad(txtA,true);
        hilo.start();
        //Se muestran las existencias de las bebidas y monedas respectivamente
        Bebidas bebs=new Bebidas();
        Maq_Bebidas.ControlArchivo flujo=new Maq_Bebidas.ControlArchivo(); 
        Monedas monds=new Monedas();
        Maq_Monedas.ControlArchivo flujo1=new Maq_Monedas.ControlArchivo();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Existencias Bebidas: ");
        System.out.println("Coca-Cola: "+flujo.BusquedaFileObj("ArchBebidas", "Coca-Cola", bebs).getStock()+
                           "\nSprite: "+flujo.BusquedaFileObj("ArchBebidas", "Sprite", bebs).getStock()+
                           "\nFanta: "+flujo.BusquedaFileObj("ArchBebidas", "Fanta", bebs).getStock()+
                           "\nPepsi: "+flujo.BusquedaFileObj("ArchBebidas", "Pepsi", bebs).getStock());
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Existencias Monedas: ");
        System.out.println("25: "+flujo1.BusquedaFileObj("ArchMoneda",25, monds).getStock()+
                           "\n5: "+flujo1.BusquedaFileObj("ArchMoneda",5, monds).getStock()+
                           "\n10: "+flujo1.BusquedaFileObj("ArchMoneda",10, monds).getStock());
        
    }
    public int q1(int op,int band,int acum2)
    {
        //el Parametro op pertenece a la opcion de la bebida, band corresponde a la operacion que se realize
        //1: Para obtener el valor de cada bebida
        //2: Evalua las monedas ingresadas vs el precio de cada bebida
        
        int reslt=0;
        if(opBebidad!=0){//op Bebiba corresponde a si al menos una de las bebidas has sido seleccionada
        
        
        if(band==1)//Parametro band corresponde a varias operaciones
        {//         1. Si el boton de cancelar ha sido seleccionado
         //         2. Si ha sido ingresada una moneda
            
            //---------------------------------------------------------------------
            //Mostrar precio de cada producto, al presionar su imagen mediante la llamada al metodo valorBeb()
            Set<String> quipu = new HashSet<String>(monedas);
            for (String key : quipu) 
            {
                if(key.equals("25"))
                {
                    cant25=Integer.parseInt(Collections.frequency(monedas, key)+"");

                }else
                    if(key.equals("5"))
                    {
                        cant5=Integer.parseInt(Collections.frequency(monedas, key)+"");                    

                    }else
                        if(key.equals("10"))
                        {
                            cant10=Integer.parseInt(Collections.frequency(monedas, key)+"");

                        }
            }
            valorBeb(op);
            Ventana_Principal.arrow.setVisible(false);
            Ventana_Principal.txtA.setText("Por Favor Retirar su Dinero...Gracias");
            Ventana_Principal.txtA.append("\nEntregando...");
            Cambio hilo=new Cambio(Ventana_Principal.txtA,monedas.size(),monedas);
            hilo.start();

            Ventana_Principal.lbl5.setText(cant5+"");
            Ventana_Principal.lbl10.setText(cant10+"");
            Ventana_Principal.lbl25.setText(cant25+"");

            //Luego de un minuto el hilo vuelve a ejecutarse
            //ScheduledExecutorService timer = Executors.newSingleThreadScheduledExecutor();
            //timer.scheduleAtFixedRate(hilo, 1, 1, TimeUnit.MINUTES);
            
        }
        else
        if(band==2)
        {
            hilo=new Publicidad(txtA,true);
            Ventana_Principal.hilo.stop();
            //Se detiene el hilo para mostrar el valor del producto vs el valor que se va ingresando
            //Mediante acum2, se acumulan las monedas ingresadas
            double dif=0;   
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Precio: "+valor+"| Ingreso:"+acum);
            monedas.add(acum2+"");//Se van guardando cada una de las monedas ingresadas, para poder ser contadas
            
            dif=valor-acum;
            if(dif<0)
            {
                
                if(acum==100)
                {
                    String aux=Integer.toString(acum);
                    Ventana_Principal.txtA.setText("Ha Ingresado: "+aux.substring(0,1)+".0 dolar/es");
                    Ventana_Principal.txtMon.setText("");
                }else
                {
                    if(acum>100)
                    {
                        String aux=Integer.toString(acum);
                        String aux2=aux.substring(0,1);
                        Ventana_Principal.txtA.setText("Ha Ingresado: "+aux2.concat(".").concat(aux.substring(1))+" dolar/es");
                        Ventana_Principal.txtMon.setText("");
                    }else
                    {
                        Ventana_Principal.txtA.setText("Ha Ingresado: "+acum+" centavos");
                        Ventana_Principal.txtMon.setText("");
                    }
                }
                    
            }else
            {
                if(acum==valor)
                {
                    if(acum==100)
                    {
                        String aux=Integer.toString(acum);
                        Ventana_Principal.txtA.setText("Ha Ingresado: "+aux.substring(0,1)+".0 dolar/es");
                        Ventana_Principal.txtMon.setText("");
                    }else
                    {
                        Ventana_Principal.txtA.setText("Ha Ingresado: "+acum+" centavos");
                        Ventana_Principal.txtMon.setText("");
                    }
                }else
                {
                    Ventana_Principal.txtA.setText("Ha Ingresado: "+acum+ " centavos\nFaltan "+dif+" centavos");
                    Ventana_Principal.txtMon.setText("");
                }
                
            }
            if(acum>=valor)
            {
                if(acum==valor)
                {
                    Ventana_Principal.txtA.append("\nPor Favor, Retire su Bebida...");
                    Ventana_Principal.txtMon.setEnabled(false);
                    Ventana_Principal.arrow.setVisible(true);
                    Ventana_Principal.lblPush.setEnabled(true);
                }else
                {
                    Ventana_Principal.txtMon.setEnabled(false);
                    q2(1);
                    Ventana_Principal.txtA.append("\nPor Favor, Retire su Bebida...");
                    Ventana_Principal.lblPush.setEnabled(true);
                }
            }
            //Se llama a cantMonedas, que muestra la cantidad de cada moneda ingresada
            cantMonedas();//Cuenta las monedas y las clasifica
            
        }
        }
        reslt=acum;
    return reslt;    
    }
    
    public void q2(int op)
    {
        //El parametro op es para hacer referencia que solamanete se va a entregar el cambio
        if(op==1)
        {
            Ventana_Principal.arrow.setVisible(true);
            cambio();
        }else
        {
            if(opBebidad==1)
            {
                actualizarStockB("Coca-Cola");
                JOptionPane.showMessageDialog(null, "¡Disfruta de tu Coca-Cola...!");
                VentanaCC obj=new VentanaCC();
                obj.setVisible(true);

            }else
            if(opBebidad==2)
            {
                actualizarStockB("Sprite");
                JOptionPane.showMessageDialog(null, "¡Disfruta de tu Sprite...!");
                VentanaSprite obj=new VentanaSprite();
                obj.setVisible(true);

            }else
            if(opBebidad==3)
            {
                actualizarStockB("Fanta");
                JOptionPane.showMessageDialog(null, "¡Disfruta de tu Fanta...!");
                VentanaFanta obj=new VentanaFanta();
                obj.setVisible(true);
            }else
                if(opBebidad==4)
                {
                    actualizarStockB("Pepsi");
                    JOptionPane.showMessageDialog(null, "¡Disfruta de tu Pepsi...!");
                    VentanaPepsi obj=new VentanaPepsi();
                    obj.setVisible(true);  
                }
        }
    }
    public void cambio()
    {
        Monedas monds=new Monedas();
        Maq_Monedas.ControlArchivo flujo1=new Maq_Monedas.ControlArchivo();
        int va25=flujo1.BusquedaFileObj("ArchMoneda",25, monds).getStock();
        int va5=flujo1.BusquedaFileObj("ArchMoneda",5, monds).getStock();
        int va10=flujo1.BusquedaFileObj("ArchMoneda",10, monds).getStock();
        
        Ventana_Principal.txtA.append("\nPor Favor, Retire su Cambio...");
        Ventana_Principal.arrow2.setVisible(true);
        if(acum>valor)
        {
            int difC=(int)(acum-valor);
            if(difC<=25)
            {
                if(difC==25)
                {
                    if(va25!=0)
                    {
                        Ventana_Principal.lbl25.setText("1");
                        actualizarStockM(25,1,true);
                    }else
                    {
                        Ventana_Principal.lbl10.setText("2");
                        Ventana_Principal.lbl5.setText("1");
                        actualizarStockM(10,2,true);
                        actualizarStockM(5,1,true);
                    }
                    
                }else
                if(difC==20)
                {
                    if(va10>1)
                    {
                        Ventana_Principal.lbl10.setText("2");
                        actualizarStockM(10,2,true);
                    }else
                    {
                        Ventana_Principal.lbl5.setText("4");
                        actualizarStockM(5,4,true);
                    }
                    
                }else
                if(difC==15)
                {
                    if(va10>=2)
                    {
                        Ventana_Principal.lbl5.setText("1");
                        Ventana_Principal.lbl10.setText("1");
                        actualizarStockM(5,1,true);
                        actualizarStockM(10,1,true);
                    }else
                    {
                        Ventana_Principal.lbl5.setText("3");
                        actualizarStockM(5,3,true);
                    }
                    
                }
                else
                if(difC==10)
                {
                    if(va10>0)
                    {
                        Ventana_Principal.lbl10.setText("1");
                        actualizarStockM(10,1,true);
                    }else
                    {
                        Ventana_Principal.lbl5.setText("2");
                        actualizarStockM(5,2,true);
                    }
                    
                }
                else
                if(difC==5)
                {
                    if(va5>0)
                    {
                        Ventana_Principal.lbl5.setText("1");
                        actualizarStockM(5,1,true);
                    }
                    else
                    {
                        Ventana_Principal.txtA.setText("Le quedo debiendo caserito :'(");
                    }
                    
                }
            }
        }
    }
    public void aumentarStockMon()
    {
        Set<String> quipu = new HashSet<String>(monedas);
        
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Cantidad Monedas Ingresadas");
        for (String key : quipu) 
        {
            System.out.println(key + " : " + Collections.frequency(monedas, key));
            if(key.equals("25"))
            {
                cant25=Integer.parseInt(Collections.frequency(monedas, key)+"");
                
            }else
                if(key.equals("5"))
                {
                    cant5=Integer.parseInt(Collections.frequency(monedas, key)+"");                    
                    
                }else
                    if(key.equals("10"))
                    {
                        cant10=Integer.parseInt(Collections.frequency(monedas, key)+"");
                        
                    }
        }
        actualizarStockM(10,cant10,false);
        actualizarStockM(5,cant5,false);
        actualizarStockM(25,cant25,false);
    }
    public double valorBeb(int op)
    {
        Ventana_Principal.hilo.stop();
        Bebidas bebs=new Bebidas();
        Maq_Bebidas.ControlArchivo flujo=new Maq_Bebidas.ControlArchivo(); 
        double valorB=0;
                        
        //--------------------------------------------------------------
        //Se envia el parametro nombre de Bebida, dependiendo su numero de "op"
        //para que pueda buscar en los registros del Archivo
        switch(op)
        {
            case 1:
            {
                String nombreBeb="Coca-Cola";
                Ventana_Principal.txtA.setText("");
                valorB=flujo.BusquedaFileObj("ArchBebidas", nombreBeb, bebs).getPrecio();
                Ventana_Principal.txtA.append("Su costo es de: "+valorB);break;
            }
            case 2:
            {
                String nombreBeb="Sprite";
                Ventana_Principal.txtA.setText("");
                valorB=flujo.BusquedaFileObj("ArchBebidas", nombreBeb, bebs).getPrecio();
                Ventana_Principal.txtA.append("Su costo es de: "+valorB);break;
            }
            case 3:
            {
                String nombreBeb="Fanta";
                valorB=flujo.BusquedaFileObj("ArchBebidas", nombreBeb, bebs).getPrecio();
                Ventana_Principal.txtA.append("Su costo es de: "+valorB);break;
            }
            case 4:
            {
                String nombreBeb="Pepsi";
                valorB=flujo.BusquedaFileObj("ArchBebidas", nombreBeb, bebs).getPrecio();
                Ventana_Principal.txtA.append("Su costo es de: "+valorB);break;
            }
            default:
            break;
        
        }
        if(valorB>=1)
        {
            Ventana_Principal.txtA.append(" dolar/es");
        }else
            Ventana_Principal.txtA.append(" centavos");
        
        return valorB;
    }
     public void cantMonedas()
    {
        Set<String> quipu = new HashSet<String>(monedas);
        for (String key : quipu) 
        {
            System.out.println(key + " : " + Collections.frequency(monedas, key));
            if(key.equals("25"))
            {
                cant25=Integer.parseInt(Collections.frequency(monedas, key)+"");
                
            }else
                if(key.equals("5"))
                {
                    cant5=Integer.parseInt(Collections.frequency(monedas, key)+"");                    
                    
                }else
                    if(key.equals("10"))
                    {
                        cant10=Integer.parseInt(Collections.frequency(monedas, key)+"");
                        
                    }
        }
        
    }
    public void actualizarStockB(String nombreBeb)
    {
        Bebidas bebs=new Bebidas();
        Bebidas bebs1=new Bebidas();
        int cont2=0;
        Maq_Bebidas.ControlArchivo flujo=new Maq_Bebidas.ControlArchivo(); 
        //-------------------------------------------------------------------
        
        double precio=Double.parseDouble(flujo.BusquedaFileObj("ArchBebidas", nombreBeb, bebs).getPrecio()+"");
        int stock=Integer.parseInt(flujo.BusquedaFileObj("ArchBebidas", nombreBeb, bebs).getStock()+"");
        
        Ventana_Principal.indiceB=flujo.contadorBusqueda(); 
        bebs.setNombre(nombreBeb);
        bebs.setStock(stock-1);
        bebs.setPrecio(precio);
        cont2=Ventana_Principal.indiceB;
        flujo.modificarRegistro("ArchBebidas", bebs,bebs1, cont2);
    }
    public void actualizarStockM(int valorM,int cant,boolean op)
    {
        Monedas mon=new Monedas();
        Monedas mon1=new Monedas();
        int cont2=0;
        Maq_Monedas.ControlArchivo flujo=new Maq_Monedas.ControlArchivo(); 
        //-------------------------------------------------------------------
        int stock=flujo.BusquedaFileObj("ArchMoneda",valorM, mon).getStock();
        Ventana_Principal.indiceM=flujo.contadorBusqueda(); 
        mon.setValorMoneda(valorM);
        if(op)
        {
            mon.setStock(stock-cant);
        }else
        {
            mon.setStock(stock+cant);
        }
        cont2=Ventana_Principal.indiceM;
        flujo.modificarRegistro("ArchMoneda", mon,mon1, cont2);
        
    }
}
