/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import BUS.KhuyenMaiBUS;
import BUS.NhanVienBUS;
import DTO.KhuyenMai;
import static View.TraCuuNhanVien_QL.isNumeric;
import java.awt.HeadlessException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class ThemKhuyenMai_QL extends javax.swing.JFrame {

    /**
     * Creates new form ThemKhuyenMai_QL
     */
    String user;

    public ThemKhuyenMai_QL(String a) throws HeadlessException {
        initComponents();
        setLocationRelativeTo(null);
        this.user = a;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        txtTenKM = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPhanTram = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dateTimePickerNgBD = new com.github.lgooddatepicker.components.DateTimePicker();
        dateTimePickerNgKT = new com.github.lgooddatepicker.components.DateTimePicker();
        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        QLNVBtn5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        QLSPBtn = new javax.swing.JButton();
        QLKHBtn = new javax.swing.JButton();
        QLDTBtn = new javax.swing.JButton();
        QLKMBtn = new javax.swing.JButton();
        QLNHBtn = new javax.swing.JButton();
        QLHDBtn = new javax.swing.JButton();
        QLDSBtn = new javax.swing.JButton();
        ChamCongBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thêm khuyến mãi");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(249, 255, 254));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageText/tag/Khuyến mãi.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageText/tag/Đăng xuất.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        Back.setText("Quay lại");
        Back.setBackground(new java.awt.Color(249, 255, 254));
        Back.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.setFocusPainted(false);
        Back.setFocusable(false);
        Back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(196, 100, 96));
        Back.setRequestFocusEnabled(false);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Add.setText("Thêm");
        Add.setBackground(new java.awt.Color(196, 100, 96));
        Add.setBorder(null);
        Add.setBorderPainted(false);
        Add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add.setFocusPainted(false);
        Add.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Add.setForeground(new java.awt.Color(255, 255, 255));
        Add.setRequestFocusEnabled(false);
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        txtTenKM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTenKM.setBackground(new java.awt.Color(249, 255, 254));
        txtTenKM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTenKM.setCaretColor(new java.awt.Color(0, 0, 0));
        txtTenKM.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setText("Tên KM");
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));

        txtPhanTram.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPhanTram.setBackground(new java.awt.Color(249, 255, 254));
        txtPhanTram.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPhanTram.setCaretColor(new java.awt.Color(0, 0, 0));
        txtPhanTram.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setText("Phần trăm");
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setText("Ngày bắt đầu");
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));

        jLabel10.setText("Ngày kết thúc");
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(384, 384, 384)
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(dateTimePickerNgBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtTenKM, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(txtPhanTram, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dateTimePickerNgKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)))
                        .addGap(114, 114, 114))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhanTram, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenKM, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateTimePickerNgKT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateTimePickerNgBD, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(293, 293, 293))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 760, 690));

        jPanel7.setBackground(new java.awt.Color(231, 238, 237));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageText/tag/logo nhỏ.png"))); // NOI18N

        jSeparator6.setBackground(new java.awt.Color(85, 122, 100));
        jSeparator6.setForeground(new java.awt.Color(85, 122, 100));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageText/tag/Quản lý.png"))); // NOI18N

        QLNVBtn5.setText("Nhân viên");
        QLNVBtn5.setBackground(new java.awt.Color(231, 238, 237));
        QLNVBtn5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        QLNVBtn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLNVBtn5.setFocusPainted(false);
        QLNVBtn5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QLNVBtn5.setForeground(new java.awt.Color(196, 100, 96));
        QLNVBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLNVBtn5ActionPerformed(evt);
            }
        });

        jButton2.setText("Chung");
        jButton2.setBackground(new java.awt.Color(231, 238, 237));
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(196, 100, 96));
        jButton2.setRequestFocusEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        QLSPBtn.setText("Sản phẩm");
        QLSPBtn.setBackground(new java.awt.Color(231, 238, 237));
        QLSPBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        QLSPBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLSPBtn.setFocusPainted(false);
        QLSPBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QLSPBtn.setForeground(new java.awt.Color(196, 100, 96));
        QLSPBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLSPBtnActionPerformed(evt);
            }
        });

        QLKHBtn.setText("Khách hàng");
        QLKHBtn.setBackground(new java.awt.Color(231, 238, 237));
        QLKHBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        QLKHBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLKHBtn.setFocusPainted(false);
        QLKHBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QLKHBtn.setForeground(new java.awt.Color(196, 100, 96));
        QLKHBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLKHBtnActionPerformed(evt);
            }
        });

        QLDTBtn.setText("Đối tác");
        QLDTBtn.setBackground(new java.awt.Color(231, 238, 237));
        QLDTBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        QLDTBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLDTBtn.setFocusPainted(false);
        QLDTBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QLDTBtn.setForeground(new java.awt.Color(196, 100, 96));
        QLDTBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLDTBtnActionPerformed(evt);
            }
        });

        QLKMBtn.setText("Khuyến mãi");
        QLKMBtn.setBackground(new java.awt.Color(196, 100, 96));
        QLKMBtn.setBorder(null);
        QLKMBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLKMBtn.setFocusPainted(false);
        QLKMBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QLKMBtn.setForeground(new java.awt.Color(255, 255, 255));

        QLNHBtn.setText("Nhập hàng");
        QLNHBtn.setBackground(new java.awt.Color(231, 238, 237));
        QLNHBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        QLNHBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLNHBtn.setFocusPainted(false);
        QLNHBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QLNHBtn.setForeground(new java.awt.Color(196, 100, 96));
        QLNHBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLNHBtnActionPerformed(evt);
            }
        });

        QLHDBtn.setText("Hóa đơn");
        QLHDBtn.setBackground(new java.awt.Color(231, 238, 237));
        QLHDBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        QLHDBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLHDBtn.setFocusPainted(false);
        QLHDBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QLHDBtn.setForeground(new java.awt.Color(196, 100, 96));
        QLHDBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLHDBtnActionPerformed(evt);
            }
        });

        QLDSBtn.setText("Doanh thu");
        QLDSBtn.setBackground(new java.awt.Color(231, 238, 237));
        QLDSBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        QLDSBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLDSBtn.setFocusPainted(false);
        QLDSBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QLDSBtn.setForeground(new java.awt.Color(196, 100, 96));
        QLDSBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLDSBtnActionPerformed(evt);
            }
        });

        ChamCongBtn.setText("Chấm công");
        ChamCongBtn.setBackground(new java.awt.Color(231, 238, 237));
        ChamCongBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        ChamCongBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ChamCongBtn.setFocusPainted(false);
        ChamCongBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ChamCongBtn.setForeground(new java.awt.Color(196, 100, 96));
        ChamCongBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChamCongBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel15))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(ChamCongBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(QLNVBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(QLSPBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(QLKHBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(QLDTBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(QLKMBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(QLNHBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(QLHDBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(QLDSBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel16)))
                .addGap(30, 30, 30))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel15)
                .addGap(6, 6, 6)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(ChamCongBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QLNVBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QLSPBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QLKHBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(QLDTBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(QLKMBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(QLNHBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QLHDBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QLDSBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        hide();
        WelcomeScreen.main(null);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void QLNVBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLNVBtn5ActionPerformed
        // TODO add your handling code here:
        hide();
        if (checkChucVu() == 1) {
            TraCuuNhanVien_QL.main(user);
        } else {
            NhanVien_KhongTruyCap_NV.main(user);
        }
    }//GEN-LAST:event_QLNVBtn5ActionPerformed

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

    private void QLDTBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLDTBtnActionPerformed
        // TODO add your handling code here:
        hide();
        if (checkChucVu() == 1) {
            TraCuuDoiTac_QL.main(user);
        } else {
            DoiTac_KhongTruyCap_NV.main(user);
        }
    }//GEN-LAST:event_QLDTBtnActionPerformed

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

    private void ChamCongBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChamCongBtnActionPerformed
        // TODO add your handling code here:
        hide();
        if (checkChucVu() == 1) {
            ChamCong_QL.main(user);
        } else {
            ChamCong_NV.main(user);
        }
    }//GEN-LAST:event_ChamCongBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        hide();
        Chung.main(user);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        hide();
        TraCuuKhuyenMai_QL.main(user);
    }//GEN-LAST:event_BackActionPerformed

    public void clearKM() {
        txtTenKM.setText("");
        txtPhanTram.setText("");
        dateTimePickerNgBD.setDateTimeStrict(null);
        dateTimePickerNgKT.setDateTimeStrict(null);
    }

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        String tenKM = txtTenKM.getText();
        String phanTram = txtPhanTram.getText();
        String ngbd = "", ngkt = "";
        if (tenKM.equals("") || phanTram.equals("")) {
            JOptionPane.showMessageDialog(this, "Thông tin không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!isNumeric(txtPhanTram.getText())) {
            JOptionPane.showMessageDialog(this, "Hãy nhập vào 1 số", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (isNumeric(tenKM)) {
            JOptionPane.showMessageDialog(this, "Tên KM không được là số!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (Float.parseFloat(phanTram) <= 0) {
            JOptionPane.showMessageDialog(this, "Phần trăm phải lớn hơn 0!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (dateTimePickerNgBD.getDateTimePermissive() != null && dateTimePickerNgKT.getDateTimePermissive() != null) {
            ngbd = dateTimePickerNgBD.getDateTimePermissive().format(dateFormat);
            ngkt = dateTimePickerNgKT.getDateTimePermissive().format(dateFormat);
            String time = dateTimePickerNgKT.getDateTimePermissive().format(timeFormat);
            if (ngbd.equals(ngkt) && time.equals("00:00:00")) {
                JOptionPane.showMessageDialog(this, "Giờ kết thúc không được bằng giờ bắt đầu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            LocalDate datecheck = dateTimePickerNgBD.getDateTimePermissive().toLocalDate();
            if (datecheck.isBefore(LocalDate.now())) {
                JOptionPane.showMessageDialog(this, "Ngày khuyến mãi không được nhỏ hơn ngày hiện tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        int reply = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thêm?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.NO_OPTION || reply == JOptionPane.CLOSED_OPTION) {
            return;
        }
        try {
            int ma = 0;
            float phanTramKM = Float.parseFloat(phanTram);
            LocalDateTime ngBD = null, ngKT = null;
            if (!ngbd.equals("") || !ngkt.equals("")) {
                ngBD = LocalDateTime.parse(ngbd, dateFormat);
                ngKT = LocalDateTime.parse(ngkt, dateFormat);
            }
            KhuyenMai km = new KhuyenMai(ma, tenKM, phanTramKM, ngBD, ngKT);
            KhuyenMaiBUS bus = new KhuyenMaiBUS();

            if (bus.insertKM(km)) {
                JOptionPane.showMessageDialog(this, "Đã thêm thành công!");
                clearKM();
            } else {
                JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi, vui lòng thử lại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AddActionPerformed

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
            java.util.logging.Logger.getLogger(ThemKhuyenMai_QL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemKhuyenMai_QL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemKhuyenMai_QL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemKhuyenMai_QL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemKhuyenMai_QL(args).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Back;
    private javax.swing.JButton ChamCongBtn;
    private javax.swing.JButton QLDSBtn;
    private javax.swing.JButton QLDTBtn;
    private javax.swing.JButton QLHDBtn;
    private javax.swing.JButton QLKHBtn;
    private javax.swing.JButton QLKMBtn;
    private javax.swing.JButton QLNHBtn;
    private javax.swing.JButton QLNVBtn5;
    private javax.swing.JButton QLSPBtn;
    private com.github.lgooddatepicker.components.DateTimePicker dateTimePickerNgBD;
    private com.github.lgooddatepicker.components.DateTimePicker dateTimePickerNgKT;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField txtPhanTram;
    private javax.swing.JTextField txtTenKM;
    // End of variables declaration//GEN-END:variables
}
