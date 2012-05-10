package presentation;
/*
import org.jdesktop.application.FrameView;
import org.jdesktop.application.SingleFrameApplication;

public class InstrutorView extends FrameView {

    public InstrutorView(SingleFrameApplication app) {
        super(app);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Instrutor = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        campo_login_cliente = new javax.swing.JTextField();
        campo_observacoes = new javax.swing.JTextField();
        campo_login_instrutor = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        campo_data = new javax.swing.JTextField();
        campo_id_af = new javax.swing.JTextField();
        Novo10 = new javax.swing.JButton();
        Novo11 = new javax.swing.JButton();
        Novo12 = new javax.swing.JButton();
        Novo13 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        campo_duracao = new javax.swing.JTextField();
        campo_treino = new javax.swing.JTextField();
        campo_data_inicio_treino = new javax.swing.JTextField();
        campo_nivel = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        campo_tipo = new javax.swing.JTextField();
        campo_id_treino = new javax.swing.JTextField();
        Novo6 = new javax.swing.JButton();
        Novo7 = new javax.swing.JButton();
        Novo8 = new javax.swing.JButton();
        Novo9 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        campo_loign_cliente_treino = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        Cliente = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Buscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        campo_login_cliente_cliente = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        campo_carga = new javax.swing.JTextField();
        campo_login_cliente_exercicio = new javax.swing.JTextField();
        campo_numero_series = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        campo_exercicio = new javax.swing.JTextField();
        campo_id_exercicio = new javax.swing.JTextField();
        Novo2 = new javax.swing.JButton();
        Novo3 = new javax.swing.JButton();
        Novo4 = new javax.swing.JButton();
        Novo5 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusableWindowState(false);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("presentation/Bundle"); // NOI18N
        jTabbedPane1.setName(bundle.getString("InstrutorView.jTabbedPane1.name")); // NOI18N

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Login", "CPF", "RG", "Nome", "Data C", "Nro Carteira", "Reg", "Carga H"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton1.setText(bundle.getString("InstrutorView.jButton1.text")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jButton1)))
                .addContainerGap(216, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 389, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 389, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton1)
                .addContainerGap(129, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 153, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 154, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout InstrutorLayout = new javax.swing.GroupLayout(Instrutor);
        Instrutor.setLayout(InstrutorLayout);
        InstrutorLayout.setHorizontalGroup(
            InstrutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
            .addGroup(InstrutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(InstrutorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        InstrutorLayout.setVerticalGroup(
            InstrutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
            .addGroup(InstrutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(InstrutorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab(bundle.getString("InstrutorView.Instrutor.TabConstraints.tabTitle"), Instrutor); // NOI18N

        campo_login_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_login_clienteActionPerformed(evt);
            }
        });

        campo_login_instrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_login_instrutorActionPerformed(evt);
            }
        });

        jLabel30.setText(bundle.getString("InstrutorView.jLabel30.text")); // NOI18N

        jLabel31.setText(bundle.getString("InstrutorView.jLabel31.text")); // NOI18N

        jLabel32.setText(bundle.getString("InstrutorView.jLabel32.text")); // NOI18N

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Login Cliente", "Login Instrutor", "Data de Realização", "Observações"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTable6);

        jLabel34.setText(bundle.getString("InstrutorView.jLabel34.text")); // NOI18N

        jLabel35.setText(bundle.getString("InstrutorView.jLabel35.text")); // NOI18N

        campo_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_dataActionPerformed(evt);
            }
        });

        campo_id_af.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_id_afActionPerformed(evt);
            }
        });

        Novo10.setText(bundle.getString("InstrutorView.Novo10.text")); // NOI18N

        Novo11.setText(bundle.getString("InstrutorView.Novo11.text")); // NOI18N

        Novo12.setText(bundle.getString("InstrutorView.Novo12.text")); // NOI18N

        Novo13.setText(bundle.getString("InstrutorView.Novo13.text")); // NOI18N

        jButton2.setText(bundle.getString("InstrutorView.jButton2.text")); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campo_id_af, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(campo_login_cliente))
                                .addGap(67, 67, 67)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel35))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campo_login_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_data, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(campo_observacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(Novo10)
                        .addGap(35, 35, 35)
                        .addComponent(Novo13)
                        .addGap(33, 33, 33)
                        .addComponent(jButton2)
                        .addGap(37, 37, 37)
                        .addComponent(Novo12)
                        .addGap(18, 18, 18)
                        .addComponent(Novo11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel32)
                    .addComponent(campo_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_id_af, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_login_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(campo_login_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_observacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Novo10)
                    .addComponent(Novo13)
                    .addComponent(jButton2)
                    .addComponent(Novo12)
                    .addComponent(Novo11))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 1, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab(bundle.getString("InstrutorView.jPanel1.TabConstraints.tabTitle"), jPanel1); // NOI18N

        campo_duracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_duracaoActionPerformed(evt);
            }
        });

        campo_data_inicio_treino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_data_inicio_treinoActionPerformed(evt);
            }
        });

        campo_nivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nivelActionPerformed(evt);
            }
        });

        jLabel24.setText(bundle.getString("InstrutorView.jLabel24.text")); // NOI18N

        jLabel26.setText(bundle.getString("InstrutorView.jLabel26.text")); // NOI18N

        jLabel27.setText(bundle.getString("InstrutorView.jLabel27.text")); // NOI18N

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tipo", "Login Cliente", "Nível", "Treino", "Data de Início", "Duração"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable5);

        jLabel28.setText(bundle.getString("InstrutorView.jLabel28.text")); // NOI18N

        jLabel29.setText(bundle.getString("InstrutorView.jLabel29.text")); // NOI18N

        campo_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_tipoActionPerformed(evt);
            }
        });

        campo_id_treino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_id_treinoActionPerformed(evt);
            }
        });

        Novo6.setText(bundle.getString("InstrutorView.Novo6.text")); // NOI18N

        Novo7.setText(bundle.getString("InstrutorView.Novo7.text")); // NOI18N

        Novo8.setText(bundle.getString("InstrutorView.Novo8.text")); // NOI18N

        Novo9.setText(bundle.getString("InstrutorView.Novo9.text")); // NOI18N

        jLabel36.setText(bundle.getString("InstrutorView.jLabel36.text")); // NOI18N

        jLabel37.setText(bundle.getString("InstrutorView.jLabel37.text")); // NOI18N

        campo_loign_cliente_treino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_loign_cliente_treinoActionPerformed(evt);
            }
        });

        jButton3.setText(bundle.getString("InstrutorView.jButton3.text")); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel26)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel28))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campo_loign_cliente_treino, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_data_inicio_treino, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(campo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel29)
                                .addGap(18, 18, 18)
                                .addComponent(campo_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campo_id_treino, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(18, 18, 18)
                                .addComponent(campo_duracao, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campo_treino, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(Novo6)
                        .addGap(33, 33, 33)
                        .addComponent(Novo9)
                        .addGap(28, 28, 28)
                        .addComponent(jButton3)
                        .addGap(29, 29, 29)
                        .addComponent(Novo8)
                        .addGap(41, 41, 41)
                        .addComponent(Novo7)))
                .addGap(34, 34, 34))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(campo_id_treino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(campo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(campo_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(campo_duracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(campo_data_inicio_treino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(campo_treino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(campo_loign_cliente_treino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Novo6)
                    .addComponent(Novo9)
                    .addComponent(jButton3)
                    .addComponent(Novo8)
                    .addComponent(Novo7))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab(bundle.getString("InstrutorView.jPanel2.TabConstraints.tabTitle"), jPanel2); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Login", "CPF", "RG", "Nome", "Nascimento", "Status", "Atestado", "Mensalidades Abertas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Byte.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        Buscar.setText(bundle.getString("InstrutorView.Buscar.text")); // NOI18N
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setText(bundle.getString("InstrutorView.jLabel1.text")); // NOI18N

        jButton4.setText(bundle.getString("InstrutorView.jButton4.text")); // NOI18N

        javax.swing.GroupLayout ClienteLayout = new javax.swing.GroupLayout(Cliente);
        Cliente.setLayout(ClienteLayout);
        ClienteLayout.setHorizontalGroup(
            ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteLayout.createSequentialGroup()
                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClienteLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(campo_login_cliente_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(Buscar))
                    .addGroup(ClienteLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ClienteLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jButton4)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ClienteLayout.createSequentialGroup()
                    .addGap(0, 289, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 287, Short.MAX_VALUE)))
        );
        ClienteLayout.setVerticalGroup(
            ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campo_login_cliente_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(jButton4)
                .addGap(61, 61, 61))
            .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ClienteLayout.createSequentialGroup()
                    .addGap(0, 148, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 148, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab(bundle.getString("InstrutorView.Cliente.TabConstraints.tabTitle"), Cliente); // NOI18N

        campo_carga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_cargaActionPerformed(evt);
            }
        });

        campo_numero_series.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_numero_seriesActionPerformed(evt);
            }
        });

        jLabel4.setText(bundle.getString("InstrutorView.jLabel4.text")); // NOI18N

        jLabel19.setText(bundle.getString("InstrutorView.jLabel19.text")); // NOI18N

        jLabel20.setText(bundle.getString("InstrutorView.jLabel20.text")); // NOI18N

        jLabel21.setText(bundle.getString("InstrutorView.jLabel21.text")); // NOI18N

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Login Cliente", "Exercício", "Carga", "Número de Séries"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable4);

        jLabel22.setText(bundle.getString("InstrutorView.jLabel22.text")); // NOI18N

        campo_exercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_exercicioActionPerformed(evt);
            }
        });

        campo_id_exercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_id_exercicioActionPerformed(evt);
            }
        });

        Novo2.setText(bundle.getString("InstrutorView.Novo2.text")); // NOI18N

        Novo3.setText(bundle.getString("InstrutorView.Novo3.text")); // NOI18N

        Novo4.setText(bundle.getString("InstrutorView.Novo4.text")); // NOI18N

        Novo5.setText(bundle.getString("InstrutorView.Novo5.text")); // NOI18N

        jButton5.setText(bundle.getString("InstrutorView.jButton5.text")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel4))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campo_id_exercicio, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(campo_carga)
                                    .addComponent(campo_login_cliente_exercicio))
                                .addGap(67, 67, 67)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel20))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campo_numero_series, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_exercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(Novo2)
                                .addGap(36, 36, 36)
                                .addComponent(Novo5)
                                .addGap(33, 33, 33)
                                .addComponent(jButton5)
                                .addGap(27, 27, 27)
                                .addComponent(Novo4)
                                .addGap(38, 38, 38)
                                .addComponent(Novo3)))
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel20)
                    .addComponent(campo_exercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_id_exercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_carga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_numero_series, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_login_cliente_exercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Novo3)
                    .addComponent(Novo4)
                    .addComponent(Novo2)
                    .addComponent(Novo5)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab(bundle.getString("InstrutorView.jPanel7.TabConstraints.tabTitle"), jPanel7); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Cliente");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarActionPerformed

    private void campo_login_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_login_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_login_clienteActionPerformed

    private void campo_login_instrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_login_instrutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_login_instrutorActionPerformed

    private void campo_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_dataActionPerformed

    private void campo_id_afActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_id_afActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_id_afActionPerformed

    private void campo_duracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_duracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_duracaoActionPerformed

    private void campo_data_inicio_treinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_data_inicio_treinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_data_inicio_treinoActionPerformed

    private void campo_nivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nivelActionPerformed

    private void campo_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_tipoActionPerformed

    private void campo_id_treinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_id_treinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_id_treinoActionPerformed

    private void campo_loign_cliente_treinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_loign_cliente_treinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_loign_cliente_treinoActionPerformed

    private void campo_cargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_cargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_cargaActionPerformed

    private void campo_numero_seriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_numero_seriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_numero_seriesActionPerformed

    private void campo_exercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_exercicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_exercicioActionPerformed

    private void campo_id_exercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_id_exercicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_id_exercicioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JPanel Cliente;
    private javax.swing.JPanel Instrutor;
    private javax.swing.JButton Novo10;
    private javax.swing.JButton Novo11;
    private javax.swing.JButton Novo12;
    private javax.swing.JButton Novo13;
    private javax.swing.JButton Novo2;
    private javax.swing.JButton Novo3;
    private javax.swing.JButton Novo4;
    private javax.swing.JButton Novo5;
    private javax.swing.JButton Novo6;
    private javax.swing.JButton Novo7;
    private javax.swing.JButton Novo8;
    private javax.swing.JButton Novo9;
    private javax.swing.JTextField campo_carga;
    private javax.swing.JTextField campo_data;
    private javax.swing.JTextField campo_data_inicio_treino;
    private javax.swing.JTextField campo_duracao;
    private javax.swing.JTextField campo_exercicio;
    private javax.swing.JTextField campo_id_af;
    private javax.swing.JTextField campo_id_exercicio;
    private javax.swing.JTextField campo_id_treino;
    private javax.swing.JTextField campo_login_cliente;
    private javax.swing.JTextField campo_login_cliente_cliente;
    private javax.swing.JTextField campo_login_cliente_exercicio;
    private javax.swing.JTextField campo_login_instrutor;
    private javax.swing.JTextField campo_loign_cliente_treino;
    private javax.swing.JTextField campo_nivel;
    private javax.swing.JTextField campo_numero_series;
    private javax.swing.JTextField campo_observacoes;
    private javax.swing.JTextField campo_tipo;
    private javax.swing.JTextField campo_treino;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    // End of variables declaration//GEN-END:variables
}
*/