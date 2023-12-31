/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import BUS.DoanhThuBUS;
import BUS.DoiTacBUS;
import BUS.KhachHangBUS;
import BUS.KhuyenMaiBUS;
import BUS.NhanVienBUS;
import BUS.SanPhamBUS;
import DTO.DoanhThu;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class Chung extends javax.swing.JFrame {

    String user;

    /**
     * Creates new form CheckInNhanVien
     */

    public Chung(String maNV) throws HeadlessException {
        initComponents();
        setLocationRelativeTo(null);
        this.user = maNV;
        setSoLieu();
    }

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        QLNVBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        QLSPBtn = new javax.swing.JButton();
        QLKHBtn = new javax.swing.JButton();
        QLDTBtn = new javax.swing.JButton();
        QLKMBtn = new javax.swing.JButton();
        QLNHBtn = new javax.swing.JButton();
        QLHDBtn = new javax.swing.JButton();
        QLDSBtn = new javax.swing.JButton();
        ChamCongBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SoNV = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        SoSP = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        SoKH = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        SoKM = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        SoDT = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        doanhThu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chung");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(231, 238, 237));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageText/tag/logo nhỏ.png"))); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(85, 122, 100));
        jSeparator1.setForeground(new java.awt.Color(85, 122, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageText/tag/Chung.png"))); // NOI18N

        QLNVBtn.setBackground(new java.awt.Color(231, 238, 237));
        QLNVBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QLNVBtn.setForeground(new java.awt.Color(196, 100, 96));
        QLNVBtn.setText("Nhân viên");
        QLNVBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        QLNVBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLNVBtn.setFocusPainted(false);
        QLNVBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLNVBtnActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(196, 100, 96));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Chung");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setRequestFocusEnabled(false);

        QLSPBtn.setBackground(new java.awt.Color(231, 238, 237));
        QLSPBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QLSPBtn.setForeground(new java.awt.Color(196, 100, 96));
        QLSPBtn.setText("Sản phẩm");
        QLSPBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        QLSPBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLSPBtn.setFocusPainted(false);
        QLSPBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLSPBtnActionPerformed(evt);
            }
        });

        QLKHBtn.setBackground(new java.awt.Color(231, 238, 237));
        QLKHBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QLKHBtn.setForeground(new java.awt.Color(196, 100, 96));
        QLKHBtn.setText("Khách hàng");
        QLKHBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        QLKHBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLKHBtn.setFocusPainted(false);
        QLKHBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLKHBtnActionPerformed(evt);
            }
        });

        QLDTBtn.setBackground(new java.awt.Color(231, 238, 237));
        QLDTBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QLDTBtn.setForeground(new java.awt.Color(196, 100, 96));
        QLDTBtn.setText("Đối tác");
        QLDTBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        QLDTBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLDTBtn.setFocusPainted(false);
        QLDTBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLDTBtnActionPerformed(evt);
            }
        });

        QLKMBtn.setBackground(new java.awt.Color(231, 238, 237));
        QLKMBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QLKMBtn.setForeground(new java.awt.Color(196, 100, 96));
        QLKMBtn.setText("Khuyến mãi");
        QLKMBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        QLKMBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLKMBtn.setFocusPainted(false);
        QLKMBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLKMBtnActionPerformed(evt);
            }
        });

        QLNHBtn.setBackground(new java.awt.Color(231, 238, 237));
        QLNHBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QLNHBtn.setForeground(new java.awt.Color(196, 100, 96));
        QLNHBtn.setText("Nhập hàng");
        QLNHBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        QLNHBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLNHBtn.setFocusPainted(false);
        QLNHBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLNHBtnActionPerformed(evt);
            }
        });

        QLHDBtn.setBackground(new java.awt.Color(231, 238, 237));
        QLHDBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QLHDBtn.setForeground(new java.awt.Color(196, 100, 96));
        QLHDBtn.setText("Hóa đơn");
        QLHDBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        QLHDBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLHDBtn.setFocusPainted(false);
        QLHDBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLHDBtnActionPerformed(evt);
            }
        });

        QLDSBtn.setBackground(new java.awt.Color(231, 238, 237));
        QLDSBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QLDSBtn.setForeground(new java.awt.Color(196, 100, 96));
        QLDSBtn.setText("Doanh thu");
        QLDSBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        QLDSBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLDSBtn.setFocusPainted(false);
        QLDSBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLDSBtnActionPerformed(evt);
            }
        });

        ChamCongBtn.setBackground(new java.awt.Color(231, 238, 237));
        ChamCongBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ChamCongBtn.setForeground(new java.awt.Color(196, 100, 96));
        ChamCongBtn.setText("Chấm công");
        ChamCongBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        ChamCongBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ChamCongBtn.setFocusPainted(false);
        ChamCongBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChamCongBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(ChamCongBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(QLNVBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(QLSPBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(QLKHBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(QLDTBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(QLKMBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(QLNHBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(QLHDBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(QLDSBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(ChamCongBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(QLNVBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QLSPBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QLKHBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(QLDTBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(QLKMBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QLNHBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QLHDBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(QLDSBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 690));

        jPanel2.setBackground(new java.awt.Color(249, 255, 254));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageText/tag/Tổng quan.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 24, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageText/tag/Đăng xuất.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 24, -1, -1));

        jPanel3.setBackground(new java.awt.Color(249, 255, 254));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(196, 100, 96)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nhân viên");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 15, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageText/icon/staff.png"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 13, 34, -1));

        SoNV.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        SoNV.setForeground(new java.awt.Color(196, 100, 96));
        SoNV.setText("14");
        jPanel3.add(SoNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 33, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 138, 300, 80));

        jPanel4.setBackground(new java.awt.Color(249, 255, 254));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(196, 100, 96)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Sản phẩm");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 15, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageText/icon/product.png"))); // NOI18N
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 13, 34, -1));

        SoSP.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        SoSP.setForeground(new java.awt.Color(196, 100, 96));
        SoSP.setText("76");
        jPanel4.add(SoSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 138, 300, 80));

        jPanel5.setBackground(new java.awt.Color(249, 255, 254));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(196, 100, 96)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Khách hàng");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 15, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageText/icon/customer.png"))); // NOI18N
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 13, 34, -1));

        SoKH.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        SoKH.setForeground(new java.awt.Color(196, 100, 96));
        SoKH.setText("11");
        jPanel5.add(SoKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 243, 300, 80));

        jPanel7.setBackground(new java.awt.Color(249, 255, 254));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(196, 100, 96)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Khuyến mãi");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 13, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageText/icon/coupon.png"))); // NOI18N
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 13, 34, 34));

        SoKM.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        SoKM.setForeground(new java.awt.Color(196, 100, 96));
        SoKM.setText("20");
        jPanel7.add(SoKM, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 353, 300, 90));

        jPanel8.setBackground(new java.awt.Color(249, 255, 254));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(196, 100, 96)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Đối tác");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 15, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageText/icon/partner.png"))); // NOI18N
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 13, 34, -1));

        SoDT.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        SoDT.setForeground(new java.awt.Color(196, 100, 96));
        SoDT.setText("24");
        jPanel8.add(SoDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 243, 300, 80));

        jPanel9.setBackground(new java.awt.Color(249, 255, 254));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(196, 100, 96)));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Doanh thu");
        jPanel9.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 15, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageText/icon/money.png"))); // NOI18N
        jPanel9.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 13, 34, -1));

        doanhThu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        doanhThu.setForeground(new java.awt.Color(196, 100, 96));
        doanhThu.setText("11");
        jPanel9.add(doanhThu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 353, 300, 90));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 760, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QLKHBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLKHBtnActionPerformed
        // TODO add your handling code here:
        hide();
        switch (checkChucVu()) {
            case 1:
            case 2:
                TraCuuKhachHang.main(user);
                break;
            case 3:
                TraCuuKhachHang_NV.main(user);
                break;
            default:
                KhachHang_KhongTruyCap_NV.main(user);
                break;
        }
    }//GEN-LAST:event_QLKHBtnActionPerformed

    private void QLNVBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLNVBtnActionPerformed
        // TODO add your handling code here:
        hide();
        if (checkChucVu() == 1) {
            TraCuuNhanVien_QL.main(user);
        } else {
            NhanVien_KhongTruyCap_NV.main(user);
        }
    }//GEN-LAST:event_QLNVBtnActionPerformed

    private void QLSPBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLSPBtnActionPerformed
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
                SanPham_KhongTruyCap_NV.main(user);
                break;
        }
    }//GEN-LAST:event_QLSPBtnActionPerformed

    private void QLDTBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLDTBtnActionPerformed
        // TODO add your handling code here:
        hide();
        if (checkChucVu() == 1) {
            TraCuuDoiTac_QL.main(user);
        } else {
            DoiTac_KhongTruyCap_NV.main(user);
        }
    }//GEN-LAST:event_QLDTBtnActionPerformed

    private void QLKMBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLKMBtnActionPerformed
        // TODO add your handling code here:
        hide();
        switch (checkChucVu()) {
            case 1:
                TraCuuKhuyenMai_QL.main(user);
                break;
            case 2:
                TraCuuKhuyenMai_NV.main(user);
                break;
            default:
                KhuyenMai_KhongTruyCap_NV.main(user);
                break;
        }
    }//GEN-LAST:event_QLKMBtnActionPerformed

    private void QLNHBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLNHBtnActionPerformed
        // TODO add your handling code here:
        hide();
        switch (checkChucVu()) {
            case 1:
            case 4:
                TraCuuNhapHang.main(user);
                break;
            default:
                NhapHang_KhongTruyCap_NV.main(user);
                break;
        }
    }//GEN-LAST:event_QLNHBtnActionPerformed

    private void QLHDBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLHDBtnActionPerformed
        // TODO add your handling code here:
        hide();
        switch (checkChucVu()) {
            case 1:
            case 2:
                TraCuuHoaDon.main(user);
                break;
            case 3:
                TraCuuHoaDon_NV.main(user);
                break;
            default:
                HoaDon_KhongTruyCap_NV.main(user);
                break;
        }
    }//GEN-LAST:event_QLHDBtnActionPerformed

    private void QLDSBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLDSBtnActionPerformed
        // TODO add your handling code here:
        hide();
        if (checkChucVu() == 1) {
            BaoCaoDoanhThu_QL.main(user);
        } else {
            DoanhThu_KhongTruyCap_NV.main(user);
        }
    }//GEN-LAST:event_QLDSBtnActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        hide();
        WelcomeScreen.main(null);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void ChamCongBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChamCongBtnActionPerformed
        // TODO add your handling code here:
        hide();
        if (checkChucVu() == 1) {
            ChamCong_QL.main(user);
        } else {
            ChamCong_NV.main(user);
        }
    }//GEN-LAST:event_ChamCongBtnActionPerformed

    public void setSoLieu() {
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        NhanVienBUS busNV = new NhanVienBUS();
        KhachHangBUS busKH = new KhachHangBUS();
        SanPhamBUS busSP = new SanPhamBUS();
        KhuyenMaiBUS busKM = new KhuyenMaiBUS();
        DoiTacBUS busDT = new DoiTacBUS();
        DoanhThuBUS busDS = new DoanhThuBUS();
        DoanhThu dt = new DoanhThu(0, year, 0);
        
        int arrNVLength = busNV.getNhanVienAll().size();
        int arrKHLength = busKH.getKhachHangAll().size();
        int arrSPLength = busSP.getSanPhamAll().size();
        int arrKMLength = busKM.getKhuyenMaiAll().size();
        int arrDTLength = busDT.getDoiTacAll().size();
        double doanhSo = 0;
        try {
            doanhSo = busDS.getDoanhThuTheoNam(dt);
        } catch (SQLException ex) {
            Logger.getLogger(Chung.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        SoNV.setText(String.valueOf(arrNVLength));
        SoKH.setText(String.valueOf(arrKHLength));
        SoSP.setText(String.valueOf(arrSPLength));
        SoKM.setText(String.valueOf(arrKMLength));
        SoDT.setText(String.valueOf(arrDTLength));
        doanhThu.setText(String.valueOf(doanhSo / 1000000) + "M");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args) {
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
            java.util.logging.Logger.getLogger(Chung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Chung(args).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChamCongBtn;
    private javax.swing.JButton QLDSBtn;
    private javax.swing.JButton QLDTBtn;
    private javax.swing.JButton QLHDBtn;
    private javax.swing.JButton QLKHBtn;
    private javax.swing.JButton QLKMBtn;
    private javax.swing.JButton QLNHBtn;
    private javax.swing.JButton QLNVBtn;
    private javax.swing.JButton QLSPBtn;
    private javax.swing.JLabel SoDT;
    private javax.swing.JLabel SoKH;
    private javax.swing.JLabel SoKM;
    private javax.swing.JLabel SoNV;
    private javax.swing.JLabel SoSP;
    private javax.swing.JLabel doanhThu;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
