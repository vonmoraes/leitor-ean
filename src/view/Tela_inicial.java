/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author morae
 */
public class Tela_inicial extends javax.swing.JFrame {
    
    final JFileChooser fc = new JFileChooser(); // Escolher arquivo
    BufferedImage imagem = null;
    BufferedImage imagem_cinza = null;

    /**
     * Creates new form Tela_inicial
     */
    public Tela_inicial() {
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

        img_Barcode = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_AbrirImagem = new javax.swing.JButton();
        btn_EscalaCinza = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Leitor de Código de Barras");
        setName("tela_inicial"); // NOI18N

        img_Barcode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_Barcode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ean13ico.png"))); // NOI18N

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LEITOR CÓDIGO DE BARRAS EAN-13");

        btn_AbrirImagem.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        btn_AbrirImagem.setText("ABRIR IMAGEM");
        btn_AbrirImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AbrirImagemActionPerformed(evt);
            }
        });

        btn_EscalaCinza.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        btn_EscalaCinza.setText("TONS DE CINZA");
        btn_EscalaCinza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EscalaCinzaActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jButton3.setText("LIMIARIZAR");

        jButton4.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jButton4.setText("LER COD. BARRAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_AbrirImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btn_EscalaCinza, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_AbrirImagem)
                    .addComponent(btn_EscalaCinza)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(img_Barcode, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(img_Barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   /** TODO: TALVEZ NAO POSSA DIMENSIONAR A IMAGEM PARA PODER FAZER OS CALCULOS!
     * btn_Abrir_Imagem
     * @param evt 
     */
    private void btn_AbrirImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AbrirImagemActionPerformed
        // Escolher imagem do computador com filechooser
        int abrir_arquivo = fc.showOpenDialog(this);
        if(abrir_arquivo == JFileChooser.APPROVE_OPTION){
            File arquivo_imagem_escolhida = fc.getSelectedFile();
            try{
                imagem = ImageIO.read(arquivo_imagem_escolhida);
            } catch (IOException ex) {
                Logger.getLogger(Tela_inicial.class.getName()).log(Level.SEVERE, null, ex);
            }
            int width = imagem.getWidth();
            int height = imagem.getHeight();
            Image imagem_dimensionada = imagem.getScaledInstance(img_Barcode.getWidth(), img_Barcode.getHeight(),
            Image.SCALE_SMOOTH);
            ImageIcon imagem_icone = new ImageIcon(imagem_dimensionada);
            // Alterar imagem do barcode
            img_Barcode.setIcon(imagem_icone);
            System.out.println("Imagem :" + width + "x" + height +";");
        }
    }//GEN-LAST:event_btn_AbrirImagemActionPerformed

    private void btn_EscalaCinzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EscalaCinzaActionPerformed
        int width = imagem.getWidth();
        int height = imagem.getHeight();
        imagem_cinza = imagem;
        // CALCULAR DIRETAMENTE NA MATRIZ DOS PIXELS 
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                int pixel = imagem_cinza.getRGB(x, y);
                // NOTA A OPERACAO >> E PARA COLOCAR NA POSICAO DO BIT CERTO
                int alpha = (pixel >> 24) & 0xff; // A
                int red = (pixel >> 16) & 0xff; // R
                int green = (pixel >> 8) & 0xff; // G
                int blue = pixel & 0xff; // B
                /**
                 * O Calculo RGB para escala de cinza 
                 * media = (R+G+B)/3
                 * O novo valor do pixel sera o valor da media
                 * exemplo: R = 100, G = 150, B = 200
                 *          media = (100+150+200)/3 = 150
                 * logo os novos valores sao R=G=B=150 no pixel
                 */
                int media = (red + green + blue)/3;
                // Coloca os valores de volta no pixel
                pixel = (alpha << 24) | (media << 16) | (media << 8) | media;
                imagem_cinza.setRGB(x, y, pixel);
            }// x
        }// y
        Image imagem_dimensionada = imagem_cinza.getScaledInstance(img_Barcode.getWidth(), 
                img_Barcode.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imagem_icone = new ImageIcon(imagem_dimensionada);
        // Alterar imagem do barcode
        img_Barcode.setIcon(imagem_icone);
    }//GEN-LAST:event_btn_EscalaCinzaActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AbrirImagem;
    private javax.swing.JButton btn_EscalaCinza;
    private javax.swing.JLabel img_Barcode;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}