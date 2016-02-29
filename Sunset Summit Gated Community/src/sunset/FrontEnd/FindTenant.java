package sunset.FrontEnd;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import sunset.BackEnd.ConnectionDAO;
import sunset.BackEnd.DBConnectionMgr;
import sunset.domain.*;

/* FILENAME: FindTenant
 * DESCRIPTION: FindTenant will parse through the database looking for the 
 *              specific tenant information keyed by TenantID
 */
public class FindTenant extends javax.swing.JFrame {

    /**
     * Creates new form Search
     */
    public FindTenant() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbFindTitle = new javax.swing.JLayeredPane();
        tfTenantID = new javax.swing.JTextField();
        lbTenantID = new javax.swing.JLabel();
        lbFirstName = new javax.swing.JLabel();
        tfFirstName = new javax.swing.JTextField();
        lbLastName = new javax.swing.JLabel();
        tfLastName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTenant = new javax.swing.JTable();
        rbAllTenant = new javax.swing.JRadioButton();
        btFind = new javax.swing.JButton();
        btHome = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btRemove = new javax.swing.JButton();
        lbApt = new javax.swing.JLabel();
        tfApt = new javax.swing.JTextField();
        tbGetMoreInfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Find Tenant");

        lbFindTitle.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Find Tenant", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 3, 13))); // NOI18N

