package InterfaceGrafica;

import ConexaoMulticast.Conexao;
import ConexaoMulticast.Request;
import ConexaoMulticast.Response;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

    private static final Conexao conexao = new Conexao();

    public TelaPrincipal() {
        initComponents();
        this.limparCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGrupoQuestao1 = new javax.swing.ButtonGroup();
        buttonGrupoQuestao2 = new javax.swing.ButtonGroup();
        buttonGrupoQuestao3 = new javax.swing.ButtonGroup();
        buttonGrupoQuestao5 = new javax.swing.ButtonGroup();
        buttonGrupoQuestao6 = new javax.swing.ButtonGroup();
        buttonGrupoQuestao4 = new javax.swing.ButtonGroup();
        btnEnviar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAltura = new javax.swing.JFormattedTextField();
        txtPeso = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        cbAtividadeFisica = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPas = new javax.swing.JFormattedTextField();
        txtPad = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btn1Grupo1 = new javax.swing.JRadioButton();
        btn2Grupo1 = new javax.swing.JRadioButton();
        btn3Grupo1 = new javax.swing.JRadioButton();
        btn4Grupo1 = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        btnSimQuestao2 = new javax.swing.JRadioButton();
        btnNaoQuestao2 = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        btn2Questao3 = new javax.swing.JRadioButton();
        btn1Questao3 = new javax.swing.JRadioButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        btnNaoQuestao5 = new javax.swing.JRadioButton();
        btnSimQuestao5 = new javax.swing.JRadioButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        btnNaoQuestao6 = new javax.swing.JRadioButton();
        btnSimQuestao6 = new javax.swing.JRadioButton();
        btn5Questao1 = new javax.swing.JRadioButton();
        btn3Questao3 = new javax.swing.JRadioButton();
        btn1Questao4 = new javax.swing.JRadioButton();
        btn2Questao4 = new javax.swing.JRadioButton();
        btn3Questao4 = new javax.swing.JRadioButton();
        btn4Questao4 = new javax.swing.JRadioButton();
        btn5Questao4 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        riscoCardiaco = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sitema Avaliador de Risco Cardíaco");
        setResizable(false);

        btnEnviar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(0, 0, 255));
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "IMC", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel1.setText("Altura");

        jLabel2.setText("Peso");

        txtAltura.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtAltura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAlturaFocusLost(evt);
            }
        });

        txtPeso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPeso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPesoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPeso)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Atividades físicas por semana", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        cbAtividadeFisica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhuma", "1x", "2x", "3x", "4 ou mais" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(cbAtividadeFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(cbAtividadeFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Pressão Arterial (PA)", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel3.setText("Pressão Sistólica (PAS)");

        jLabel4.setText("Pressão Diastólica (PAD)");

        txtPas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txtPad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPas, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(txtPad))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Formulário sobre Tabagismo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jPanel4.setAutoscrolls(true);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("1) Quanto tempo após você acordar você fuma seu primeiro cigarro?");

        buttonGrupoQuestao1.add(btn1Grupo1);
        btn1Grupo1.setMnemonic(3);
        btn1Grupo1.setText("Dentro de 5 minutos");

        buttonGrupoQuestao1.add(btn2Grupo1);
        btn2Grupo1.setMnemonic(2);
        btn2Grupo1.setText("Entre 6 e 30 minutos");

        buttonGrupoQuestao1.add(btn3Grupo1);
        btn3Grupo1.setMnemonic(1);
        btn3Grupo1.setText("Entre 31 e 60 minutos");

        buttonGrupoQuestao1.add(btn4Grupo1);
        btn4Grupo1.setMnemonic(0);
        btn4Grupo1.setText("Após 60 minutos");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("2) Você acha difícil não fumar em lugares proibidos tais como igrejas, cinemas, ônibus?");

        buttonGrupoQuestao2.add(btnSimQuestao2);
        btnSimQuestao2.setMnemonic(1);
        btnSimQuestao2.setText("Sim");

        buttonGrupoQuestao2.add(btnNaoQuestao2);
        btnNaoQuestao2.setMnemonic(0);
        btnNaoQuestao2.setText("Não");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("3) Qual cigarro do dia lhe dá mais satisfação?");

        buttonGrupoQuestao3.add(btn2Questao3);
        btn2Questao3.setMnemonic(0);
        btn2Questao3.setText("Outros");

        buttonGrupoQuestao3.add(btn1Questao3);
        btn1Questao3.setMnemonic(1);
        btn1Questao3.setText("O primeiro da manhã");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("4) Quantos cigarros você fuma por dia?");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("5) Você fuma mais frequentemente pela manhã?");

        buttonGrupoQuestao5.add(btnNaoQuestao5);
        btnNaoQuestao5.setMnemonic(0);
        btnNaoQuestao5.setText("Não");

        buttonGrupoQuestao5.add(btnSimQuestao5);
        btnSimQuestao5.setMnemonic(1);
        btnSimQuestao5.setText("Sim");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("6) Você fuma mesmo doente, quanto fica ficar de cama a maior parte do tempo?");

        buttonGrupoQuestao6.add(btnNaoQuestao6);
        btnNaoQuestao6.setMnemonic(0);
        btnNaoQuestao6.setText("Não");

        buttonGrupoQuestao6.add(btnSimQuestao6);
        btnSimQuestao6.setMnemonic(1);
        btnSimQuestao6.setText("Sim");

        buttonGrupoQuestao1.add(btn5Questao1);
        btn5Questao1.setMnemonic(0);
        btn5Questao1.setText("Não fumo");

        buttonGrupoQuestao3.add(btn3Questao3);
        btn3Questao3.setMnemonic(0);
        btn3Questao3.setText("Não fumo");

        buttonGrupoQuestao4.add(btn1Questao4);
        btn1Questao4.setMnemonic(0);
        btn1Questao4.setText("Menos de 10");

        buttonGrupoQuestao4.add(btn2Questao4);
        btn2Questao4.setMnemonic(1);
        btn2Questao4.setText("Entre 10 e 20");

        buttonGrupoQuestao4.add(btn3Questao4);
        btn3Questao4.setMnemonic(2);
        btn3Questao4.setText("Entre 20 e 30");

        buttonGrupoQuestao4.add(btn4Questao4);
        btn4Questao4.setMnemonic(3);
        btn4Questao4.setText("Mais de 31");

        buttonGrupoQuestao4.add(btn5Questao4);
        btn5Questao4.setMnemonic(0);
        btn5Questao4.setText("Não fumo");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btn1Grupo1)
                                .addGap(18, 18, 18)
                                .addComponent(btn3Grupo1)
                                .addGap(18, 18, 18)
                                .addComponent(btn5Questao1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(148, Short.MAX_VALUE))
                    .addComponent(jSeparator5)))
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addComponent(jSeparator4)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btn1Questao3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btn2Questao3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3Questao3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnSimQuestao5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(btnNaoQuestao5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btnSimQuestao6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(btnNaoQuestao6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(btnSimQuestao2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(btnNaoQuestao2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btn2Questao4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn4Questao4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btn1Questao4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(btn3Questao4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addComponent(btn5Questao4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn2Grupo1)
                        .addGap(18, 18, 18)
                        .addComponent(btn4Grupo1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1Grupo1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3Grupo1)
                    .addComponent(btn5Questao1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn2Grupo1)
                    .addComponent(btn4Grupo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimQuestao2)
                    .addComponent(btnNaoQuestao2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn2Questao3)
                    .addComponent(btn1Questao3)
                    .addComponent(btn3Questao3))
                .addGap(13, 13, 13)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1Questao4)
                    .addComponent(btn3Questao4)
                    .addComponent(btn5Questao4))
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn2Questao4)
                    .addComponent(btn4Questao4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimQuestao5)
                    .addComponent(btnNaoQuestao5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNaoQuestao6)
                    .addComponent(btnSimQuestao6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Chances de risco cardiaco segundo sua análise", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        riscoCardiaco.setBackground(new java.awt.Color(255, 255, 255));
        riscoCardiaco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        riscoCardiaco.setForeground(new java.awt.Color(204, 0, 0));
        riscoCardiaco.setMajorTickSpacing(5);
        riscoCardiaco.setPaintLabels(true);
        riscoCardiaco.setPaintTicks(true);
        riscoCardiaco.setFocusable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(riscoCardiaco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(riscoCardiaco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 261, 261))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean validarCamposPreenchidos() {
        String mensagem = "";

        if (txtAltura.getText().isBlank()) {
            mensagem += "O campo Altura é obrigatório.\n";
        }
        if (txtPeso.getText().isBlank()) {
            mensagem += "O campo Peso é obrigatório.\n";
        }
        if (cbAtividadeFisica.getSelectedItem() == null || cbAtividadeFisica.getSelectedIndex() == -1) {
            mensagem += "A quantidade de atividade física por semana é obrigatório.\n";
        }
        if (txtPad.getText().isBlank()) {
            mensagem += "O campo Pressão Diastólica é obrigatório.\n";
        }
        if (txtPad.getText().isBlank()) {
            mensagem += "O campo Pressão Sistólica é obrigatório.\n";
        }
        if (buttonGrupoQuestao1.getSelection() == null) {
            mensagem += "A questão 1 do formulário é obrigatória.\n";
        }
        if (buttonGrupoQuestao2.getSelection() == null) {
            mensagem += "A questão 2 do formulário é obrigatória.\n";
        }
        if (buttonGrupoQuestao3.getSelection() == null) {
            mensagem += "A questão 3 do formulário é obrigatória.\n";
        }
        if (buttonGrupoQuestao4.getSelection() == null) {
            mensagem += "A questão 4 do formulário é obrigatória.\n";
        }
        if (buttonGrupoQuestao5.getSelection() == null) {
            mensagem += "A questão 5 do formulário é obrigatória.\n";
        }
        if (buttonGrupoQuestao6.getSelection() == null) {
            mensagem += "A questão 6 do formulário é obrigatória.\n";
        }

        if (mensagem.isBlank()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    mensagem,
                    "Preencha os campos obrigatórios.",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    private void limparCampos() {
        txtAltura.setText("");
        txtPeso.setText("");
        txtPad.setText("");
        txtPas.setText("");
        cbAtividadeFisica.setSelectedItem(null);
        buttonGrupoQuestao1.clearSelection();
        buttonGrupoQuestao2.clearSelection();
        buttonGrupoQuestao3.clearSelection();
        buttonGrupoQuestao4.clearSelection();
        buttonGrupoQuestao5.clearSelection();
        buttonGrupoQuestao6.clearSelection();
        riscoCardiaco.setValue(50);
        jScrollPane2.getVerticalScrollBar().setValue(0);
    }

    private Integer getPontuacaoFormularioTabagismo() {
        int pontuacao = 0;
        pontuacao += buttonGrupoQuestao1.getSelection().getMnemonic();
        pontuacao += buttonGrupoQuestao2.getSelection().getMnemonic();
        pontuacao += buttonGrupoQuestao3.getSelection().getMnemonic();
        pontuacao += buttonGrupoQuestao4.getSelection().getMnemonic();
        pontuacao += buttonGrupoQuestao5.getSelection().getMnemonic();
        pontuacao += buttonGrupoQuestao6.getSelection().getMnemonic();
        return pontuacao;
    }

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        if (validarCamposPreenchidos()) {
            double altura = Double.parseDouble(txtAltura.getText().replace(",", "."));
            double peso = Double.parseDouble(txtPeso.getText().replace(",", "."));
            Integer qtdAtividadeFisicaSemanal = cbAtividadeFisica.getSelectedIndex();
            Integer pas = Integer.valueOf(txtPas.getText());
            Integer pad = Integer.valueOf(txtPad.getText());
            double opiniaoEspecialistaChanceAtqCardiaco = riscoCardiaco.getValue();

            Request request = new Request();
            request.setId(conexao.getId());
            request.setAltura(altura);
            request.setPeso(peso);
            request.setQtdAtividadeFisicaSemanal(qtdAtividadeFisicaSemanal);
            request.setPas(pas);
            request.setPad(pad);
            request.setPontuacaoTabagismo(this.getPontuacaoFormularioTabagismo());
            request.setOpniaoEspecialistaChanceAtqCardiaco(opiniaoEspecialistaChanceAtqCardiaco/100);
            
            String resposta = conexao.iniciar(request);

            JOptionPane.showMessageDialog(
                    this,
                    resposta,
                    "Resultado de Risco cardíaco",
                    JOptionPane.INFORMATION_MESSAGE);

            //this.limparCampos();
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void txtAlturaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAlturaFocusLost
        if (!txtAltura.getText().isBlank()) {
            double altura = Double.parseDouble(txtAltura.getText().replace(",", "."));
            if (altura < 0.3 || altura > 2.5) {
                JOptionPane.showMessageDialog(this,
                        "A altura informada é inválida.\n"
                        + "Informe uma altura entre 0,3m e 2,5m.",
                        "Altura inválida",
                        JOptionPane.ERROR_MESSAGE);
                txtAltura.setText("");
            }
        }
    }//GEN-LAST:event_txtAlturaFocusLost

    private void txtPesoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPesoFocusLost
        if (!txtPeso.getText().isBlank()) {
            double peso = Double.parseDouble(txtPeso.getText().replace(",", "."));
            if (peso <= 0 || peso > 600) {
                JOptionPane.showMessageDialog(this,
                        "O peso informado é inválido.\n"
                        + "Informe um peso maior que 0 e menor que 600 quilos.",
                        "Peso inválido",
                        JOptionPane.ERROR_MESSAGE);
                txtPeso.setText("");
            }
        }
    }//GEN-LAST:event_txtPesoFocusLost

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btn1Grupo1;
    private javax.swing.JRadioButton btn1Questao3;
    private javax.swing.JRadioButton btn1Questao4;
    private javax.swing.JRadioButton btn2Grupo1;
    private javax.swing.JRadioButton btn2Questao3;
    private javax.swing.JRadioButton btn2Questao4;
    private javax.swing.JRadioButton btn3Grupo1;
    private javax.swing.JRadioButton btn3Questao3;
    private javax.swing.JRadioButton btn3Questao4;
    private javax.swing.JRadioButton btn4Grupo1;
    private javax.swing.JRadioButton btn4Questao4;
    private javax.swing.JRadioButton btn5Questao1;
    private javax.swing.JRadioButton btn5Questao4;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JRadioButton btnNaoQuestao2;
    private javax.swing.JRadioButton btnNaoQuestao5;
    private javax.swing.JRadioButton btnNaoQuestao6;
    private javax.swing.JRadioButton btnSimQuestao2;
    private javax.swing.JRadioButton btnSimQuestao5;
    private javax.swing.JRadioButton btnSimQuestao6;
    private javax.swing.ButtonGroup buttonGrupoQuestao1;
    private javax.swing.ButtonGroup buttonGrupoQuestao2;
    private javax.swing.ButtonGroup buttonGrupoQuestao3;
    private javax.swing.ButtonGroup buttonGrupoQuestao4;
    private javax.swing.ButtonGroup buttonGrupoQuestao5;
    private javax.swing.ButtonGroup buttonGrupoQuestao6;
    private javax.swing.JComboBox<String> cbAtividadeFisica;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSlider riscoCardiaco;
    private javax.swing.JFormattedTextField txtAltura;
    private javax.swing.JFormattedTextField txtPad;
    private javax.swing.JFormattedTextField txtPas;
    private javax.swing.JFormattedTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
