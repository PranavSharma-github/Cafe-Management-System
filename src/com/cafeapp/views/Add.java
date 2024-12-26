package com.cafeapp.views;

import com.cafeapp.model.MenuItems;
import com.cafeapp.views.Home;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pranav Sharma LMU ID:23048577
 */
public class Add extends javax.swing.JFrame {

    // Initialization of DefaultTableModel and LinkedList
    private DefaultTableModel tableModel;
    private LinkedList<MenuItems> menuList;

    /**
     * Creates new form Add
     */
    // COnstructor for the class
    public Add() {
        initComponents();
        menuList = new LinkedList();
        pnlfortbl.setVisible(false);
    }

    // This method checks weither the data entered is duplicate or not and returns true if it is duplicate and false if it is not duplicate
    private boolean checkDuplicateId(MenuItems menu) {
        for (MenuItems existingMenu : menuList) {
            if (existingMenu.getId() == menu.getId()) {
                return true;
            }
        }
        return false;
    }

    //This method acceps the object of the model class as parameter and adds the menu items to the Linked List named as menuList and adds the data to the row
    public void addMenuItems(MenuItems menu) {
        menuList.add(menu);
        DefaultTableModel model = (DefaultTableModel) tblview.getModel();
        Object[] data = new Object[]{
            menu.getId(), menu.getName(), menu.getCategory(),
            menu.getPrice(), menu.getDescription(), menu.getCalories()
        };
        model.addRow(data);
    }

    //This method accepts id and selectedrow as parameter and deletes the row according to the matched id
    private boolean deleteMenuItems(int id, int selectedRow) {
        Iterator<MenuItems> iterator = menuList.iterator();
        while (iterator.hasNext()) {
            MenuItems menu = iterator.next();
            if (menu.getId() == id) {

                iterator.remove();

                DefaultTableModel model = (DefaultTableModel) tblview.getModel();
                model.removeRow(selectedRow);
                return true;
            }
        }
        return false; // No menu item found with the given ID
    }

    //This method is used to update the Menu Items  based on id
    private void updateMenuItems() {
        DefaultTableModel model = (DefaultTableModel) tblview.getModel();

        // Clear the table before loading new data
        model.setRowCount(0);

        // Iterate through the LinkedList and add each menu item to the table
        for (MenuItems menu : menuList) {
            model.addRow(new Object[]{
                menu.getId(),
                menu.getName(),
                menu.getCategory(),
                menu.getPrice(),
                menu.getDescription(),
                menu.getCalories()

            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlforcrud = new javax.swing.JPanel();
        lblnewitem = new javax.swing.JLabel();
        btnclose = new javax.swing.JButton();
        lblforName = new javax.swing.JLabel();
        lblforcategory = new javax.swing.JLabel();
        lblforcalories = new javax.swing.JLabel();
        txtfldforName = new javax.swing.JTextField();
        txtfldfodescription = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnshowTable = new javax.swing.JButton();
        comboboxforCategory = new javax.swing.JComboBox<>();
        lblid = new javax.swing.JLabel();
        txtfldforID = new javax.swing.JTextField();
        lblforprice1 = new javax.swing.JLabel();
        txtfldforcalories1 = new javax.swing.JTextField();
        lblfordescription = new javax.swing.JLabel();
        txtfldforprice = new javax.swing.JTextField();
        btnupdate = new javax.swing.JButton();
        lbladdbackground = new javax.swing.JLabel();
        pnlfortbl = new javax.swing.JPanel();
        scrlpaneview = new javax.swing.JScrollPane();
        tblview = new javax.swing.JTable();
        btnback = new javax.swing.JButton();
        btndelete1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setUndecorated(true);

        pnlforcrud.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblnewitem.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblnewitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new product.png"))); // NOI18N
        lblnewitem.setText("New Menu Item");
        pnlforcrud.add(lblnewitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, -1, -1));

        btnclose.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        pnlforcrud.add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblforName.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblforName.setText("Name");
        pnlforcrud.add(lblforName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        lblforcategory.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblforcategory.setText("Category");
        pnlforcrud.add(lblforcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        lblforcalories.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblforcalories.setText("Calories");
        pnlforcrud.add(lblforcalories, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, -1, -1));

        txtfldforName.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        pnlforcrud.add(txtfldforName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 341, -1));

        txtfldfodescription.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        pnlforcrud.add(txtfldfodescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, 341, -1));

        btnadd.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new product.png"))); // NOI18N
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        pnlforcrud.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 540, -1, -1));

