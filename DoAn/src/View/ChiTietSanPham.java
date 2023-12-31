/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import BUS.NhanVienBUS;
import BUS.SanPhamBUS;
import DTO.SanPham;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author asus
 */
public class ChiTietSanPham extends javax.swing.JFrame {

    /**
     * Creates new form ChiTietSanPham
     */
    String user;
    int maSP;
    public ChiTietSanPham(String a, int maSP) throws HeadlessException {
        initComponents();
        setLocationRelativeTo(null);
        this.user = a;
        this.maSP = maSP;
        loadChiTietSanPham();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSLSan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMauSac = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        Back = new javax.swing.JButton();
        ImageFlo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTenSP = new javax.swing.JTextArea();
        txtMaLoaiSP = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chi tiết sản phẩm");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(231, 238, 237));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageText/tag/Sản phẩm.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageText/tag/Đăng xuất.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Mã sản phẩm");

        txtMaSP.setBackground(new java.awt.Color(249, 255, 254));
        txtMaSP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMaSP.setForeground(new java.awt.Color(0, 0, 0));
        txtMaSP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtMaSP.setCaretColor(new java.awt.Color(0, 0, 0));
        txtMaSP.setFocusable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tên sản phẩm");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Giá");

        txtGia.setBackground(new java.awt.Color(249, 255, 254));
        txtGia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtGia.setForeground(new java.awt.Color(0, 0, 0));
        txtGia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtGia.setCaretColor(new java.awt.Color(0, 0, 0));
        txtGia.setFocusable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Mã loại SP");

        txtSLSan.setBackground(new java.awt.Color(249, 255, 254));
        txtSLSan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSLSan.setForeground(new java.awt.Color(0, 0, 0));
        txtSLSan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtSLSan.setCaretColor(new java.awt.Color(0, 0, 0));
        txtSLSan.setFocusable(false);
        txtSLSan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSLSanActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("SL sẵn");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Ghi chú");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Màu sắc");

        txtMauSac.setBackground(new java.awt.Color(249, 255, 254));
        txtMauSac.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMauSac.setForeground(new java.awt.Color(0, 0, 0));
        txtMauSac.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtMauSac.setCaretColor(new java.awt.Color(0, 0, 0));
        txtMauSac.setFocusable(false);
        txtMauSac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMauSacActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Ảnh hoa");

        txtGhiChu.setEditable(false);
        txtGhiChu.setBackground(new java.awt.Color(249, 255, 254));
        txtGhiChu.setColumns(20);
        txtGhiChu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtGhiChu.setForeground(new java.awt.Color(0, 0, 0));
        txtGhiChu.setLineWrap(true);
        txtGhiChu.setRows(5);
        txtGhiChu.setBorder(null);
        txtGhiChu.setFocusable(false);
        jScrollPane1.setViewportView(txtGhiChu);

        Back.setBackground(new java.awt.Color(249, 255, 254));
        Back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(196, 100, 96));
        Back.setText("Quay lại");
        Back.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.setFocusPainted(false);
        Back.setFocusable(false);
        Back.setRequestFocusEnabled(false);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        txtTenSP.setBackground(new java.awt.Color(249, 255, 254));
        txtTenSP.setColumns(20);
        txtTenSP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTenSP.setLineWrap(true);
        txtTenSP.setRows(5);
        txtTenSP.setFocusable(false);
        jScrollPane2.setViewportView(txtTenSP);

        txtMaLoaiSP.setBackground(new java.awt.Color(249, 255, 254));
        txtMaLoaiSP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMaLoaiSP.setForeground(new java.awt.Color(0, 0, 0));
        txtMaLoaiSP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtMaLoaiSP.setCaretColor(new java.awt.Color(0, 0, 0));
        txtMaLoaiSP.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaLoaiSP)
                                    .addComponent(jScrollPane1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2)
                                    .addComponent(txtMaSP))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5))
                        .addGap(66, 66, 66))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(451, 451, 451)
                                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jLabel2))
                    .addComponent(ImageFlo, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtSLSan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                        .addComponent(txtMauSac, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtGia, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtSLSan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(ImageFlo, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtMaLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(246, 246, 246))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65))))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSLSanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSLSanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSLSanActionPerformed

    private void txtMauSacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMauSacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMauSacActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        hide();
        switch (checkChucVu()) {
            case 1:
            case 4:
                TraCuuSanPham_QL.main(user);
                break;
            case 2:
            case 3:
                TraCuuSanPham_NV.main(user);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_BackActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        hide();
        WelcomeScreen.main(null);
    }//GEN-LAST:event_jLabel2MouseClicked

    public int checkChucVu() {
        NhanVienBUS bus = new NhanVienBUS();
        String chucVu = bus.getChucVu(user);
        if (chucVu.equals("Quản lý")) {
            return 1;
        } else if (chucVu.equals("Thu ngân")) {
            return 2;
        } else if (chucVu.equals("Bán hàng")) {
            return 3;
        } else {
            return 4;
        }
    }
    
    public void loadChiTietSanPham() {
        SanPham dt = SanPhamBUS.getChiTietSanPham(maSP);
        int maSP = dt.getMaSP();
        String tenSP = dt.getTenSP();
        long gia = dt.getGiaSP();
        int maloaiSP = dt.getMaLoaiSP();
        String mausac = dt.getMauSac();
        int slsan = dt.getSlsan();
        String ghichu = dt.getGhiChu();
        String anhSP = dt.getAnhSP();

        txtMaSP.setText(Integer.toString(maSP));
        txtTenSP.setText(tenSP);
        txtGia.setText(Long.toString(gia));
        txtMauSac.setText(mausac);
        txtGhiChu.setText(ghichu);
        txtSLSan.setText(Integer.toString(slsan));
        txtMaLoaiSP.setText(Integer.toString(maloaiSP));
        
        ImageIcon MyImage = null;
        ImageIcon image = null;

        BufferedImage myPicture = null;
        if (anhSP.contains("build\\classes")) {
            try {
                myPicture = ImageIO.read(new File(anhSP));
            } catch (IOException ex) {
                Logger.getLogger(ChiTietSanPham.class.getName()).log(Level.SEVERE, null, ex);
            }
            Image newImg = myPicture.getScaledInstance(ImageFlo.getWidth(), ImageFlo.getHeight(), Image.SCALE_SMOOTH);
            image = new ImageIcon(newImg);

        } else {
            MyImage = new ImageIcon(getClass().getResource("/HinhAnh/" + anhSP));
            Image img = MyImage.getImage();
            Image newImg = img.getScaledInstance(ImageFlo.getWidth(), ImageFlo.getHeight(), Image.SCALE_SMOOTH);
            image = new ImageIcon(newImg);
        }

        ImageFlo.setIcon(image);
        
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String arg1, int arg2) {
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
            java.util.logging.Logger.getLogger(ChiTietSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChiTietSanPham(arg1, arg2).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel ImageFlo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaLoaiSP;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtMauSac;
    private javax.swing.JTextField txtSLSan;
    private javax.swing.JTextArea txtTenSP;
    // End of variables declaration//GEN-END:variables
}
