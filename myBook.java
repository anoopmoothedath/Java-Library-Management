package book;

import com.mysql.jdbc.*;
import java.sql.DriverManager;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class myBook extends javax.swing.JFrame {
    public myBook() {
        initComponents();
        LoadTable();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        T_author = new javax.swing.JTextField();
        T_publisher = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        T_preface = new javax.swing.JTextField();
        B_modBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        B_clearBtn = new javax.swing.JButton();
        T_accnum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        T_name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        B_addBtn = new javax.swing.JButton();
        B_deleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        datatab = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jLabel9.setText("Publisher");

        jLabel10.setText("Preface");

        B_modBtn.setText("Modify");
        B_modBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_modBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Accession Number");

        B_clearBtn.setText("Clear");
        B_clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_clearBtnActionPerformed(evt);
            }
        });

        jLabel7.setText("Name");

        jLabel8.setText("Author");

        B_addBtn.setText("Add");
        B_addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_addBtnActionPerformed(evt);
            }
        });

        B_deleteBtn.setText("Delete");
        B_deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_deleteBtnActionPerformed(evt);
            }
        });

        datatab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        datatab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datatabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(datatab);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B_addBtn)
                        .addGap(18, 18, 18)
                        .addComponent(B_deleteBtn)
                        .addGap(18, 18, 18)
                        .addComponent(B_modBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B_clearBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(T_preface, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(T_publisher, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 4, Short.MAX_VALUE)))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(T_name)
                            .addComponent(T_author)
                            .addComponent(T_accnum, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(106, 106, 106))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(T_accnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(T_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T_author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(T_publisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(T_preface, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_addBtn)
                    .addComponent(B_deleteBtn)
                    .addComponent(B_modBtn)
                    .addComponent(B_clearBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_addBtnActionPerformed
        String name,author,publisher,preface;
        String acc_num,query;
        acc_num=T_accnum.getText();
        name=T_name.getText();
        author=T_author.getText();
        publisher=T_publisher.getText();
        preface=T_preface.getText();
        query = "insert into book values ("+acc_num+",'"+name+"','"+author+"','"+publisher+"','"+preface+"')";
        connection(query);
        JOptionPane.showMessageDialog(null,"Inserted Successfully!");
        LoadTable();
    }//GEN-LAST:event_B_addBtnActionPerformed

    private void B_clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_clearBtnActionPerformed
        T_accnum.setText("");
        T_author.setText("");
        T_name.setText("");
        T_preface.setText("");
        T_publisher.setText("");
    }//GEN-LAST:event_B_clearBtnActionPerformed

    private void datatabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datatabMouseClicked
        DefaultTableModel model = (DefaultTableModel)datatab.getModel();
        int selectedRowIndex = datatab.getSelectedRow();
        String acnum = model.getValueAt(selectedRowIndex, 0).toString();
        T_accnum.setText(acnum);
        String bname = model.getValueAt(selectedRowIndex, 1).toString();
        T_name.setText(bname);
        String bauthor = model.getValueAt(selectedRowIndex, 2).toString();
        T_author.setText(bauthor);
        String bpub = model.getValueAt(selectedRowIndex, 3).toString();
        T_publisher.setText(bpub);
        String bpreface = model.getValueAt(selectedRowIndex, 4).toString();
        T_preface.setText(bpreface);
    }//GEN-LAST:event_datatabMouseClicked

    private void B_modBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_modBtnActionPerformed
        String name,author,publisher,preface;
        String acc_num;
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        acc_num=T_accnum.getText();
        name=T_name.getText();
        author=T_author.getText();
        publisher=T_publisher.getText();
        preface=T_preface.getText();
        JOptionPane.showMessageDialog(null,"Updated");
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/books","root", "root");
            String queryI = "UPDATE book SET book_name = '"+name+"',book_author = '"+author+"',book_publisher = '"+publisher+"',book_preface = '"+preface+"' where accession_number = "+acc_num+"";
            stmt = (PreparedStatement) conn.prepareStatement(queryI);           
            if(conn!=null)
                System.out.println("Connected");
            stmt.executeUpdate(queryI);
        } catch (Exception ex) {
            System.out.println("Not Connected");
        }
        LoadTable();
    }//GEN-LAST:event_B_modBtnActionPerformed

    private void B_deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_deleteBtnActionPerformed
        String acc_num;
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        acc_num=T_accnum.getText();                
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/books","root", "root");
            String queryI = "delete from book where accession_number = '"+acc_num+"' ";
            stmt = (PreparedStatement) conn.prepareStatement(queryI);           
            if(conn!=null)
                System.out.println("Connected");
            stmt.executeUpdate(queryI);
        } catch (Exception ex) {
            System.out.println("Not Connected");
        }
        JOptionPane.showMessageDialog(null,"Deleted");
        LoadTable();
    }//GEN-LAST:event_B_deleteBtnActionPerformed

    public void connection(String query) {
        Connection conn = null;
        Statement stmt;
        ResultSet rs;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/books","root", "root");
            stmt = (Statement) conn.createStatement();
            if(conn!=null)
                System.out.println("Connected");
            stmt.executeUpdate(query);
        } catch (Exception ex) {
            System.out.println("Not Connected");
        }
    }
 
    
    public void LoadTable()
    {
        Statement stmt;
       Connection conn = null;
       try {
           Class.forName("com.mysql.jdbc.Driver");
           conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/books","root", "root");
           
               stmt = (Statement) conn.createStatement();
               ResultSet rs = (ResultSet) stmt.executeQuery("select * from book");
               
               Vector head=new Vector();
               head.addElement("Acc No");
               head.addElement("Name");
               head.addElement("Author");
               head.addElement("Publisher");
               head.addElement("Preface");
               
               Vector data=new Vector();
               while(rs.next())
               {
                   Vector row=new Vector();
                   for(int i=1;i<=5;i++)
                       row.addElement(rs.getString(i));
                    data.addElement(row);
               }
               DefaultTableModel model=new DefaultTableModel(data, head);
               datatab.setModel(model);
               
               //model.getDataVector().elementAt(datatab.getSelectedRow());
               
           if(conn!=null)
               System.out.println("Connected");
       } catch (Exception ex) {
           System.out.println("Not Connected"+ex);
       }     
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myBook().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_addBtn;
    private javax.swing.JButton B_clearBtn;
    private javax.swing.JButton B_deleteBtn;
    private javax.swing.JButton B_modBtn;
    private javax.swing.JTextField T_accnum;
    private javax.swing.JTextField T_author;
    private javax.swing.JTextField T_name;
    private javax.swing.JTextField T_preface;
    private javax.swing.JTextField T_publisher;
    private javax.swing.JTable datatab;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
