package presentation;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sabio.SABioException;
import sabio.SABioFactory;
import sabio.spec.IAvaliacaoFisica;
import sabio.spec.ICliente;
import sabio.spec.IInstrutor;
import vo.*;

public class AtendenteView extends javax.swing.JFrame {

    private static AtendenteView atendenteview;
    private List<AtendenteVO> atendentes;
    private boolean cliente_status = false;
    private ClienteVO cliente;
    private InstrutorVO instrutor;
    private AvaliacaoFisicaVO avaliacao;

    public AtendenteView() {

        super("Atendente");
        initComponents();
        this.setVisible(true);

        try {
            IAvaliacaoFisica af = SABioFactory.getInstance().getAvaliacaoFisica();

            List<AvaliacaoFisicaVO> avaliacoes;
            List<Integer> ids = new ArrayList();

            avaliacoes = af.getAll();

            for (int i = 0; i < avaliacoes.size(); i++) {
                ids.add(avaliacoes.get(i).getID());
            }

            af_id.setModel(new javax.swing.DefaultComboBoxModel(ids.toArray()));

        } catch (SABioException ex) {
            Logger.getLogger(AtendenteView.class.getName()).log(Level.SEVERE, null, ex);
        }

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
        Buscar = new javax.swing.JButton();
        Cliente = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        campo_login_cliente = new javax.swing.JTextField();
        campo_cpf_cliente = new javax.swing.JTextField();
        campo_mensalidades_aberto_cliente = new javax.swing.JTextField();
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
        BuscarCliente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        campo_login_cliente_af = new javax.swing.JTextField();
        campo_observacoes_af = new javax.swing.JTextField();
        campo_login_instrutor_af = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        campo_id_af = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        Cliente1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        Buscar10 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        af_id = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

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

        Buscar.setText(bundle.getString("AtendenteView.Buscar.text")); // NOI18N
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel18)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_endereco_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campo_nome_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_registro_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_carteira_trabalho_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_senha_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cancela_cadastro_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(confirma_cadastro_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 389, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 389, Short.MAX_VALUE)))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Buscar, cancela_cadastro_instrutor, confirma_cadastro_instrutor});

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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_cpf_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(campo_carteira_trabalho_instrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancela_cadastro_instrutor)
                    .addComponent(confirma_cadastro_instrutor)
                    .addComponent(Buscar))
                .addGap(58, 58, 58))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 153, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 154, Short.MAX_VALUE)))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {campo_carga_horaria_instrutor, campo_cpf_instrutor, campo_login_instrutor});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Buscar, cancela_cadastro_instrutor, confirma_cadastro_instrutor});

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

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setName(bundle.getString("AtendenteView.jSeparator3.name")); // NOI18N

        jLabel24.setText(bundle.getString("AtendenteView.jLabel24.text")); // NOI18N
        jLabel24.setName(bundle.getString("AtendenteView.jLabel24.name")); // NOI18N

        jLabel25.setText(bundle.getString("AtendenteView.jLabel25.text")); // NOI18N
        jLabel25.setName(bundle.getString("AtendenteView.jLabel25.name")); // NOI18N

        campo_login_cliente.setName(bundle.getString("AtendenteView.campo_login_cliente.name")); // NOI18N

        campo_cpf_cliente.setName(bundle.getString("AtendenteView.campo_cpf_cliente.name")); // NOI18N

        campo_mensalidades_aberto_cliente.setName(bundle.getString("AtendenteView.campo_mensalidades_aberto_cliente.name")); // NOI18N

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

        BuscarCliente.setText(bundle.getString("AtendenteView.BuscarCliente.text")); // NOI18N
        BuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel26)
                    .addComponent(jLabel25)
                    .addComponent(jLabel24)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(campo_atestado_cliente, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(campo_cpf_cliente, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(campo_rg_cliente, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(campo_login_cliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(campo_mensalidades_aberto_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_telefone_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_senha_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_ativo_cliente)
                    .addComponent(campo_inativo_cliente))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(cancela_cadastrar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(BuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(confirma_cadastrar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 389, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 389, Short.MAX_VALUE)))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BuscarCliente, cancela_cadastrar_cliente, confirma_cadastrar_cliente});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(campo_login_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(campo_rg_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(campo_cpf_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(campo_atestado_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(campo_mensalidades_aberto_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19)))
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(confirma_cadastrar_cliente)
                            .addComponent(BuscarCliente)
                            .addComponent(cancela_cadastrar_cliente))
                        .addGap(57, 57, 57))
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
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(campo_ativo_cliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campo_inativo_cliente))
                            .addComponent(jLabel4))
                        .addGap(148, 148, 148))))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 153, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 154, Short.MAX_VALUE)))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BuscarCliente, cancela_cadastrar_cliente, confirma_cadastrar_cliente});

        javax.swing.GroupLayout ClienteLayout = new javax.swing.GroupLayout(Cliente);
        Cliente.setLayout(ClienteLayout);
        ClienteLayout.setHorizontalGroup(
            ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ClienteLayout.setVerticalGroup(
            ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab(bundle.getString("AtendenteView.Cliente.TabConstraints.tabTitle"), Cliente); // NOI18N

        jPanel1.setName(bundle.getString("AtendenteView.jPanel1.name")); // NOI18N

        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel6.setName(bundle.getString("AtendenteView.jPanel6.name")); // NOI18N

        campo_login_cliente_af.setName(bundle.getString("AtendenteView.campo_login_cliente_af.name")); // NOI18N

        campo_observacoes_af.setName(bundle.getString("AtendenteView.campo_observacoes_af.name")); // NOI18N

        campo_login_instrutor_af.setName(bundle.getString("AtendenteView.campo_login_instrutor_af.name")); // NOI18N

        jLabel30.setText(bundle.getString("AtendenteView.jLabel30.text")); // NOI18N
        jLabel30.setName(bundle.getString("AtendenteView.jLabel30.name")); // NOI18N

        jLabel31.setText(bundle.getString("AtendenteView.jLabel31.text")); // NOI18N
        jLabel31.setName(bundle.getString("AtendenteView.jLabel31.name")); // NOI18N

        jLabel34.setText(bundle.getString("AtendenteView.jLabel34.text")); // NOI18N
        jLabel34.setName(bundle.getString("AtendenteView.jLabel34.name")); // NOI18N

        jLabel35.setText(bundle.getString("AtendenteView.jLabel35.text")); // NOI18N
        jLabel35.setName(bundle.getString("AtendenteView.jLabel35.name")); // NOI18N

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
                .addGap(162, 162, 162)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel30)
                        .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campo_id_af, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_login_cliente_af, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campo_login_instrutor_af, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(campo_observacoes_af, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton11, jButton12});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
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
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton12)
                    .addComponent(jButton11))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton11, jButton12});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab(bundle.getString("AtendenteView.jPanel1.TabConstraints.tabTitle"), jPanel1); // NOI18N

        Cliente1.setName(bundle.getString("AtendenteView.Cliente1.name")); // NOI18N
        Cliente1.setPreferredSize(new java.awt.Dimension(731, 326));

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel5.setName(bundle.getString("AtendenteView.jPanel5.name")); // NOI18N
        jPanel5.setPreferredSize(new java.awt.Dimension(731, 326));

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
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
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

        af_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                af_idActionPerformed(evt);
            }
        });

        jLabel1.setText(bundle.getString("AtendenteView.jLabel1.text")); // NOI18N

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
                        .addGap(61, 61, 61)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(af_id, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton13, jButton14});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(af_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton14))
                .addGap(18, 18, 18)
                .addComponent(Buscar10)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton13, jButton14});

        javax.swing.GroupLayout Cliente1Layout = new javax.swing.GroupLayout(Cliente1);
        Cliente1.setLayout(Cliente1Layout);
        Cliente1Layout.setHorizontalGroup(
            Cliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cliente1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
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
            JOptionPane.showMessageDialog(null,"Cadastro Realizado", "Sucesso!", JOptionPane.WARNING_MESSAGE);
            campo_nome_instrutor.setText("");
            campo_rg_instrutor.setText("");
            campo_cpf_instrutor.setText("");
            campo_endereco_instrutor.setText("");
            campo_registro_instrutor.setText("");
            campo_carteira_trabalho_instrutor.setText("");
            campo_carga_horaria_instrutor.setText("");
            campo_senha_instrutor.setText("");
            
        } catch (SABioException ex) {
            JOptionPane.showMessageDialog(null,"Cadastro NAO Realizado", "Erro!", JOptionPane.WARNING_MESSAGE);
            campo_nome_instrutor.setText("");
            campo_rg_instrutor.setText("");
            campo_cpf_instrutor.setText("");
            campo_endereco_instrutor.setText("");
            campo_registro_instrutor.setText("");
            campo_carteira_trabalho_instrutor.setText("");
            campo_carga_horaria_instrutor.setText("");
            campo_senha_instrutor.setText("");
        }

    }//GEN-LAST:event_confirma_cadastro_instrutorActionPerformed

    private void cancela_cadastro_instrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancela_cadastro_instrutorActionPerformed
        
        IInstrutor inst = SABioFactory.getInstance().getInstrutor();

        try {
            instrutor = inst.getInstrutorByLogin(campo_login_instrutor.getText());
        } catch (SABioException ex) {
            Logger.getLogger(AtendenteView.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            inst.delete(campo_login_instrutor.getText());
            
            campo_nome_instrutor.setText("");
            campo_rg_instrutor.setText("");
            campo_cpf_instrutor.setText("");
            campo_endereco_instrutor.setText("");
            campo_registro_instrutor.setText("");
            campo_carteira_trabalho_instrutor.setText("");
            campo_carga_horaria_instrutor.setText("");
            campo_senha_instrutor.setText("");
            
        } catch (SABioException ex) {
            Logger.getLogger(AtendenteView.class.getName()).log(Level.SEVERE, null, ex);
        }


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
            
            JOptionPane.showMessageDialog(null,"Cadastro Realizado", "Sucesso!", JOptionPane.WARNING_MESSAGE);
            campo_nome_cliente.setText("");
            campo_rg_cliente.setText("");
            campo_cpf_cliente.setText("");
            campo_atestado_cliente.setText("");
            campo_mensalidades_aberto_cliente.setText("");
            campo_telefone_cliente.setText("");
            cliente_status = false;
            campo_senha_cliente.setText("");

        } catch (SABioException ex) {
            JOptionPane.showMessageDialog(null,"Cadastro  NAO Realizado", "Erro!", JOptionPane.WARNING_MESSAGE);
            campo_nome_cliente.setText("");
            campo_rg_cliente.setText("");
            campo_cpf_cliente.setText("");
            campo_atestado_cliente.setText("");
            campo_mensalidades_aberto_cliente.setText("");
            campo_telefone_cliente.setText("");
            cliente_status = false;
            campo_senha_cliente.setText("");
        }
    }//GEN-LAST:event_confirma_cadastrar_clienteActionPerformed

    private void campo_ativo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_ativo_clienteActionPerformed
        cliente_status = true;
    }//GEN-LAST:event_campo_ativo_clienteActionPerformed

    private void campo_inativo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_inativo_clienteActionPerformed
        cliente_status = false;
    }//GEN-LAST:event_campo_inativo_clienteActionPerformed

    private void cancela_cadastrar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancela_cadastrar_clienteActionPerformed

        //System.exit(0);
        ICliente client = SABioFactory.getInstance().getCliente();

        try {
            cliente = client.getClienteByLogin(campo_login_cliente.getText());
        } catch (SABioException ex) {
            Logger.getLogger(AtendenteView.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            client.delete(campo_login_cliente.getText());
            
            campo_nome_cliente.setText("");
            campo_rg_cliente.setText("");
            campo_cpf_cliente.setText("");
            campo_atestado_cliente.setText("");
            campo_mensalidades_aberto_cliente.setText("");
            campo_telefone_cliente.setText("");
            cliente_status = false;
            campo_senha_cliente.setText("");
            
        } catch (SABioException ex) {
            Logger.getLogger(AtendenteView.class.getName()).log(Level.SEVERE, null, ex);
        }



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
        } catch (SABioException ex) {
            Logger.getLogger(AtendenteView.class.getName()).log(Level.SEVERE, null, ex);
        }

        IInstrutor inst = SABioFactory.getInstance().getInstrutor();

        try {
            instrutor = inst.getInstrutorByLogin(login_instrutor);
        } catch (SABioException ex) {
            Logger.getLogger(AtendenteView.class.getName()).log(Level.SEVERE, null, ex);
        }

        AvaliacaoFisicaVO avaliacao2 = new AvaliacaoFisicaVO(cliente, instrutor, id, data_realizacao, observacao);

        // Cria cliente no bd
        try {
            factory.getAvaliacaoFisica().create(avaliacao2);
            
            JOptionPane.showMessageDialog(null,"Cadastro Realizado", "Sucesso!", JOptionPane.WARNING_MESSAGE);
            campo_id_af.setText("");
            campo_login_cliente_af.setText("");
            campo_login_instrutor_af.setText("");
            campo_observacoes_af.setText("");
        } catch (SABioException ex) {
            
            JOptionPane.showMessageDialog(null,"Cadastro NAO Realizado", "ERRO!", JOptionPane.WARNING_MESSAGE);
            campo_id_af.setText("");
            campo_login_cliente_af.setText("");
            campo_login_instrutor_af.setText("");
            campo_observacoes_af.setText("");
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        IInstrutor inst = SABioFactory.getInstance().getInstrutor();

        try {

            instrutor = inst.getInstrutorByLogin(campo_login_instrutor.getText());
            campo_nome_instrutor.setText(instrutor.getNome());
            campo_rg_instrutor.setText(instrutor.getRG());
            campo_cpf_instrutor.setText(instrutor.getCPF());
            campo_endereco_instrutor.setText(instrutor.getEndereco());
            campo_registro_instrutor.setText(instrutor.getRegistroProfissional());
            campo_carteira_trabalho_instrutor.setText(instrutor.getNumeroCarteiraTrabalho());
            campo_carga_horaria_instrutor.setText(String.valueOf(instrutor.getCargaHoraria()));
            campo_senha_instrutor.setEnabled(false);

        } catch (SABioException ex) {
            Logger.getLogger(AtendenteView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void BuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarClienteActionPerformed
        ICliente cli = SABioFactory.getInstance().getCliente();

        try {
            cliente = cli.getClienteByLogin(campo_login_cliente.getText());
            campo_nome_cliente.setText(cliente.getNomeCliente());
            campo_rg_cliente.setText(cliente.getRG());
            campo_cpf_cliente.setText(cliente.getCPF());
            campo_atestado_cliente.setText(cliente.getAtestadoMedico());
            campo_mensalidades_aberto_cliente.setText(cliente.getMensalidadesAbertas());
            campo_telefone_cliente.setText(cliente.getTelefone());
            boolean stats = cliente.getStatus();
            campo_senha_cliente.setEnabled(false);
            if (stats) {
                campo_ativo_cliente.doClick();
            } else {
                campo_inativo_cliente.doClick();
            }

        } catch (SABioException ex) {
            Logger.getLogger(AtendenteView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BuscarClienteActionPerformed

    private void af_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_af_idActionPerformed
        
        int id = Integer.parseInt(String.valueOf(af_id.getSelectedItem()));

        IAvaliacaoFisica af = SABioFactory.getInstance().getAvaliacaoFisica();
        
        try {
                avaliacao = af.getAvaliacaoFisicaById(id);
                
                String[] colunas = {"Login Cliente", "Login Instrutor", "Id", "Data", "Observacoes"};

                // Mostra a data na linguagem selecionada no login
                String data_realizacao = SimpleDateFormat.getDateInstance(SimpleDateFormat.MEDIUM, Locale.getDefault()).format(avaliacao.getDataRealizacao().getTime());
                
                String tabela[][] = {
                {avaliacao.getCliente().getUsuario().getLogin(),
                avaliacao.getInstrutor().getUsuario().getLogin(),
                String.valueOf(avaliacao.getID()),
                data_realizacao,
                avaliacao.getObservacoes()}
            };

            jTable1.setModel(new DefaultTableModel(tabela, colunas) {

                @Override
                public boolean isCellEditable(int rowIndex, int mColIndex) {
                    return false;
                }
            });

            validate();
             
        } catch (SABioException ex) {
            Logger.getLogger(AtendenteView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_af_idActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Buscar10;
    private javax.swing.JButton BuscarCliente;
    private javax.swing.JPanel Cliente;
    private javax.swing.JPanel Cliente1;
    private javax.swing.JPanel Instrutor;
    private javax.swing.JComboBox af_id;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campo_atestado_cliente;
    private javax.swing.JRadioButton campo_ativo_cliente;
    private javax.swing.JTextField campo_carga_horaria_instrutor;
    private javax.swing.JTextField campo_carteira_trabalho_instrutor;
    private javax.swing.JTextField campo_cpf_cliente;
    private javax.swing.JTextField campo_cpf_instrutor;
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
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
