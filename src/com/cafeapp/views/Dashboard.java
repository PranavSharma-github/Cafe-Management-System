package com.cafeapp.views;

import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Pranav Sharma LMU ID:23048577
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    private double total = 0.0;

    public Dashboard() {
        initComponents();
        init();
    }

    public void init() {
        setImage();
        setTime();
    }

    //This method is used to reset all the jSpinners and TextFields of Billing
    public void reset() {
        jSpinnerforQuantityChocolate.setValue(0);
        jSpinnerforQuantityColdCoffee.setValue(0);
        jSpinnerforQuantityCapuccino.setValue(0);
        jSpinnerforQuantityGreenTea.setValue(0);
        jSpinnerforQuantityWater.setValue(0);

        jSpinnerforQuantityStraberryCake.setValue(0);
        jSpinnerforQuantityChocolateCake.setValue(0);
        jSpinnerforQuantityFruitsCake.setValue(0);
        jSpinnerforQuantityRainbowCake.setValue(0);
        jSpinnerforQuantityCocaCola.setValue(0);

        jSpinnerforQuantityMargeritta.setValue(0);
        jSpinnerforQuantityChickenBurger.setValue(0);
        jSpinnerforQuantity7up.setValue(0);
        jSpinnerforQuantityChickenNoodles.setValue(0);
        jSpinnerforQuantityOrangeJuice.setValue(0);
        jTextFieldTax.setText("0.0");
        jTextFieldSubtotal.setText("0.0");
        jTextFieldTotal.setText("0.0");

    }

    //This method is used to set image of all the items of the menu
    public void setImage() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/coldcoffee.jpg"));
        Image img = icon.getImage().getScaledInstance(lblimgcoldcoffee.getWidth(), lblimgcoldcoffee.getHeight(), Image.SCALE_SMOOTH);
        lblimgcoldcoffee.setIcon(new ImageIcon(img));

        ImageIcon icon2 = new ImageIcon(getClass().getResource("/images/cappuccinocoffee.jpg"));
        Image img2 = icon2.getImage().getScaledInstance(lblimgcapuccino.getWidth(), lblimgcapuccino.getHeight(), Image.SCALE_SMOOTH);
        lblimgcapuccino.setIcon(new ImageIcon(img2));

        ImageIcon icon3 = new ImageIcon(getClass().getResource("/images/chocolatecoffee.jpg"));
        Image img3 = icon3.getImage().getScaledInstance(lblimgchocolate.getWidth(), lblimgchocolate.getHeight(), Image.SCALE_SMOOTH);
        lblimgchocolate.setIcon(new ImageIcon(img3));

        ImageIcon icon4 = new ImageIcon(getClass().getResource("/images/greentea.jpg"));
        Image img4 = icon4.getImage().getScaledInstance(lblimggreentea.getWidth(), lblimggreentea.getHeight(), Image.SCALE_SMOOTH);
        lblimggreentea.setIcon(new ImageIcon(img4));

        ImageIcon icon5 = new ImageIcon(getClass().getResource("/images/mineralswater.png"));
        Image img5 = icon5.getImage().getScaledInstance(lblimgwater.getWidth(), lblimgwater.getHeight(), Image.SCALE_SMOOTH);
        lblimgwater.setIcon(new ImageIcon(img5));

        ImageIcon icon6 = new ImageIcon(getClass().getResource("/images/strawberrycake.jpg"));
        Image img6 = icon6.getImage().getScaledInstance(lblimgstrawberrycake.getWidth(), lblimgstrawberrycake.getHeight(), Image.SCALE_SMOOTH);
        lblimgstrawberrycake.setIcon(new ImageIcon(img6));

        ImageIcon icon7 = new ImageIcon(getClass().getResource("/images/chocolatecake.jpg"));
        Image img7 = icon7.getImage().getScaledInstance(lblimgchocolatecake.getWidth(), lblimgchocolatecake.getHeight(), Image.SCALE_SMOOTH);
        lblimgchocolatecake.setIcon(new ImageIcon(img7));

        ImageIcon icon8 = new ImageIcon(getClass().getResource("/images/fruitscake.jpg"));
        Image img8 = icon8.getImage().getScaledInstance(lblimgfruitscake.getWidth(), lblimgfruitscake.getHeight(), Image.SCALE_SMOOTH);
        lblimgfruitscake.setIcon(new ImageIcon(img8));

        ImageIcon icon9 = new ImageIcon(getClass().getResource("/images/rainbow.jpg"));
        Image img9 = icon9.getImage().getScaledInstance(lblimgrainbowcake.getWidth(), lblimgrainbowcake.getHeight(), Image.SCALE_SMOOTH);
        lblimgrainbowcake.setIcon(new ImageIcon(img9));

        ImageIcon icon10 = new ImageIcon(getClass().getResource("/images/coke.jpg"));
        Image img10 = icon10.getImage().getScaledInstance(lblimgcocacola.getWidth(), lblimgcocacola.getHeight(), Image.SCALE_SMOOTH);
        lblimgcocacola.setIcon(new ImageIcon(img10));

        ImageIcon icon11 = new ImageIcon(getClass().getResource("/images/vegetarianpizza.jpg"));
        Image img11 = icon11.getImage().getScaledInstance(lblimgmargerita.getWidth(), lblimgmargerita.getHeight(), Image.SCALE_SMOOTH);
        lblimgmargerita.setIcon(new ImageIcon(img11));

        ImageIcon icon12 = new ImageIcon(getClass().getResource("/images/chickenburger.jpg"));
        Image img12 = icon12.getImage().getScaledInstance(lblimgchickenburger.getWidth(), lblimgchickenburger.getHeight(), Image.SCALE_SMOOTH);
        lblimgchickenburger.setIcon(new ImageIcon(img12));

        ImageIcon icon13 = new ImageIcon(getClass().getResource("/images/chickennoodles.jpg"));
        Image img13 = icon13.getImage().getScaledInstance(lblimgchickennoodles.getWidth(), lblimgchickennoodles.getHeight(), Image.SCALE_SMOOTH);
        lblimgchickennoodles.setIcon(new ImageIcon(img13));

        ImageIcon icon14 = new ImageIcon(getClass().getResource("/images/7up.jpg"));
        Image img14 = icon14.getImage().getScaledInstance(lblimg7up.getWidth(), lblimg7up.getHeight(), Image.SCALE_SMOOTH);
        lblimg7up.setIcon(new ImageIcon(img14));

        ImageIcon icon15 = new ImageIcon(getClass().getResource("/images/orange_juice.jpg"));
        Image img15 = icon15.getImage().getScaledInstance(lblimgorangejuice.getWidth(), lblimgorangejuice.getHeight(), Image.SCALE_SMOOTH);
        lblimgorangejuice.setIcon(new ImageIcon(img15));

    }
    //This method checks that purchase cannot be made if quantity is 0

    public boolean qtyIsZero(int qty) {
        if (qty == 0) {
            JOptionPane.showMessageDialog(null, "Please increase the item quantity");
            return false;

        }
        return true;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlforothercomponents = new javax.swing.JPanel();
        pnlforMenuItemsandBill = new javax.swing.JPanel();
        lblforCafeName = new javax.swing.JLabel();
        jtxtTime = new javax.swing.JLabel();
        jTxtDate = new javax.swing.JLabel();
        pnlforMenuItems = new javax.swing.JPanel();
        pnlforChocolate = new javax.swing.JPanel();
        lblimgchocolate = new javax.swing.JLabel();
        lblforPriceofChocolate = new javax.swing.JLabel();
        lblforQuantityofChocolate = new javax.swing.JLabel();
        lblforPurchaseChocolate = new javax.swing.JLabel();
        lblfornameChocolate = new javax.swing.JLabel();
        lblforpricevalueChocolate = new javax.swing.JLabel();
        jSpinnerforQuantityChocolate = new javax.swing.JSpinner();
        jCheckBoxPurchaseChocolate = new javax.swing.JCheckBox();
        lblforTitle = new javax.swing.JLabel();
        pnlforColdCoffee = new javax.swing.JPanel();
        lblimgcoldcoffee = new javax.swing.JLabel();
        lblforpriceColdCoffee = new javax.swing.JLabel();
        lblforQuantityColdCoffee = new javax.swing.JLabel();
        lblforPurchaseColdCoffee = new javax.swing.JLabel();
        lblforNameColdCoffee = new javax.swing.JLabel();
        lblforPricevalueColdCoffee = new javax.swing.JLabel();
        jSpinnerforQuantityColdCoffee = new javax.swing.JSpinner();
        jCheckBoxforPurchaseColdCoffee = new javax.swing.JCheckBox();
        pnlforcapuccino = new javax.swing.JPanel();
        lblimgcapuccino = new javax.swing.JLabel();
        lblforPriceCapuccino = new javax.swing.JLabel();
        lboforQuantityCapuccino = new javax.swing.JLabel();
        lblforPurchaseCapuccino = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblforPriceValueCapuccino = new javax.swing.JLabel();
        jSpinnerforQuantityCapuccino = new javax.swing.JSpinner();
        jCheckBoxforPurchaseCapuccino = new javax.swing.JCheckBox();
        pnlforGreenTea = new javax.swing.JPanel();
        lblimggreentea = new javax.swing.JLabel();
        lblforPricegreenTea = new javax.swing.JLabel();
        lblforQuantityGreenTea = new javax.swing.JLabel();
        lblforPurchaseGreenTea = new javax.swing.JLabel();
        lblforNameGreenTea = new javax.swing.JLabel();
        lblforPriceValueGreenTea = new javax.swing.JLabel();
        jSpinnerforQuantityGreenTea = new javax.swing.JSpinner();
        jCheckBoxforPurchaseGreenTea = new javax.swing.JCheckBox();
        pnlforWater = new javax.swing.JPanel();
        lblimgwater = new javax.swing.JLabel();
        lblforPriceWater = new javax.swing.JLabel();
        lblforQuantityWater = new javax.swing.JLabel();
        lblforPurchaseWater = new javax.swing.JLabel();
        lblforNameWater = new javax.swing.JLabel();
        lblforPriceValueWater = new javax.swing.JLabel();
        jSpinnerforQuantityWater = new javax.swing.JSpinner();
        jCheckBoxforPurchaseWater = new javax.swing.JCheckBox();
        pnlforStrawberryCake = new javax.swing.JPanel();
        lblimgstrawberrycake = new javax.swing.JLabel();
        lblforPriceStrawberryCake = new javax.swing.JLabel();
        lblforQuantityStrawberryCake = new javax.swing.JLabel();
        lblforPurchaseStrawberryCake = new javax.swing.JLabel();
        lblforNameStrawberryCake = new javax.swing.JLabel();
        lblforPriceValueStraberryCake = new javax.swing.JLabel();
        jSpinnerforQuantityStraberryCake = new javax.swing.JSpinner();
        jCheckBoxforPurchaseStrawberryCake = new javax.swing.JCheckBox();
        pnlforChocolateCake = new javax.swing.JPanel();
        lblimgchocolatecake = new javax.swing.JLabel();
        lblforPriceChocolateCake = new javax.swing.JLabel();
        lblforQuantityChocolateCake = new javax.swing.JLabel();
        lblforPurchaseChocolateCake = new javax.swing.JLabel();
        lblforNameChocolateCake = new javax.swing.JLabel();
        lblforPriceValueChocolateCake = new javax.swing.JLabel();
        jSpinnerforQuantityChocolateCake = new javax.swing.JSpinner();
        jCheckBoxforPurchaseChocolateCake = new javax.swing.JCheckBox();
        pnlforFruitsCake = new javax.swing.JPanel();
        lblimgfruitscake = new javax.swing.JLabel();
        lblforPriceFruitsCake = new javax.swing.JLabel();
        lblforQuantityFruitsCake = new javax.swing.JLabel();
        lblforPurchaseFruitsCake = new javax.swing.JLabel();
        lblforNameFruitsCake = new javax.swing.JLabel();
        lblforPriceValueFruitsCake = new javax.swing.JLabel();
        jSpinnerforQuantityFruitsCake = new javax.swing.JSpinner();
        jCheckBoxforPurchaseFruitsCake = new javax.swing.JCheckBox();
        pnlforRainbowCake = new javax.swing.JPanel();
        lblimgrainbowcake = new javax.swing.JLabel();
        lblforPriceRainbowCake = new javax.swing.JLabel();
        lblforQuantityRainbowCake = new javax.swing.JLabel();
        lblforPurchaseRainbowCake = new javax.swing.JLabel();
        lblforNameRanbowCake = new javax.swing.JLabel();
        lblforPriceValueRainbowCake = new javax.swing.JLabel();
        jSpinnerforQuantityRainbowCake = new javax.swing.JSpinner();
        jCheckBoxforPurchaseRainbowCake = new javax.swing.JCheckBox();
        pnlforCocaCola = new javax.swing.JPanel();
        lblimgcocacola = new javax.swing.JLabel();
        lblforPriceCocaCola = new javax.swing.JLabel();
        lblforQuantityCocaCola = new javax.swing.JLabel();
        lblforPurchaseCocaCola = new javax.swing.JLabel();
        lblforNameCocaCola = new javax.swing.JLabel();
        lblforPriceValueCocaCola = new javax.swing.JLabel();
        jSpinnerforQuantityCocaCola = new javax.swing.JSpinner();
        jCheckBoxforPurchaseCocaCola = new javax.swing.JCheckBox();
        pnlforMargerita = new javax.swing.JPanel();
        lblimgmargerita = new javax.swing.JLabel();
        lblforPriceMargeritta = new javax.swing.JLabel();
        lblforQuantityMargeritta = new javax.swing.JLabel();
        lblforPurchaseMargeritta = new javax.swing.JLabel();
        lblforNameMargeritta = new javax.swing.JLabel();
        lblforPriceValueMargerittta = new javax.swing.JLabel();
        jSpinnerforQuantityMargeritta = new javax.swing.JSpinner();
        jCheckBoxforPurchaseMargeritta = new javax.swing.JCheckBox();
        pnlforChickenBurger = new javax.swing.JPanel();
        lblimgchickenburger = new javax.swing.JLabel();
        lblforPriceChickenBurger = new javax.swing.JLabel();
        lblforQuantityChickenBurger = new javax.swing.JLabel();
        lblforPurchaseChickenBurger = new javax.swing.JLabel();
        lblforNameChickenBurger = new javax.swing.JLabel();
        lblforPriceValueChickenBurger = new javax.swing.JLabel();
        jSpinnerforQuantityChickenBurger = new javax.swing.JSpinner();
        jCheckBoxforPurchaseChickenBurger = new javax.swing.JCheckBox();
        pnlforSevenUp = new javax.swing.JPanel();
        lblimg7up = new javax.swing.JLabel();
        lblforPrice7Up = new javax.swing.JLabel();
        lblforQuantity7up = new javax.swing.JLabel();
        lblforPurchase7up = new javax.swing.JLabel();
        lblforName7up = new javax.swing.JLabel();
        lblforPriceValue7up = new javax.swing.JLabel();
        jSpinnerforQuantity7up = new javax.swing.JSpinner();
        jCheckBoxforPurchase7up = new javax.swing.JCheckBox();
        pnlforChickenNoodles = new javax.swing.JPanel();
        lblimgchickennoodles = new javax.swing.JLabel();
        lblforPriceChickenNoodles = new javax.swing.JLabel();
        lblforQuantityChickenNoodles = new javax.swing.JLabel();
        lblforPurchaseChickenNoodles = new javax.swing.JLabel();
        lblforNameChickenNoodles = new javax.swing.JLabel();
        lblforPriceValueChickenNoodles = new javax.swing.JLabel();
        jSpinnerforQuantityChickenNoodles = new javax.swing.JSpinner();
        jCheckboxforPurchaseChickenNoodles = new javax.swing.JCheckBox();
        pnlforOrangeJuice = new javax.swing.JPanel();
        lblimgorangejuice = new javax.swing.JLabel();
        lblforPriceOrangeJuice = new javax.swing.JLabel();
        lblforQuantityOrangeJuice = new javax.swing.JLabel();
        lblforPurchaseOrangeJuice = new javax.swing.JLabel();
        lblforNameOrangeJuice = new javax.swing.JLabel();
        lblforPriceValueOrangeJuice = new javax.swing.JLabel();
        jSpinnerforQuantityOrangeJuice = new javax.swing.JSpinner();
        jCheckBoxforPurchaseOrangeJuice = new javax.swing.JCheckBox();
        pnlforButtons = new javax.swing.JPanel();
        pnlforTotalReceipt = new javax.swing.JPanel();
        btnforReceipt = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnTotal = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        pnlforBilling = new javax.swing.JPanel();
        pnlforUserBill = new javax.swing.JPanel();
        jTextFieldSubtotal = new javax.swing.JTextField();
        jTextFieldTotal = new javax.swing.JTextField();
        jTextFieldTax = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        lblTax = new javax.swing.JLabel();
        lblSubTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(234, 220, 207));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlforothercomponents.setBackground(new java.awt.Color(234, 220, 207));
        pnlforothercomponents.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        pnlforothercomponents.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlforMenuItemsandBill.setBackground(new java.awt.Color(234, 220, 207));
        pnlforMenuItemsandBill.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblforCafeName.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        lblforCafeName.setText("Pranav's Cafe");
        pnlforMenuItemsandBill.add(lblforCafeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 0, -1, 41));

        jtxtTime.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pnlforMenuItemsandBill.add(jtxtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 150, 40));

        jTxtDate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pnlforMenuItemsandBill.add(jTxtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, 210, 40));

        pnlforothercomponents.add(pnlforMenuItemsandBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1414, -1));

        pnlforMenuItems.setBackground(new java.awt.Color(234, 220, 207));
        pnlforMenuItems.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(234, 220, 207), 2));

        pnlforChocolate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        lblforPriceofChocolate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPriceofChocolate.setText("Price:");

        lblforQuantityofChocolate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforQuantityofChocolate.setText("Quantity:");

        lblforPurchaseChocolate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPurchaseChocolate.setText("Purchase:");

        lblfornameChocolate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblfornameChocolate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfornameChocolate.setText("Chocolate");

        lblforpricevalueChocolate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforpricevalueChocolate.setText("Rs.400");

        jSpinnerforQuantityChocolate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinnerforQuantityChocolate.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        javax.swing.GroupLayout pnlforChocolateLayout = new javax.swing.GroupLayout(pnlforChocolate);
        pnlforChocolate.setLayout(pnlforChocolateLayout);
        pnlforChocolateLayout.setHorizontalGroup(
            pnlforChocolateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimgchocolate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlforChocolateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlforChocolateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfornameChocolate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlforChocolateLayout.createSequentialGroup()
                        .addGroup(pnlforChocolateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlforChocolateLayout.createSequentialGroup()
                                .addComponent(lblforQuantityofChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerforQuantityChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlforChocolateLayout.createSequentialGroup()
                                .addComponent(lblforPriceofChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblforpricevalueChocolate))
                            .addGroup(pnlforChocolateLayout.createSequentialGroup()
                                .addComponent(lblforPurchaseChocolate)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxPurchaseChocolate)))
                        .addContainerGap(40, Short.MAX_VALUE))))
        );
        pnlforChocolateLayout.setVerticalGroup(
            pnlforChocolateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlforChocolateLayout.createSequentialGroup()
                .addComponent(lblimgchocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblfornameChocolate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforChocolateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforPriceofChocolate)
                    .addComponent(lblforpricevalueChocolate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforChocolateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforQuantityofChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerforQuantityChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforChocolateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforPurchaseChocolate)
                    .addComponent(jCheckBoxPurchaseChocolate)))
        );

        lblforTitle.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblforTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblforTitle.setText("Menu Items");

        pnlforColdCoffee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        lblforpriceColdCoffee.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforpriceColdCoffee.setText("Price:");

        lblforQuantityColdCoffee.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforQuantityColdCoffee.setText("Quantity:");

        lblforPurchaseColdCoffee.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPurchaseColdCoffee.setText("Purchase:");

        lblforNameColdCoffee.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforNameColdCoffee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblforNameColdCoffee.setText("Cold Coffee");

        lblforPricevalueColdCoffee.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPricevalueColdCoffee.setText("Rs.300");

        jSpinnerforQuantityColdCoffee.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinnerforQuantityColdCoffee.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        javax.swing.GroupLayout pnlforColdCoffeeLayout = new javax.swing.GroupLayout(pnlforColdCoffee);
        pnlforColdCoffee.setLayout(pnlforColdCoffeeLayout);
        pnlforColdCoffeeLayout.setHorizontalGroup(
            pnlforColdCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimgcoldcoffee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlforColdCoffeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlforColdCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblforNameColdCoffee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlforColdCoffeeLayout.createSequentialGroup()
                        .addGroup(pnlforColdCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlforColdCoffeeLayout.createSequentialGroup()
                                .addComponent(lblforQuantityColdCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerforQuantityColdCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlforColdCoffeeLayout.createSequentialGroup()
                                .addComponent(lblforpriceColdCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblforPricevalueColdCoffee))
                            .addGroup(pnlforColdCoffeeLayout.createSequentialGroup()
                                .addComponent(lblforPurchaseColdCoffee)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxforPurchaseColdCoffee)))
                        .addGap(0, 34, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlforColdCoffeeLayout.setVerticalGroup(
            pnlforColdCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlforColdCoffeeLayout.createSequentialGroup()
                .addComponent(lblimgcoldcoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblforNameColdCoffee)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforColdCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforpriceColdCoffee)
                    .addComponent(lblforPricevalueColdCoffee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforColdCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforQuantityColdCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerforQuantityColdCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforColdCoffeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforPurchaseColdCoffee)
                    .addComponent(jCheckBoxforPurchaseColdCoffee)))
        );

        pnlforcapuccino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        lblforPriceCapuccino.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPriceCapuccino.setText("Price:");

        lboforQuantityCapuccino.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lboforQuantityCapuccino.setText("Quantity:");

        lblforPurchaseCapuccino.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPurchaseCapuccino.setText("Purchase:");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Cappuccino");

        lblforPriceValueCapuccino.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPriceValueCapuccino.setText("Rs.500");

        jSpinnerforQuantityCapuccino.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinnerforQuantityCapuccino.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        javax.swing.GroupLayout pnlforcapuccinoLayout = new javax.swing.GroupLayout(pnlforcapuccino);
        pnlforcapuccino.setLayout(pnlforcapuccinoLayout);
        pnlforcapuccinoLayout.setHorizontalGroup(
            pnlforcapuccinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimgcapuccino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlforcapuccinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlforcapuccinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlforcapuccinoLayout.createSequentialGroup()
                        .addGroup(pnlforcapuccinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlforcapuccinoLayout.createSequentialGroup()
                                .addComponent(lboforQuantityCapuccino, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerforQuantityCapuccino, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlforcapuccinoLayout.createSequentialGroup()
                                .addComponent(lblforPriceCapuccino, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblforPriceValueCapuccino))
                            .addGroup(pnlforcapuccinoLayout.createSequentialGroup()
                                .addComponent(lblforPurchaseCapuccino)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxforPurchaseCapuccino)))
                        .addGap(0, 34, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlforcapuccinoLayout.setVerticalGroup(
            pnlforcapuccinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlforcapuccinoLayout.createSequentialGroup()
                .addComponent(lblimgcapuccino, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforcapuccinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforPriceCapuccino)
                    .addComponent(lblforPriceValueCapuccino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforcapuccinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lboforQuantityCapuccino, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerforQuantityCapuccino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforcapuccinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforPurchaseCapuccino)
                    .addComponent(jCheckBoxforPurchaseCapuccino)))
        );

        pnlforGreenTea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        lblforPricegreenTea.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPricegreenTea.setText("Price:");

        lblforQuantityGreenTea.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforQuantityGreenTea.setText("Quantity:");

        lblforPurchaseGreenTea.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPurchaseGreenTea.setText("Purchase:");

        lblforNameGreenTea.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforNameGreenTea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblforNameGreenTea.setText("Green Tea");

        lblforPriceValueGreenTea.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPriceValueGreenTea.setText("Rs.200");

        jSpinnerforQuantityGreenTea.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinnerforQuantityGreenTea.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        javax.swing.GroupLayout pnlforGreenTeaLayout = new javax.swing.GroupLayout(pnlforGreenTea);
        pnlforGreenTea.setLayout(pnlforGreenTeaLayout);
        pnlforGreenTeaLayout.setHorizontalGroup(
            pnlforGreenTeaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimggreentea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlforGreenTeaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlforGreenTeaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblforNameGreenTea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlforGreenTeaLayout.createSequentialGroup()
                        .addGroup(pnlforGreenTeaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlforGreenTeaLayout.createSequentialGroup()
                                .addComponent(lblforQuantityGreenTea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerforQuantityGreenTea, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlforGreenTeaLayout.createSequentialGroup()
                                .addComponent(lblforPricegreenTea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblforPriceValueGreenTea))
                            .addGroup(pnlforGreenTeaLayout.createSequentialGroup()
                                .addComponent(lblforPurchaseGreenTea)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxforPurchaseGreenTea)))
                        .addContainerGap(40, Short.MAX_VALUE))))
        );
        pnlforGreenTeaLayout.setVerticalGroup(
            pnlforGreenTeaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlforGreenTeaLayout.createSequentialGroup()
                .addComponent(lblimggreentea, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblforNameGreenTea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforGreenTeaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforPricegreenTea)
                    .addComponent(lblforPriceValueGreenTea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforGreenTeaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforQuantityGreenTea, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerforQuantityGreenTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforGreenTeaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblforPurchaseGreenTea)
                    .addComponent(jCheckBoxforPurchaseGreenTea)))
        );

        pnlforWater.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        lblforPriceWater.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPriceWater.setText("Price:");

        lblforQuantityWater.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforQuantityWater.setText("Quantity:");

        lblforPurchaseWater.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPurchaseWater.setText("Purchase:");

        lblforNameWater.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforNameWater.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblforNameWater.setText("Water");

        lblforPriceValueWater.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPriceValueWater.setText("Rs.60");

        jSpinnerforQuantityWater.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinnerforQuantityWater.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        javax.swing.GroupLayout pnlforWaterLayout = new javax.swing.GroupLayout(pnlforWater);
        pnlforWater.setLayout(pnlforWaterLayout);
        pnlforWaterLayout.setHorizontalGroup(
            pnlforWaterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimgwater, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlforWaterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlforWaterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlforWaterLayout.createSequentialGroup()
                        .addComponent(lblforQuantityWater, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinnerforQuantityWater, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlforWaterLayout.createSequentialGroup()
                        .addComponent(lblforPriceWater, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblforPriceValueWater))
                    .addGroup(pnlforWaterLayout.createSequentialGroup()
                        .addComponent(lblforPurchaseWater)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxforPurchaseWater)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addComponent(lblforNameWater, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlforWaterLayout.setVerticalGroup(
            pnlforWaterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlforWaterLayout.createSequentialGroup()
                .addComponent(lblimgwater, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblforNameWater)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforWaterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforPriceWater)
                    .addComponent(lblforPriceValueWater))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforWaterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforQuantityWater, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerforQuantityWater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforWaterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforPurchaseWater)
                    .addComponent(jCheckBoxforPurchaseWater)))
        );

        pnlforStrawberryCake.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        lblforPriceStrawberryCake.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPriceStrawberryCake.setText("Price:");

        lblforQuantityStrawberryCake.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforQuantityStrawberryCake.setText("Quantity:");

        lblforPurchaseStrawberryCake.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPurchaseStrawberryCake.setText("Purchase:");

        lblforNameStrawberryCake.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforNameStrawberryCake.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblforNameStrawberryCake.setText("Strawberry Cake");

        lblforPriceValueStraberryCake.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPriceValueStraberryCake.setText("Rs.1000");

        jSpinnerforQuantityStraberryCake.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinnerforQuantityStraberryCake.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        javax.swing.GroupLayout pnlforStrawberryCakeLayout = new javax.swing.GroupLayout(pnlforStrawberryCake);
        pnlforStrawberryCake.setLayout(pnlforStrawberryCakeLayout);
        pnlforStrawberryCakeLayout.setHorizontalGroup(
            pnlforStrawberryCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimgstrawberrycake, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlforStrawberryCakeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlforStrawberryCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlforStrawberryCakeLayout.createSequentialGroup()
                        .addComponent(lblforQuantityStrawberryCake, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinnerforQuantityStraberryCake, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlforStrawberryCakeLayout.createSequentialGroup()
                        .addComponent(lblforPriceStrawberryCake, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblforPriceValueStraberryCake))
                    .addGroup(pnlforStrawberryCakeLayout.createSequentialGroup()
                        .addComponent(lblforPurchaseStrawberryCake)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxforPurchaseStrawberryCake)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlforStrawberryCakeLayout.createSequentialGroup()
                .addComponent(lblforNameStrawberryCake, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        pnlforStrawberryCakeLayout.setVerticalGroup(
            pnlforStrawberryCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlforStrawberryCakeLayout.createSequentialGroup()
                .addComponent(lblimgstrawberrycake, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblforNameStrawberryCake)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforStrawberryCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforPriceStrawberryCake)
                    .addComponent(lblforPriceValueStraberryCake))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforStrawberryCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforQuantityStrawberryCake, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerforQuantityStraberryCake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforStrawberryCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforPurchaseStrawberryCake)
                    .addComponent(jCheckBoxforPurchaseStrawberryCake)))
        );

        pnlforChocolateCake.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        lblforPriceChocolateCake.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPriceChocolateCake.setText("Price:");

        lblforQuantityChocolateCake.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforQuantityChocolateCake.setText("Quantity:");

        lblforPurchaseChocolateCake.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPurchaseChocolateCake.setText("Purchase:");

        lblforNameChocolateCake.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforNameChocolateCake.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblforNameChocolateCake.setText("Chocolate Cake");

        lblforPriceValueChocolateCake.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPriceValueChocolateCake.setText("Rs.800");

        jSpinnerforQuantityChocolateCake.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinnerforQuantityChocolateCake.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        javax.swing.GroupLayout pnlforChocolateCakeLayout = new javax.swing.GroupLayout(pnlforChocolateCake);
        pnlforChocolateCake.setLayout(pnlforChocolateCakeLayout);
        pnlforChocolateCakeLayout.setHorizontalGroup(
            pnlforChocolateCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimgchocolatecake, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlforChocolateCakeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlforChocolateCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlforChocolateCakeLayout.createSequentialGroup()
                        .addComponent(lblforQuantityChocolateCake, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinnerforQuantityChocolateCake, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlforChocolateCakeLayout.createSequentialGroup()
                        .addComponent(lblforPriceChocolateCake, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblforPriceValueChocolateCake))
                    .addGroup(pnlforChocolateCakeLayout.createSequentialGroup()
                        .addComponent(lblforPurchaseChocolateCake)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxforPurchaseChocolateCake))
                    .addComponent(lblforNameChocolateCake, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlforChocolateCakeLayout.setVerticalGroup(
            pnlforChocolateCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlforChocolateCakeLayout.createSequentialGroup()
                .addComponent(lblimgchocolatecake, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblforNameChocolateCake)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforChocolateCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforPriceChocolateCake)
                    .addComponent(lblforPriceValueChocolateCake))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforChocolateCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforQuantityChocolateCake, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerforQuantityChocolateCake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforChocolateCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforPurchaseChocolateCake)
                    .addComponent(jCheckBoxforPurchaseChocolateCake)))
        );

        pnlforFruitsCake.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        lblforPriceFruitsCake.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPriceFruitsCake.setText("Price:");

        lblforQuantityFruitsCake.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforQuantityFruitsCake.setText("Quantity:");

        lblforPurchaseFruitsCake.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPurchaseFruitsCake.setText("Purchase:");

        lblforNameFruitsCake.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforNameFruitsCake.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblforNameFruitsCake.setText("Fruits Cake");

        lblforPriceValueFruitsCake.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPriceValueFruitsCake.setText("Rs.1200");

        jSpinnerforQuantityFruitsCake.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinnerforQuantityFruitsCake.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        javax.swing.GroupLayout pnlforFruitsCakeLayout = new javax.swing.GroupLayout(pnlforFruitsCake);
        pnlforFruitsCake.setLayout(pnlforFruitsCakeLayout);
        pnlforFruitsCakeLayout.setHorizontalGroup(
            pnlforFruitsCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimgfruitscake, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlforFruitsCakeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlforFruitsCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblforNameFruitsCake, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlforFruitsCakeLayout.createSequentialGroup()
                        .addGroup(pnlforFruitsCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlforFruitsCakeLayout.createSequentialGroup()
                                .addComponent(lblforQuantityFruitsCake, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerforQuantityFruitsCake, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlforFruitsCakeLayout.createSequentialGroup()
                                .addComponent(lblforPriceFruitsCake, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblforPriceValueFruitsCake))
                            .addGroup(pnlforFruitsCakeLayout.createSequentialGroup()
                                .addComponent(lblforPurchaseFruitsCake)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxforPurchaseFruitsCake)))
                        .addGap(0, 34, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlforFruitsCakeLayout.setVerticalGroup(
            pnlforFruitsCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlforFruitsCakeLayout.createSequentialGroup()
                .addComponent(lblimgfruitscake, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblforNameFruitsCake)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforFruitsCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforPriceFruitsCake)
                    .addComponent(lblforPriceValueFruitsCake))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforFruitsCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforQuantityFruitsCake, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerforQuantityFruitsCake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforFruitsCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforPurchaseFruitsCake)
                    .addComponent(jCheckBoxforPurchaseFruitsCake)))
        );

        pnlforRainbowCake.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        lblforPriceRainbowCake.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPriceRainbowCake.setText("Price:");

        lblforQuantityRainbowCake.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforQuantityRainbowCake.setText("Quantity:");

        lblforPurchaseRainbowCake.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPurchaseRainbowCake.setText("Purchase:");

        lblforNameRanbowCake.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforNameRanbowCake.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblforNameRanbowCake.setText("Rainbow Cake");

        lblforPriceValueRainbowCake.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPriceValueRainbowCake.setText("Rs.1500");

        jSpinnerforQuantityRainbowCake.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinnerforQuantityRainbowCake.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        javax.swing.GroupLayout pnlforRainbowCakeLayout = new javax.swing.GroupLayout(pnlforRainbowCake);
        pnlforRainbowCake.setLayout(pnlforRainbowCakeLayout);
        pnlforRainbowCakeLayout.setHorizontalGroup(
            pnlforRainbowCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimgrainbowcake, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlforRainbowCakeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlforRainbowCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlforRainbowCakeLayout.createSequentialGroup()
                        .addComponent(lblforQuantityRainbowCake, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinnerforQuantityRainbowCake, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlforRainbowCakeLayout.createSequentialGroup()
                        .addComponent(lblforPriceRainbowCake, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblforPriceValueRainbowCake))
                    .addGroup(pnlforRainbowCakeLayout.createSequentialGroup()
                        .addComponent(lblforPurchaseRainbowCake)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxforPurchaseRainbowCake))
                    .addComponent(lblforNameRanbowCake, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlforRainbowCakeLayout.setVerticalGroup(
            pnlforRainbowCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlforRainbowCakeLayout.createSequentialGroup()
                .addComponent(lblimgrainbowcake, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblforNameRanbowCake)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforRainbowCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforPriceRainbowCake)
                    .addComponent(lblforPriceValueRainbowCake))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforRainbowCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforQuantityRainbowCake, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerforQuantityRainbowCake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforRainbowCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforPurchaseRainbowCake)
                    .addComponent(jCheckBoxforPurchaseRainbowCake)))
        );

        pnlforCocaCola.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        lblforPriceCocaCola.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPriceCocaCola.setText("Price:");

        lblforQuantityCocaCola.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforQuantityCocaCola.setText("Quantity:");

        lblforPurchaseCocaCola.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPurchaseCocaCola.setText("Purchase:");

        lblforNameCocaCola.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforNameCocaCola.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblforNameCocaCola.setText("Coca-Cola");

        lblforPriceValueCocaCola.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPriceValueCocaCola.setText("Rs.120");

        jSpinnerforQuantityCocaCola.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinnerforQuantityCocaCola.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        javax.swing.GroupLayout pnlforCocaColaLayout = new javax.swing.GroupLayout(pnlforCocaCola);
        pnlforCocaCola.setLayout(pnlforCocaColaLayout);
        pnlforCocaColaLayout.setHorizontalGroup(
            pnlforCocaColaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimgcocacola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlforCocaColaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlforCocaColaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblforNameCocaCola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlforCocaColaLayout.createSequentialGroup()
                        .addGroup(pnlforCocaColaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlforCocaColaLayout.createSequentialGroup()
                                .addComponent(lblforQuantityCocaCola, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerforQuantityCocaCola, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlforCocaColaLayout.createSequentialGroup()
                                .addComponent(lblforPriceCocaCola, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblforPriceValueCocaCola))
                            .addGroup(pnlforCocaColaLayout.createSequentialGroup()
                                .addComponent(lblforPurchaseCocaCola)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxforPurchaseCocaCola)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlforCocaColaLayout.setVerticalGroup(
            pnlforCocaColaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlforCocaColaLayout.createSequentialGroup()
                .addComponent(lblimgcocacola, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblforNameCocaCola)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforCocaColaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforPriceCocaCola)
                    .addComponent(lblforPriceValueCocaCola))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforCocaColaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforQuantityCocaCola, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerforQuantityCocaCola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforCocaColaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforPurchaseCocaCola)
                    .addComponent(jCheckBoxforPurchaseCocaCola)))
        );

        pnlforMargerita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        lblforPriceMargeritta.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPriceMargeritta.setText("Price:");

        lblforQuantityMargeritta.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforQuantityMargeritta.setText("Quantity:");

        lblforPurchaseMargeritta.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPurchaseMargeritta.setText("Purchase:");

        lblforNameMargeritta.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforNameMargeritta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblforNameMargeritta.setText("Margeritta");

        lblforPriceValueMargerittta.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPriceValueMargerittta.setText("Rs.750");

        jSpinnerforQuantityMargeritta.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinnerforQuantityMargeritta.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        javax.swing.GroupLayout pnlforMargeritaLayout = new javax.swing.GroupLayout(pnlforMargerita);
        pnlforMargerita.setLayout(pnlforMargeritaLayout);
        pnlforMargeritaLayout.setHorizontalGroup(
            pnlforMargeritaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimgmargerita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlforMargeritaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlforMargeritaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblforNameMargeritta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlforMargeritaLayout.createSequentialGroup()
                        .addGroup(pnlforMargeritaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlforMargeritaLayout.createSequentialGroup()
                                .addComponent(lblforQuantityMargeritta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerforQuantityMargeritta, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlforMargeritaLayout.createSequentialGroup()
                                .addComponent(lblforPriceMargeritta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblforPriceValueMargerittta))
                            .addGroup(pnlforMargeritaLayout.createSequentialGroup()
                                .addComponent(lblforPurchaseMargeritta)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxforPurchaseMargeritta)))
                        .addGap(0, 34, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlforMargeritaLayout.setVerticalGroup(
            pnlforMargeritaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlforMargeritaLayout.createSequentialGroup()
                .addComponent(lblimgmargerita, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblforNameMargeritta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforMargeritaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforPriceMargeritta)
                    .addComponent(lblforPriceValueMargerittta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforMargeritaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforQuantityMargeritta, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerforQuantityMargeritta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforMargeritaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforPurchaseMargeritta)
                    .addComponent(jCheckBoxforPurchaseMargeritta)))
        );

        pnlforChickenBurger.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        lblforPriceChickenBurger.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPriceChickenBurger.setText("Price:");

        lblforQuantityChickenBurger.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforQuantityChickenBurger.setText("Quantity:");

        lblforPurchaseChickenBurger.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPurchaseChickenBurger.setText("Purchase:");

        lblforNameChickenBurger.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforNameChickenBurger.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblforNameChickenBurger.setText("Chicken Burger");

        lblforPriceValueChickenBurger.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPriceValueChickenBurger.setText("Rs.300");

        jSpinnerforQuantityChickenBurger.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinnerforQuantityChickenBurger.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        javax.swing.GroupLayout pnlforChickenBurgerLayout = new javax.swing.GroupLayout(pnlforChickenBurger);
        pnlforChickenBurger.setLayout(pnlforChickenBurgerLayout);
        pnlforChickenBurgerLayout.setHorizontalGroup(
            pnlforChickenBurgerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimgchickenburger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlforChickenBurgerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlforChickenBurgerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlforChickenBurgerLayout.createSequentialGroup()
                        .addComponent(lblforQuantityChickenBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinnerforQuantityChickenBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlforChickenBurgerLayout.createSequentialGroup()
                        .addComponent(lblforPriceChickenBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblforPriceValueChickenBurger))
                    .addGroup(pnlforChickenBurgerLayout.createSequentialGroup()
                        .addComponent(lblforPurchaseChickenBurger)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxforPurchaseChickenBurger))
                    .addComponent(lblforNameChickenBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        pnlforChickenBurgerLayout.setVerticalGroup(
            pnlforChickenBurgerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlforChickenBurgerLayout.createSequentialGroup()
                .addComponent(lblimgchickenburger, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblforNameChickenBurger)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforChickenBurgerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforPriceChickenBurger)
                    .addComponent(lblforPriceValueChickenBurger))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforChickenBurgerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforQuantityChickenBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerforQuantityChickenBurger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforChickenBurgerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforPurchaseChickenBurger)
                    .addComponent(jCheckBoxforPurchaseChickenBurger)))
        );

        pnlforSevenUp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        lblforPrice7Up.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPrice7Up.setText("Price:");

        lblforQuantity7up.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforQuantity7up.setText("Quantity:");

        lblforPurchase7up.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPurchase7up.setText("Purchase:");

        lblforName7up.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforName7up.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblforName7up.setText("7 UP");

        lblforPriceValue7up.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPriceValue7up.setText("Rs.130");

        jSpinnerforQuantity7up.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinnerforQuantity7up.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        javax.swing.GroupLayout pnlforSevenUpLayout = new javax.swing.GroupLayout(pnlforSevenUp);
        pnlforSevenUp.setLayout(pnlforSevenUpLayout);
        pnlforSevenUpLayout.setHorizontalGroup(
            pnlforSevenUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimg7up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlforSevenUpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlforSevenUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblforName7up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlforSevenUpLayout.createSequentialGroup()
                        .addGroup(pnlforSevenUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlforSevenUpLayout.createSequentialGroup()
                                .addComponent(lblforQuantity7up, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerforQuantity7up, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlforSevenUpLayout.createSequentialGroup()
                                .addComponent(lblforPrice7Up, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblforPriceValue7up))
                            .addGroup(pnlforSevenUpLayout.createSequentialGroup()
                                .addComponent(lblforPurchase7up)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxforPurchase7up)))
                        .addGap(0, 34, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlforSevenUpLayout.setVerticalGroup(
            pnlforSevenUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlforSevenUpLayout.createSequentialGroup()
                .addComponent(lblimg7up, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblforName7up)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforSevenUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforPrice7Up)
                    .addComponent(lblforPriceValue7up))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforSevenUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforQuantity7up, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerforQuantity7up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforSevenUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforPurchase7up)
                    .addComponent(jCheckBoxforPurchase7up)))
        );

        pnlforChickenNoodles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        lblforPriceChickenNoodles.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPriceChickenNoodles.setText("Price:");

        lblforQuantityChickenNoodles.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforQuantityChickenNoodles.setText("Quantity:");

        lblforPurchaseChickenNoodles.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPurchaseChickenNoodles.setText("Purchase:");

        lblforNameChickenNoodles.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforNameChickenNoodles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblforNameChickenNoodles.setText("Chicken Noodles");

        lblforPriceValueChickenNoodles.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPriceValueChickenNoodles.setText("Rs.500");

        jSpinnerforQuantityChickenNoodles.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinnerforQuantityChickenNoodles.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        javax.swing.GroupLayout pnlforChickenNoodlesLayout = new javax.swing.GroupLayout(pnlforChickenNoodles);
        pnlforChickenNoodles.setLayout(pnlforChickenNoodlesLayout);
        pnlforChickenNoodlesLayout.setHorizontalGroup(
            pnlforChickenNoodlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimgchickennoodles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlforChickenNoodlesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlforChickenNoodlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlforChickenNoodlesLayout.createSequentialGroup()
                        .addComponent(lblforQuantityChickenNoodles, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinnerforQuantityChickenNoodles, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlforChickenNoodlesLayout.createSequentialGroup()
                        .addComponent(lblforPriceChickenNoodles, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblforPriceValueChickenNoodles))
                    .addGroup(pnlforChickenNoodlesLayout.createSequentialGroup()
                        .addComponent(lblforPurchaseChickenNoodles)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckboxforPurchaseChickenNoodles)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addComponent(lblforNameChickenNoodles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlforChickenNoodlesLayout.setVerticalGroup(
            pnlforChickenNoodlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlforChickenNoodlesLayout.createSequentialGroup()
                .addComponent(lblimgchickennoodles, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblforNameChickenNoodles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforChickenNoodlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforPriceChickenNoodles)
                    .addComponent(lblforPriceValueChickenNoodles))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforChickenNoodlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforQuantityChickenNoodles, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerforQuantityChickenNoodles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforChickenNoodlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforPurchaseChickenNoodles)
                    .addComponent(jCheckboxforPurchaseChickenNoodles)))
        );

        pnlforOrangeJuice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));

        lblforPriceOrangeJuice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPriceOrangeJuice.setText("Price:");

        lblforQuantityOrangeJuice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforQuantityOrangeJuice.setText("Quantity:");

        lblforPurchaseOrangeJuice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPurchaseOrangeJuice.setText("Purchase:");

        lblforNameOrangeJuice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforNameOrangeJuice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblforNameOrangeJuice.setText("Orange Juice");

        lblforPriceValueOrangeJuice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblforPriceValueOrangeJuice.setText("Rs.200");

        jSpinnerforQuantityOrangeJuice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSpinnerforQuantityOrangeJuice.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        javax.swing.GroupLayout pnlforOrangeJuiceLayout = new javax.swing.GroupLayout(pnlforOrangeJuice);
        pnlforOrangeJuice.setLayout(pnlforOrangeJuiceLayout);
        pnlforOrangeJuiceLayout.setHorizontalGroup(
            pnlforOrangeJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimgorangejuice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlforOrangeJuiceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlforOrangeJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblforNameOrangeJuice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlforOrangeJuiceLayout.createSequentialGroup()
                        .addGroup(pnlforOrangeJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlforOrangeJuiceLayout.createSequentialGroup()
                                .addComponent(lblforQuantityOrangeJuice, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerforQuantityOrangeJuice, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlforOrangeJuiceLayout.createSequentialGroup()
                                .addComponent(lblforPriceOrangeJuice, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblforPriceValueOrangeJuice))
                            .addGroup(pnlforOrangeJuiceLayout.createSequentialGroup()
                                .addComponent(lblforPurchaseOrangeJuice)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxforPurchaseOrangeJuice)))
                        .addContainerGap(40, Short.MAX_VALUE))))
        );
        pnlforOrangeJuiceLayout.setVerticalGroup(
            pnlforOrangeJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlforOrangeJuiceLayout.createSequentialGroup()
                .addComponent(lblimgorangejuice, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblforNameOrangeJuice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforOrangeJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforPriceOrangeJuice)
                    .addComponent(lblforPriceValueOrangeJuice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforOrangeJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforQuantityOrangeJuice, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerforQuantityOrangeJuice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforOrangeJuiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblforPurchaseOrangeJuice)
                    .addComponent(jCheckBoxforPurchaseOrangeJuice)))
        );

        javax.swing.GroupLayout pnlforMenuItemsLayout = new javax.swing.GroupLayout(pnlforMenuItems);
        pnlforMenuItems.setLayout(pnlforMenuItemsLayout);
        pnlforMenuItemsLayout.setHorizontalGroup(
            pnlforMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlforMenuItemsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlforMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblforTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlforMenuItemsLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(pnlforMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlforMenuItemsLayout.createSequentialGroup()
                                .addComponent(pnlforStrawberryCake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlforChocolateCake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlforFruitsCake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlforRainbowCake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlforCocaCola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlforMenuItemsLayout.createSequentialGroup()
                                .addComponent(pnlforColdCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlforcapuccino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlforChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlforGreenTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlforWater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlforMenuItemsLayout.createSequentialGroup()
                                .addComponent(pnlforMargerita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlforChickenBurger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlforChickenNoodles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlforSevenUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlforOrangeJuice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlforMenuItemsLayout.setVerticalGroup(
            pnlforMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlforMenuItemsLayout.createSequentialGroup()
                .addComponent(lblforTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlforMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlforcapuccino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlforColdCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlforWater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlforChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlforGreenTea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlforStrawberryCake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlforChocolateCake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlforFruitsCake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlforRainbowCake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlforCocaCola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlforMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlforMargerita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlforChickenBurger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlforChickenNoodles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlforSevenUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlforOrangeJuice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlforothercomponents.add(pnlforMenuItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 47, 950, -1));

        pnlforButtons.setBackground(new java.awt.Color(234, 220, 207));

        pnlforTotalReceipt.setBackground(new java.awt.Color(234, 220, 207));
        pnlforTotalReceipt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(234, 220, 207), 2));
        pnlforTotalReceipt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnforReceipt.setBackground(new java.awt.Color(0, 255, 255));
        btnforReceipt.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnforReceipt.setForeground(new java.awt.Color(255, 255, 255));
        btnforReceipt.setText("Receipt");
        pnlforTotalReceipt.add(btnforReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 119, 44));

        btnReset.setBackground(new java.awt.Color(51, 51, 255));
        btnReset.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        pnlforTotalReceipt.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 119, 44));

        btnExit.setBackground(new java.awt.Color(255, 102, 102));
        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        pnlforTotalReceipt.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 119, 44));

        btnTotal.setBackground(new java.awt.Color(0, 153, 0));
        btnTotal.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnTotal.setForeground(new java.awt.Color(255, 255, 255));
        btnTotal.setText("Total");
        pnlforTotalReceipt.add(btnTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 119, 44));

        btnBack.setBackground(new java.awt.Color(255, 153, 0));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        pnlforTotalReceipt.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 119, 44));

        javax.swing.GroupLayout pnlforButtonsLayout = new javax.swing.GroupLayout(pnlforButtons);
        pnlforButtons.setLayout(pnlforButtonsLayout);
        pnlforButtonsLayout.setHorizontalGroup(
            pnlforButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlforButtonsLayout.createSequentialGroup()
                .addComponent(pnlforTotalReceipt, javax.swing.GroupLayout.DEFAULT_SIZE, 949, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlforButtonsLayout.setVerticalGroup(
            pnlforButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlforButtonsLayout.createSequentialGroup()
                .addComponent(pnlforTotalReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlforothercomponents.add(pnlforButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 675, -1, 70));

        pnlforBilling.setBackground(new java.awt.Color(234, 220, 207));
        pnlforBilling.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlforUserBill.setBackground(new java.awt.Color(250, 250, 250));

        javax.swing.GroupLayout pnlforUserBillLayout = new javax.swing.GroupLayout(pnlforUserBill);
        pnlforUserBill.setLayout(pnlforUserBillLayout);
        pnlforUserBillLayout.setHorizontalGroup(
            pnlforUserBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );
        pnlforUserBillLayout.setVerticalGroup(
            pnlforUserBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        pnlforBilling.add(pnlforUserBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTextFieldSubtotal.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jTextFieldSubtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldSubtotal.setText("0.0");
        pnlforBilling.add(jTextFieldSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 600, 152, 35));

        jTextFieldTotal.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jTextFieldTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTotal.setText("0.0");
        pnlforBilling.add(jTextFieldTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 650, 152, 35));

        jTextFieldTax.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jTextFieldTax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTax.setText("0.0");
        pnlforBilling.add(jTextFieldTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 152, 35));

        lblTotal.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblTotal.setText("Total");
        pnlforBilling.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, -1, 35));

        lblTax.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblTax.setText("Tax");
        pnlforBilling.add(lblTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 73, 35));

        lblSubTotal.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblSubTotal.setText("Sub Total");
        pnlforBilling.add(lblSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, -1, 35));

        pnlforothercomponents.add(pnlforBilling, new org.netbeans.lib.awtextra.AbsoluteConstraints(987, 47, -1, 710));

        getContentPane().add(pnlforothercomponents, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //This method is used to exit from the system
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed
    //This method is used to reset all the jSpinners and textfields
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        reset();

    }//GEN-LAST:event_btnResetActionPerformed
    //This method is used to go back to Home page when back button is pressed
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        setVisible(false);
        new Home().setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed
    //This method is used to set time and date in the top right label
    public void setTime() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Date date = new Date();
                    SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                    SimpleDateFormat df = new SimpleDateFormat("EEEE,dd-MM-yyyy");
                    String time = tf.format(date);
                    jtxtTime.setText(time.split(" ")[0] + " " + time.split(" ")[1]);
                    jTxtDate.setText(df.format(date));

                }
            }
        }).start();

    }

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTotal;
    private javax.swing.JButton btnforReceipt;
    private javax.swing.JCheckBox jCheckBoxPurchaseChocolate;
    private javax.swing.JCheckBox jCheckBoxforPurchase7up;
    private javax.swing.JCheckBox jCheckBoxforPurchaseCapuccino;
    private javax.swing.JCheckBox jCheckBoxforPurchaseChickenBurger;
    private javax.swing.JCheckBox jCheckBoxforPurchaseChocolateCake;
    private javax.swing.JCheckBox jCheckBoxforPurchaseCocaCola;
    private javax.swing.JCheckBox jCheckBoxforPurchaseColdCoffee;
    private javax.swing.JCheckBox jCheckBoxforPurchaseFruitsCake;
    private javax.swing.JCheckBox jCheckBoxforPurchaseGreenTea;
    private javax.swing.JCheckBox jCheckBoxforPurchaseMargeritta;
    private javax.swing.JCheckBox jCheckBoxforPurchaseOrangeJuice;
    private javax.swing.JCheckBox jCheckBoxforPurchaseRainbowCake;
    private javax.swing.JCheckBox jCheckBoxforPurchaseStrawberryCake;
    private javax.swing.JCheckBox jCheckBoxforPurchaseWater;
    private javax.swing.JCheckBox jCheckboxforPurchaseChickenNoodles;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JSpinner jSpinnerforQuantity7up;
    private javax.swing.JSpinner jSpinnerforQuantityCapuccino;
    private javax.swing.JSpinner jSpinnerforQuantityChickenBurger;
    private javax.swing.JSpinner jSpinnerforQuantityChickenNoodles;
    private javax.swing.JSpinner jSpinnerforQuantityChocolate;
    private javax.swing.JSpinner jSpinnerforQuantityChocolateCake;
    private javax.swing.JSpinner jSpinnerforQuantityCocaCola;
    private javax.swing.JSpinner jSpinnerforQuantityColdCoffee;
    private javax.swing.JSpinner jSpinnerforQuantityFruitsCake;
    private javax.swing.JSpinner jSpinnerforQuantityGreenTea;
    private javax.swing.JSpinner jSpinnerforQuantityMargeritta;
    private javax.swing.JSpinner jSpinnerforQuantityOrangeJuice;
    private javax.swing.JSpinner jSpinnerforQuantityRainbowCake;
    private javax.swing.JSpinner jSpinnerforQuantityStraberryCake;
    private javax.swing.JSpinner jSpinnerforQuantityWater;
    private javax.swing.JTextField jTextFieldSubtotal;
    private javax.swing.JTextField jTextFieldTax;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JLabel jTxtDate;
    private javax.swing.JLabel jtxtTime;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JLabel lblTax;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblforCafeName;
    private javax.swing.JLabel lblforName7up;
    private javax.swing.JLabel lblforNameChickenBurger;
    private javax.swing.JLabel lblforNameChickenNoodles;
    private javax.swing.JLabel lblforNameChocolateCake;
    private javax.swing.JLabel lblforNameCocaCola;
    private javax.swing.JLabel lblforNameColdCoffee;
    private javax.swing.JLabel lblforNameFruitsCake;
    private javax.swing.JLabel lblforNameGreenTea;
    private javax.swing.JLabel lblforNameMargeritta;
    private javax.swing.JLabel lblforNameOrangeJuice;
    private javax.swing.JLabel lblforNameRanbowCake;
    private javax.swing.JLabel lblforNameStrawberryCake;
    private javax.swing.JLabel lblforNameWater;
    private javax.swing.JLabel lblforPrice7Up;
    private javax.swing.JLabel lblforPriceCapuccino;
    private javax.swing.JLabel lblforPriceChickenBurger;
    private javax.swing.JLabel lblforPriceChickenNoodles;
    private javax.swing.JLabel lblforPriceChocolateCake;
    private javax.swing.JLabel lblforPriceCocaCola;
    private javax.swing.JLabel lblforPriceFruitsCake;
    private javax.swing.JLabel lblforPriceMargeritta;
    private javax.swing.JLabel lblforPriceOrangeJuice;
    private javax.swing.JLabel lblforPriceRainbowCake;
    private javax.swing.JLabel lblforPriceStrawberryCake;
    private javax.swing.JLabel lblforPriceValue7up;
    private javax.swing.JLabel lblforPriceValueCapuccino;
    private javax.swing.JLabel lblforPriceValueChickenBurger;
    private javax.swing.JLabel lblforPriceValueChickenNoodles;
    private javax.swing.JLabel lblforPriceValueChocolateCake;
    private javax.swing.JLabel lblforPriceValueCocaCola;
    private javax.swing.JLabel lblforPriceValueFruitsCake;
    private javax.swing.JLabel lblforPriceValueGreenTea;
    private javax.swing.JLabel lblforPriceValueMargerittta;
    private javax.swing.JLabel lblforPriceValueOrangeJuice;
    private javax.swing.JLabel lblforPriceValueRainbowCake;
    private javax.swing.JLabel lblforPriceValueStraberryCake;
    private javax.swing.JLabel lblforPriceValueWater;
    private javax.swing.JLabel lblforPriceWater;
    private javax.swing.JLabel lblforPricegreenTea;
    private javax.swing.JLabel lblforPriceofChocolate;
    private javax.swing.JLabel lblforPricevalueColdCoffee;
    private javax.swing.JLabel lblforPurchase7up;
    private javax.swing.JLabel lblforPurchaseCapuccino;
    private javax.swing.JLabel lblforPurchaseChickenBurger;
    private javax.swing.JLabel lblforPurchaseChickenNoodles;
    private javax.swing.JLabel lblforPurchaseChocolate;
    private javax.swing.JLabel lblforPurchaseChocolateCake;
    private javax.swing.JLabel lblforPurchaseCocaCola;
    private javax.swing.JLabel lblforPurchaseColdCoffee;
    private javax.swing.JLabel lblforPurchaseFruitsCake;
    private javax.swing.JLabel lblforPurchaseGreenTea;
    private javax.swing.JLabel lblforPurchaseMargeritta;
    private javax.swing.JLabel lblforPurchaseOrangeJuice;
    private javax.swing.JLabel lblforPurchaseRainbowCake;
    private javax.swing.JLabel lblforPurchaseStrawberryCake;
    private javax.swing.JLabel lblforPurchaseWater;
    private javax.swing.JLabel lblforQuantity7up;
    private javax.swing.JLabel lblforQuantityChickenBurger;
    private javax.swing.JLabel lblforQuantityChickenNoodles;
    private javax.swing.JLabel lblforQuantityChocolateCake;
    private javax.swing.JLabel lblforQuantityCocaCola;
    private javax.swing.JLabel lblforQuantityColdCoffee;
    private javax.swing.JLabel lblforQuantityFruitsCake;
    private javax.swing.JLabel lblforQuantityGreenTea;
    private javax.swing.JLabel lblforQuantityMargeritta;
    private javax.swing.JLabel lblforQuantityOrangeJuice;
    private javax.swing.JLabel lblforQuantityRainbowCake;
    private javax.swing.JLabel lblforQuantityStrawberryCake;
    private javax.swing.JLabel lblforQuantityWater;
    private javax.swing.JLabel lblforQuantityofChocolate;
    private javax.swing.JLabel lblforTitle;
    private javax.swing.JLabel lblfornameChocolate;
    private javax.swing.JLabel lblforpriceColdCoffee;
    private javax.swing.JLabel lblforpricevalueChocolate;
    private javax.swing.JLabel lblimg7up;
    private javax.swing.JLabel lblimgcapuccino;
    private javax.swing.JLabel lblimgchickenburger;
    private javax.swing.JLabel lblimgchickennoodles;
    private javax.swing.JLabel lblimgchocolate;
    private javax.swing.JLabel lblimgchocolatecake;
    private javax.swing.JLabel lblimgcocacola;
    private javax.swing.JLabel lblimgcoldcoffee;
    private javax.swing.JLabel lblimgfruitscake;
    private javax.swing.JLabel lblimggreentea;
    private javax.swing.JLabel lblimgmargerita;
    private javax.swing.JLabel lblimgorangejuice;
    private javax.swing.JLabel lblimgrainbowcake;
    private javax.swing.JLabel lblimgstrawberrycake;
    private javax.swing.JLabel lblimgwater;
    private javax.swing.JLabel lboforQuantityCapuccino;
    private javax.swing.JPanel pnlforBilling;
    private javax.swing.JPanel pnlforButtons;
    private javax.swing.JPanel pnlforChickenBurger;
    private javax.swing.JPanel pnlforChickenNoodles;
    private javax.swing.JPanel pnlforChocolate;
    private javax.swing.JPanel pnlforChocolateCake;
    private javax.swing.JPanel pnlforCocaCola;
    private javax.swing.JPanel pnlforColdCoffee;
    private javax.swing.JPanel pnlforFruitsCake;
    private javax.swing.JPanel pnlforGreenTea;
    private javax.swing.JPanel pnlforMargerita;
    private javax.swing.JPanel pnlforMenuItems;
    private javax.swing.JPanel pnlforMenuItemsandBill;
    private javax.swing.JPanel pnlforOrangeJuice;
    private javax.swing.JPanel pnlforRainbowCake;
    private javax.swing.JPanel pnlforSevenUp;
    private javax.swing.JPanel pnlforStrawberryCake;
    private javax.swing.JPanel pnlforTotalReceipt;
    private javax.swing.JPanel pnlforUserBill;
    private javax.swing.JPanel pnlforWater;
    private javax.swing.JPanel pnlforcapuccino;
    private javax.swing.JPanel pnlforothercomponents;
    // End of variables declaration//GEN-END:variables
}
