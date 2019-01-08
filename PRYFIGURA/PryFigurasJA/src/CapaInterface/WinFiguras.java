
package CapaInterface;


public class WinFiguras extends javax.swing.JFrame {

    
    public WinFiguras() {
        initComponents();
        PnlTriangulo.setVisible(false);
        PnlCuadrilatero.setVisible(false);
        PnlCirculo.setVisible(false);
        PnlCuadrilatero.setVisible(false);
        PnlCalculos.setVisible(false);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlTriangulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        PnlCirculo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        PnlCuadrilatero = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        PnlCalculos = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        PnlPologono = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        MnuFiguras = new javax.swing.JMenuBar();
        MnuTriangulo = new javax.swing.JMenu();
        MnuItemAreaTriangulo = new javax.swing.JMenuItem();
        MnuItemPerimTriangulo = new javax.swing.JMenuItem();
        MnuCuadrilatero = new javax.swing.JMenu();
        MnuItemAreaCuadrilatrero = new javax.swing.JMenuItem();
        MnuItemPerimCuadrilatero = new javax.swing.JMenuItem();
        MnuCirculo = new javax.swing.JMenu();
        MnuItemAreaCirculo = new javax.swing.JMenuItem();
        MnuItemPerimCirculo = new javax.swing.JMenuItem();
        MnuPoligono = new javax.swing.JMenu();
        MnuItemAreaPoligono = new javax.swing.JMenuItem();
        MnuItemPerimPoligono = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnlTriangulo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "TRIANGULO"));

        jLabel1.setText("LADO1:");

        jLabel2.setText("LADO2:");

        jLabel3.setText("LADO3:");

        jButton1.setText("RETORNAR");

        javax.swing.GroupLayout PnlTrianguloLayout = new javax.swing.GroupLayout(PnlTriangulo);
        PnlTriangulo.setLayout(PnlTrianguloLayout);
        PnlTrianguloLayout.setHorizontalGroup(
            PnlTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTrianguloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlTrianguloLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(63, 63, 63)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlTrianguloLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(63, 63, 63)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlTrianguloLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(63, 63, 63)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlTrianguloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        PnlTrianguloLayout.setVerticalGroup(
            PnlTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTrianguloLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PnlTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(PnlTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        PnlCirculo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "CIIRCULO"));

        jLabel6.setText("RADIO:");

        jButton3.setText("RETORNAR");

        javax.swing.GroupLayout PnlCirculoLayout = new javax.swing.GroupLayout(PnlCirculo);
        PnlCirculo.setLayout(PnlCirculoLayout);
        PnlCirculoLayout.setHorizontalGroup(
            PnlCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCirculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(63, 63, 63)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlCirculoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(20, 20, 20))
        );
        PnlCirculoLayout.setVerticalGroup(
            PnlCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCirculoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PnlCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        PnlCuadrilatero.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "CUADRILATERO"));

        jButton2.setText("RETORNAR");

        jLabel4.setText("LADO1:");

        jLabel5.setText("LADO2:");

        javax.swing.GroupLayout PnlCuadrilateroLayout = new javax.swing.GroupLayout(PnlCuadrilatero);
        PnlCuadrilatero.setLayout(PnlCuadrilateroLayout);
        PnlCuadrilateroLayout.setHorizontalGroup(
            PnlCuadrilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCuadrilateroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlCuadrilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlCuadrilateroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(PnlCuadrilateroLayout.createSequentialGroup()
                        .addGroup(PnlCuadrilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(61, 61, 61)
                        .addGroup(PnlCuadrilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(jTextField5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PnlCuadrilateroLayout.setVerticalGroup(
            PnlCuadrilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlCuadrilateroLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(PnlCuadrilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(PnlCuadrilateroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap())
        );

        PnlCalculos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "CALCULOS"));

        jButton5.setText("RETORNAR");

        jLabel9.setText("PERIMETRO :");

        javax.swing.GroupLayout PnlCalculosLayout = new javax.swing.GroupLayout(PnlCalculos);
        PnlCalculos.setLayout(PnlCalculosLayout);
        PnlCalculosLayout.setHorizontalGroup(
            PnlCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlCalculosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(22, 22, 22))
            .addGroup(PnlCalculosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addGap(81, 81, 81)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        PnlCalculosLayout.setVerticalGroup(
            PnlCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlCalculosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(PnlCalculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );

        PnlPologono.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "POLIGONO"));

        jButton4.setText("RETORNAR");

        jLabel7.setText("NUM.LADOS:");

        jLabel8.setText("LADO:");

        javax.swing.GroupLayout PnlPologonoLayout = new javax.swing.GroupLayout(PnlPologono);
        PnlPologono.setLayout(PnlPologonoLayout);
        PnlPologonoLayout.setHorizontalGroup(
            PnlPologonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlPologonoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(27, 27, 27))
            .addGroup(PnlPologonoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlPologonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(57, 57, 57)
                .addGroup(PnlPologonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(jTextField7))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        PnlPologonoLayout.setVerticalGroup(
            PnlPologonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlPologonoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PnlPologonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PnlPologonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlPologonoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(PnlPologonoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );

        MnuFiguras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MnuFigurasMouseClicked(evt);
            }
        });

        MnuTriangulo.setText("Triangulo");
        MnuTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuTrianguloActionPerformed(evt);
            }
        });

        MnuItemAreaTriangulo.setText("Area");
        MnuTriangulo.add(MnuItemAreaTriangulo);

        MnuItemPerimTriangulo.setText("Perimetro");
        MnuTriangulo.add(MnuItemPerimTriangulo);

        MnuFiguras.add(MnuTriangulo);

        MnuCuadrilatero.setText("Cuadrilatero");

        MnuItemAreaCuadrilatrero.setText("Area");
        MnuCuadrilatero.add(MnuItemAreaCuadrilatrero);

        MnuItemPerimCuadrilatero.setText("Perimetro");
        MnuCuadrilatero.add(MnuItemPerimCuadrilatero);

        MnuFiguras.add(MnuCuadrilatero);

        MnuCirculo.setText("Circulo");

        MnuItemAreaCirculo.setText("Area");
        MnuCirculo.add(MnuItemAreaCirculo);

        MnuItemPerimCirculo.setText("Perimetro");
        MnuCirculo.add(MnuItemPerimCirculo);

        MnuFiguras.add(MnuCirculo);

        MnuPoligono.setText("Poligono");

        MnuItemAreaPoligono.setText("Area");
        MnuPoligono.add(MnuItemAreaPoligono);

        MnuItemPerimPoligono.setText("Perimetro");
        MnuPoligono.add(MnuItemPerimPoligono);

        MnuFiguras.add(MnuPoligono);

        setJMenuBar(MnuFiguras);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PnlCirculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PnlTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PnlCuadrilatero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PnlPologono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(PnlCalculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PnlTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlCuadrilatero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PnlPologono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PnlCirculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(73, 73, 73)
                .addComponent(PnlCalculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(844, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MnuTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuTrianguloActionPerformed
            PnlTriangulo.setVisible(true);
            PnlCuadrilatero.setVisible(false);
            PnlCirculo.setVisible(false);
            PnlCuadrilatero.setVisible(false);
            PnlCalculos.setVisible(false);
            
            
            

    }//GEN-LAST:event_MnuTrianguloActionPerformed

    private void MnuFigurasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MnuFigurasMouseClicked
       
    }//GEN-LAST:event_MnuFigurasMouseClicked

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
            java.util.logging.Logger.getLogger(WinFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinFiguras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MnuCirculo;
    private javax.swing.JMenu MnuCuadrilatero;
    private javax.swing.JMenuBar MnuFiguras;
    private javax.swing.JMenuItem MnuItemAreaCirculo;
    private javax.swing.JMenuItem MnuItemAreaCuadrilatrero;
    private javax.swing.JMenuItem MnuItemAreaPoligono;
    private javax.swing.JMenuItem MnuItemAreaTriangulo;
    private javax.swing.JMenuItem MnuItemPerimCirculo;
    private javax.swing.JMenuItem MnuItemPerimCuadrilatero;
    private javax.swing.JMenuItem MnuItemPerimPoligono;
    private javax.swing.JMenuItem MnuItemPerimTriangulo;
    private javax.swing.JMenu MnuPoligono;
    private javax.swing.JMenu MnuTriangulo;
    private javax.swing.JPanel PnlCalculos;
    private javax.swing.JPanel PnlCirculo;
    private javax.swing.JPanel PnlCuadrilatero;
    private javax.swing.JPanel PnlPologono;
    private javax.swing.JPanel PnlTriangulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
