/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import BUS.KhachHangBUS;
import BUS.NhanVienBUS;
import DTO.KhachHang;
import static View.TraCuuNhanVien_QL.isNumeric;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class TraCuuKhachHang_NV extends javax.swing.JFrame {

    /**
     * Creates new form TraCuuKhachHang_NV
     */
    String user;
    public TraCuuKhachHang_NV(String a) throws HeadlessException {
        initComponents();
        setLocationRelativeTo(null);
        this.user = a;
        loadKhachHangAll();
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
        jLabel5 = new javax.swing.JLabel();
        cbb_search = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Find = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        QLNVBtn3 = new javax.swing.JButton();
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
        setTitle("Tra cứu khách hàng của nhân viên");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(249, 255, 254));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageText/tag/Khách hàng.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageText/tag/Đăng xuất.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nhập vào");

        cbb_search.setBackground(new java.awt.Color(249, 255, 254));
        cbb_search.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbb_search.setForeground(new java.awt.Color(0, 0, 0));
        cbb_search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã KH", "Tên KH", "SĐT", "Loại KH" }));
        cbb_search.setFocusable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Tìm kiếm theo");

        txtSearch.setBackground(new java.awt.Color(249, 255, 254));
        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(0, 0, 0));
        txtSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtSearch.setCaretColor(new java.awt.Color(0, 0, 0));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã KH", "Tên KH", "Ngày sinh", "SĐT", "Địa chỉ", "Giới tính", "Loại KH", "Ngày đăng kí", "Tích lũy", "Ghi chú"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setBackground(new java.awt.Color(180, 222, 197));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setSelectionBackground(new java.awt.Color(196, 100, 96));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowGrid(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        Find.setBackground(new java.awt.Color(196, 100, 96));
        Find.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Find.setForeground(new java.awt.Color(255, 255, 255));
        Find.setText("Tìm");
        Find.setBorder(null);
        Find.setBorderPainted(false);
        Find.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Find.setFocusPainted(false);
        Find.setRequestFocusEnabled(false);
        Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cbb_search, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(Find, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)))
                        .addGap(20, 20, 20))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSearch)
                            .addComponent(cbb_search, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)))
                    .addComponent(Find, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 760, 690));

        jPanel5.setBackground(new java.awt.Color(231, 238, 237));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageText/tag/logo nhỏ.png"))); // NOI18N

        jSeparator4.setBackground(new java.awt.Color(85, 122, 100));
        jSeparator4.setForeground(new java.awt.Color(85, 122, 100));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageText/tag/Nhân viên dn.png"))); // NOI18N

        QLNVBtn3.setBackground(new java.awt.Color(231, 238, 237));
        QLNVBtn3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QLNVBtn3.setForeground(new java.awt.Color(196, 100, 96));
        QLNVBtn3.setText("Nhân viên");
        QLNVBtn3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        QLNVBtn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLNVBtn3.setFocusPainted(false);
        QLNVBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLNVBtn3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(231, 238, 237));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(196, 100, 96));
        jButton2.setText("Chung");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 100, 96), 1, true));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setRequestFocusEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

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

        QLKHBtn.setBackground(new java.awt.Color(196, 100, 96));
        QLKHBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QLKHBtn.setForeground(new java.awt.Color(255, 255, 255));
        QLKHBtn.setText("Khách hàng");
        QLKHBtn.setBorder(null);
        QLKHBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QLKHBtn.setFocusPainted(false);

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel11))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(ChamCongBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(QLNVBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(QLSPBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(QLKHBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(QLDTBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(QLKMBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(QLNHBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(QLHDBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(QLDSBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel12)))
                .addGap(30, 30, 30))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel11)
                .addGap(6, 6, 6)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(ChamCongBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QLNVBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 690));

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

    private void QLNVBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLNVBtn3ActionPerformed
        // TODO add your handling code here:
        hide();
        if (checkChucVu() == 1) {
            TraCuuNhanVien_QL.main(user);
        } else {
            NhanVien_KhongTruyCap_NV.main(user);
        }
    }//GEN-LAST:event_QLNVBtn3ActionPerformed

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

    private void FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindActionPerformed
        // TODO add your handling code here:
        String search = txtSearch.getText();
        if (search.equals("")) {
            loadKhachHangAll();
        } else {
            FindKhachHang();
        }
    }//GEN-LAST:event_FindActionPerformed

    public void FindKhachHang() {
        DefaultTableModel SearchTable = (DefaultTableModel) jTable1.getModel();
        String option = (String) cbb_search.getSelectedItem();
        String search = txtSearch.getText();
        SearchTable.setRowCount(0);

        if (option.equals("Mã KH") || option.equals("SĐT")) {
            if (!isNumeric(txtSearch.getText())) {
                JOptionPane.showMessageDialog(this, "Hãy nhập vào 1 số", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        ArrayList<KhachHang> arr = new ArrayList<KhachHang>();
        arr = KhachHangBUS.timKhachHang(option, search);
        KhachHang kh = new KhachHang();
        for (int i = 0; i < arr.size(); i++) {
            kh = arr.get(i);
            int maKH = kh.getMaKH();
            String hoten = kh.getHoTen();
            String diaChi = kh.getDiaChi();
            String loaiKH = kh.getLoaiKH();
            String sdt = kh.getSDT();
            String ngsinh = kh.toString(kh.getNgSinh());
            String gioitinh = kh.getGioiTinh();
            String ghichu = kh.getGhiChu();
            String ngdk = kh.toString(kh.getNgDK());
            int tichluy = kh.getTichLuy();
            Object[] row = {maKH, hoten, ngsinh, sdt, diaChi, gioitinh, loaiKH, ngdk, tichluy, ghichu};
            SearchTable.addRow(row);
        }
        if (arr.size() <= 0) {
            JOptionPane.showMessageDialog(this, "Thông tin tìm kiếm không tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void loadKhachHangAll() {
        String[] header = {"Mã KH", "Họ tên", "Ngày sinh", "SĐT", "Địa chỉ", "Giới tính", "Loại KH", "Ngày đăng kí", "Tích lũy", "Ghi chú"};
        DefaultTableModel dtm = new DefaultTableModel(header, 0);
        ArrayList<KhachHang> arr = new ArrayList<KhachHang>();
        arr = KhachHangBUS.getKhachHangAll();
        KhachHang kh = new KhachHang();
        for (int i = 0; i < arr.size(); i++) {
            kh = arr.get(i);
            int maKH = kh.getMaKH();
            String hoten = kh.getHoTen();
            String diaChi = kh.getDiaChi();
            String loaiKH = kh.getLoaiKH();
            String sdt = kh.getSDT();
            String ngsinh = kh.toString(kh.getNgSinh());
            String gioitinh = kh.getGioiTinh();
            String ghichu = kh.getGhiChu();
            String ngdk = kh.toString(kh.getNgDK());
            int tichluy = kh.getTichLuy();
            Object[] row = {maKH, hoten, ngsinh, sdt, diaChi, gioitinh, loaiKH, ngdk, tichluy, ghichu};
            dtm.addRow(row);
        }
        jTable1.setModel(dtm);
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
            java.util.logging.Logger.getLogger(TraCuuKhachHang_NV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TraCuuKhachHang_NV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TraCuuKhachHang_NV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TraCuuKhachHang_NV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TraCuuKhachHang_NV(args).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChamCongBtn;
    private javax.swing.JButton Find;
    private javax.swing.JButton QLDSBtn;
    private javax.swing.JButton QLDTBtn;
    private javax.swing.JButton QLHDBtn;
    private javax.swing.JButton QLKHBtn;
    private javax.swing.JButton QLKMBtn;
    private javax.swing.JButton QLNHBtn;
    private javax.swing.JButton QLNVBtn3;
    private javax.swing.JButton QLSPBtn;
    private javax.swing.JComboBox<String> cbb_search;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
