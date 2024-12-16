import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class PurchasedHistoryPage extends javax.swing.JFrame {

    
    public PurchasedHistoryPage() {
        initComponents();
        setUndecorated(true);
        loadPurchasedHistory();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Historytable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(51, 0, 0));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TRANSACTION HISTORY");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 320, 40));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\lemuel\\OneDrive\\Documents\\NetBeansProjects\\mavenproject5\\src\\main\\java\\whiteArrow (2).png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 60));

        Historytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ITEM", "QUANTITY", "DATE & TIME", "PRICE"
            }
        ));
        Historytable.setRowHeight(40);
        Historytable.setShowGrid(true);
        jScrollPane1.setViewportView(Historytable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1210, 540));

        setSize(new java.awt.Dimension(1216, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    CartPage cart = new CartPage(); // Create an instance of CartPage
    cart.setVisible(true);          // Show the CartPage
    this.dispose();                 // Close the current PurchasedHistoryPage
        
    }//GEN-LAST:event_jButton1ActionPerformed
private void loadPurchasedHistory() {
    String filePath = "C:\\Users\\lemuel\\OneDrive\\Documents\\NetBeansProjects\\mavenproject5\\src\\main\\java\\new 8.txt";
    DefaultTableModel model = (DefaultTableModel) Historytable.getModel();

    // Clear existing rows
    model.setRowCount(0);

    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = reader.readLine()) != null) {
            // Split the line using the comma delimiter
            String[] parts = line.split(",", 4); // Limit to 4 parts (Item, Quantity, DateTime, Price)

            if (parts.length == 4) { // Ensure all parts are present
                String item = parts[0].trim(); // First part is the item name
                String quantity = parts[1].trim(); // Second part is the quantity
                String dateTime = parts[2].trim(); // Third part is the date and time
                String price = parts[3].trim(); // Fourth part is the price

                // Add a new row to the table
                model.addRow(new Object[]{item, quantity, dateTime, price});
            } else {
                System.out.println("Skipping line: " + line); // Debugging output for invalid lines
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error loading purchase history: " + e.getMessage());
    }
}
    
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PurchasedHistoryPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Historytable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
