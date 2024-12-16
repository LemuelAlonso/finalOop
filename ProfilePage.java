import javax.swing.*;
import java.io.*;
public class ProfilePage extends javax.swing.JFrame {

    public ProfilePage() {
        initComponents();
        loadUserProfile();
        setFieldsNonEditable();
        setUndecorated(true);
        
       UsernameText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        UsernameText = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        logoutBtn = new javax.swing.JButton();
        fullNameField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        jLabel7 = new javax.swing.JLabel();
        panel3 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        usernameField1 = new javax.swing.JTextField();
        panel4 = new java.awt.Panel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(255, 153, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\lemuel\\Downloads\\profile.jpg")); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0), 2));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 110));

        panel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, 110));

        UsernameText.setBorder(null);
        UsernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTextActionPerformed(evt);
            }
        });
        panel1.add(UsernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 130, 30));

        usernameField.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        usernameField.setBorder(null);
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        panel1.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 230, 30));

        emailField.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        emailField.setBorder(null);
        panel1.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 230, 30));

        passwordField.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        passwordField.setBorder(null);
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        panel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 230, 30));

        logoutBtn.setBackground(new java.awt.Color(255, 0, 0));
        logoutBtn.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        logoutBtn.setText("LOG OUT");
        logoutBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        panel1.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 310, 30));

        fullNameField.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        fullNameField.setBorder(null);
        fullNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameFieldActionPerformed(evt);
            }
        });
        panel1.add(fullNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 230, 30));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel1.setText("Fullname:");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel4.setText("Username:");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel6.setText("Email:");
        panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        panel2.setBackground(new java.awt.Color(42, 20, 14));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PROFILE");
        panel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        panel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 40));

        panel3.setBackground(new java.awt.Color(102, 51, 0));
        panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Accounts Details:");
        panel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 100, -1));

        panel1.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 380, 30));

        jLabel8.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel8.setText("Password:");
        panel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        usernameField1.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        usernameField1.setBorder(null);
        usernameField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameField1ActionPerformed(evt);
            }
        });
        panel1.add(usernameField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 230, 30));

        panel4.setBackground(new java.awt.Color(102, 51, 0));
        panel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("About Me");
        panel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 60, -1));

        panel1.add(panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 380, 30));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 560));

        setSize(new java.awt.Dimension(374, 561));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void loadUserProfile() {
    String username = readUsernameFromFile("C:\\Users\\lemuel\\OneDrive\\Documents\\NetBeansProjects\\mavenproject5\\src\\main\\java\\new 4.txt");
    if (username != null) {
        UsernameText.setText(username); // Add username to UsernameText field
        String[] userDetails = readUserDetailsFromFile("C:\\Users\\lemuel\\OneDrive\\Documents\\NetBeansProjects\\mavenproject5\\src\\main\\java\\new 1.txt", username);
        if (userDetails != null) {
            fullNameField.setText(userDetails[0]); // Full name
            emailField.setText(userDetails[1]);    // Email
            passwordField.setText(userDetails[2]); // Password
        } else {
            JOptionPane.showMessageDialog(this, "User not found in the details file.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        // Fetch and set contact number
        
        
    } else {
        JOptionPane.showMessageDialog(this, "Username file is empty or not found.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
private String readContactNumberFromFile(String filePath) {
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        return reader.readLine(); // Assuming the file contains only the contact number
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error reading contact number file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        return null;
    }
}
    private String readUsernameFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            return reader.readLine();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error reading username file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    private String[] readUserDetailsFromFile(String filePath, String username) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userDetails = line.split(","); // username, fullname, email, password
                if (userDetails.length == 4 && userDetails[0].equals(username)) {
                    return new String[]{userDetails[1], userDetails[2], userDetails[3]};
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error reading user details file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    private void UsernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTextActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
    clearFile("C:\\Users\\lemuel\\OneDrive\\Documents\\NetBeansProjects\\mavenproject5\\src\\main\\java\\new 4.txt");
    clearFile("C:\\Users\\lemuel\\OneDrive\\Documents\\NetBeansProjects\\mavenproject5\\src\\main\\java\\new 3.txt");
   
    // Navigate back to the FirstPage
    new FirstPage().setVisible(true);
    this.dispose(); // Close the current ProfilePage window
}

private void clearFile(String filePath) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
        writer.write(""); // Write an empty string to clear the file
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error clearing file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void fullNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameFieldActionPerformed

    private void usernameField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameField1ActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void setFieldsNonEditable() {
        usernameField.setEditable(false);
        fullNameField.setEditable(false);
        emailField.setEditable(false);
        passwordField.setEditable(false);
        UsernameText.setEditable(false);
       
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfilePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField UsernameText;
    private javax.swing.JTextField emailField;
    private javax.swing.JPasswordField fullNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutBtn;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.Panel panel4;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField usernameField;
    private javax.swing.JTextField usernameField1;
    // End of variables declaration//GEN-END:variables
}
