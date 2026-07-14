package avance2proyecto_alexanderalpizarm;
import javax.swing.JOptionPane;

public class PantallaInicioSesion extends javax.swing.JFrame {

    public PantallaInicioSesion() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtUsuario = new javax.swing.JTextPane();
        BIniciarSesion = new javax.swing.JButton();
        txtContrasena = new javax.swing.JPasswordField();
        BSalirPrograma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText(" FideBurguesas");

        jLabel2.setText(" Sistema POS");

        jLabel3.setText("Usuario:");

        jLabel4.setText("Contraseña:");

        jScrollPane1.setViewportView(txtUsuario);

        BIniciarSesion.setText("Iniciar Sesión");
        BIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BIniciarSesionActionPerformed(evt);
            }
        });

        BSalirPrograma.setText("Cerrar");
        BSalirPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalirProgramaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1)
                    .addComponent(txtContrasena))
                .addContainerGap(144, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BSalirPrograma))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BSalirPrograma)
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(BIniciarSesion)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BIniciarSesionActionPerformed

        String usuario = txtUsuario.getText();
        String contrasena =String.valueOf(txtContrasena.getPassword());

        // Validar campos vacíos
        if (usuario.isEmpty() || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos.");
            return;
        }

        // Administrador permanente
        if (usuario.equals("admin") && contrasena.equals("123")){
            JOptionPane.showMessageDialog(null,"Bienvenido Administrador.");
            PantallaAdministrador pantalla = new PantallaAdministrador();
            pantalla.setVisible(true);
            dispose();

            return;
        }

        // Buscar cajero
        ArchivosUsuarios archivo = new ArchivosUsuarios();
        Usuario usuarioEncontrado = archivo.buscarUsuario(usuario,contrasena);

        if (usuarioEncontrado == null){
            JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrectos.");
            return;
        }

        Cajero cajero = (Cajero) usuarioEncontrado;

        // Verifica si está activo
        if (!cajero.isActivo()) {
            JOptionPane.showMessageDialog(null,"Este cajero se encuentra inactivo.");
            return;
        }

        JOptionPane.showMessageDialog(null,"Bienvenido " + cajero.getNombre());

        //se envía el cajero a la pantalla principal
        PantallaPrincipalCajero pantalla = new PantallaPrincipalCajero(cajero,null);
        pantalla.setVisible(true);
        dispose();
    }//GEN-LAST:event_BIniciarSesionActionPerformed

    private void BSalirProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalirProgramaActionPerformed
        JOptionPane.showMessageDialog(null,"Saliendo del programa");
        System.exit(0);
    }//GEN-LAST:event_BSalirProgramaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaInicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BIniciarSesion;
    private javax.swing.JButton BSalirPrograma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextPane txtUsuario;
    // End of variables declaration//GEN-END:variables
}
