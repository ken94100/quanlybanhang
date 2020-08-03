/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrangFrame;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Nguyễn Thành lộc
 */
public class Dangki extends javax.swing.JInternalFrame {

    /**
     * Creates new form Dangki
     */
    public Dangki() {
        initComponents();
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
        jRadioButton1 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        lbltendangnhap1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtManv = new javax.swing.JTextField();
        lbltendangnhap2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDiachi = new javax.swing.JTextField();
        cboGioitinh = new javax.swing.JComboBox<>();
        lbltendangnhap3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rbtQuanly = new javax.swing.JRadioButton();
        rbtNhanvien = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        lbltendangnhap4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTaikhoanmoi = new javax.swing.JTextField();
        txtMatkhaumoi = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        txtnhaplaimk = new javax.swing.JPasswordField();
        btndangkymoi = new javax.swing.JButton();
        txtSDT = new javax.swing.JTextField();
        txtHoten = new javax.swing.JTextField();
        txtNgaysinh = new javax.swing.JTextField();

        lbltendangnhap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbltendangnhap.setText("Tên đăng nhập");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mật Khẩu");

        txtTaikhoan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtMatkhau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jRadioButton1.setText("jRadioButton1");

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Đăng kí");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Đăng ký thành viên");

        lbltendangnhap1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbltendangnhap1.setText("Mã nhân viên");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Họ tên");

        txtManv.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbltendangnhap2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbltendangnhap2.setText("Ngày Sinh");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Giới tính");

        txtDiachi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cboGioitinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Giới tính khác" }));
        cboGioitinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGioitinhActionPerformed(evt);
            }
        });

        lbltendangnhap3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbltendangnhap3.setText("Địa chỉ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Số điện thoại");

        buttonGroup1.add(rbtQuanly);
        rbtQuanly.setText("Quản lý");

        buttonGroup1.add(rbtNhanvien);
        rbtNhanvien.setText("Nhân viên");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Quyền");

        lbltendangnhap4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbltendangnhap4.setText("Tên đăng nhập");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Mật Khẩu");

        txtTaikhoanmoi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTaikhoanmoi.setToolTipText("");

        txtMatkhaumoi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Nhập lại mật khẩu");

        txtnhaplaimk.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtnhaplaimk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnhaplaimkActionPerformed(evt);
            }
        });

        btndangkymoi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btndangkymoi.setText("Đăng ký");
        btndangkymoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangkymoiActionPerformed(evt);
            }
        });

        txtSDT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtHoten.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtNgaysinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(lbltendangnhap4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(lbltendangnhap3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(lbltendangnhap1)
                    .addComponent(lbltendangnhap2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTaikhoanmoi, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                    .addComponent(txtDiachi, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                    .addComponent(txtManv, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                    .addComponent(cboGioitinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMatkhaumoi)
                    .addComponent(txtnhaplaimk)
                    .addComponent(btndangkymoi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbtQuanly, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSDT)
                    .addComponent(txtHoten)
                    .addComponent(txtNgaysinh))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cboGioitinh, txtDiachi, txtManv});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, lbltendangnhap1, lbltendangnhap2, lbltendangnhap3, lbltendangnhap4, rbtQuanly});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtMatkhaumoi, txtTaikhoanmoi, txtnhaplaimk});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbltendangnhap2)
                            .addComponent(txtNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltendangnhap1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboGioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltendangnhap3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtQuanly)
                    .addComponent(rbtNhanvien)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTaikhoanmoi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltendangnhap4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatkhaumoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnhaplaimk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(35, 35, 35)
                .addComponent(btndangkymoi, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cboGioitinh, txtDiachi, txtManv});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, lbltendangnhap1, lbltendangnhap2, lbltendangnhap3, lbltendangnhap4, rbtNhanvien, rbtQuanly});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtMatkhaumoi, txtTaikhoanmoi, txtnhaplaimk});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboGioitinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGioitinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboGioitinhActionPerformed

    private void txtnhaplaimkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnhaplaimkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnhaplaimkActionPerformed

    private void btndangkymoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangkymoiActionPerformed
        checkNull();
    }//GEN-LAST:event_btndangkymoiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndangkymoi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboGioitinh;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel lbltendangnhap;
    private javax.swing.JLabel lbltendangnhap1;
    private javax.swing.JLabel lbltendangnhap2;
    private javax.swing.JLabel lbltendangnhap3;
    private javax.swing.JLabel lbltendangnhap4;
    private javax.swing.JRadioButton rbtNhanvien;
    private javax.swing.JRadioButton rbtQuanly;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JTextField txtManv;
    private javax.swing.JPasswordField txtMatkhau;
    private javax.swing.JPasswordField txtMatkhaumoi;
    private javax.swing.JTextField txtNgaysinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTaikhoan;
    private javax.swing.JTextField txtTaikhoanmoi;
    private javax.swing.JPasswordField txtnhaplaimk;
    // End of variables declaration//GEN-END:variables
public void checkNull() {
        try {
            if (txtManv.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Hãy nhập vào mã nhân viên");
                txtManv.requestFocus();
                return;
            }
            if (txtHoten.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Nhập vào họ và tên");
                txtHoten.requestFocus();
                return;
            }
            if (txtNgaysinh.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Bạn chưa nhập ngày sinh");
                txtNgaysinh.requestFocus();
                return;
            }
            if (txtDiachi.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Nhập vào địa chỉ");
                txtDiachi.requestFocus();
                return;
            }
            try {
                  if ( Integer.valueOf(txtSDT.getText()).equals("")) {
                JOptionPane.showMessageDialog(this, "Nhập vào số điện thoại");
                txtSDT.requestFocus();
                return;
            } else if (txtSDT.getText().length() < 10 || txtSDT.getText().length() > 10) {
                JOptionPane.showMessageDialog(this, "Số điện thoại phải có 10 số");
                txtSDT.requestFocus();
                return;
            }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Số điện thoại phải là số");
            }
          
            if (txtTaikhoanmoi.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Nhập vào tài khoản của bạn");
                txtTaikhoanmoi.requestFocus();
                return;
            }
            if (txtMatkhaumoi.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Nhập vào mật khẩu của bạn");
                txtMatkhaumoi.requestFocus();
                return;
            }
            if (txtnhaplaimk.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Bạn chưa nhập lại mật khẩu");
                txtnhaplaimk.requestFocus();
                return;
            } else if (!txtnhaplaimk.getText().equals(txtMatkhaumoi.getText())) {
                JOptionPane.showMessageDialog(this, "Mật khẩu không trùng khớp !!");
                txtnhaplaimk.requestFocus();
                return;
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Lỗi!!!");
        }
    }
}