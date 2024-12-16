

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Checkout extends javax.swing.JFrame {

    
    public Checkout() {
        initComponents();
        setUndecorated(true);
        setResizable(false); 
        loadCartItems();
        centerTableText();
        calculateOrderTotal();
        
        contactNumberField.addKeyListener(new java.awt.event.KeyAdapter() {
        @Override
        public void keyTyped(java.awt.event.KeyEvent evt) {
            char c = evt.getKeyChar();
            if (!Character.isDigit(c) && c != java.awt.event.KeyEvent.VK_BACK_SPACE && c != java.awt.event.KeyEvent.VK_DELETE) {
                evt.consume(); // Ignore the input
                JOptionPane.showMessageDialog(null, "Please enter only numbers.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
        }
    });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        paymentMethodbtn = new javax.swing.JButton();
        paymentMethodField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        totalField = new javax.swing.JTextField();
        contactNumberField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        orderTotalField = new javax.swing.JTextField();
        completeOrderbtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel1.setText("Cart totals");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 110, 40));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel2.setText("Add delivery address:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 28, -1, 30));

        addressField.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        addressField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFieldActionPerformed(evt);
            }
        });
        getContentPane().add(addressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 380, 30));

        paymentMethodbtn.setBackground(new java.awt.Color(0, 255, 0));
        paymentMethodbtn.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        paymentMethodbtn.setText(" Click to Select Payment Method");
        paymentMethodbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paymentMethodbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentMethodbtnActionPerformed(evt);
            }
        });
        getContentPane().add(paymentMethodbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 380, 40));

        paymentMethodField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paymentMethodField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentMethodFieldActionPerformed(evt);
            }
        });
        getContentPane().add(paymentMethodField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 380, 30));

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item", "Quantity", "Price"
            }
        ));
        jTable1.setRowHeight(35);
        jTable1.setShowGrid(false);
        jTable1.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 380, 160));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel3.setText("Subtotal:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 110, 40));

        totalField.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        totalField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        totalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalFieldActionPerformed(evt);
            }
        });
        getContentPane().add(totalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 140, 30));

        contactNumberField.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        contactNumberField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contactNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNumberFieldActionPerformed(evt);
            }
        });
        getContentPane().add(contactNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 380, 30));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel5.setText("Order Total:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 90, 40));

        orderTotalField.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        orderTotalField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(orderTotalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, 140, 30));

        completeOrderbtn.setBackground(new java.awt.Color(51, 255, 0));
        completeOrderbtn.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        completeOrderbtn.setText("Complete Order");
        completeOrderbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        completeOrderbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeOrderbtnActionPerformed(evt);
            }
        });
        getContentPane().add(completeOrderbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 380, 40));

        jLabel7.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel7.setText("Vat value:");
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 90, 30));

        jLabel8.setText("12%");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, 30, 30));

        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel6.setText(" Add Contact No.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 98, -1, 30));

        setSize(new java.awt.Dimension(418, 708));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loadCartItems() {
        String filePath = "C:\\Users\\lemuel\\OneDrive\\Documents\\NetBeansProjects\\mavenproject5\\src\\main\\java\\new 3.txt";
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        // Clear existing rows
        model.setRowCount(0);
        
        double total = 0.0; // Initialize total

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] stringData = line.split(","); // Assuming the file is comma-separated
                
                // Check if the line has enough data
                if (stringData.length < 3) {
                    System.out.println("Skipping line due to insufficient data: " + line);
                    continue; // Skip this line
                }
                
                // Create an Object array to hold the data
                Object[] rowData = new Object[3];
                
                // Set the data
                rowData[0] = stringData[0]; // Name
                rowData[1] = stringData[2]; // Quantity
                
                // Clean the price string and parse it
                String priceString = stringData[1].replaceAll("[^\\d.]", ""); // Remove non-numeric characters
                rowData[2] = priceString; // Store the cleaned price string
                
                // Add the row to the table model
                model.addRow(rowData);
                
                // Calculate total
                total += Double.parseDouble(priceString) * Integer.parseInt(stringData[2]); // Price * Quantity
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Set the total in the totalField with "Php" prefix
        totalField.setText("Php " + String.format("%.2f", total));
        totalField.setEditable(false); // Make totalField non-editable
    }
     
    private void calculateOrderTotal() {
        // Get the subtotal from the totalField
        String totalText = totalField.getText().replace("Php ", "").trim();
        double subtotal = Double.parseDouble(totalText);

        // Fixed shipping fee
      

        // Calculate VAT (12% of subtotal)
        double vat = subtotal * 0.12;

        // Calculate order total
        double orderTotal = subtotal +  vat;

        // Set the order total in the orderTotalField with "Php" prefix
        orderTotalField.setText("Php " + String.format("%.2f", orderTotal));
        orderTotalField.setEditable(false); // Make orderTotalField non-editable
    }

     private void centerTableText() {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }
    
    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFieldActionPerformed

    private void paymentMethodbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentMethodbtnActionPerformed
 // Show payment method selection dialog
        String[] options = {"COD", "Gcash"};
        int choice = JOptionPane.showOptionDialog(this, 
                "Select Payment Method", 
                "Payment Method", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                options, 
                options[0]);

        // Set the selected payment method in the paymentMethodField
        if (choice >= 0) {
            paymentMethodField.setText(options[choice]);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_paymentMethodbtnActionPerformed

    private void paymentMethodFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentMethodFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentMethodFieldActionPerformed

    private void totalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalFieldActionPerformed

    private void contactNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNumberFieldActionPerformed

    private void completeOrderbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeOrderbtnActionPerformed
    // Check if the addressField is empty
    if (addressField.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a delivery address.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method if the address is empty
    }

    // Check if the paymentMethodField is empty
    if (paymentMethodField.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select a payment method.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method if the payment method is empty
    }

    // Check if the contactNumberField is empty
    if (contactNumberField.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a contact number.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method if the contact number is empty
    }

    // Write the delivery address to the file
    String deliveryAddress = addressField.getText().trim();
    writeDeliveryAddressToFile("C:\\Users\\lemuel\\OneDrive\\Documents\\NetBeansProjects\\mavenproject5\\src\\main\\java\\orderReceipt5.txt", deliveryAddress);

    // Write the cart items to the new path
    writeCartItemsToFile("C:\\Users\\lemuel\\OneDrive\\Documents\\NetBeansProjects\\mavenproject5\\src\\main\\java\\new 3.txt");

    // Write the contact number to the file
    String contactNumber = contactNumberField.getText().trim();
    writeContactNumberToFile("C:\\Users\\lemuel\\OneDrive\\Documents\\NetBeansProjects\\mavenproject5\\src\\main\\java\\new 9.txt", contactNumber);

    // Read the buyer's name from the file
    String buyerName = readBuyerNameFromFile("C:\\Users\\lemuel\\OneDrive\\Documents\\NetBeansProjects\\mavenproject5\\src\\main\\java\\new 4.txt");
    
    // Create an instance of OrderReceipt and set the buyer's name
    OrderReceipt orderReceipt = new OrderReceipt();
    orderReceipt.setBuyerName(buyerName); // Set the buyer's name in the OrderReceipt
    orderReceipt.setVisible(true); // Show the OrderReceipt

    // Check if Gcash is selected as payment method
    if ("Gcash".equals(paymentMethodField.getText().trim())) {
        // Proceed to GcashPage
        GcashPage gcashPage = new GcashPage();
        gcashPage.setVisible(true); // Show the GcashPage
    }

    this.dispose(); // Close the Checkout window

}
    private void writeContactNumberToFile(String filePath, String contactNumber) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
        writer.write(contactNumber); // Write the contact number to the file
    } catch (IOException e) {
        e.printStackTrace();
    }
}
private void writeCartItemsToFile(String filePath) {
      try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < model.getColumnCount(); j++) {
                line.append(model.getValueAt(i, j));
                if (j < model.getColumnCount() - 1) {
                    line.append(","); // Add comma between values
                }
            }
            writer.write(line.toString());
            writer.newLine(); // Write a new line after each row
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
private void writeDeliveryAddressToFile(String filePath, String address) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
        writer.write(address); // Write the address to the file
    } catch (IOException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_completeOrderbtnActionPerformed

    private String readBuyerNameFromFile(String filePath) {
    StringBuilder buyerName = new StringBuilder();
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        String line;
        if ((line = reader.readLine()) != null) {
            buyerName.append(line); // Read the first line as the buyer's name
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return buyerName.toString();
}
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JButton completeOrderbtn;
    private javax.swing.JTextField contactNumberField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField orderTotalField;
    private javax.swing.JTextField paymentMethodField;
    private javax.swing.JButton paymentMethodbtn;
    private javax.swing.JTextField totalField;
    // End of variables declaration//GEN-END:variables
}
