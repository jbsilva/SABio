package presentation;

import java.util.Calendar;
import java.util.List;
import java.util.TreeSet;
import sabio.SABioFactory;
import vo.AtendenteVO;
import vo.UsuarioVO;
import vo.ClienteVO;
import vo.InstrutorVO;
import java.util.logging.Level;
import java.util.logging.Logger;
import sabio.SABioException;
import sabio.impl.Cliente;
import sabio.impl.Instrutor;
import sabio.spec.ICliente;
import sabio.spec.IInstrutor;
import vo.*;

public class AtendenteView extends javax.swing.JFrame {

    private static AtendenteView atendenteview;
    private List<AtendenteVO> atendentes;
    private boolean cliente_status = false;
    private ClienteVO cliente;
    private InstrutorVO instrutor;

    public AtendenteView() {

        super("Atendente");
        initComponents();
        this.setVisible(true);
    }

    public static AtendenteView getInstance() {
        if (atendenteview == null) {
            atendenteview = new AtendenteView();
        }
        return atendenteview;
    }

    public static void destroyInstance() {
        atendenteview = null;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Instrutor = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        campo_carteira_trabalho_instrutor = new javax.swing.JTextField();
        campo_login_instrutor = new javax.swing.JTextField();
        campo_cpf_instrutor = new javax.swing.JTextField();
        campo_endereco_instrutor = new javax.swing.JTextField();
        campo_registro_instrutor = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        campo_rg_instrutor = new javax.swing.JTextField();
        campo_nome_instrutor = new javax.swing.JTextField();
        cancela_cadastro_instrutor = new javax.swing.JButton();
        confirma_cadastro_instrutor = new javax.swing.JButton();
        campo_carga_horaria_instrutor = new javax.swing.JTextField();
        campo_senha_instrutor = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        campo_login_cliente_af = new javax.swing.JTextField();
        campo_observacoes_af = new javax.swing.JTextField();
        campo_login_instrutor_af = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        campo_data_realizacao_af = new javax.swing.JTextField();
        campo_id_af = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        Cliente = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        campo_login_cliente = new javax.swing.JTextField();
        campo_cpf_cliente = new javax.swing.JTextField();
        campo_mensalidades_aberto_cliente = new javax.swing.JTextField();
        campo_data_nascimento_cliente = new javax.swing.JTextField();
        campo_telefone_cliente = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        campo_rg_cliente = new javax.swing.JTextField();
        campo_nome_cliente = new javax.swing.JTextField();
        cancela_cadastrar_cliente = new javax.swing.JButton();
        confirma_cadastrar_cliente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        campo_atestado_cliente = new javax.swing.JTextField();
        campo_senha_cliente = new javax.swing.JPasswordField();
        campo_ativo_cliente = new javax.swing.JRadioButton();
        campo_inativo_cliente = new javax.swing.JRadioButton();
        Cliente1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        Buscar10 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusableWindowState(false);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("presentation/Bundle"); // NOI18N
        setName(bundle.getString("AtendenteView.name")); // NOI18N

        jTabbedPane1.setName(bundle.getString("AtendenteView.jTabbedPane1.name")); // NOI18N

        Instrutor.setName(bundle.getString("AtendenteView.Instrutor.name")); // NOI18N

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.setName(bundle.getString("AtendenteView.jPanel3.name")); // NOI18N

        jLabel10.setText(bundle.getString("AtendenteView.jLabel10.text")); // NOI18N
        jLabel10.setName(bundle.getString("AtendenteView.jLabel10.name")); // NOI18N

        jLabel11.setText(bundle.getString("AtendenteView.jLabel11.text")); // NOI18N
        jLabel11.setName(bundle.getString("AtendenteView.jLabel11.name")); // NOI18N

        jLabel12.setText(bundle.getString("AtendenteView.jLabel12.text")); // NOI18N
        jLabel12.setName(bundle.getString("AtendenteView.jLabel12.name")); // NOI18N

        jLabel13.setText(bundle.getString("AtendenteView.jLabel13.text")); // NOI18N
        jLabel13.setName(bundle.getString("AtendenteView.jLabel13.name")); // NOI18N

        jLabel14.setText(bundle.getString("AtendenteView.jLabel14.text")); // NOI18N
        jLabel14.setName(bundle.getString("AtendenteView.jLabel14.name")); // NOI18N

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setName(bundle.getString("AtendenteView.jSeparator2.name")); // NOI18N

        jLabel15.setText(bundle.getString("AtendenteView.jLabel15.text")); // NOI18N
        jLabel15.setName(bundle.getString("AtendenteView.jLabel15.name")); // NOI18N

        jLabel16.setText(bundle.getString("AtendenteView.jLabel16.text")); // NOI18N
        jLabel16.setName(bundle.getString("AtendenteView.jLabel16.name")); // NOI18N

        campo_carteira_trabalho_instrutor.setName(bundle.getString("AtendenteView.campo_carteira_trabalho_instrutor.name")); // NOI18N

        campo_login_instrutor.setName(bundle.getString("AtendenteView.campo_login_instrutor.name")); // NOI18N

        campo_cpf_instrutor.setName(bundle.getString("AtendenteView.campo_cpf_instrutor.name")); // NOI18N

        campo_endereco_instrutor.setName(bundle.getString("AtendenteView.campo_endereco_instrutor.name")); // NOI18N

        campo_registro_instrutor.setName(bundle.getString("AtendenteView.campo_registro_instrutor.name")); // NOI18N

        jLabel17.setText(bundle.getString("AtendenteView.jLabel17.text")); // NOI18N
        jLabel17.setName(bundle.getString("AtendenteView.jLabel17.name")); // NOI18N

        jLabel18.setText(bundle.getString("AtendenteView.jLabel18.text")); // NOI18N
        jLabel18.setName(bundle.getString("AtendenteView.jLabel18.name")); // NOI18N

        campo_rg_instrutor.setName(bundle.getString("AtendenteView.campo_rg_instrutor.name")); // NOI18N

        campo_nome_instrutor.setName(bundle.getString("AtendenteView.campo_nome_instrutor.name")); // NOI18N

        cancela_cadastro_instrutor.setText(bundle.getString("AtendenteView.cancela_cadastro_instrutor.text")); // NOI18N
        cancela_cadastro_instrutor.setName(bundle.getString("AtendenteView.cancela_cadastro_instrutor.name")); // NOI18N
        cancela_cadastro_instrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancela_cadastro_instrutorActionPerformed(evt);
            }
        });

        confirma_cadastro_instrutor.setText(bundle.getString("AtendenteView.confirma_cadastro_instrutor.text")); // NOI18N
        confirma_cadastro_instrutor.setName(bundle.getString("AtendenteView.confirma_cadastro_instrutor.name")); // NOI18N
        confirma_cadastro_instrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirma_cadastro_instrutorActionPerformed(evt);
            }
        });

        campo_carga_horaria_instrutor.setText(bundle.getString("AtendenteView.campo_carga_horaria_instrutor.text")); // NOI18N
        campo_carga_horaria_instrutor.setName(bundle.getString("AtendenteView.campo_carga_horaria_instrutor.name")); // NOI18N

        campo_senha_instrutor.setText(bundle.getString("AtendenteView.campo_senha_instrutor.text")); // NOI18N
        campo_senha_instrutor.setName(bundle.getString("AtendenteView.campo_senha_instrutor.name")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel18)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campo_cpf_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_carga_horaria_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_login_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_rg_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(108, 108, 108)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campo_nome_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_registro_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_carteira_trabalho_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_senha_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(campo_endereco_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(cancela_cadastro_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(confirma_cadastro_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 389, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 389, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_login_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel12)
                    .addComponent(campo_nome_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_rg_instrutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(campo_registro_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campo_cpf_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(campo_carteira_trabalho_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_carga_horaria_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_senha_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel14))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(campo_endereco_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancela_cadastro_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirma_cadastro_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 153, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 154, Short.MAX_VALUE)))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {campo_carga_horaria_instrutor, campo_cpf_instrutor, campo_login_instrutor});

        javax.swing.GroupLayout InstrutorLayout = new javax.swing.GroupLayout(Instrutor);
        Instrutor.setLayout(InstrutorLayout);
        InstrutorLayout.setHorizontalGroup(
            InstrutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        InstrutorLayout.setVerticalGroup(
            InstrutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InstrutorLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab(bundle.getString("AtendenteView.Instrutor.TabConstraints.tabTitle"), Instrutor); // NOI18N

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setName(bundle.getString("AtendenteView.jPanel1.name")); // NOI18N

        jPanel6.setName(bundle.getString("AtendenteView.jPanel6.name")); // NOI18N

        campo_login_cliente_af.setName(bundle.getString("AtendenteView.campo_login_cliente_af.name")); // NOI18N

        campo_observacoes_af.setName(bundle.getString("AtendenteView.campo_observacoes_af.name")); // NOI18N

        campo_login_instrutor_af.setName(bundle.getString("AtendenteView.campo_login_instrutor_af.name")); // NOI18N

        jLabel30.setText(bundle.getString("AtendenteView.jLabel30.text")); // NOI18N
        jLabel30.setName(bundle.getString("AtendenteView.jLabel30.name")); // NOI18N

        jLabel31.setText(bundle.getString("AtendenteView.jLabel31.text")); // NOI18N
        jLabel31.setName(bundle.getString("AtendenteView.jLabel31.name")); // NOI18N

        jLabel32.setText(bundle.getString("AtendenteView.jLabel32.text")); // NOI18N
        jLabel32.setName(bundle.getString("AtendenteView.jLabel32.name")); // NOI18N

        jLabel34.setText(bundle.getString("AtendenteView.jLabel34.text")); // NOI18N
        jLabel34.setName(bundle.getString("AtendenteView.jLabel34.name")); // NOI18N

        jLabel35.setText(bundle.getString("AtendenteView.jLabel35.text")); // NOI18N
        jLabel35.setName(bundle.getString("AtendenteView.jLabel35.name")); // NOI18N

        campo_data_realizacao_af.setName(bundle.getString("AtendenteView.campo_data_realizacao_af.name")); // NOI18N

        campo_id_af.setName(bundle.getString("AtendenteView.campo_id_af.name")); // NOI18N

        jButton11.setText(bundle.getString("AtendenteView.jButton11.text")); // NOI18N
        jButton11.setName(bundle.getString("AtendenteView.jButton11.name")); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText(bundle.getString("AtendenteView.jButton12.text")); // NOI18N
        jButton12.setName(bundle.getString("AtendenteView.jButton12.name")); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(277, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel30)
                        .addComponent(jLabel34)))
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campo_id_af, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_login_cliente_af, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_data_realizacao_af, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_login_instrutor_af, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(campo_observacoes_af, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(151, 151, 151))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel32)
                    .addComponent(campo_data_realizacao_af, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_id_af, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_login_cliente_af, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(campo_login_instrutor_af, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_observacoes_af, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addGap(73, 73, 73)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab(bundle.getString("AtendenteView.jPanel1.TabConstraints.tabTitle"), jPanel1); // NOI18N

        Cliente.setName(bundle.getString("AtendenteView.Cliente.name")); // NOI18N

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel4.setName(bundle.getString("AtendenteView.jPanel4.name")); // NOI18N

        jLabel19.setText(bundle.getString("AtendenteView.jLabel19.text")); // NOI18N
        jLabel19.setName(bundle.getString("AtendenteView.jLabel19.name")); // NOI18N

        jLabel20.setText(bundle.getString("AtendenteView.jLabel20.text")); // NOI18N
        jLabel20.setName(bundle.getString("AtendenteView.jLabel20.name")); // NOI18N

        jLabel21.setText(bundle.getString("AtendenteView.jLabel21.text")); // NOI18N
        jLabel21.setName(bundle.getString("AtendenteView.jLabel21.name")); // NOI18N

        jLabel22.setText(bundle.getString("AtendenteView.jLabel22.text")); // NOI18N
        jLabel22.setName(bundle.getString("AtendenteView.jLabel22.name")); // NOI18N

        jLabel23.setText(bundle.getString("AtendenteView.jLabel23.text")); // NOI18N
        jLabel23.setName(bundle.getString("AtendenteView.jLabel23.name")); // NOI18N

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setName(bundle.getString("AtendenteView.jSeparator3.name")); // NOI18N

        jLabel24.setText(bundle.getString("AtendenteView.jLabel24.text")); // NOI18N
        jLabel24.setName(bundle.getString("AtendenteView.jLabel24.name")); // NOI18N

        jLabel25.setText(bundle.getString("AtendenteView.jLabel25.text")); // NOI18N
        jLabel25.setName(bundle.getString("AtendenteView.jLabel25.name")); // NOI18N

        campo_login_cliente.setName(bundle.getString("AtendenteView.campo_login_cliente.name")); // NOI18N

        campo_cpf_cliente.setName(bundle.getString("AtendenteView.campo_cpf_cliente.name")); // NOI18N

        campo_mensalidades_aberto_cliente.setName(bundle.getString("AtendenteView.campo_mensalidades_aberto_cliente.name")); // NOI18N

        campo_data_nascimento_cliente.setName(bundle.getString("AtendenteView.campo_data_nascimento_cliente.name")); // NOI18N

        campo_telefone_cliente.setName(bundle.getString("AtendenteView.campo_telefone_cliente.name")); // NOI18N

        jLabel26.setText(bundle.getString("AtendenteView.jLabel26.text")); // NOI18N
        jLabel26.setName(bundle.getString("AtendenteView.jLabel26.name")); // NOI18N

        jLabel27.setText(bundle.getString("AtendenteView.jLabel27.text")); // NOI18N
        jLabel27.setName(bundle.getString("AtendenteView.jLabel27.name")); // NOI18N

        campo_rg_cliente.setName(bundle.getString("AtendenteView.campo_rg_cliente.name")); // NOI18N

        campo_nome_cliente.setName(bundle.getString("AtendenteView.campo_nome_cliente.name")); // NOI18N

        cancela_cadastrar_cliente.setText(bundle.getString("AtendenteView.cancela_cadastrar_cliente.text")); // NOI18N
        cancela_cadastrar_cliente.setName(bundle.getString("AtendenteView.cancela_cadastrar_cliente.name")); // NOI18N
        cancela_cadastrar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancela_cadastrar_clienteActionPerformed(evt);
            }
        });

        confirma_cadastrar_cliente.setText(bundle.getString("AtendenteView.confirma_cadastrar_cliente.text")); // NOI18N
        confirma_cadastrar_cliente.setName(bundle.getString("AtendenteView.confirma_cadastrar_cliente.name")); // NOI18N
        confirma_cadastrar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirma_cadastrar_clienteActionPerformed(evt);
            }
        });

        jLabel4.setText(bundle.getString("AtendenteView.jLabel4.text")); // NOI18N
        jLabel4.setName(bundle.getString("AtendenteView.jLabel4.name")); // NOI18N

        campo_atestado_cliente.setText(bundle.getString("AtendenteView.campo_atestado_cliente.text")); // NOI18N
        campo_atestado_cliente.setName(bundle.getString("AtendenteView.campo_atestado_cliente.name")); // NOI18N

        campo_senha_cliente.setText(bundle.getString("AtendenteView.campo_senha_cliente.text")); // NOI18N
        campo_senha_cliente.setName(bundle.getString("AtendenteView.campo_senha_cliente.name")); // NOI18N

        buttonGroup1.add(campo_ativo_cliente);
        campo_ativo_cliente.setText(bundle.getString("AtendenteView.campo_ativo_cliente.text")); // NOI18N
        campo_ativo_cliente.setName(bundle.getString("AtendenteView.campo_ativo_cliente.name")); // NOI18N
        campo_ativo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_ativo_clienteActionPerformed(evt);
            }
        });

        buttonGroup1.add(campo_inativo_cliente);
        campo_inativo_cliente.setText(bundle.getString("AtendenteView.campo_inativo_cliente.text")); // NOI18N
        campo_inativo_cliente.setName(bundle.getString("AtendenteView.campo_inativo_cliente.name")); // NOI18N
        campo_inativo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_inativo_clienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cancela_cadastrar_cliente)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25)
                            .addComponent(jLabel24)
                            .addComponent(jLabel27))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(campo_login_cliente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campo_rg_cliente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campo_cpf_cliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                .addComponent(campo_atestado_cliente))
                            .addComponent(campo_mensalidades_aberto_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_telefone_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_senha_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(campo_data_nascimento_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_inativo_cliente)
                            .addComponent(campo_ativo_cliente)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(confirma_cadastrar_cliente)))
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 389, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 389, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_login_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_rg_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(campo_cpf_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(campo_mensalidades_aberto_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(campo_atestado_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel21)
                                .addComponent(campo_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(campo_telefone_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_senha_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(campo_data_nascimento_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_ativo_cliente)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_inativo_cliente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cancela_cadastrar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirma_cadastrar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 153, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 154, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout ClienteLayout = new javax.swing.GroupLayout(Cliente);
        Cliente.setLayout(ClienteLayout);
        ClienteLayout.setHorizontalGroup(
            ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ClienteLayout.setVerticalGroup(
            ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab(bundle.getString("AtendenteView.Cliente.TabConstraints.tabTitle"), Cliente); // NOI18N

        Cliente1.setName(bundle.getString("AtendenteView.Cliente1.name")); // NOI18N

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel5.setName(bundle.getString("AtendenteView.jPanel5.name")); // NOI18N

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setName(bundle.getString("AtendenteView.jSeparator4.name")); // NOI18N

        Buscar10.setText(bundle.getString("AtendenteView.Buscar10.text")); // NOI18N
        Buscar10.setName(bundle.getString("AtendenteView.Buscar10.name")); // NOI18N
        Buscar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar10ActionPerformed(evt);
            }
        });

        jButton13.setText(bundle.getString("AtendenteView.jButton13.text")); // NOI18N
        jButton13.setName(bundle.getString("AtendenteView.jButton13.name")); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText(bundle.getString("AtendenteView.jButton14.text")); // NOI18N
        jButton14.setName(bundle.getString("AtendenteView.jButton14.name")); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jScrollPane1.setName(bundle.getString("AtendenteView.jScrollPane1.name")); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Login Cliente", "Login Instrutor", "ID", "Data", "Observações"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setName(bundle.getString("AtendenteView.jTable1.name")); // NOI18N
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setHeaderValue(bundle.getString("AtendenteView.jTable1.columnModel.title0")); // NOI18N
        jTable1.getColumnModel().getColumn(1).setHeaderValue(bundle.getString("AtendenteView.jTable1.columnModel.title1")); // NOI18N
        jTable1.getColumnModel().getColumn(2).setHeaderValue(bundle.getString("AtendenteView.jTable1.columnModel.title2")); // NOI18N
        jTable1.getColumnModel().getColumn(3).setHeaderValue(bundle.getString("AtendenteView.jTable1.columnModel.title3")); // NOI18N
        jTable1.getColumnModel().getColumn(4).setHeaderValue(bundle.getString("AtendenteView.jTable1.columnModel.title4")); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(832, 832, 832)
                        .addComponent(Buscar10))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 389, Short.MAX_VALUE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 389, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(Buscar10)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 153, Short.MAX_VALUE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 154, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout Cliente1Layout = new javax.swing.GroupLayout(Cliente1);
        Cliente1.setLayout(Cliente1Layout);
        Cliente1Layout.setHorizontalGroup(
            Cliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cliente1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 69, Short.MAX_VALUE))
        );
        Cliente1Layout.setVerticalGroup(
            Cliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cliente1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab(bundle.getString("AtendenteView.Cliente1.TabConstraints.tabTitle"), Cliente1); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jTabbedPane1)
                .addGap(26, 26, 26))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Cliente");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Buscar10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Buscar10ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void confirma_cadastro_instrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirma_cadastro_instrutorActionPerformed

        SABioFactory factory = SABioFactory.getInstance();

        String login = campo_login_instrutor.getText();
        String senha = String.copyValueOf(campo_senha_instrutor.getPassword());
        String nome = campo_nome_instrutor.getText();
        String rg = campo_rg_instrutor.getText();
        String cpf = campo_cpf_instrutor.getText();
        String endereco = campo_endereco_instrutor.getText();
        String registro_profissional = campo_registro_instrutor.getText();
        String numero_carteira_trabalho = campo_carteira_trabalho_instrutor.getText();
        int carga_horaria = Integer.parseInt(campo_carga_horaria_instrutor.getText());

        UsuarioVO usuario = new UsuarioVO(login, senha);

        Calendar data_contratacao = Calendar.getInstance();

        InstrutorVO instrutor = new InstrutorVO(usuario, nome, cpf,
                data_contratacao, rg, endereco, registro_profissional,
                numero_carteira_trabalho, carga_horaria);

        // Cria usuario no bd
        try {
            factory.getUsuario().create(usuario);
        } catch (SABioException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Cria instrutor no bd
        try {
            factory.getInstrutor().create(instrutor);
        } catch (SABioException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_confirma_cadastro_instrutorActionPerformed

    private void cancela_cadastro_instrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancela_cadastro_instrutorActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancela_cadastro_instrutorActionPerformed

    private void confirma_cadastrar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirma_cadastrar_clienteActionPerformed
        SABioFactory factory = SABioFactory.getInstance();

        String login = campo_login_cliente.getText();
        String senha = String.copyValueOf(campo_senha_cliente.getPassword());
        String nome = campo_nome_cliente.getText();
        String rg = campo_rg_cliente.getText();
        String cpf = campo_cpf_cliente.getText();
        String atestado_medico = campo_atestado_cliente.getText();
        String mensalidades_abertas = campo_mensalidades_aberto_cliente.getText();
        String telefone = campo_telefone_cliente.getText();
        Boolean status = cliente_status;

        UsuarioVO usuario = new UsuarioVO(login, senha);

        Calendar data_nascimento = Calendar.getInstance();
        Calendar data_ingresso = Calendar.getInstance();

        ClienteVO cliente = new ClienteVO(usuario, nome, cpf, rg, telefone,
                atestado_medico, data_ingresso, mensalidades_abertas,
                data_nascimento, status);


        // Cria usuario no bd
        try {
            factory.getUsuario().create(usuario);
        } catch (SABioException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Cria cliente no bd
        try {
            factory.getCliente().create(cliente);
        } catch (SABioException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_confirma_cadastrar_clienteActionPerformed

    private void campo_ativo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_ativo_clienteActionPerformed
        cliente_status = true;
    }//GEN-LAST:event_campo_ativo_clienteActionPerformed

    private void campo_inativo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_inativo_clienteActionPerformed
        cliente_status = false;
    }//GEN-LAST:event_campo_inativo_clienteActionPerformed

    private void cancela_cadastrar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancela_cadastrar_clienteActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancela_cadastrar_clienteActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        SABioFactory factory = SABioFactory.getInstance();

        int id = Integer.parseInt(campo_id_af.getText());
        String login_cliente = campo_login_cliente_af.getText();
        String login_instrutor = campo_login_instrutor_af.getText();
        String observacao = campo_observacoes_af.getText();

        Calendar data_realizacao = Calendar.getInstance();
        
        ICliente cli = SABioFactory.getInstance().getCliente();
        
        try {
            cliente = cli.getClienteByLogin(login_cliente);
            System.out.println(cliente.getNomeCliente());
        } catch (SABioException ex) {
            Logger.getLogger(AtendenteView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        IInstrutor inst = SABioFactory.getInstance().getInstrutor();
        
        try {
            instrutor = inst.getInstrutorByLogin(login_instrutor);
        } catch (SABioException ex) {
            Logger.getLogger(AtendenteView.class.getName()).log(Level.SEVERE, null, ex);
        }
             
        AvaliacaoFisicaVO avaliacao = new AvaliacaoFisicaVO(cliente, instrutor, id, data_realizacao, observacao);

        // Cria cliente no bd
        try {
            factory.getAvaliacaoFisica().create(avaliacao);
        } catch (SABioException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar10;
    private javax.swing.JPanel Cliente;
    private javax.swing.JPanel Cliente1;
    private javax.swing.JPanel Instrutor;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campo_atestado_cliente;
    private javax.swing.JRadioButton campo_ativo_cliente;
    private javax.swing.JTextField campo_carga_horaria_instrutor;
    private javax.swing.JTextField campo_carteira_trabalho_instrutor;
    private javax.swing.JTextField campo_cpf_cliente;
    private javax.swing.JTextField campo_cpf_instrutor;
    private javax.swing.JTextField campo_data_nascimento_cliente;
    private javax.swing.JTextField campo_data_realizacao_af;
    private javax.swing.JTextField campo_endereco_instrutor;
    private javax.swing.JTextField campo_id_af;
    private javax.swing.JRadioButton campo_inativo_cliente;
    private javax.swing.JTextField campo_login_cliente;
    private javax.swing.JTextField campo_login_cliente_af;
    private javax.swing.JTextField campo_login_instrutor;
    private javax.swing.JTextField campo_login_instrutor_af;
    private javax.swing.JTextField campo_mensalidades_aberto_cliente;
    private javax.swing.JTextField campo_nome_cliente;
    private javax.swing.JTextField campo_nome_instrutor;
    private javax.swing.JTextField campo_observacoes_af;
    private javax.swing.JTextField campo_registro_instrutor;
    private javax.swing.JTextField campo_rg_cliente;
    private javax.swing.JTextField campo_rg_instrutor;
    private javax.swing.JPasswordField campo_senha_cliente;
    private javax.swing.JPasswordField campo_senha_instrutor;
    private javax.swing.JTextField campo_telefone_cliente;
    private javax.swing.JButton cancela_cadastrar_cliente;
    private javax.swing.JButton cancela_cadastro_instrutor;
    private javax.swing.JButton confirma_cadastrar_cliente;
    private javax.swing.JButton confirma_cadastro_instrutor;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
