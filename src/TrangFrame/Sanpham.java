/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrangFrame;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nguyễn Thành lộc
 */
public class Sanpham extends javax.swing.JInternalFrame {

    /**
     * Creates new form Sanpham
     */
    public Sanpham() {
        initComponents();
        
         this.ListSP = new ArrayList<>();

        this.conn = this.getConnection();
        this.ListSP = this.fetchlist();
        this.RenderTable(ListSP);

    
    }
    
    ArrayList<ClassSp> ListSP;
    DefaultTableModel model;
    
    int index;
    
    protected String dbUsername, dbPassword;
    
    Connection conn;
    
    protected Connection getConnection() {
        Connection conn = null;
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyBanHang";
            
            String dbUsername = "sa", dbPassword = "Aa123";
            conn = DriverManager.getConnection(url, dbUsername, dbPassword);
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(KhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
        
    }
    
    protected ArrayList<ClassSp> fetchlist() {
        ArrayList<ClassSp> result = new ArrayList<>();
        
        String query = "select * from Sanpham";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
//                MaSP ,TenSP ,SoLuong,DonGia ,NgaySanXuat
                String masp = rs.getString("MaSP");
                String tensp = rs.getString("TenSP");         
                String Soluong = rs.getString("Soluong");
                int Dongia = rs.getInt("Dongia");
                Date Ngaynhap = rs.getDate("Ngaysanxuat");
                result.add(new ClassSp(masp, tensp, Soluong, Dongia, Ngaynhap));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Nhanvien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
        
    }
    
    public void RenderTable(ArrayList<ClassSp> data) {
        model = (DefaultTableModel) this.tblQlSP.getModel();
        model.setRowCount(0);
        for (int i = 0; i < data.size(); i++) {
            ClassSp kh = data.get(i);
            model.addRow(new Object[]{
                kh.getMaSP(),
                kh.getTenSP(),
                kh.getSoLuong(),
                kh.getDonGia(),
                kh.getNgayNhap()            
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

        lbltendangnhap = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTaikhoan = new javax.swing.JTextField();
        txtMatkhau = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQlSP = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lbltendangnhap1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtmasp = new javax.swing.JTextField();
        lbltendangnhap2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtdongia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        btnDangnhap = new javax.swing.JButton();
        txtngaynhap = new javax.swing.JTextField();
        txttensp = new javax.swing.JTextField();
        txtsoluong = new javax.swing.JTextField();

        lbltendangnhap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbltendangnhap.setText("Tên đăng nhập");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mật Khẩu");

        txtTaikhoan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtMatkhau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Sản phẩm");

        tblQlSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Đơn giá", "Ngày nhập"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblQlSP);
        if (tblQlSP.getColumnModel().getColumnCount() > 0) {
            tblQlSP.getColumnModel().getColumn(0).setResizable(false);
            tblQlSP.getColumnModel().getColumn(3).setResizable(false);
            tblQlSP.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Quản lý sản phẩm");

        lbltendangnhap1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbltendangnhap1.setText("Mã sản phẩm");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Tên sản phẩm");

        txtmasp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbltendangnhap2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbltendangnhap2.setText("Đơn giá");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Số lượng");

        txtdongia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Ngày nhập");

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\plus.png")); // NOI18N
        jButton1.setText("Thêm");

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\restore.png")); // NOI18N
        jButton2.setText("Sửa");

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\close.png")); // NOI18N
        jButton3.setText("Xóa");

        btnLuu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\correct.png")); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Tìm kiếm sản phẩm");

        txtsearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnDangnhap.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnDangnhap.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\search (1).png")); // NOI18N
        btnDangnhap.setText("Tìm kiếm");
        btnDangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangnhapActionPerformed(evt);
            }
        });

        txtngaynhap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txttensp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtsoluong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbltendangnhap1)
                                    .addComponent(jLabel3))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtmasp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtdongia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtngaynhap, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txttensp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lbltendangnhap2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtsearch)
                                .addGap(18, 18, 18)
                                .addComponent(btnDangnhap))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addGap(60, 60, 60)
                                        .addComponent(jButton3)
                                        .addGap(60, 60, 60)
                                        .addComponent(btnLuu))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel1)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel3, lbltendangnhap1, lbltendangnhap2});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel4, jLabel5});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLuu, jButton1, jButton2, jButton3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbltendangnhap1)
                            .addComponent(txtmasp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txttensp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbltendangnhap2)
                            .addComponent(txtdongia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtngaynhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(btnLuu))
                .addGap(52, 52, 52)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDangnhap))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnLuu, jButton1, jButton2, jButton3});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDangnhap, txtsearch});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangnhapActionPerformed
        if (txtsearch.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập mã sản phẩm!!");
            txtsearch.requestFocus();
            return;
        }
    }//GEN-LAST:event_btnDangnhapActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        checknull();
    }//GEN-LAST:event_btnLuuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangnhap;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltendangnhap;
    private javax.swing.JLabel lbltendangnhap1;
    private javax.swing.JLabel lbltendangnhap2;
    private javax.swing.JTable tblQlSP;
    private javax.swing.JPasswordField txtMatkhau;
    private javax.swing.JTextField txtTaikhoan;
    private javax.swing.JTextField txtdongia;
    private javax.swing.JTextField txtmasp;
    private javax.swing.JTextField txtngaynhap;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtsoluong;
    private javax.swing.JTextField txttensp;
    // End of variables declaration//GEN-END:variables
public void checknull() {
        try {

            //check null
            if (txtmasp.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Mã sản phẩm không được để trống !");
                txtmasp.requestFocus();
                return;
            }
            if (txttensp.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Tên sản phẩm không được để trống");
                txttensp.requestFocus();
                return;
            }
            if (txtdongia.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Đơn gía không được để trống");
                txtdongia.requestFocus();
                return;
            } else if (Integer.parseInt(txtdongia.getText()) <= 0) {
                JOptionPane.showMessageDialog(this, "Đơn giá  > 0");
                txtdongia.requestFocus();
                return;
            }
            
            if (String.valueOf(txtsoluong).equals("")) {
                JOptionPane.showMessageDialog(this, "Số lượng phải là số!");
                txtsoluong.requestFocus();
                return;
            } else if (Integer.parseInt(txtsoluong.getText()) <= 0) {
                JOptionPane.showMessageDialog(this, "Số lượng > 0");
                txtsoluong.requestFocus();
                return;
            }
            
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Lỗi nhập thông tin!");
        }
    }
}
