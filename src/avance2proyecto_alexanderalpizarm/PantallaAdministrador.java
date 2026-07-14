package avance2proyecto_alexanderalpizarm;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PantallaAdministrador extends javax.swing.JFrame {

    public PantallaAdministrador() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        JDesactivarCajero = new javax.swing.JButton();
        BRegistrarNuevoCajero = new javax.swing.JButton();
        BModificarCajero = new javax.swing.JButton();
        JVolverCajeros = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMostrarCajeros = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        btnEntrarComoCajero = new javax.swing.JButton();
        BCambiarEstadoCajer = new javax.swing.JButton();
        BEliminarCajero = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Gestion de Cajeros");

        JDesactivarCajero.setText("Desactivar Cajero");
        JDesactivarCajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JDesactivarCajeroActionPerformed(evt);
            }
        });

        BRegistrarNuevoCajero.setText("Registrar Nuevo Cajero");
        BRegistrarNuevoCajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRegistrarNuevoCajeroActionPerformed(evt);
            }
        });

        BModificarCajero.setText("Modificar Cajero");
        BModificarCajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BModificarCajeroActionPerformed(evt);
            }
        });

        JVolverCajeros.setText("Cerrar Sesión");
        JVolverCajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JVolverCajerosActionPerformed(evt);
            }
        });

        txtMostrarCajeros.setColumns(20);
        txtMostrarCajeros.setRows(5);
        jScrollPane2.setViewportView(txtMostrarCajeros);

        jButton1.setText("Mostrar Cajeros");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnEntrarComoCajero.setText("Entrar como Cajero");
        btnEntrarComoCajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarComoCajeroActionPerformed(evt);
            }
        });

        BCambiarEstadoCajer.setText("Cambiar estado");
        BCambiarEstadoCajer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCambiarEstadoCajerActionPerformed(evt);
            }
        });

        BEliminarCajero.setText("EliminarCajero");
        BEliminarCajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEliminarCajeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(btnEntrarComoCajero))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BModificarCajero, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BRegistrarNuevoCajero, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BEliminarCajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JDesactivarCajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BCambiarEstadoCajer, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(540, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JVolverCajeros)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BModificarCajero)
                    .addComponent(BRegistrarNuevoCajero)
                    .addComponent(JDesactivarCajero)
                    .addComponent(BCambiarEstadoCajer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BEliminarCajero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEntrarComoCajero)
                .addGap(43, 43, 43)
                .addComponent(JVolverCajeros)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BRegistrarNuevoCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRegistrarNuevoCajeroActionPerformed
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cajero:");

        if (nombre == null || nombre.trim().isEmpty()){
            return;
        }

        String usuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario:");

        if (usuario == null || usuario.trim().isEmpty()){
            return;
        }

        String contrasena = JOptionPane.showInputDialog("Ingrese la contraseña:");

        if (contrasena == null || contrasena.trim().isEmpty()) {
            return;
        }

        ArchivosUsuarios archivo = new ArchivosUsuarios();
        ArrayList<Usuario> usuarios = archivo.leerUsuarios();

        //Verificar que el usuario no exista
        for (Usuario u : usuarios){
            if (u.getUsuario().equals(usuario)){
                JOptionPane.showMessageDialog(null,"Ese nombre de usuario ya existe.");
                return;
            }
        }

        int id = usuarios.size() + 1;

        Cajero nuevo = new Cajero(id, nombre, usuario, contrasena, true);

        usuarios.add(nuevo);
        ArchivosUsuarios.guardarUsuarios(usuarios);

        JOptionPane.showMessageDialog(null,"Cajero registrado correctamente.");
    }//GEN-LAST:event_BRegistrarNuevoCajeroActionPerformed

    private void BModificarCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BModificarCajeroActionPerformed
        ArchivosUsuarios archivo = new ArchivosUsuarios();

        ArrayList<Usuario> usuarios = archivo.leerUsuarios();

        String dato=JOptionPane.showInputDialog("Ingrese el ID del cajero:");

        if (dato == null || dato.trim().isEmpty()){
            return;
        }

        int id=Integer.parseInt(dato);

        boolean encontrado=false;

        for (Usuario usuario : usuarios){
            if (usuario instanceof Cajero && usuario.getId() == id){

                Cajero cajero = (Cajero) usuario;
                String nombre = JOptionPane.showInputDialog("Nuevo nombre:", cajero.getNombre());

                if (nombre == null){
                    return;
                }

                String usuarioNuevo = JOptionPane.showInputDialog("Nuevo usuario:", cajero.getUsuario());

                if (usuarioNuevo == null){
                    return;
                }

                String contrasena = JOptionPane.showInputDialog("Nueva contraseña:", cajero.getContrasena());

                if (contrasena == null){
                    return;
                }

                cajero.setNombre(nombre);
                cajero.setUsuario(usuarioNuevo);
                cajero.setContrasena(contrasena);
                ArchivosUsuarios.guardarUsuarios(usuarios);

                JOptionPane.showMessageDialog(null,"Cajero modificado correctamente.");
                encontrado = true;

                break;
            }
        }

        if (!encontrado){
            JOptionPane.showMessageDialog(null,"No existe un cajero con ese ID.");
        }
    }//GEN-LAST:event_BModificarCajeroActionPerformed

    private void JDesactivarCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JDesactivarCajeroActionPerformed
        ArchivosUsuarios archivo = new ArchivosUsuarios();

        ArrayList<Usuario> usuarios = archivo.leerUsuarios();

        String dato=JOptionPane.showInputDialog("Ingrese el ID del cajero:");

        if (dato == null || dato.trim().isEmpty()){
            return;
        }

        int id=Integer.parseInt(dato);

        boolean encontrado=false;

        for (Usuario usuario : usuarios){
            if (usuario instanceof Cajero && usuario.getId() == id){

                Cajero cajero = (Cajero) usuario;
                cajero.setActivo(false);

                ArchivosUsuarios.guardarUsuarios(usuarios);

                JOptionPane.showMessageDialog(null,"Cajero desactivado correctamente.");

                encontrado = true;
                break;
            }
        }

        if (!encontrado){
            JOptionPane.showMessageDialog(null,"No existe un cajero con ese ID.");
        }
    }//GEN-LAST:event_JDesactivarCajeroActionPerformed

    private void JVolverCajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JVolverCajerosActionPerformed
        PantallaInicioSesion pantalla = new PantallaInicioSesion();
        pantalla.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_JVolverCajerosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArchivosUsuarios archivo = new ArchivosUsuarios();

        ArrayList<Usuario> usuarios = archivo.leerUsuarios();

        txtMostrarCajeros.setText("");

        txtMostrarCajeros.append("ID\tNombre\tUsuario\tEstado\n");
        txtMostrarCajeros.append("------------------------------------------------------------\n");

        for (Usuario usuario : usuarios){

            if (usuario instanceof Cajero){

                Cajero cajero = (Cajero) usuario;

                String estado;

                if (cajero.isActivo()){
                    estado = "Activo";
                } 
                else{
                    estado = "Inactivo";
                }

                txtMostrarCajeros.append(cajero.getId() + "\t"
                        + cajero.getNombre() + "\t"
                        + cajero.getUsuario() + "\t"
                        + estado + "\n");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEntrarComoCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarComoCajeroActionPerformed
        Cajero administradorComoCajero = new Cajero(0,"Administrador","admin","123", true);
        PantallaPrincipalCajero pantalla = new PantallaPrincipalCajero(administradorComoCajero, null);
        pantalla.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEntrarComoCajeroActionPerformed

    private void BCambiarEstadoCajerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCambiarEstadoCajerActionPerformed
        ArchivosUsuarios archivo = new ArchivosUsuarios();
        ArrayList<Usuario> usuarios = archivo.leerUsuarios();

        String datoId = JOptionPane.showInputDialog("Ingrese el ID del cajero:");

        if (datoId == null || datoId.trim().isEmpty()){
            return;
        }

        try {

            int id = Integer.parseInt(datoId);

            Cajero cajeroEncontrado = null;

            for (Usuario usuario : usuarios){

                if (usuario instanceof Cajero && usuario.getId() == id){
                    cajeroEncontrado = (Cajero) usuario;
                    break;
                }
            }

            if (cajeroEncontrado == null) {
                JOptionPane.showMessageDialog(null, "No existe un cajero con ese ID.");
                return;
            }

            String estadoActual;

            if (cajeroEncontrado.isActivo()){
                estadoActual = "Activo";
            } 
            else{
                estadoActual = "Inactivo";
            }

            Object[] opciones ={
                "Activo",
                "Inactivo"
            };

            int opcion = JOptionPane.showOptionDialog(null, "Cajero: " + cajeroEncontrado.getNombre()
                    + "\nEstado actual: " + estadoActual
                    + "\nSeleccione el nuevo estado:",
                    "Cambiar estado del cajero",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,opciones, opciones[0]);

            if (opcion == 0){
                cajeroEncontrado.setActivo(true);
                ArchivosUsuarios.guardarUsuarios(usuarios);
                JOptionPane.showMessageDialog(null,"El cajero fue activado correctamente.");

            }
            else if (opcion == 1){
                cajeroEncontrado.setActivo(false);
                ArchivosUsuarios.guardarUsuarios(usuarios);
                JOptionPane.showMessageDialog(null,"El cajero fue desactivado correctamente.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Debe ingresar un ID válido.");
        }
    }//GEN-LAST:event_BCambiarEstadoCajerActionPerformed

    private void BEliminarCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarCajeroActionPerformed
        ArchivosUsuarios archivo = new ArchivosUsuarios();

        ArrayList<Usuario> usuarios = archivo.leerUsuarios();

        String datoId = JOptionPane.showInputDialog("Ingrese el ID del cajero que desea eliminar:");

        if (datoId == null || datoId.trim().isEmpty()){
            return;
        }

        try {

            int id = Integer.parseInt(datoId);

            Cajero cajeroEliminar = null;

            for (Usuario usuario : usuarios){
                if (usuario instanceof Cajero && usuario.getId() == id){
                    cajeroEliminar = (Cajero) usuario;
                    break;
                }
            }

            if (cajeroEliminar == null){
                JOptionPane.showMessageDialog(null,"No existe un cajero con ese ID.");
                return;
            }

            int opcion = JOptionPane.showConfirmDialog( null,"¿Desea eliminar al cajero?\n\n"
                    + "ID: " + cajeroEliminar.getId()
                    + "\nNombre: " + cajeroEliminar.getNombre(),
                    "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION){
                usuarios.remove(cajeroEliminar);
                ArchivosUsuarios.guardarUsuarios(usuarios);
                JOptionPane.showMessageDialog(null,"Cajero eliminado correctamente.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Debe ingresar un ID válido.");
        }
    }//GEN-LAST:event_BEliminarCajeroActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCambiarEstadoCajer;
    private javax.swing.JButton BEliminarCajero;
    private javax.swing.JButton BModificarCajero;
    private javax.swing.JButton BRegistrarNuevoCajero;
    private javax.swing.JButton JDesactivarCajero;
    private javax.swing.JButton JVolverCajeros;
    private javax.swing.JButton btnEntrarComoCajero;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea txtMostrarCajeros;
    // End of variables declaration//GEN-END:variables
}
