import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Seemore2 extends javax.swing.JFrame {


    public Seemore2() {
        initComponents();
        setUndecorated(true);
        setPlaceholder(commenttext2, "Add comment");
        commentBoard.setEditable(false);
        loadCommentsFromFile("C:\\Users\\lemuel\\OneDrive\\Documents\\NetBeansProjects\\mavenproject5\\src\\main\\java\\new 7.txt");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jPanel11 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        commentBoard = new javax.swing.JTextPane();
        commenttext2 = new javax.swing.JTextField();
        addcomment2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setPreferredSize(new java.awt.Dimension(270, 270));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(0, 0, 0,80));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Php 280.00");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 120, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\lemuel\\Downloads\\Untitled design (3).png")); // NOI18N
        jPanel11.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 240));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("\n  Short Description:\n\n The Apple Crisp Oatmilk Macchiato is a \n seasonal Starbucks drink combining espresso,\n steamed oat milk, and spiced apple drizzle,\n offering a cozy fall flavor with hints of apple\n and brown sugar.\n\n \n  Common Ingredients:\n\n-Espresso\n\n -Oat milk:Creamy oatmilk\n\n -Syrups:Apple brown sugar syrup.\n\n -Drizzle:Spiced apple drizzle.\n\n -Ice.\n");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        commentBoard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(commentBoard);

        commenttext2.setToolTipText("");
        commenttext2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        commenttext2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commenttext2ActionPerformed(evt);
            }
        });

        addcomment2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        addcomment2.setText("Add");
        addcomment2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        addcomment2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcomment2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(commenttext2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addcomment2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(commenttext2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addcomment2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 700));

        setSize(new java.awt.Dimension(734, 708));
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
                    textField.setText(placeholder);}
            }
        });
    }

  
    private void commenttext2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commenttext2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commenttext2ActionPerformed

    private void addcomment2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcomment2ActionPerformed
        String loggedInUsername = getLoggedInUsernameFromFile("C:\\Users\\lemuel\\OneDrive\\Documents\\NetBeansProjects\\mavenproject5\\src\\main\\java\\new 4.txt");
        System.out.println("Current username: " + loggedInUsername);

        if (loggedInUsername == null || loggedInUsername.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No user is currently logged in!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Get the comment from the text field
        String userComment = commenttext2.getText();

        // Check if the comment is not empty
        if (!userComment.trim().isEmpty() && !userComment.equals("Add comment")) {
            // Format the output
            String output = loggedInUsername + ": " + userComment + "\n";

            // Append the comment to the JTextPane
            commentBoard.setText(commentBoard.getText() + output);

            // Clear the text field
            commenttext2.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Comment cannot be empty!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_addcomment2ActionPerformed
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
    
     private void loadCommentsFromFile(String filePath) {
        StringBuilder comments = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                comments.append(line).append("\n"); // Append each line to the comments
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading comments from file.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        commentBoard.setText(comments.toString()); // Set the loaded comments to the JTextPane
    }
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seemore2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addcomment2;
    private javax.swing.JTextPane commentBoard;
    private javax.swing.JTextField commenttext2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
