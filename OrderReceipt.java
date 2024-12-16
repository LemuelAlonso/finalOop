import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.imageio.ImageIO;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;

public class OrderReceipt extends javax.swing.JFrame {

   
    public OrderReceipt() {
    initComponents();
        setUndecorated(true);
        setBuyerNameAndEmailFromFile("C:\\Users\\lemuel\\OneDrive\\Documents\\NetBeansProjects\\mavenproject5\\src\\main\\java\\new 4.txt", 
                                      "C:\\Users\\lemuel\\OneDrive\\Documents\\NetBeansProjects\\mavenproject5\\src\\main\\java\\new 1.txt");
        setCurrentDateTime();
        setDeliveryAddressFromFile("C:\\Users\\lemuel\\OneDrive\\Documents\\NetBeansProjects\\mavenproject5\\src\\main\\java\\orderReceipt5.txt");
        setStoreName();
        setStoreAddress();
        loadTableData("C:\\Users\\lemuel\\OneDrive\\Documents\\NetBeansProjects\\mavenproject5\\src\\main\\java\\new 3.txt");
        
        Savebtn.addActionListener(evt -> {
            saveReceiptAsImage();
            navigateToCartPage();
        });
    
    }
    private void setStoreAddress(){
    storeAddressField.setText("University of Cebu Main campus");
    storeAddressField.setEditable(false);
    }
    private void setStoreName() {
    storeNameField.setText("CAFECRACK"); // Set the store name
    storeNameField.setEditable(false); // Make the field non-editable
}
    private void setDeliveryAddressFromFile(String filePath) {
    String deliveryAddress = readDeliveryAddressFromFile(filePath);
    if (deliveryAddress != null && !deliveryAddress.isEmpty()) {
        deliveryField.setText(deliveryAddress);
    } else {
        deliveryField.setText("No delivery address found."); // Fallback if no address is found
    }
    deliveryField.setEditable(false); // Make the field non-editable
}
     public void setBuyerName(String buyerName) {
        buyerNameField.setText(buyerName);
        buyerNameField.setEditable(false);
        setEmailFromFile("C:\\Users\\lemuel\\OneDrive\\Documents\\NetBeansProjects\\mavenproject5\\src\\main\\java\\new 1.txt", buyerName);
    }
     private String readDeliveryAddressFromFile(String filePath) {
    StringBuilder address = new StringBuilder();
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        String line;
        if ((line = reader.readLine()) != null) {
            address.append(line); // Read the first line as the delivery address
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return address.toString();
}
 private void setCurrentDateTime() {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();
        // Format the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        // Set the formatted date and time in the timeField
        timeField.setText(formattedDateTime);
        timeField.setEditable(false); // Make the field non-editable
    }
  private void setBuyerNameAndEmailFromFile(String usernameFilePath, String emailFilePath) {
        String buyerName = readUsernameFromFile(usernameFilePath);
        if (buyerName != null && !buyerName.isEmpty()) {
            buyerNameField.setText(buyerName);
            buyerNameField.setEditable(false);
            setEmailFromFile(emailFilePath, buyerName);
        } else {
            buyerNameField.setText("Unknown Buyer");
            emailField.setText("Email not found");
        }
    }
   private String readUsernameFromFile(String filePath) {
        StringBuilder username = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            if ((line = reader.readLine()) != null) {
                username.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return username.toString();
    }
private void setEmailFromFile(String filePath, String buyerName) {
    String email = readEmailFromFile(filePath, buyerName);
    if (email != null && !email.isEmpty()) {
        emailField.setText(email);
    } else {
        emailField.setText("Email not found");
    }
    emailField.setEditable(false);
}

private String readEmailFromFile(String filePath, String buyerName) {
    String email = null;
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(","); // Split by comma
            if (parts.length >= 4 && parts[0].trim().equalsIgnoreCase(buyerName)) { // Check against username
                email = parts[2].trim(); // Assuming the email is the third part
                break; // Exit the loop once the email is found
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return email;
}




    private void loadTableData(String filePath) {
    DefaultTableModel model = new DefaultTableModel(new String[]{"Name", "Quantity", "Price"}, 0);
    double subtotal = 0.0; // Initialize subtotal

    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(","); // Assuming the data is comma-separated
            if (parts.length == 3) {
                model.addRow(parts); // Add the row to the table model
                // Calculate subtotal
                double price = Double.parseDouble(parts[2]); // Assuming price is in the third column
                int quantity = Integer.parseInt(parts[1]); // Assuming quantity is in the second column
                subtotal += price * quantity; // Update subtotal
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    jTable1.setModel(model);
    jTable1.setDefaultEditor(Object.class, null); // Make the table non-editable

    // Center the text in the table columns
    centerTableText();

    // Calculate VAT and total
    double vat = subtotal * 0.12; // 12% VAT
    double total = subtotal + vat; // Total including VAT

    // Set total in totalField
    TotalField.setText("Php " + String.format("%.2f", total)); // Set total in totalField
    TotalField.setEditable(false); // Make totalField non-editable
    }
    private void centerTableText() {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }
  private void saveReceiptAsImage() {
    try {
        // Create a BufferedImage with the same dimensions as the JFrame
        BufferedImage bufferedImage = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_ARGB);
        
        // Get the Graphics object from the BufferedImage
        Graphics g = bufferedImage.createGraphics();
        
        // Paint the JFrame into the BufferedImage (this renders the whole window)
        this.paint(g);
        
        // Dispose of the Graphics object
        g.dispose();
        
        // Define the output file path (you can change this to your preferred location)
        File file = new File("C:\\Users\\lemuel\\Downloads\\OrderReceipt.png");  // Save as PNG
        
        // Write the image to the file
        ImageIO.write(bufferedImage, "PNG", file);
        
        // Notify the user that the image has been saved
        JOptionPane.showMessageDialog(this, "Receipt saved as an image to " + file.getAbsolutePath());
        
        // Clear the specified file after saving the receipt
        clearFile("C:\\Users\\lemuel\\OneDrive\\Documents\\NetBeansProjects\\mavenproject5\\src\\main\\java\\new 2.txt");
        
        // Write order details to a file
        writeOrderDetailsToFile("C:\\Users\\lemuel\\OneDrive\\Documents\\NetBeansProjects\\mavenproject5\\src\\main\\java\\new 8.txt");
        
        // Navigate back to CartPage
        navigateToCartPage();
        
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error saving receipt: " + e.getMessage());
    }
}

private void writeOrderDetailsToFile(String filePath) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) { // Append mode
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        
        for (int i = 0; i < model.getRowCount(); i++) {
            String itemName = model.getValueAt(i, 0).toString(); // Item name
            String quantity = model.getValueAt(i, 1).toString(); // Quantity
            String price = model.getValueAt(i, 2).toString(); // Price
            
            // Write the details to the file
            writer.write(itemName + "," + quantity + "," + formattedDateTime + "," + price);
            writer.newLine(); // Write a new line after each entry
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error writing order details: " + e.getMessage());
    }
}

    private void navigateToCartPage() {
    this.dispose(); // Close the current window
    CartPage cartPage = new CartPage();
    
    // Clear the items in the CartPage table
    cartPage.clearCartAndFile(); // Call the method to clear the cart items
    
    // Pass the purchased items to CartPage if needed
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
   
    
    // Pass the purchased items to CartPage if needed
    cartPage.setVisible(true); // Open the CartPage
}

private void clearFile(String filePath) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
        // Writing an empty string to clear the file
        writer.write("");
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error clearing file: " + e.getMessage());
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        storeAddressField = new javax.swing.JTextField();
        storeNameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        buyerNameField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        timeField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        deliveryField = new javax.swing.JTextField();
        panel1 = new java.awt.Panel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panel2 = new java.awt.Panel();
        panel3 = new java.awt.Panel();
        jLabel10 = new javax.swing.JLabel();
        TotalField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Savebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel1.setText("ORDER RECEIPT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, 30));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel2.setText("Purchased From:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel3.setText("Order Summary:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel4.setText("Store Address:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        storeAddressField.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        storeAddressField.setBorder(null);
        storeAddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeAddressFieldActionPerformed(evt);
            }
        });
        getContentPane().add(storeAddressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 270, 30));

