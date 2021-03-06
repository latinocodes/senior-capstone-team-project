package sunset.FrontEnd;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sunset.BackEnd.DBConnectionMgr;
import sunset.domain.*;

public class AddTenant extends javax.swing.JFrame {
    
    Tenant currentTenant = new Tenant();
    private int lastNum;

    /**
     * Creates new form AddTenant
     */
    public AddTenant() {
        initComponents();
    }

    public AddTenant(Tenant tenant) {
        initComponents();
        this.settingFields();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        currentTenant.setApt(tenant.getApt());
        
        this.tfTenantID.setText(Integer.toString(lastNum));
        tfApt.setText(tenant.getApt());
        tfApt.setEditable(false);
        tfStreetAddress.setText(tenant.getStreet());
        tfStreetAddress.setEditable(false);
        tfCity.setText(tenant.getCity());
        tfCity.setEditable(false);
        tfState.setSelectedItem(tenant.getState());
        tfState.setEditable(false);
        tfZipCode.setText(tenant.getZip());
        tfZipCode.setEditable(false);
    
    }
    
    //*********************************************
    //  Gets the last tenantID use from the database
    //
    //**********************************************
    private void settingFields(){
        DBConnectionMgr db = new DBConnectionMgr();
        try {
          this.lastNum = db.getlastTenant();
        } catch (Exception ex) {
            Logger.getLogger(CreateTenant.class.getName()).log(Level.SEVERE, null, ex);
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

        jlpTenantInfo = new javax.swing.JLayeredPane();
        tfFirstName = new javax.swing.JTextField();
        lbLastName = new javax.swing.JLabel();
        lbStreetAddress = new javax.swing.JLabel();
        tfStreetAddress = new javax.swing.JTextField();
        lbCity = new javax.swing.JLabel();
        tfCity = new javax.swing.JTextField();
        lbState = new javax.swing.JLabel();
        lbZipCode = new javax.swing.JLabel();
        tfZipCode = new javax.swing.JTextField();
        lbTelephone = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        tfLastName = new javax.swing.JTextField();
        lbFirstName = new javax.swing.JLabel();
        lbAptNum = new javax.swing.JLabel();
        tfApt = new javax.swing.JTextField();
        lbSpecialNeeds = new javax.swing.JLabel();
        tfSpecialNeeds = new javax.swing.JTextField();
        lbDOB = new javax.swing.JLabel();
        tfDOB = new javax.swing.JFormattedTextField();
        tfPhone = new javax.swing.JFormattedTextField();
        tfState = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        tfTenantID = new javax.swing.JTextField();
        jrbDefaultAddress = new javax.swing.JRadioButton();
        btSave = new javax.swing.JButton();
        btClear = new javax.swing.JButton();
        btHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Tenant");

        jlpTenantInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Tenant Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N

        lbLastName.setText("Last:");

        lbStreetAddress.setText("Street: ");

        lbCity.setText("City:");

        lbState.setText("State:");

        lbZipCode.setText("Zip Code:");

        lbTelephone.setText("Tel: ");

        lbEmail.setText("Email:");

        lbFirstName.setText("First: ");

        lbAptNum.setText("Apt #:");

        lbSpecialNeeds.setText("Special:");

        lbDOB.setText("DOB");

        tfDOB.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        tfDOB.setToolTipText("");

        tfPhone.setColumns(10);
        try {
            tfPhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tfState.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "MA", "MD", "ME", "MI", "MN", "MO", "MS", "MT", "NC", "ND", "NE", "NH", "NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VA", "VT", "WA", "WI", "WV", "WY" }));

        jLabel1.setText("Tenant ID");

        tfTenantID.setText(Integer.toString(lastNum));

