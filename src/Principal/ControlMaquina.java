/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Maq_Monedas.*;
import Maq_Bebidas.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author JoeL
 */
public class ControlMaquina extends javax.swing.JFrame {
    int indiceM=0;
    int indiceB=0;
    /**
     * Creates new form ControlMaquina
     */
    public ControlMaquina() {
        initComponents();
        this.setTitle("Control Maquina");
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Multimedia/conf.png"));
        setIconImage(icon);
        this.setLocationRelativeTo(null);
        insertImage(panelBeb,"/Multimedia/f1_1.jpg",588,361);
        insertImage(panelMon,"/Multimedia/f1_1.jpg",588,361);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBebidas = new javax.swing.JTabbedPane();
        panelMon = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtValorMoneda = new javax.swing.JTextField();
        txtExistMonedas = new javax.swing.JTextField();
        btnGuardarM = new javax.swing.JButton();
        btnMostrarM = new javax.swing.JButton();
        btnBuscarM = new javax.swing.JButton();
        btnModifM = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAPantallaM = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        panelBeb = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombreBebida = new javax.swing.JTextField();
        txtExistenciasBebidas = new javax.swing.JTextField();
        txtPrecioBebida = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAPantallaB = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelBebidas.setBackground(new java.awt.Color(255, 255, 255));
        panelBebidas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        panelMon.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel1.setText("Valor Moneda: ");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel2.setText("Existencias: ");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Gestión de Monedas");

        txtValorMoneda.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        txtExistMonedas.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        btnGuardarM.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarM.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btnGuardarM.setText("Guardar");
        btnGuardarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarMActionPerformed(evt);
            }
        });

        btnMostrarM.setBackground(new java.awt.Color(255, 255, 255));
        btnMostrarM.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btnMostrarM.setText("Mostrar");
        btnMostrarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarMActionPerformed(evt);
            }
        });

        btnBuscarM.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarM.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btnBuscarM.setText("Buscar");
        btnBuscarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMActionPerformed(evt);
            }
        });

        btnModifM.setBackground(new java.awt.Color(255, 255, 255));
        btnModifM.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btnModifM.setText("Modificar");
        btnModifM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifMActionPerformed(evt);
            }
        });

        txtAPantallaM.setColumns(20);
        txtAPantallaM.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtAPantallaM.setRows(5);
        jScrollPane1.setViewportView(txtAPantallaM);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/ad.png"))); // NOI18N

        javax.swing.GroupLayout panelMonLayout = new javax.swing.GroupLayout(panelMon);
        panelMon.setLayout(panelMonLayout);
        panelMonLayout.setHorizontalGroup(
            panelMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMonLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(panelMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtExistMonedas, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(txtValorMoneda))
                .addGap(27, 27, 27)
                .addGroup(panelMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelMonLayout.createSequentialGroup()
                        .addComponent(btnMostrarM, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModifM))
                    .addGroup(panelMonLayout.createSequentialGroup()
                        .addComponent(btnGuardarM, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(panelMonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelMonLayout.setVerticalGroup(
            panelMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMonLayout.createSequentialGroup()
                .addGroup(panelMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtValorMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarM)
                    .addComponent(btnBuscarM))
                .addGap(19, 19, 19)
                .addGroup(panelMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtExistMonedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarM)
                    .addComponent(btnModifM))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBebidas.addTab("Control Monedas", panelMon);

        panelBeb.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setText("Gestión de Bebidas");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel5.setText("Nombre: ");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel6.setText("Existencias: ");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel7.setText("Precio: ");

        txtNombreBebida.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        txtExistenciasBebidas.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        txtPrecioBebida.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnMostrar.setBackground(new java.awt.Color(255, 255, 255));
        btnMostrar.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(255, 255, 255));
        btnModificar.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        txtAPantallaB.setColumns(20);
        txtAPantallaB.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        txtAPantallaB.setRows(5);
        jScrollPane2.setViewportView(txtAPantallaB);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/ad.png"))); // NOI18N

        javax.swing.GroupLayout panelBebLayout = new javax.swing.GroupLayout(panelBeb);
        panelBeb.setLayout(panelBebLayout);
        panelBebLayout.setHorizontalGroup(
            panelBebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBebLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 340, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelBebLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelBebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(panelBebLayout.createSequentialGroup()
                        .addGroup(panelBebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(panelBebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreBebida)
                            .addComponent(txtExistenciasBebidas)
                            .addComponent(txtPrecioBebida, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(panelBebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelBebLayout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelBebLayout.createSequentialGroup()
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        panelBebLayout.setVerticalGroup(
            panelBebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBebLayout.createSequentialGroup()
                .addGroup(panelBebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBebLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(panelBebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombreBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar)
                    .addComponent(btnMostrar))
                .addGap(18, 18, 18)
                .addGroup(panelBebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtExistenciasBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnModificar))
                .addGap(18, 18, 18)
                .addGroup(panelBebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPrecioBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBebidas.addTab("Control Bebidas", panelBeb);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBebidas, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        Bebidas bebs=new Bebidas();
        Maq_Bebidas.ControlArchivo flujo=new Maq_Bebidas.ControlArchivo();
        //--------------------------------------------------------------
        flujo.lecturaFileObj("ArchBebidas", bebs);
        txtAPantallaB.append(flujo.pantalla());
        txtNombreBebida.requestFocus();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnGuardarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarMActionPerformed
        Monedas mon=new Monedas();
        Maq_Monedas.ControlArchivo flujo=new Maq_Monedas.ControlArchivo();
        //-------------------------------------------------------------------
        int valorM=Integer.parseInt(txtValorMoneda.getText().trim());
        int existM=Integer.parseInt(txtExistMonedas.getText().trim());
        mon.setValorMoneda(valorM);
        mon.setStock(existM);
        
        flujo.escrituraFileObj("ArchMoneda",mon);
        JOptionPane.showMessageDialog(null,"Registro Guardado");
        //-------------------------------------------------------------------
        txtValorMoneda.setText("");
        txtExistMonedas.setText("");
        txtValorMoneda.requestFocus();
    }//GEN-LAST:event_btnGuardarMActionPerformed

    private void btnMostrarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarMActionPerformed
        Monedas mon=new Monedas();
        Maq_Monedas.ControlArchivo flujo=new Maq_Monedas.ControlArchivo();
        //--------------------------------------------------------------
        flujo.lecturaFileObj("ArchMoneda", mon);
        txtAPantallaM.append(flujo.pantalla());
        txtValorMoneda.requestFocus();
        
    }//GEN-LAST:event_btnMostrarMActionPerformed

    private void btnBuscarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMActionPerformed
        Monedas mon=new Monedas();
        Maq_Monedas.ControlArchivo flujo=new Maq_Monedas.ControlArchivo();
        //--------------------------------------------------------------
        int valorM=Integer.parseInt(txtValorMoneda.getText().trim());
        
        txtExistMonedas.setText(flujo.BusquedaFileObj("ArchMoneda",valorM, mon).getStock()+"");
        txtAPantallaM.append(flujo.pantalla());
        indiceM=flujo.contadorBusqueda();
        //txtAPantalla.append("\nEl Registro está en la posición :"+Integer.toString(flujo.contadorBusqueda())+"\n");
        txtValorMoneda.requestFocus();
    }//GEN-LAST:event_btnBuscarMActionPerformed

    private void btnModifMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifMActionPerformed
        Monedas mon=new Monedas();
        Monedas mon1=new Monedas();
        int cont2=0;
        Maq_Monedas.ControlArchivo flujo=new Maq_Monedas.ControlArchivo();
        //-------------------------------------------------------------------
        int valorM=Integer.parseInt(txtValorMoneda.getText().trim());
        int existM=Integer.parseInt(txtExistMonedas.getText().trim());
        mon.setValorMoneda(valorM);
        mon.setStock(existM);
        cont2=indiceM;
        flujo.modificarRegistro("ArchMoneda", mon,mon1, cont2);
        
        JOptionPane.showMessageDialog(null,"Registro Modificado con Exito");
        txtValorMoneda.setText("");
        txtExistMonedas.setText("");
        txtValorMoneda.requestFocus();
    }//GEN-LAST:event_btnModifMActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Bebidas bebs=new Bebidas();
        Maq_Bebidas.ControlArchivo flujo=new Maq_Bebidas.ControlArchivo();
        //-------------------------------------------------------------------
        String nombreBeb=txtNombreBebida.getText().trim();
        int existBeb=Integer.parseInt(txtExistenciasBebidas.getText());
        double precio=Double.parseDouble(txtPrecioBebida.getText());
        
        bebs.setNombre(nombreBeb);
        bebs.setStock(existBeb);
        bebs.setPrecio(precio);
        
        flujo.escrituraFileObj("ArchBebidas", bebs);
        JOptionPane.showMessageDialog(null,"Registro Guardado");
        //-------------------------------------------------------------------
        txtNombreBebida.setText("");
        txtExistenciasBebidas.setText("");
        txtPrecioBebida.setText("");
        txtNombreBebida.requestFocus();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Bebidas bebs=new Bebidas();
        Maq_Bebidas.ControlArchivo flujo=new Maq_Bebidas.ControlArchivo(); 
        //--------------------------------------------------------------
        String nombreBeb=txtNombreBebida.getText().trim();
        
        txtPrecioBebida.setText(flujo.BusquedaFileObj("ArchBebidas", nombreBeb, bebs).getPrecio()+"");
        txtExistenciasBebidas.setText(flujo.BusquedaFileObj("ArchBebidas", nombreBeb, bebs).getStock()+"");
        txtAPantallaB.append(flujo.pantalla());
        indiceB=flujo.contadorBusqueda();
        //txtAPantallaB.append("\nEl Registro está en la posición :"+Integer.toString(flujo.contadorBusqueda())+"\n");
        txtNombreBebida.requestFocus();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Bebidas bebs=new Bebidas();
        Bebidas bebs1=new Bebidas();
        int cont2=0;
        Maq_Bebidas.ControlArchivo flujo=new Maq_Bebidas.ControlArchivo(); 
        //-------------------------------------------------------------------
         String nombreBeb=txtNombreBebida.getText().trim();
        int existBeb=Integer.parseInt(txtExistenciasBebidas.getText());
        double precio=Double.parseDouble(txtPrecioBebida.getText());
        
        bebs.setNombre(nombreBeb);
        bebs.setStock(existBeb);
        bebs.setPrecio(precio);
        cont2=indiceB;
        flujo.modificarRegistro("ArchBebidas", bebs,bebs1, cont2);
        
        JOptionPane.showMessageDialog(null,"Registro Modificado con Exito");
        txtNombreBebida.setText("");
        txtExistenciasBebidas.setText("");
        txtPrecioBebida.setText("");
        txtNombreBebida.requestFocus();
    }//GEN-LAST:event_btnModificarActionPerformed

     public void insertImage(JPanel panel,String ruta,int x, int y)
    {
        ImagePanel Imagen = new ImagePanel(ruta,x,y);
        panel.add(Imagen);
        panel.repaint();
    }
    public class ImagePanel extends JPanel 
    {
        private final String ruta;
        private final int x;
        private final int y;
        public ImagePanel(String ruta,int x,int y)
        {
            //Se crea un método cuyo parámetro debe ser un objeto Graphics
            this.ruta=ruta;
            this.x=x;
            this.y=y;
            this.setSize(x,y);
        } 
        @Override
        public void paint(Graphics grafico)
        {
            Dimension height = getSize();
            //Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
            ImageIcon Img = new ImageIcon(getClass().getResource(ruta)); 
            //se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
            grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
            setOpaque(false);
            super.paintComponent(grafico);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarM;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarM;
    private javax.swing.JButton btnModifM;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnMostrarM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelBeb;
    private javax.swing.JTabbedPane panelBebidas;
    private javax.swing.JPanel panelMon;
    private javax.swing.JTextArea txtAPantallaB;
    private javax.swing.JTextArea txtAPantallaM;
    private javax.swing.JTextField txtExistMonedas;
    private javax.swing.JTextField txtExistenciasBebidas;
    private javax.swing.JTextField txtNombreBebida;
    private javax.swing.JTextField txtPrecioBebida;
    private javax.swing.JTextField txtValorMoneda;
    // End of variables declaration//GEN-END:variables
}
