/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria.vistas;

/**
 *
 * @author PabloOjeda
 */
public class BajaDeCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form BajaDeMascota
     */
    public BajaDeCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cliente = new javax.swing.JLabel();
        dni = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        Direccion = new javax.swing.JLabel();
        contacto = new javax.swing.JLabel();
        mascota = new javax.swing.JLabel();
        boxCliente = new javax.swing.JTextField();
        boxTelefono = new javax.swing.JTextField();
        boxDireccion = new javax.swing.JTextField();
        boxCotacto = new javax.swing.JTextField();
        boxMascota = new javax.swing.JTextField();
        boxDni = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Baja de Cliente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cliente.setForeground(new java.awt.Color(0, 200, 50));
        cliente.setText("ID:");
        getContentPane().add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 60, -1));

        dni.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dni.setForeground(new java.awt.Color(0, 200, 50));
        dni.setText("DNI:");
        getContentPane().add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        telefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        telefono.setForeground(new java.awt.Color(0, 200, 50));
        telefono.setText("Telefono:");
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        Direccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Direccion.setForeground(new java.awt.Color(0, 200, 50));
        Direccion.setText("Direccion:");
        getContentPane().add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        contacto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        contacto.setForeground(new java.awt.Color(0, 200, 50));
        contacto.setText("Contacto:");
        getContentPane().add(contacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        mascota.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mascota.setForeground(new java.awt.Color(0, 200, 50));
        mascota.setText("Mascota:");
        getContentPane().add(mascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        boxCliente.setText("Apellido y Nombre");
        getContentPane().add(boxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 110, -1));

        boxTelefono.setText("Telefono");
        getContentPane().add(boxTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 110, -1));

        boxDireccion.setText("Direccion");
        getContentPane().add(boxDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 110, -1));

        boxCotacto.setText("Alternativo");
        boxCotacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCotactoActionPerformed(evt);
            }
        });
        getContentPane().add(boxCotacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 110, -1));

        boxMascota.setText("Nombre");
        getContentPane().add(boxMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 110, -1));

        boxDni.setText("Solo numero");
        getContentPane().add(boxDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 110, -1));

        jButton1.setText("Cargar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 70, -1));

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/veterinaria/vistas/Imagenes/Fondos/VeterinariaVistaPrincipal.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxCotactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCotactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCotactoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Direccion;
    private javax.swing.JTextField boxCliente;
    private javax.swing.JTextField boxCotacto;
    private javax.swing.JTextField boxDireccion;
    private javax.swing.JTextField boxDni;
    private javax.swing.JTextField boxMascota;
    private javax.swing.JTextField boxTelefono;
    private javax.swing.JLabel cliente;
    private javax.swing.JLabel contacto;
    private javax.swing.JLabel dni;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel mascota;
    private javax.swing.JLabel telefono;
    // End of variables declaration//GEN-END:variables
}