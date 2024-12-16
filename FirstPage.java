

import java.awt.event.WindowEvent;
import javax.swing.JFrame;


public class FirstPage extends javax.swing.JFrame {

   
    public FirstPage() {
        
        initComponents();
       setExtendedState(JFrame.MAXIMIZED_BOTH);
        // Disable the minimize button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
    }
    @Override
    protected void processWindowEvent(WindowEvent e) {
        if (e.getID() == WindowEvent.WINDOW_ICONIFIED) {
            // Prevent the window from being minimized
            return;
        }
        super.processWindowEvent(e);
    }


    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        Loginbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        RegisterBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(255, 255, 204));
        panel1.setLayout(null);

        Loginbtn.setBackground(new java.awt.Color(255, 255, 204));
        Loginbtn.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        Loginbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\lemuel\\Downloads\\loginicon (1).png")); // NOI18N
        Loginbtn.setText("Login");
        Loginbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginbtnActionPerformed(evt);
            }
        });
        panel1.add(Loginbtn);
        Loginbtn.setBounds(350, 152, 190, 60);

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel3.setText("WELCOME!");
        panel1.add(jLabel3);
        jLabel3.setBounds(45, 395, 142, 48);

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel4.setText("\nSince our opening, we have become masters of our craft.\n");
        panel1.add(jLabel4);
        jLabel4.setBounds(45, 474, 332, 30);

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel5.setText("\n our commitment to quality products, exceptional services ");
        panel1.add(jLabel5);
        jLabel5.setBounds(40, 502, 360, 30);

        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel6.setText(" and incomparable customer care keep our community ");
        panel1.add(jLabel6);
        jLabel6.setBounds(45, 562, 322, 32);

        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel7.setText("  coming back again and again.");
        panel1.add(jLabel7);
        jLabel7.setBounds(45, 600, 179, 32);

        RegisterBtn.setBackground(new java.awt.Color(255, 255, 204));
        RegisterBtn.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        RegisterBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\lemuel\\Downloads\\registericon.png")); // NOI18N
        RegisterBtn.setText("Register");
        RegisterBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        RegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBtnActionPerformed(evt);
            }
        });
        panel1.add(RegisterBtn);
        RegisterBtn.setBounds(148, 152, 190, 60);

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 0, 910, 730));

        jLabel1.setBackground(new java.awt.Color(255, 153, 0));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 660, 740));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\lemuel\\Downloads\\Premium Coffee Aesthetic Flyer (1) (2).png")); // NOI18N
        jLayeredPane1.add(jLabel10);
        jLabel10.setBounds(10, -20, 490, 750);

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 730));

        setSize(new java.awt.Dimension(1996, 1088));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginbtnActionPerformed
       Login login = new Login(this); // If the Login page extends JDialog, pass the parent frame
    login.setLocationRelativeTo(this); // Center the Login page relative to FirstPage
    login.setVisible(true);
    }//GEN-LAST:event_LoginbtnActionPerformed

    private void RegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBtnActionPerformed
  Register reg = new Register(this); // Pass the current frame if needed
    reg.setLocationRelativeTo(this);   // Center the Register window relative to FirstPage
    reg.setVisible(true); 
    }//GEN-LAST:event_RegisterBtnActionPerformed

   
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               FirstPage firstPage = new FirstPage();
               firstPage.setVisible(true);
                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Loginbtn;
    private javax.swing.JButton RegisterBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