        storeNameField.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        storeNameField.setBorder(null);
        getContentPane().add(storeNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 270, 30));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel5.setText("Buyer Email:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        buyerNameField.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        buyerNameField.setBorder(null);
        getContentPane().add(buyerNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 240, 30));

        jLabel6.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel6.setText("Order Time:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        emailField.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        emailField.setBorder(null);
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });
        getContentPane().add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 240, 30));

        jLabel7.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel7.setText("Delivery Address");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        timeField.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        timeField.setBorder(null);
        timeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeFieldActionPerformed(evt);
            }
        });
        getContentPane().add(timeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 240, 30));

        jLabel8.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel8.setText("Buyer Name:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        deliveryField.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        deliveryField.setBorder(null);
        deliveryField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveryFieldActionPerformed(evt);
            }
        });
        getContentPane().add(deliveryField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 240, 30));

        panel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 760, 10));

        jLabel9.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel9.setText("Purchased By:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Quantity", "Price"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTable1.setShowGrid(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 760, 190));

        panel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 760, 10));

        panel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 760, 10));

        jLabel10.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel10.setText("Order Total:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 513, -1, 30));

        TotalField.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        TotalField.setBorder(null);
        TotalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalFieldActionPerformed(evt);
            }
        });
        getContentPane().add(TotalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 510, 110, 30));

        jLabel11.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel11.setText("THANK YOU!");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, 170, 30));

        Savebtn.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        Savebtn.setText("Save");
        Savebtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(Savebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 70, 30));

        setSize(new java.awt.Dimension(816, 614));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void storeAddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeAddressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_storeAddressFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void timeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeFieldActionPerformed

    private void deliveryFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveryFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deliveryFieldActionPerformed

    private void TotalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalFieldActionPerformed

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderReceipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Savebtn;
    private javax.swing.JTextField TotalField;
    private javax.swing.JTextField buyerNameField;
    private javax.swing.JTextField deliveryField;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private javax.swing.JTextField storeAddressField;
    private javax.swing.JTextField storeNameField;
    private javax.swing.JTextField timeField;
    // End of variables declaration//GEN-END:variables
}
