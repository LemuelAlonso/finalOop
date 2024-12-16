import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

class Seemore1 extends javax.swing.JFrame {

    
    public Seemore1() {
        initComponents();
        setUndecorated(true);
        setPlaceholder(commenttext1, "Add comment");
        commentBoard.setEditable(false);
         loadCommentsFromFile("C:\\Users\\lemuel\\OneDrive\\Documents\\NetBeansProjects\\mavenproject5\\src\\main\\java\\new 6.txt");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        commentBoard = new javax.swing.JTextPane();
        commenttext1 = new javax.swing.JTextField();
        addcomment1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(204, 204, 204));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(270, 270));
        jPanel1.setMinimumSize(new java.awt.Dimension(270, 270));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102,80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Php 260.00");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 130, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\lemuel\\Downloads\\pumpkincreamcoldbrew1.png")); // NOI18N
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 260));

        panel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 260, 250));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("\n  Short Description:\n\n Pumpkin Cream Cold Brew is a seasonal Starbucks\n drink available in fall, featuring cold brew coffee\n topped with creamy pumpkin foam and warm spices.\n\n   Common Ingredients:\n\n  -Cold brew coffee.           -Milk.\n  -Pumpkin.                        -Heavy cream.\n  -Creamy topping.            -Sugar.\n  -Vanilla syrup.                 -Ice.\n");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 370, 260));

        commentBoard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(commentBoard);

        panel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 610, 220));

        commenttext1.setToolTipText("");
        commenttext1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        commenttext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commenttext1ActionPerformed(evt);
            }
        });
        panel1.add(commenttext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 612, 530, 40));

        addcomment1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        addcomment1.setText("Add");
        addcomment1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        addcomment1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcomment1ActionPerformed(evt);
            }
        });
        panel1.add(addcomment1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 610, 70, 40));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 700));

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
        if (!userComment.trim().isEmpty() && !userComment.equals("Add comment")) {
            // Format the output
            String output = loggedInUsername + ": " + userComment + "\n";

            // Append the comment to the JTextPane
            commentBoard.setText(commentBoard.getText() + output);

            // Store the comment in the specified file
            storeCommentInFile("C:\\Users\\lemuel\\OneDrive\\Documents\\NetBeansProjects\\mavenproject5\\src\\main\\java\\new 6.txt", output);

            // Clear the text field
            commenttext1.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Comment cannot be empty!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_addcomment1ActionPerformed
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
   private void storeCommentInFile(String filePath, String comment) {
        try (FileWriter writer = new FileWriter(filePath, true)) { // true for append mode
            writer.write(comment); // Write the comment to the file
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving comment to file.", "Error", JOptionPane.ERROR_MESSAGE);
        }
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
                new Seemore1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addcomment1;
    private javax.swing.JTextPane commentBoard;
    private javax.swing.JTextField commenttext1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