        jrbDefaultAddress.setText("Use Complex Address");
        jrbDefaultAddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbDefaultAddressMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jlpTenantInfoLayout = new javax.swing.GroupLayout(jlpTenantInfo);
        jlpTenantInfo.setLayout(jlpTenantInfoLayout);
        jlpTenantInfoLayout.setHorizontalGroup(
            jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpTenantInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jlpTenantInfoLayout.createSequentialGroup()
                        .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbStreetAddress)
                            .addComponent(lbCity)
                            .addComponent(lbTelephone)
                            .addComponent(lbDOB)
                            .addComponent(lbFirstName))
                        .addGap(22, 22, 22)
                        .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpTenantInfoLayout.createSequentialGroup()
                                .addComponent(tfPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpTenantInfoLayout.createSequentialGroup()
                                .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jlpTenantInfoLayout.createSequentialGroup()
                                        .addComponent(tfCity)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbState)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jlpTenantInfoLayout.createSequentialGroup()
                                        .addComponent(tfStreetAddress)
                                        .addGap(46, 46, 46)
                                        .addComponent(lbAptNum)
                                        .addGap(37, 37, 37)))
                                .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfApt)
                                    .addComponent(tfZipCode)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpTenantInfoLayout.createSequentialGroup()
                                .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfDOB, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                    .addComponent(tfFirstName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbLastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                    .addComponent(tfTenantID)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jlpTenantInfoLayout.createSequentialGroup()
                        .addComponent(lbSpecialNeeds)
                        .addGap(18, 18, 18)
                        .addComponent(tfSpecialNeeds)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpTenantInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrbDefaultAddress)
                .addContainerGap())
        );
        jlpTenantInfoLayout.setVerticalGroup(
            jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpTenantInfoLayout.createSequentialGroup()
                .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFirstName)
                    .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLastName)
                    .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDOB)
                    .addComponent(tfDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(tfTenantID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbStreetAddress)
                    .addComponent(tfStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfApt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAptNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCity)
                        .addComponent(lbZipCode)
                        .addComponent(tfZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbState)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbTelephone)
                        .addComponent(lbEmail)
                        .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jlpTenantInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSpecialNeeds)
                    .addComponent(tfSpecialNeeds, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbDefaultAddress)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jlpTenantInfo.setLayer(tfFirstName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(lbLastName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(lbStreetAddress, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(tfStreetAddress, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(lbCity, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(tfCity, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(lbState, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(lbZipCode, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(tfZipCode, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(lbTelephone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(lbEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(tfEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(tfLastName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(lbFirstName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(lbAptNum, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(tfApt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(lbSpecialNeeds, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(tfSpecialNeeds, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(lbDOB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(tfDOB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(tfPhone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(tfState, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(tfTenantID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpTenantInfo.setLayer(jrbDefaultAddress, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btSave.setText("Save");
        btSave.setPreferredSize(new java.awt.Dimension(87, 65));
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btClear.setText("Clear");
        btClear.setMaximumSize(new java.awt.Dimension(75, 29));
        btClear.setMinimumSize(new java.awt.Dimension(75, 29));
        btClear.setPreferredSize(new java.awt.Dimension(87, 29));
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });

        btHome.setText("Home");
        btHome.setPreferredSize(new java.awt.Dimension(87, 65));
        btHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btHome, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                .addComponent(btClear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jlpTenantInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(262, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btHome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jlpTenantInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(39, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbDefaultAddressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbDefaultAddressMouseClicked
        String defaultAddress = "1234 Main STREET";
        String defaultCity = "Santa Monica";
        String defaultState = "CA";
        String defaultZip = "90403";

        tfStreetAddress.setText(defaultAddress);
        tfStreetAddress.setEditable(false);
        tfCity.setText(defaultCity);
        tfCity.setEditable(false);
        tfState.setSelectedItem(defaultState);
        tfState.setEditable(false);
        tfZipCode.setText(defaultZip);
        tfZipCode.setEditable(false);
    }//GEN-LAST:event_jrbDefaultAddressMouseClicked

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed

        this.settingFields(); 

        if(tfTenantID.getText().equals("") || tfApt.getText().equals("") || tfFirstName.getText().equals("")
            || tfLastName.getText().equals("") || tfTenantID.getText().equals("")){

            JOptionPane.showMessageDialog(null, "Please enter all of the tenant information.",
                "Input error", JOptionPane.ERROR_MESSAGE);

        }
        else{
           
            Residence lease = new Residence();
            Invoice invoice = new Invoice();
            
            currentTenant.setBirthDate(tfDOB.getText());
            currentTenant.setFirstName(tfFirstName.getText());
            currentTenant.setLastName(tfLastName.getText());
            currentTenant.setStreet(tfStreetAddress.getText());
            currentTenant.setCity(tfCity.getText());
            currentTenant.setState(tfState.getSelectedItem().toString());
            currentTenant.setPhoneNum(tfPhone.getText());
            currentTenant.setZip(tfZipCode.getText());
            currentTenant.setEmail(tfEmail.getText());
            currentTenant.setSpecNeeds(tfSpecialNeeds.getText());

            //sets TenantID from last ID in database
            currentTenant.setTenantID(lastNum);

            currentTenant.setApt(tfApt.getText());
            lease.setInvoice(invoice);
            lease.setResID(lastNum);
            lease.setResID(Integer.parseInt(tfTenantID.getText()));

            currentTenant.setLease(lease);

            DBConnectionMgr connect = new DBConnectionMgr();
            boolean flag = false;
            try {
                flag = connect.addTenant(currentTenant);

            } catch (Exception ex) {
                Logger.getLogger(CreateTenant.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                if(flag){
                    JOptionPane.showMessageDialog(null, "Tenant Added");
                }
                else
                JOptionPane.showMessageDialog(null, "Unable to add Tenant!");

            } catch (Exception ex) {
                Logger.getLogger(CreateTenant.class.getName()).log(Level.SEVERE,
                    null, ex);
            }
            int result = JOptionPane.showConfirmDialog(null, "Do you want to add another Tenant?");

            if(result == JOptionPane.YES_OPTION){
               new AddTenant(currentTenant).setVisible(true);
               dispose();
            }
            if(result == JOptionPane.NO_OPTION){
                new MainWindow().setVisible(true);
                dispose();
            }
            dispose();

        }
    }//GEN-LAST:event_btSaveActionPerformed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed

        this.tfApt.setText("");
        this.tfCity.setText("");
        this.tfEmail.setText("");
        this.tfFirstName.setText("");
        this.tfLastName.setText("");
        this.tfStreetAddress.setText("");
        this.tfPhone.setText("");
        this.tfZipCode.setText("");
        this.tfSpecialNeeds.setText("");
        this.tfDOB.setText("");
        this.tfTenantID.setText(Integer.toString(lastNum));
        this.jrbDefaultAddress.setSelected(false);

    }//GEN-LAST:event_btClearActionPerformed

    private void btHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHomeActionPerformed
        new MainWindow().setVisible(true);
        dispose();

    }//GEN-LAST:event_btHomeActionPerformed

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
            java.util.logging.Logger.getLogger(AddTenant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTenant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTenant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTenant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTenant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClear;
    private javax.swing.JButton btHome;
    private javax.swing.JButton btSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jlpTenantInfo;
    private javax.swing.JRadioButton jrbDefaultAddress;
    private javax.swing.JLabel lbAptNum;
    private javax.swing.JLabel lbCity;
    private javax.swing.JLabel lbDOB;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbFirstName;
    private javax.swing.JLabel lbLastName;
    private javax.swing.JLabel lbSpecialNeeds;
    private javax.swing.JLabel lbState;
    private javax.swing.JLabel lbStreetAddress;
    private javax.swing.JLabel lbTelephone;
    private javax.swing.JLabel lbZipCode;
    private javax.swing.JTextField tfApt;
    private javax.swing.JTextField tfCity;
    private javax.swing.JFormattedTextField tfDOB;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JFormattedTextField tfPhone;
    private javax.swing.JTextField tfSpecialNeeds;
    private javax.swing.JComboBox tfState;
    private javax.swing.JTextField tfStreetAddress;
    private javax.swing.JTextField tfTenantID;
    private javax.swing.JTextField tfZipCode;
    // End of variables declaration//GEN-END:variables
}
