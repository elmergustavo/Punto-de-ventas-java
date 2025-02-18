/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import ModelClass.Usuario;
import Models.Cajas;
import Models.Usuarios;
import java.awt.Color;
import java.util.List;

/**
 *
 * @author AlexJPZ
 */
public class Login extends javax.swing.JFrame {

    Usuario usuario = new Usuario();

    public Login() {

        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        Label_Mensaje.setText("");
        TextField_Usuario.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Label_Usuario = new javax.swing.JLabel();
        TextField_Usuario = new javax.swing.JTextField();
        Label_Pass = new javax.swing.JLabel();
        PasswordField_Pass = new javax.swing.JPasswordField();
        Label_Mensaje = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Label_Usuario.setText("Usuario");

        TextField_Usuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TextField_Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextField_UsuarioKeyReleased(evt);
            }
        });

        Label_Pass.setText("Contraseña");

        PasswordField_Pass.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PasswordField_Pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PasswordField_PassKeyReleased(evt);
            }
        });

        Label_Mensaje.setForeground(new java.awt.Color(255, 51, 102));
        Label_Mensaje.setText("Mensaje");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextField_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addComponent(Label_Usuario)
                    .addComponent(Label_Mensaje)
                    .addComponent(Label_Pass)
                    .addComponent(PasswordField_Pass))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Label_Usuario)
                .addGap(3, 3, 3)
                .addComponent(TextField_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Label_Pass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordField_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Label_Mensaje)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Iniciar sesión");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondoB.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(271, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(329, 329, 329))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextField_UsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_UsuarioKeyReleased
        if (TextField_Usuario.getText().equals("")) {
            Label_Usuario.setForeground(new Color(102, 102, 102));
        } else {
            Label_Usuario.setText("Usuario");
            Label_Usuario.setForeground(new Color(0, 153, 51));
        }
        Label_Mensaje.setText("");
    }//GEN-LAST:event_TextField_UsuarioKeyReleased

    private void PasswordField_PassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordField_PassKeyReleased
        String pass = new String(PasswordField_Pass.getPassword());
        if (pass.equals("")) {
            Label_Pass.setForeground(new Color(102, 102, 102));
        } else {
            Label_Pass.setText("Contraseña");
            Label_Pass.setForeground(new Color(0, 153, 51));
        }
        Label_Mensaje.setText("");
    }//GEN-LAST:event_PasswordField_PassKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        iniciarSesion();
    }//GEN-LAST:event_jButton1ActionPerformed
    private void iniciarSesion() {
        if (TextField_Usuario.getText().equals("")) {
            Label_Usuario.setText("Ingrese el usuario");
            Label_Usuario.setForeground(Color.RED);
            TextField_Usuario.requestFocus();
        } else {
            String pass = new String(PasswordField_Pass.getPassword());
            if (pass.equals("")) {
                Label_Pass.setText("Ingrese la contraseña");
                Label_Pass.setForeground(Color.RED);
                PasswordField_Pass.requestFocus();
            } else {
                Object[] objects = usuario.login(TextField_Usuario.getText(), pass);
                List<Usuarios> listUsuario = (List<Usuarios>) objects[0];
                List<Cajas> listCaja = (List<Cajas>) objects[1];
                if (0 < listUsuario.size()) {
                    if (listUsuario.get(0).getRole().equals("Admin")) {
                        Sistema sisten = new Sistema(listUsuario, listCaja);
                        sisten.setVisible(true);
                        sisten.setExtendedState(MAXIMIZED_BOTH);
                        this.setVisible(false);
                    } else {
                        if (0 < listCaja.size()) {
                            Sistema sisten = new Sistema(listUsuario, listCaja);
                            sisten.setVisible(true);
                            sisten.setExtendedState(MAXIMIZED_BOTH);
                            this.setVisible(false);
                        } else {
                            Label_Mensaje.setText("No hay cajas disponibles");
                        }
                    }
                } else {
                    Label_Mensaje.setText("Usuario o Contraseña incorrecta");
                }
            }
        }
    }

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Mensaje;
    private javax.swing.JLabel Label_Pass;
    private javax.swing.JLabel Label_Usuario;
    private javax.swing.JPasswordField PasswordField_Pass;
    private javax.swing.JTextField TextField_Usuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
