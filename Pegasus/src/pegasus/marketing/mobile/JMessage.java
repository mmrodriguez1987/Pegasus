package pegasus.marketing.mobile;

/**
 *
 * @author Analyst
 */
public class JMessage extends javax.swing.JFrame {

    public JMessage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelIzquierdo = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        rbtnConDominio = new javax.swing.JRadioButton();
        rbtnSinDominio = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        rbtnLocCalifornia = new javax.swing.JRadioButton();
        rbtnLocMiami = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cmbDealers = new javax.swing.JComboBox();
        panelDerecho = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(1, 2, 4, 4));

        panelIzquierdo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel4.setLayout(new java.awt.GridLayout(1, 2));

        rbtnConDominio.setSelected(true);
        rbtnConDominio.setText("With Domain");
        rbtnConDominio.setToolTipText("");
        rbtnConDominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnConDominioActionPerformed(evt);
            }
        });
        jPanel4.add(rbtnConDominio);

        rbtnSinDominio.setText("Without Domain");
        rbtnSinDominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSinDominioActionPerformed(evt);
            }
        });
        jPanel4.add(rbtnSinDominio);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Location", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel5.setLayout(new java.awt.GridLayout(1, 2));

        rbtnLocCalifornia.setSelected(true);
        rbtnLocCalifornia.setText("California");
        rbtnLocCalifornia.setToolTipText("");
        rbtnLocCalifornia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnLocCaliforniarbtnCaliforniaActionPerformed(evt);
            }
        });
        jPanel5.add(rbtnLocCalifornia);

        rbtnLocMiami.setText("Miami");
        rbtnLocMiami.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnLocMiamirbtnMiamiActionPerformed(evt);
            }
        });
        jPanel5.add(rbtnLocMiami);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Location", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel6.setLayout(new java.awt.GridLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Dealer Name:");
        jPanel6.add(jLabel7);

        cmbDealers.setMinimumSize(new java.awt.Dimension(30, 20));
        cmbDealers.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDealersItemDealerChanged(evt);
            }
        });
        jPanel6.add(cmbDealers);

        javax.swing.GroupLayout panelIzquierdoLayout = new javax.swing.GroupLayout(panelIzquierdo);
        panelIzquierdo.setLayout(panelIzquierdoLayout);
        panelIzquierdoLayout.setHorizontalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelIzquierdoLayout.setVerticalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(panelIzquierdo);

        panelDerecho.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout panelDerechoLayout = new javax.swing.GroupLayout(panelDerecho);
        panelDerecho.setLayout(panelDerechoLayout);
        panelDerechoLayout.setHorizontalGroup(
            panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );
        panelDerechoLayout.setVerticalGroup(
            panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        jPanel1.add(panelDerecho);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnConDominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnConDominioActionPerformed
          
    }//GEN-LAST:event_rbtnConDominioActionPerformed

    private void rbtnSinDominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSinDominioActionPerformed
             
    }//GEN-LAST:event_rbtnSinDominioActionPerformed

    private void rbtnLocCaliforniarbtnCaliforniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnLocCaliforniarbtnCaliforniaActionPerformed
       
    }//GEN-LAST:event_rbtnLocCaliforniarbtnCaliforniaActionPerformed

    private void rbtnLocMiamirbtnMiamiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnLocMiamirbtnMiamiActionPerformed
        
    }//GEN-LAST:event_rbtnLocMiamirbtnMiamiActionPerformed

    private void cmbDealersItemDealerChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDealersItemDealerChanged
       
    }//GEN-LAST:event_cmbDealersItemDealerChanged

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbDealers;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel panelDerecho;
    private javax.swing.JPanel panelIzquierdo;
    private javax.swing.JRadioButton rbtnConDominio;
    private javax.swing.JRadioButton rbtnLocCalifornia;
    private javax.swing.JRadioButton rbtnLocMiami;
    private javax.swing.JRadioButton rbtnSinDominio;
    // End of variables declaration//GEN-END:variables
}
