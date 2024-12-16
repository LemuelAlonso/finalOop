
public class MainPage extends javax.swing.JFrame {

 
    public MainPage() {
        initComponents();
        setLocationRelativeTo(null); 
        System.out.println("MainPage initialized");
        setResizable(false);
        pack();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        DiscoverBtn = new javax.swing.JButton();
        cartBtn = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();
        Homebtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Page");
        setMinimumSize(new java.awt.Dimension(1301, 731));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51,80));

        DiscoverBtn.setBackground(new java.awt.Color(102, 102, 102,80));
        DiscoverBtn.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        DiscoverBtn.setForeground(new java.awt.Color(255, 255, 255));
        DiscoverBtn.setText("DISCOVER");
        DiscoverBtn.setBorder(null);
        DiscoverBtn.setBorderPainted(false);
        DiscoverBtn.setContentAreaFilled(false);
        DiscoverBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DiscoverBtn.setFocusPainted(false);
        DiscoverBtn.setFocusable(false);
        DiscoverBtn.setRequestFocusEnabled(false);
        DiscoverBtn.setVerifyInputWhenFocusTarget(false);
        DiscoverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiscoverBtnActionPerformed(evt);
            }
        });

        cartBtn.setBackground(new java.awt.Color(102, 102, 102,80));
        cartBtn.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        cartBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\lemuel\\Downloads\\icons8-cart-64 (1) (1).png")); // NOI18N
        cartBtn.setBorderPainted(false);
        cartBtn.setContentAreaFilled(false);
        cartBtn.setFocusPainted(false);
        cartBtn.setFocusable(false);
        cartBtn.setRequestFocusEnabled(false);
        cartBtn.setVerifyInputWhenFocusTarget(false);
        cartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartBtnActionPerformed(evt);
            }
        });

        profileBtn.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        profileBtn.setForeground(new java.awt.Color(255, 255, 255));
        profileBtn.setText("Profile");
        profileBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        profileBtn.setBorderPainted(false);
        profileBtn.setContentAreaFilled(false);
        profileBtn.setFocusPainted(false);
        profileBtn.setFocusable(false);
        profileBtn.setRequestFocusEnabled(false);
        profileBtn.setVerifyInputWhenFocusTarget(false);
        profileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileBtnActionPerformed(evt);
            }
        });

        Homebtn.setBackground(new java.awt.Color(102, 102, 102,80));
        Homebtn.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        Homebtn.setForeground(new java.awt.Color(255, 255, 255));
        Homebtn.setText("HOME");
        Homebtn.setBorder(null);
        Homebtn.setContentAreaFilled(false);
        Homebtn.setFocusPainted(false);
        Homebtn.setFocusable(false);
        Homebtn.setRequestFocusEnabled(false);
        Homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(444, Short.MAX_VALUE)
                .addComponent(Homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addComponent(DiscoverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176)
                .addComponent(cartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147)
                .addComponent(profileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DiscoverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(cartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1270, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\lemuel\\Downloads\\MainPageNewImage (150 x 106 px) (150 x 270 px).png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1300, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomebtnActionPerformed
        MainPage main = new MainPage();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomebtnActionPerformed

    private void DiscoverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiscoverBtnActionPerformed
        DiscoverPage discover = new DiscoverPage();
        discover.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_DiscoverBtnActionPerformed

    private void cartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartBtnActionPerformed
      CartPage cart = new CartPage();
      cart.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_cartBtnActionPerformed

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
    ProfilePage see = new ProfilePage();
    see.setLocationRelativeTo(this); // Center the new window relative to DiscoverPage
    see.setVisible(true); 
    }//GEN-LAST:event_profileBtnActionPerformed

 
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DiscoverBtn;
    private javax.swing.JButton Homebtn;
    private javax.swing.JButton cartBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton profileBtn;
    // End of variables declaration//GEN-END:variables
}
