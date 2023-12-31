/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Figuras;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        btnCirculo = new javax.swing.JButton();
        btnCuadrado = new javax.swing.JButton();
        btnTriangulo = new javax.swing.JButton();
        btnRectangulo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCirculo.setText("Círculo");
        btnCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCirculoActionPerformed(evt);
            }
        });

        btnCuadrado.setText("Cuadrado");
        btnCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuadradoActionPerformed(evt);
            }
        });

        btnTriangulo.setText("Triángulo Rectángulo");
        btnTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrianguloActionPerformed(evt);
            }
        });

        btnRectangulo.setText("Rectángulo");
        btnRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRectanguloActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCirculo)
                    .addComponent(btnTriangulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCuadrado)
                    .addComponent(btnRectangulo))
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(159, 159, 159))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCirculo)
                    .addComponent(btnCuadrado))
                .addGap(44, 44, 44)
                .addComponent(btnSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRectangulo)
                    .addComponent(btnTriangulo))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCirculoActionPerformed
        // TODO add your handling code here:
        int radio;
        double area, perimetro;
        
        radio = 2;
        area = Math.PI*Math.pow(radio, 2);
        perimetro = 2*Math.PI*radio;
        
        JOptionPane.showMessageDialog(this, "El área del círculo es = "+area+"\nEl perímetro del círculo es = "+perimetro);
    }//GEN-LAST:event_btnCirculoActionPerformed

    private void btnCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuadradoActionPerformed
        // TODO add your handling code here:
        int lado;
        double area, perimetro;
        
        lado = 3;
        area = lado*lado;
        perimetro = 4*lado;
        
        JOptionPane.showMessageDialog(this, "El área del cuadrado es = "+area+"\nEl perímetro del cuadrado es = "+perimetro);
    }//GEN-LAST:event_btnCuadradoActionPerformed

    private void btnRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRectanguloActionPerformed
        // TODO add your handling code here:
        int base, altura;
        double area, perimetro;
        
        base = 1;
        altura = 2;
        area = base*altura;
        perimetro = (2*base)+(2*altura);
        
        JOptionPane.showMessageDialog(this, "El área del rectángulo es = "+area+"\nEl perímetro del rectángulo es = "+perimetro);
    }//GEN-LAST:event_btnRectanguloActionPerformed

    private void btnTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrianguloActionPerformed
        // TODO add your handling code here:
        int base, altura;
        double area, perimetro, hipotenusa;
        String tipo;
        
        base = 3;
        altura = 5;
        area = base*altura/2;
        hipotenusa= Math.pow(base*base+altura*altura, 0.5);
        perimetro = base+altura+hipotenusa;
        if ((base == altura) && (base == hipotenusa) && (altura == hipotenusa)) {
            tipo = "Es un triángulo equilátero";
        }
        else if ((base != altura) && (base != hipotenusa) && (altura != hipotenusa)) {
            tipo = "Es un triángulo escaleno";
        }
        else {
            tipo = "Es un triángulo isósceles";
        }
        
        JOptionPane.showMessageDialog(this, "El área del triángulo es = "+area+"\nEl perímetro del triángulo es = "+perimetro+"\n"+tipo);
    }//GEN-LAST:event_btnTrianguloActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
    private javax.swing.JButton btnCirculo;
    private javax.swing.JButton btnCuadrado;
    private javax.swing.JButton btnRectangulo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTriangulo;
    // End of variables declaration//GEN-END:variables
}
