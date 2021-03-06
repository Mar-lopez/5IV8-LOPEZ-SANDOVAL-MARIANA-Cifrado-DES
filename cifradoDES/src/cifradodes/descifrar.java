/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifradodes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import java.io.*;
import javax.crypto.*;
import javax.crypto.spec.*; //generar las llaves del cifrado
import java.security.*; //trae las instancias del tipo de cifrado
import java.security.spec.InvalidKeySpecException;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import static jdk.nashorn.internal.objects.ArrayBufferView.buffer;

/**
 *
 * @author crist
 */
public class descifrar extends javax.swing.JFrame {

    /**
     * Creates new form descifrar
     */
    public descifrar() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        llave = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Descifrado DES");

        jButton1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 0));
        jButton1.setText("CIFRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        jLabel1.setText("Ingresa 8 car??cteres:");

        llave.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        jLabel2.setText("Elija el texto a descifrar:");

        txt.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        txt.setText("...");
        txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel3.setText("DESCIFRADO DES");

        direccion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt)
                                .addGap(62, 62, 62))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(llave, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(374, 374, 374))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(llave, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt))
                .addGap(18, 18, 18)
                .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cifrado ci=new cifrado();
        ci.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActionPerformed
        // TODO add your handling code here:
        while(llave.getText().length()==8){
            JFileChooser fc=new JFileChooser();
            
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            
            FileNameExtensionFilter filtro=new FileNameExtensionFilter("*.TXT", "txt");
            
            fc.setFileFilter(filtro);

            int seleccion=fc.showOpenDialog(this);

            if(seleccion == JFileChooser.APPROVE_OPTION){
                
                File fichero=fc.getSelectedFile();

                direccion.setText(fichero.getAbsolutePath());
                try(FileReader fr=new FileReader(fichero)){
                    String cadena="";
                    int valor=fr.read();
                    while(valor != -1){
                        cadena=cadena+(char) valor;
                        valor=fr.read();
                    }
                    
                    //descifrado
                    String clave=llave.getText();
                    SecretKeyFactory skf=SecretKeyFactory.getInstance("DES");
                    DESKeySpec kspec=new DESKeySpec(clave.getBytes());
                    SecretKey ks=skf.generateSecret(kspec);
                    
                    Cipher cifrado=Cipher.getInstance("DES/ECB/PKCS5Padding");
                    
                    cifrado.init(Cipher.DECRYPT_MODE, ks);
                    
                    byte[] buffer=new byte[1000];
                    
                    byte[] bufferPlano; //aqui voy a almacenar el resultado descifrado
        
                    FileInputStream in=new FileInputStream(fichero);

                    FileOutputStream out=new FileOutputStream(fichero+".descifrado.txt");

                    int bytesleidos=in.read(buffer, 0, 1000);
                    while(bytesleidos != -1){
                        //mientras no se llegue al final del archivo o fichero
                        bufferPlano=cifrado.update(buffer, 0, bytesleidos);
                        //para el texto claro leer y enviarlo al buffer cifrado
                        out.write(bufferPlano);
                        //escribir el archivo
                        bytesleidos=in.read(buffer, 0, 1000);
                    }
                    //acompletar el fichero o archivo con el cifrado
                    bufferPlano=cifrado.doFinal();
                    out.write(bufferPlano); //escribir el final del texto cifrado si lo hay

                    in.close();
                    out.close();
                    
                    JOptionPane.showMessageDialog(null, "El archivo descifrado se cre?? con exito");
                    llave.setText("");
                    
                }catch (FileNotFoundException ex) {
                    Logger.getLogger(cifrado.class.getName()).log(Level.SEVERE, null, ex);
                }catch (IOException ex) {
                    Logger.getLogger(cifrado.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(cifrado.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NoSuchPaddingException ex) {
                    Logger.getLogger(cifrado.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvalidKeyException ex) {
                    Logger.getLogger(cifrado.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvalidKeySpecException ex) {
                    Logger.getLogger(cifrado.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalBlockSizeException ex) {
                    Logger.getLogger(cifrado.class.getName()).log(Level.SEVERE, null, ex);
                } catch (BadPaddingException ex) {
                    Logger.getLogger(cifrado.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }JOptionPane.showMessageDialog(null, "La clave debe de ser de 8 caracteres para continuar");
    }//GEN-LAST:event_txtActionPerformed

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
            java.util.logging.Logger.getLogger(descifrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(descifrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(descifrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(descifrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new descifrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField direccion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField llave;
    private javax.swing.JButton txt;
    // End of variables declaration//GEN-END:variables
}