        btnshowTable.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btnshowTable.setText("Show Table");
        btnshowTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowTableActionPerformed(evt);
            }
        });
        pnlforcrud.add(btnshowTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 540, -1, -1));

        comboboxforCategory.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        comboboxforCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fast Food", "Healthy Foods", "Beverages", "Deserts" }));
        pnlforcrud.add(comboboxforCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 341, 34));

        lblid.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblid.setText("ID");
        pnlforcrud.add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        txtfldforID.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        pnlforcrud.add(txtfldforID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 340, -1));

        lblforprice1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblforprice1.setText("Price");
        pnlforcrud.add(lblforprice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, -1, -1));

        txtfldforcalories1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        pnlforcrud.add(txtfldforcalories1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, 341, -1));

        lblfordescription.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblfordescription.setText("Description");
        pnlforcrud.add(lblfordescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, -1, -1));

        txtfldforprice.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        pnlforcrud.add(txtfldforprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, 341, -1));

        btnupdate.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        pnlforcrud.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, -1, -1));

        lbladdbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/first page background.PNG"))); // NOI18N
        pnlforcrud.add(lbladdbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlfortbl.setBackground(new java.awt.Color(240, 232, 219));
        pnlfortbl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblview.setBackground(new java.awt.Color(240, 232, 219));
        tblview.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        tblview.setForeground(new java.awt.Color(145, 79, 38));
        tblview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Item Name", "Category", "Price", "Description", "Calories"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblview.setMaximumSize(new java.awt.Dimension(2147483647, 707));
        tblview.setPreferredSize(new java.awt.Dimension(800, 620));
        scrlpaneview.setViewportView(tblview);

        pnlfortbl.add(scrlpaneview, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 530, 560));

        btnback.setBackground(new java.awt.Color(204, 255, 255));
        btnback.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        pnlfortbl.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 630, 250, 39));

        btndelete1.setBackground(new java.awt.Color(255, 51, 51));
        btndelete1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btndelete1.setForeground(new java.awt.Color(255, 255, 255));
        btndelete1.setText("Delete");
        btndelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelete1ActionPerformed(evt);
            }
        });
        pnlfortbl.add(btndelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 250, 39));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlforcrud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlfortbl, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlforcrud, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlfortbl, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //This method is used to view the crud panel and hide the panel that holds the table
    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        pnlfortbl.setVisible(false);
        pnlforcrud.setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed
    //This metod contains all the validations needed for update button and also this method checks the id from the table as well as the id we enter and updates other details bases on that information
    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed

        try {

            if (txtfldforID.getText().isEmpty() && txtfldforName.getText().isEmpty() && txtfldfodescription.getText().isEmpty() && txtfldforprice.getText().isEmpty()
                    && txtfldforcalories1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all the fields given in the form", "Empty Fields", JOptionPane.WARNING_MESSAGE);
            } // Check if any fields are empty
            else if (txtfldforID.getText().isEmpty() || txtfldforName.getText().isEmpty() || txtfldfodescription.getText().isEmpty() || txtfldforprice.getText().isEmpty()
                    || txtfldforcalories1.getText().isEmpty()) {
                if (txtfldforID.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill in the  ID field as it is empty", "Empty Fields", JOptionPane.WARNING_MESSAGE);

                }

                if (txtfldforName.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill in the  Name field as it is empty", "Empty Fields", JOptionPane.WARNING_MESSAGE);

                }

                if (txtfldfodescription.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill in the description field as it is empty", "Empty Fields", JOptionPane.WARNING_MESSAGE);

                }

                if (txtfldforprice.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill in the price field as it is empty", "Empty Fields", JOptionPane.WARNING_MESSAGE);

                }

                if (txtfldforcalories1.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill in the calories field as it is empty", "Empty Fields", JOptionPane.WARNING_MESSAGE);

                }

                return;

            }

            // Proceed with parsing 
            int Id = Integer.parseInt(txtfldforID.getText());
            String category = (String) comboboxforCategory.getSelectedItem();
            String Name = txtfldforName.getText();
            int price = Integer.parseInt(txtfldforprice.getText());
            int calories = Integer.parseInt(txtfldforcalories1.getText());
            String description = txtfldfodescription.getText();

            boolean isValid = true;

            if (isValid) {

                for (MenuItems menu : menuList) {
                    if (menu.getId() == Id) { // Matching Id
                        // Update other Details
                        menu.setName(Name);
                        menu.setCategory(category);
                        menu.setPrice(price);
                        menu.setDescription(description);
                        menu.setCalories(calories);

                        updateMenuItems();
                        JOptionPane.showMessageDialog(null, "Menu Items updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                        return; // Exit after updating
                    }
                }
            }

            if (Id > 500 || Id < 0) {
                JOptionPane.showMessageDialog(null, "Cannot enter  id more than 500 or a negative number", "Invalid  ID", JOptionPane.WARNING_MESSAGE);
            }
            if ((int) price <= 0) {
                JOptionPane.showMessageDialog(null, "Cannot enter  price as a negative value", "Invalid  price", JOptionPane.WARNING_MESSAGE);

            }

            if ((int) calories <= 0) {
                JOptionPane.showMessageDialog(null, "Cannot enter  calories as a negative value", "Invalid  calories", JOptionPane.WARNING_MESSAGE);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Details", "Invalid", JOptionPane.ERROR_MESSAGE);

        }


    }//GEN-LAST:event_btnupdateActionPerformed
    //This method contains all the validations which are triggered when the Add button is pressed. This method also checks the validation for duplicate data. If data is not duplicate, it then adds data to the table
    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed

        try {

            if (txtfldforID.getText().isEmpty() && txtfldforName.getText().isEmpty() && txtfldfodescription.getText().isEmpty() && txtfldforprice.getText().isEmpty()
                    && txtfldforcalories1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all the fields given in the form", "Empty Fields", JOptionPane.WARNING_MESSAGE);
            } // Check if any fields are empty
            else if (txtfldforID.getText().isEmpty() || txtfldforName.getText().isEmpty() || txtfldfodescription.getText().isEmpty() || txtfldforprice.getText().isEmpty()
                    || txtfldforcalories1.getText().isEmpty()) {
                if (txtfldforID.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill in the  ID field as it is empty", "Empty Fields", JOptionPane.WARNING_MESSAGE);

                }

                if (txtfldforName.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill in the  Name field as it is empty", "Empty Fields", JOptionPane.WARNING_MESSAGE);

                }

                if (txtfldfodescription.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill in the description field as it is empty", "Empty Fields", JOptionPane.WARNING_MESSAGE);

                }

                if (txtfldforprice.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill in the price field as it is empty", "Empty Fields", JOptionPane.WARNING_MESSAGE);

                }

                if (txtfldforcalories1.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill in the calories field as it is empty", "Empty Fields", JOptionPane.WARNING_MESSAGE);

                }

                return;

            }

            // Proceed with parsing 
            int Id = Integer.parseInt(txtfldforID.getText());
            String category = (String) comboboxforCategory.getSelectedItem();
            String Name = txtfldforName.getText();
            int price = Integer.parseInt(txtfldforprice.getText());
            int calories = Integer.parseInt(txtfldforcalories1.getText());
            String description = txtfldfodescription.getText();

            boolean isValid = true;

            if (isValid) {
                MenuItems newMenu = new MenuItems(Id, Name, category, price, description, calories);
                if (checkDuplicateId(newMenu)) {
                    JOptionPane.showMessageDialog(null, "Duplicate Data.", "Duplicate", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    addMenuItems(newMenu);
                    JOptionPane.showMessageDialog(null, "Added successfully.", " Add Success", JOptionPane.INFORMATION_MESSAGE);
                }

            }

            if (Id > 500 || Id < 0) {
                JOptionPane.showMessageDialog(null, "Cannot enter  id more than 500 or a negative number", "Invalid  ID", JOptionPane.WARNING_MESSAGE);
            }
            if ((int) price <= 0) {
                JOptionPane.showMessageDialog(null, "Cannot enter  price as a negative value", "Invalid  price", JOptionPane.WARNING_MESSAGE);

            }

            if ((int) calories <= 0) {
                JOptionPane.showMessageDialog(null, "Cannot enter  calories as a negative value", "Invalid  calories", JOptionPane.WARNING_MESSAGE);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Details", "Invalid", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_btnaddActionPerformed

    // This method is used to close the Add form and open the Home form
    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_btncloseActionPerformed
    // This method is used to view the panel for table and hide the crud panel.
    private void btnshowTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowTableActionPerformed
        // TODO add your handling code here:
        pnlfortbl.setVisible(true);
        pnlforcrud.setVisible(false);
    }//GEN-LAST:event_btnshowTableActionPerformed
    //This method is used to delete the table details based on its ID.
    private void btndelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelete1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblview.getModel();
        int selectedRow = tblview.getSelectedRow();

        if (selectedRow != -1) { // Check if a row is selected
            // Extract row data
            int id = (Integer) tblview.getValueAt(selectedRow, 0);
            int confirm = JOptionPane.showConfirmDialog(
                    null, // Parent component
                    "Are you sure you want to delete this menu item?", 
                    "Confirm Deletion", 
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.WARNING_MESSAGE 
            );
            if (confirm == JOptionPane.YES_OPTION) {
                boolean deleted = deleteMenuItems(id, selectedRow);
                if (deleted) {
                    JOptionPane.showMessageDialog(null, "Menu Item deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a menu item to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btndelete1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btndelete1;
    private javax.swing.JButton btnshowTable;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> comboboxforCategory;
    private javax.swing.JLabel lbladdbackground;
    private javax.swing.JLabel lblforName;
    private javax.swing.JLabel lblforcalories;
    private javax.swing.JLabel lblforcategory;
    private javax.swing.JLabel lblfordescription;
    private javax.swing.JLabel lblforprice1;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblnewitem;
    private javax.swing.JPanel pnlforcrud;
    private javax.swing.JPanel pnlfortbl;
    private javax.swing.JScrollPane scrlpaneview;
    private javax.swing.JTable tblview;
    private javax.swing.JTextField txtfldfodescription;
    private javax.swing.JTextField txtfldforID;
    private javax.swing.JTextField txtfldforName;
    private javax.swing.JTextField txtfldforcalories1;
    private javax.swing.JTextField txtfldforprice;
    // End of variables declaration//GEN-END:variables
}
