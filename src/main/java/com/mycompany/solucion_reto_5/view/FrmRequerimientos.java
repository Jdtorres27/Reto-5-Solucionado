
package com.mycompany.solucion_reto_5.view;

import com.mycompany.solucion_reto_5.controller.ControladorRequerimientosReto4;
import com.mycompany.solucion_reto_5.model.vo.AsesorPorCiudad;
import com.mycompany.solucion_reto_5.model.vo.CompraPorProveedor;
import com.mycompany.solucion_reto_5.model.vo.ProyectosCasaCampestre;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class FrmRequerimientos extends javax.swing.JFrame {
    
    public FrmRequerimientos() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnInforme1 = new javax.swing.JButton();
        btnInforme2 = new javax.swing.JButton();
        btnInforme3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(219, 244, 255));
        jPanel1.setLocation(new java.awt.Point(0, 0));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel1.setText("Requerimientos");

        btnInforme1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnInforme1.setText("Informe 1");
        btnInforme1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInforme1ActionPerformed(evt);
            }
        });

        btnInforme2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnInforme2.setText("Informe 2");
        btnInforme2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInforme2ActionPerformed(evt);
            }
        });

        btnInforme3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnInforme3.setText("Informe 3");
        btnInforme3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInforme3ActionPerformed(evt);
            }
        });

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTabla);

        btnSalir.setBackground(new java.awt.Color(0, 204, 204));
        btnSalir.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnInforme1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btnInforme2)
                .addGap(48, 48, 48)
                .addComponent(btnInforme3)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(148, 148, 148))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addGap(170, 170, 170))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInforme3)
                            .addComponent(btnInforme2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnInforme1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInforme1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInforme1ActionPerformed
        
        String [] columnNombre = {"Id Lider", "Nombre", "Primer Apellido", "Residencia"} ;
        ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();
        
        ArrayList<AsesorPorCiudad> listaA;
        
        try{
            listaA = controlador.consultarAsesorPorCiudad();
            
            Object[][] datos = new Object[listaA.size()][4];
            int index = 0;
            
            for (AsesorPorCiudad lista: listaA){
                datos[index][0] = lista.getIdLider();
                datos[index][1] = lista.getNombre();
                datos[index][2] = lista.getPrimerApellido();
                datos[index][3] = lista.getCiudadResidencia();
                index++;
        
            }
            
            DefaultTableModel model = new DefaultTableModel(datos, columnNombre);
            tblTabla.setModel(model);
          
        } catch (Exception e){
            System.err.println(e.getMessage());
            
            
        }
        
 
    }//GEN-LAST:event_btnInforme1ActionPerformed

    private void btnInforme2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInforme2ActionPerformed
        
        String [] columnProyecto = {"Id Proyecto", "Constructora", "Numero Habitaciones", "Ciudad"} ;
        ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();
        
        ArrayList<ProyectosCasaCampestre> listaB;
        
        try{
            listaB = controlador.consultarProyectosCasaCampestre();
            
            Object[][] datos = new Object[listaB.size()][4];
            int index = 0;
            
            for (ProyectosCasaCampestre lista: listaB){
                datos[index][0] = lista.getID_Proyecto();
                datos[index][1] = lista.getConstructora();
                datos[index][2] = lista.getNumero_Habitaciones();
                datos[index][3] = lista.getCiudad();
                index++;
            }
            
            DefaultTableModel model = new DefaultTableModel(datos, columnProyecto);
            tblTabla.setModel(model);
          
        } catch (Exception e){
            System.err.println(e.getMessage()); 
        }
    }//GEN-LAST:event_btnInforme2ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnInforme3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInforme3ActionPerformed
        
        String [] columnProveedor = {"Id Compra", "Constructora", "Banco Vinculado"} ;
        ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();
        
        ArrayList<CompraPorProveedor> listaC;
        
        try{
            listaC = controlador.consultarCompraPorProveedor();
            
            Object[][] datos = new Object[listaC.size()][3];
            int index = 0;
            
            for (CompraPorProveedor lista: listaC){
                datos[index][0] = lista.getID_Compra();
                datos[index][1] = lista.getConstructora();
                datos[index][2] = lista.getBanco_Vinculado();
                index++;
        
            }
            
            DefaultTableModel model = new DefaultTableModel(datos, columnProveedor);
            tblTabla.setModel(model);
          
        } catch (Exception e){
            System.err.println(e.getMessage());  
        }                                          

    }//GEN-LAST:event_btnInforme3ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRequerimientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInforme1;
    private javax.swing.JButton btnInforme2;
    private javax.swing.JButton btnInforme3;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabla;
    // End of variables declaration//GEN-END:variables

    private void setLotationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
