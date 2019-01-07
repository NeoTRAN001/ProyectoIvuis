
package cifradoivuis;

import AppPackage.AnimationClass;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import java.util.StringTokenizer;
/**
 *
 * @author Neo
 */
public class Principal extends javax.swing.JFrame {
    
    private String textUser, keyPublic;
    
    public Principal() {
        initComponents();
    }
    
    private String cryptoKey(String keyP) {
        StringBuilder builder=new StringBuilder(keyP);
        String reverseText = builder.reverse().toString();
        return reverseText;
    }
    
    private void animationAddress(String address, int start, int end, JScrollPane name) {
        JScrollPane scroll;
        AnimationClass contentAnimation = new AnimationClass();
        scroll = name;
        switch(address) {
            case "UP":
                contentAnimation.jTextAreaYUp(start, end, 10, 5, scroll); 
                break;
            case "LEFT":
                contentAnimation.jTextAreaXLeft(start, end, 10, 5, scroll); 
                break;
            case "RIGHT": 
                contentAnimation.jTextAreaXRight(start, end, 10, 5, scroll); 
                break;
            case "DOWN":
                contentAnimation.jTextAreaYDown(start, end, 10, 5, scroll);
                break;
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jspResult = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaResultado = new javax.swing.JTextArea();
        lblCerrar = new javax.swing.JLabel();
        jspDictionary = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        lblAtras = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaDictionary = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaTexto = new javax.swing.JTextArea();
        txtPublicKey = new javax.swing.JTextField();
        txtNumberKey = new javax.swing.JTextField();
        btnDescifrar = new javax.swing.JButton();
        btnCifrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblSave = new javax.swing.JLabel();
        lblOpen = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNumericanBase = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jspResult.setBackground(new java.awt.Color(51, 51, 51));
        jspResult.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Potra Light", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Texto Final");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, -1));

        txtAreaResultado.setBackground(new java.awt.Color(65, 65, 65));
        txtAreaResultado.setColumns(20);
        txtAreaResultado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtAreaResultado.setForeground(new java.awt.Color(204, 204, 204));
        txtAreaResultado.setLineWrap(true);
        txtAreaResultado.setRows(5);
        txtAreaResultado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setViewportView(txtAreaResultado);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 620, -1));

        lblCerrar.setFont(new java.awt.Font("Potra Light", 1, 24)); // NOI18N
        lblCerrar.setForeground(new java.awt.Color(204, 204, 204));
        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        lblCerrar.setText("Cerrar");
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });
        jPanel2.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jspResult.setViewportView(jPanel2);

        jPanel1.add(jspResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -300, 650, 250));
        jspResult.getAccessibleContext().setAccessibleName("");

        jspDictionary.setBackground(new java.awt.Color(51, 51, 51));
        jspDictionary.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAtras.setFont(new java.awt.Font("Potra Light", 1, 24)); // NOI18N
        lblAtras.setForeground(new java.awt.Color(204, 204, 204));
        lblAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/izquierda.png"))); // NOI18N
        lblAtras.setText("Diccionario");
        lblAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAtrasMouseClicked(evt);
            }
        });
        jPanel3.add(lblAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jScrollPane3.setBorder(null);

        txtAreaDictionary.setEditable(false);
        txtAreaDictionary.setBackground(new java.awt.Color(51, 51, 51));
        txtAreaDictionary.setColumns(20);
        txtAreaDictionary.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtAreaDictionary.setForeground(new java.awt.Color(204, 204, 204));
        txtAreaDictionary.setLineWrap(true);
        txtAreaDictionary.setRows(3);
        jScrollPane3.setViewportView(txtAreaDictionary);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 280, 150));

        jspDictionary.setViewportView(jPanel3);

        jPanel1.add(jspDictionary, new org.netbeans.lib.awtextra.AbsoluteConstraints(-300, 260, 290, 210));

        txtAreaTexto.setBackground(new java.awt.Color(65, 65, 65));
        txtAreaTexto.setColumns(20);
        txtAreaTexto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtAreaTexto.setForeground(new java.awt.Color(204, 204, 204));
        txtAreaTexto.setLineWrap(true);
        txtAreaTexto.setRows(5);
        txtAreaTexto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(txtAreaTexto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 620, -1));

        txtPublicKey.setBackground(new java.awt.Color(65, 65, 65));
        txtPublicKey.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPublicKey.setForeground(new java.awt.Color(204, 204, 204));
        txtPublicKey.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtPublicKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 440, 40));

        txtNumberKey.setBackground(new java.awt.Color(65, 65, 65));
        txtNumberKey.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNumberKey.setForeground(new java.awt.Color(204, 204, 204));
        txtNumberKey.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtNumberKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 150, 40));

        btnDescifrar.setBackground(new java.awt.Color(65, 65, 65));
        btnDescifrar.setFont(new java.awt.Font("Potra Light", 1, 36)); // NOI18N
        btnDescifrar.setForeground(new java.awt.Color(204, 204, 204));
        btnDescifrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/codigo-de-seguridad.png"))); // NOI18N
        btnDescifrar.setText("Descifrar");
        btnDescifrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDescifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescifrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnDescifrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 260, -1));

        btnCifrar.setBackground(new java.awt.Color(65, 65, 65));
        btnCifrar.setFont(new java.awt.Font("Potra Light", 1, 36)); // NOI18N
        btnCifrar.setForeground(new java.awt.Color(204, 204, 204));
        btnCifrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escudo.png"))); // NOI18N
        btnCifrar.setText("Cifrar");
        btnCifrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCifrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCifrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 260, -1));

        jLabel1.setFont(new java.awt.Font("Philophobia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Team Wasp");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        jLabel3.setFont(new java.awt.Font("Potra Light", 1, 64)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Ivuis");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Potra Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reportar.png"))); // NOI18N
        jLabel4.setText("Text");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Potra Light", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clave.png"))); // NOI18N
        jLabel5.setText("Public Key");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        lblSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/disco-flexible.png"))); // NOI18N
        lblSave.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSaveMouseClicked(evt);
            }
        });
        jPanel1.add(lblSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, -1));

        lblOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carpeta.png"))); // NOI18N
        lblOpen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblOpen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOpenMouseClicked(evt);
            }
        });
        jPanel1.add(lblOpen, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Potra Light", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/digital.png"))); // NOI18N
        jLabel6.setText("Numerican base");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        txtNumericanBase.setBackground(new java.awt.Color(65, 65, 65));
        txtNumericanBase.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNumericanBase.setForeground(new java.awt.Color(204, 204, 204));
        txtNumericanBase.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtNumericanBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 150, 40));

        jLabel7.setFont(new java.awt.Font("Potra Light", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clave.png"))); // NOI18N
        jLabel7.setText("Number Key");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        lblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lista.png"))); // NOI18N
        lblMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });
        jPanel1.add(lblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCifrarActionPerformed
        animationAddress("DOWN", -300, 0, jspResult);
        animationAddress("RIGHT", -300, 0, jspDictionary);
        
        crearDiccionario diccionario = new crearDiccionario();
        
        String text = txtAreaTexto.getText();
        String privateKey = txtNumberKey.getText();
        int numericanBase = Integer.parseInt(txtNumericanBase.getText());
        
        String dictionary = diccionario.generarDiccionario(Integer.parseInt(privateKey), numericanBase);
        String publicKey = diccionario.publicKey;
        String result = diccionario.crearCifrado(text);
        
        txtAreaDictionary.setText(dictionary);
        txtPublicKey.setText(cryptoKey(publicKey));
        txtAreaResultado.setText(result);
    }//GEN-LAST:event_btnCifrarActionPerformed

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        animationAddress("UP", 0, -300, jspResult);
        animationAddress("LEFT", 0, -300, jspDictionary);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseClicked
        animationAddress("LEFT", 0, -300, jspDictionary);
    }//GEN-LAST:event_lblAtrasMouseClicked

    private void btnDescifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescifrarActionPerformed
        animationAddress("DOWN", -300, 0, jspResult);
        
        crearDiccionario diccionario = new crearDiccionario();
        
        String text = txtAreaTexto.getText();
        keyPublic = txtPublicKey.getText();
        int numericanBase = Integer.parseInt(txtNumericanBase.getText());
        
        textUser = diccionario.descifrar(text, cryptoKey(keyPublic), numericanBase);
        
        txtPublicKey.setText(keyPublic);
        txtAreaResultado.setText(textUser);
    }//GEN-LAST:event_btnDescifrarActionPerformed

    private void lblSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveMouseClicked
        JFileChooser save = new JFileChooser();
        save.showSaveDialog(this);
        save.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        
        File fileUser = save.getSelectedFile();
        
        ManejoArchivo fileSave = new ManejoArchivo();
        try {
            fileSave.crearArchivo(txtAreaResultado.getText(), txtPublicKey.getText(), fileUser, Integer.parseInt(txtNumericanBase.getText()));
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblSaveMouseClicked

    private void lblOpenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpenMouseClicked
        JFileChooser save = new JFileChooser();
        save.showOpenDialog(this);
        
        String address = save.getSelectedFile().getAbsolutePath();
        ManejoArchivo open = new ManejoArchivo();
        
        try {
            String text = open.readFile(address);
            StringTokenizer tokens = new StringTokenizer(text," ");
            
            txtAreaTexto.setText(tokens.nextToken());
            txtPublicKey.setText(tokens.nextToken());
            txtNumericanBase.setText(tokens.nextToken());
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_lblOpenMouseClicked

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        animationAddress("DOWN", -300, 0, jspResult);
        animationAddress("RIGHT", -300, 0, jspDictionary);
    }//GEN-LAST:event_lblMenuMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCifrar;
    private javax.swing.JButton btnDescifrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jspDictionary;
    private javax.swing.JScrollPane jspResult;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblOpen;
    private javax.swing.JLabel lblSave;
    private javax.swing.JTextArea txtAreaDictionary;
    private javax.swing.JTextArea txtAreaResultado;
    private javax.swing.JTextArea txtAreaTexto;
    private javax.swing.JTextField txtNumberKey;
    private javax.swing.JTextField txtNumericanBase;
    private javax.swing.JTextField txtPublicKey;
    // End of variables declaration//GEN-END:variables
}
