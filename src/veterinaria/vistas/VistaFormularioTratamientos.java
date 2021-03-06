/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria.vistas;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import veterinaria.modelo.Conexion;
import veterinaria.modelo.Tratamiento;
import veterinaria.modelo.TratamientoData;

/**
 *
 * @author nachomorati
 */
public class VistaFormularioTratamientos extends javax.swing.JInternalFrame {
    private Conexion conexion;
    private TratamientoData tratamientoData;
    private ArrayList<Tratamiento> tratamientos;
    
    /**
     * Creates new form VistaFormularioTratamientos
     */
    public VistaFormularioTratamientos() {
        initComponents();
        
        try {
            conexion = new Conexion("jdbc:mysql://localhost/veterinaria", "root", "");
            tratamientoData = new TratamientoData(conexion);
            tratamientos = (ArrayList<Tratamiento>) tratamientoData.obtenerTratamientos();
            
            cargaTratamientos();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaFormularioTratamientos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cargaTratamientos() {
        
        comboBoxTratamientos.removeAllItems();
        
        for(Tratamiento t:tratamientos) {
            comboBoxTratamientos.addItem(t);
        }
    }
    
    public void limpiaCampos() {
        comboBoxTratamientos.removeAllItems();
        checkBoxActivo.setSelected(true);
        texFieldTipo.setText("");
        textFieldDescripcion.setText("");
        textFieldImporte.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboBoxTratamientos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        texFieldTipo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textFieldDescripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textFieldImporte = new javax.swing.JTextField();
        checkBoxActivo = new javax.swing.JCheckBox();
        btnCrear = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de Tratamientos");

        jLabel2.setText("Tratamiento");

        comboBoxTratamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTratamientosActionPerformed(evt);
            }
        });

        jLabel3.setText("Tipo");

        jLabel4.setText("Descripcion");

        jLabel5.setText("Importe");

        textFieldImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldImporteActionPerformed(evt);
            }
        });

        checkBoxActivo.setText("Activo");

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldDescripcion))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texFieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(checkBoxActivo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxTratamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCrear)
                        .addGap(79, 79, 79)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBorrar)
                        .addGap(65, 65, 65)
                        .addComponent(btnLimpiar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboBoxTratamientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(texFieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(textFieldImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBoxActivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(btnModificar)
                    .addComponent(btnBorrar)
                    .addComponent(btnLimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldImporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldImporteActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiaCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        Tratamiento tratamiento = new Tratamiento();
        if(checkBoxActivo.isSelected()) {
            tratamiento.setActivo(true);
        } else {
            tratamiento.setActivo(false);
        }
        tratamiento.setDescripcion(textFieldDescripcion.getText());
        tratamiento.setImporte(Double.parseDouble(textFieldImporte.getText()));
        tratamiento.setTipo(texFieldTipo.getText());
        tratamientoData.guardarTratamiento(tratamiento);
        limpiaCampos();
        
        tratamientos = (ArrayList<Tratamiento>) tratamientoData.obtenerTratamientos();
        
        cargaTratamientos();
        
    }//GEN-LAST:event_btnCrearActionPerformed

    private void comboBoxTratamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTratamientosActionPerformed
        if(comboBoxTratamientos.getSelectedItem() != null) {
            Tratamiento tratamiento = (Tratamiento)comboBoxTratamientos.getSelectedItem();

            texFieldTipo.setText(tratamiento.getTipo());
            textFieldImporte.setText(String.valueOf(tratamiento.getImporte()));
            if(tratamiento.isActivo()) {
                checkBoxActivo.setSelected(true);
            } else {
                checkBoxActivo.setSelected(false);
            }
            textFieldDescripcion.setText(tratamiento.getDescripcion());
        }
    }//GEN-LAST:event_comboBoxTratamientosActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(comboBoxTratamientos.getSelectedItem() != null) {
            Tratamiento tratamiento = (Tratamiento)comboBoxTratamientos.getSelectedItem();
            if(checkBoxActivo.isSelected()) {
                tratamiento.setActivo(true);
            } else {
                tratamiento.setActivo(false);
            }
            tratamiento.setDescripcion(textFieldDescripcion.getText());
            tratamiento.setImporte(Double.parseDouble(textFieldImporte.getText()));
            tratamiento.setTipo(texFieldTipo.getText());
            
            tratamientoData.actualizarTratamiento(tratamiento);
            
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if(comboBoxTratamientos.getSelectedItem() != null) {
            Tratamiento tratamiento = (Tratamiento) comboBoxTratamientos.getSelectedItem();
            tratamientoData.borrarTratamiento(tratamiento.getId());
            tratamientos = (ArrayList<Tratamiento>) tratamientoData.obtenerTratamientos();
        
            cargaTratamientos();
        }
    }//GEN-LAST:event_btnBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JCheckBox checkBoxActivo;
    private javax.swing.JComboBox<Tratamiento> comboBoxTratamientos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField texFieldTipo;
    private javax.swing.JTextField textFieldDescripcion;
    private javax.swing.JTextField textFieldImporte;
    // End of variables declaration//GEN-END:variables
}
