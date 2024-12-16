
import java.awt.Color;//
import java.awt.event.FocusAdapter;//
import java.awt.event.FocusEvent;//
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class SbSeemore1 extends javax.swing.JFrame {

    private String currentUsername;
    
    
      public void setCurrentUser (String username) {
        this.currentUsername = username;
    }

    
    public SbSeemore1() {
        initComponents();
        setUndecorated(true);
        setPlaceholder(commenttext1, "Add comment");
        CommentBoard.setEditable(false); 
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        panil = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        CommentBoard = new javax.swing.JTextPane();
        commenttext1 = new javax.swing.JTextField();
        addcomment1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(204, 204, 204));

        panil.setMaximumSize(new java.awt.Dimension(270, 270));
        panil.setMinimumSize(new java.awt.Dimension(270, 270));
        panil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setMaximumSize(new java.awt.Dimension(270, 270));
        jPanel2.setMinimumSize(new java.awt.Dimension(270, 270));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 102, 102,80));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Php 260.00");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 130, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\lemuel\\Downloads\\pumpkincreamcoldbrew1.png")); // NOI18N
        jLabel2.setToolTipText("");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 260));

        panil.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, -1));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("\n  Short Description:\n\n Pumpkin Cream Cold Brew is a seasonal Starbucks\n drink available in fall, featuring cold brew coffee\n topped with creamy pumpkin foam and warm spices.\n\n   Common Ingredients:\n\n  -Cold brew coffee.           -Milk.\n  -Pumpkin.                        -Heavy cream.\n  -Creamy topping.            -Sugar.\n  -Vanilla syrup.                 -Ice.\n");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        CommentBoard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(CommentBoard);

        commenttext1.setToolTipText("");
        commenttext1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        commenttext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commenttext1ActionPerformed(evt);
            }
        });

        addcomment1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        addcomment1.setText("Add");
        addcomment1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        addcomment1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcomment1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(panil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(commenttext1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addcomment1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(commenttext1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addcomment1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 700));

        setSize(new java.awt.Dimension(716, 708));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
     private void setPlaceholder(final javax.swing.JTextField textField, final String placeholder) {
        textField.setForeground(Color.GRAY);
        textField.setText(placeholder);

        textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setForeground(Color.GRAY);
                    textField.setText(placeholder);
                }
            }
        });
    }
    private void commenttext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commenttext1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commenttext1ActionPerformed

    private void addcomment1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcomment1ActionPerformed
                                           
    String loggedInUsername = getLoggedInUsernameFromFile("C:\\Users\\lemuel\\OneDrive\\Documents\\NetBeansProjects\\mavenproject5\\src\\main\\java\\new 4.txt");
        System.out.println("Current username: " + loggedInUsername);

        if (loggedInUsername == null || loggedInUsername.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No user is currently logged in!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Get the comment from the text field
        String userComment = commenttext1.getText();

        // Check if the comment is not empty
        if (!userComment.trim().isEmpty()) {
            // Format the output
            String output = loggedInUsername + ": " + userComment + "\n";

            // Append the comment to the JTextPane
            CommentBoard.setText(CommentBoard.getText() + output);

            // Clear the text field
            commenttext1.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Comment cannot be empty!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
}
// Method to retrieve the logged-in username from the file
  private String getLoggedInUsernameFromFile(String filePath) {
        String loggedInUsername = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Loop through the file to find the logged-in username
            if ((line = reader.readLine()) != null) {
                // Assuming the first line contains the username
                loggedInUsername = line.trim();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return loggedInUsername;
    }

// Dummy method to check if a user is logged in
// Replace this with actual logic to validate the logged-in user
private boolean isUserLoggedIn(String username) {
    // Compare with the username of the logged-in user (implement your logic here)
    return SessionManager.getLoggedInUsername().equals(username);
    }//GEN-LAST:event_addcomment1ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SbSeemore1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane CommentBoard;
    private javax.swing.JButton addcomment1;
    private javax.swing.JTextField commenttext1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private java.awt.Panel panel1;
    private javax.swing.JPanel panil;
    // End of variables declaration//GEN-END:variables

    private static class SessionManager {

        private static Object getLoggedInUsername() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public SessionManager() {
        }
    }
}