        tfTenantID.setColumns(10);
        tfTenantID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTenantIDKeyTyped(evt);
            }
        });

        lbTenantID.setText("Tenant ID #");

        lbFirstName.setText("First Name:");

        lbLastName.setText("Last Name: ");

        jtTenant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TenantID", "First", "Last", "Dob", "Address", "Apt #", "City", "State", "Zip", "Phone", "Email", "Special Needs"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtTenant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTenantMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtTenant);

        rbAllTenant.setText("All Tenants");

        btFind.setText("Find Tenant");
        btFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFindActionPerformed(evt);
            }
        });
        btFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btFindKeyPressed(evt);
            }
        });

        btHome.setText("Home");
        btHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHomeActionPerformed(evt);
            }
        });

        btEdit.setText("Update Tenant");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btRemove.setText("Remove Tenant");
        btRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoveActionPerformed(evt);
            }
        });

        lbApt.setText("Apt #:");

        tbGetMoreInfo.setText("Get More Information");
        tbGetMoreInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbGetMoreInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lbFindTitleLayout = new javax.swing.GroupLayout(lbFindTitle);
        lbFindTitle.setLayout(lbFindTitleLayout);
        lbFindTitleLayout.setHorizontalGroup(
            lbFindTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbFindTitleLayout.createSequentialGroup()
                .addGroup(lbFindTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(lbFindTitleLayout.createSequentialGroup()
                        .addComponent(btHome, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btFind, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lbFindTitleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(lbFindTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTenantID)
                            .addComponent(lbFirstName))
                        .addGap(14, 14, 14)
                        .addGroup(lbFindTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfFirstName)
                            .addComponent(tfTenantID, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(lbFindTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbApt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(lbFindTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(tfApt))
                        .addGap(51, 51, 51)
                        .addGroup(lbFindTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbAllTenant)
                            .addComponent(tbGetMoreInfo))
                        .addGap(232, 232, 232)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        lbFindTitleLayout.setVerticalGroup(
            lbFindTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbFindTitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(lbFindTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbFindTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfTenantID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbTenantID)
                        .addComponent(lbApt)
                        .addComponent(tfApt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rbAllTenant, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbFindTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lbFindTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbFirstName)
                        .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbLastName)
                        .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tbGetMoreInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbFindTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btHome)
                    .addComponent(btEdit)
                    .addComponent(btRemove)
                    .addComponent(btFind)))
        );
        lbFindTitle.setLayer(tfTenantID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lbFindTitle.setLayer(lbTenantID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lbFindTitle.setLayer(lbFirstName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lbFindTitle.setLayer(tfFirstName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lbFindTitle.setLayer(lbLastName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lbFindTitle.setLayer(tfLastName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lbFindTitle.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lbFindTitle.setLayer(rbAllTenant, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lbFindTitle.setLayer(btFind, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lbFindTitle.setLayer(btHome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lbFindTitle.setLayer(btEdit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lbFindTitle.setLayer(btRemove, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lbFindTitle.setLayer(lbApt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lbFindTitle.setLayer(tfApt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lbFindTitle.setLayer(tbGetMoreInfo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFindTitle)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbFindTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHomeActionPerformed
        new MainWindow().setVisible(true);
        dispose();
    }//GEN-LAST:event_btHomeActionPerformed

    /**
     * btEditActionPerformed will edit the data from the found tenant info
     * @param evt 
     */
    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed

        if(jtTenant.getSelectionModel().isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, "Must select a Tenant from list!");
        }
        else{
            int index = jtTenant.getSelectedRow();
            String id, name, last, address, apt, birthday, city, state, zip, phone, email, specialNeeds;
            
            TableModel model = jtTenant.getModel();
            id = model.getValueAt(index, 0).toString();
            name = model.getValueAt(index, 1).toString();
            last = model.getValueAt(index, 2).toString();
            birthday = model.getValueAt(index, 3).toString();
            address = model.getValueAt(index, 4).toString();
            apt = model.getValueAt(index, 5).toString();
            city = model.getValueAt(index, 6).toString();
            state = model.getValueAt(index, 7).toString();
            zip = model.getValueAt(index, 8).toString();
            phone = model.getValueAt(index, 9).toString();
            email = model.getValueAt(index, 10).toString();
            specialNeeds = model.getValueAt(index, 11).toString();
            
            
            Tenant tenant = new Tenant(Integer.parseInt(id),Integer.parseInt(id), last, name, phone, email, address, apt, city,
                                        state, zip, birthday, specialNeeds);
            
            
            UpdateTenant editTenant =  new UpdateTenant(tenant);
            
            editTenant.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btEditActionPerformed

    /**
     * tfTenantIDKeyTyped will limit the user input of TenantID to be 
     * of numerical value
     * @param evt 
     */
    private void tfTenantIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTenantIDKeyTyped
        char tempChar = evt.getKeyChar();
        
        if(!(Character.isDigit(tempChar) || tempChar == KeyEvent.VK_BACK_SPACE)
                || tempChar == KeyEvent.VK_DELETE){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tfTenantIDKeyTyped

    /*
     *  Action handler for the Find buttom
     *  It will call either search for searchAllTenant() or findTenant()
     *  to search for all of tenant or one particular tenant
     */
    private void btFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFindActionPerformed
        
        if(tfTenantID.getText().equals("") && tfApt.getText().equals("") && tfFirstName.getText().equals("")
                    && tfLastName.getText().equals("") && !rbAllTenant.isSelected()){
            
            JOptionPane.showMessageDialog(null, "Please enter data to search!");

        }
        else{
            
            // create tenant obj, database connection object 
            // and a list to store tenants retrieved from database
            Tenant tenant = new Tenant();
            ConnectionDAO dao = new ConnectionDAO();
            List<Tenant> tenantList = new ArrayList<>();
            

            tenant.setFirstName(tfFirstName.getText());
            tenant.setLastName(tfLastName.getText());
            tenant.setApt(tfApt.getText());
            
            if(!tfTenantID.getText().equals("") )
                tenant.setTenantID(Integer.parseInt(tfTenantID.getText()));
            
        
            try {
                // search for all tenant 
                if(rbAllTenant.isSelected()){
                    
                    tfTenantID.setText("");
                    tfFirstName.setText("");
                    tfLastName.setText("");
                    tfApt.setText("");
                    
                    tenantList = dao.getAllTenant();
                    
                    rbAllTenant.setSelected(false); // deselect the radio button
                }else{
                    
                    //search for specific tenant
                    tenantList = dao.findTenant(tenant);
                    
                }
                    
                DisplayTable(tenantList);
               
            } catch (Exception e) {
            
            }
        }
        
    }//GEN-LAST:event_btFindActionPerformed

     /*
     *  Action handler for the Remove buttom
     *  It will call either search for getSelectedRow(), deleteTenant(), getAllTenant(), and Create DBConnectionMgr
     *  to search for all of tenant and deletes the tenant from database list is refreshed
     */
    private void btRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveActionPerformed
       try{
           
            boolean flag;
           
            Tenant tenant = new Tenant();
            List<Tenant> tenantList = new ArrayList<>();
        
            jtTenant.getSelectedRow();
            int row = jtTenant.getSelectedRow();
    
            tenant.setTenantID(Integer.parseInt(jtTenant.getValueAt(row, 0).toString()));
            tenant.setFirstName(jtTenant.getValueAt(row, 1).toString());
            tenant.setLastName(jtTenant.getValueAt(row, 1).toString());
            
            DBConnectionMgr dao = new DBConnectionMgr();
            
            flag = dao.deleteTenant(tenant);
            
            if(flag){
                JOptionPane.showMessageDialog(null, "Tenant Deleted!");
            }
            else
                JOptionPane.showMessageDialog(null, "Unable to delete tenant, check with administrator!");
            
            tenantList = dao.getAllTenant();
            DisplayTable(tenantList);
                 

       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Something when wrong, Item not deleted!");
       }
 
    }//GEN-LAST:event_btRemoveActionPerformed

    private void jtTenantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTenantMouseClicked
       Tenant tempTenant = new Tenant();
       
       // Code to find more details about the Tenant will go here.
    }//GEN-LAST:event_jtTenantMouseClicked

    private void btFindKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btFindKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btFindKeyPressed

    private void tbGetMoreInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbGetMoreInfoActionPerformed
        
        if(jtTenant.getSelectionModel().isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, "Must select a Tenant from list!");
        }
        else{
            int index = jtTenant.getSelectedRow();
            String id, name, last, address, apt, birthday, city, state, zip, phone, email, specialNeeds;
            
            TableModel model = jtTenant.getModel();
            id = model.getValueAt(index, 0).toString();
            name = model.getValueAt(index, 1).toString();
            last = model.getValueAt(index, 2).toString();
            birthday = model.getValueAt(index, 3).toString();
            address = model.getValueAt(index, 4).toString();
            apt = model.getValueAt(index, 5).toString();
            city = model.getValueAt(index, 6).toString();
            state = model.getValueAt(index, 7).toString();
            zip = model.getValueAt(index, 8).toString();
            phone = model.getValueAt(index, 9).toString();
            email = model.getValueAt(index, 10).toString();
            specialNeeds = model.getValueAt(index, 11).toString();
            
            
            Tenant tenant = new Tenant(Integer.parseInt(id),Integer.parseInt(id), last, name, phone, email, address, apt, city,
                                        state, zip, birthday, specialNeeds);
            
            
            AdditionalData addInfo =  new AdditionalData(tenant);
            
            addInfo.setVisible(true);
            
        }
    }//GEN-LAST:event_tbGetMoreInfoActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info :
                    javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException |
                javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FindTenant.class.getName()).
                    log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FindTenant().setVisible(true);
            }
        });
    }
    /*
     * Method is use to layout the data from database into the GUI table
    */
    private void DisplayTable(List<Tenant> tenantList){

        DefaultTableModel model=(DefaultTableModel)jtTenant.getModel();
        model.setRowCount(0);
        
        for(Tenant temp: tenantList) {
            model.addRow(new Object[]{temp.getTenantID(), temp.getFirstName(), temp.getLastName(), temp.getBirthDate(), temp.getStreet(), temp.getApt(), temp.getCity(), temp.getState(),
                temp.getZip(), temp.getPhoneNum(),temp.getEmail(), temp.getSpecNeeds()}); 

        }

    } // end of DisplayTable


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btFind;
    private javax.swing.JButton btHome;
    private javax.swing.JButton btRemove;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtTenant;
    private javax.swing.JLabel lbApt;
    private javax.swing.JLayeredPane lbFindTitle;
    private javax.swing.JLabel lbFirstName;
    private javax.swing.JLabel lbLastName;
    private javax.swing.JLabel lbTenantID;
    private javax.swing.JRadioButton rbAllTenant;
    private javax.swing.JButton tbGetMoreInfo;
    private javax.swing.JTextField tfApt;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JTextField tfTenantID;
    // End of variables declaration//GEN-END:variables
}
