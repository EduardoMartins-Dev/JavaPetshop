/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package petshop;
import static petshop.Conexao.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Dudu
 */
public class Animal extends javax.swing.JFrame {
DefaultTableModel  model, id_cliente, id_tipo_animal, id_raca;
String usuario, id_func;
    
    public Animal() {
        initComponents();
        Conexao.Conectar(); 
        pnIdCliente.setVisible(false);
        pnIdTipoAnimal.setVisible(false);
        pnIdRaca.setVisible(false);
        id_cliente =  (DefaultTableModel) jTable2.getModel();
        id_tipo_animal =  (DefaultTableModel) jTable3.getModel();
        id_raca = (DefaultTableModel) jTable13.getModel();
        
      
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        tfid = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfIdCliente = new javax.swing.JTextField();
        tfIdTipoAnimal = new javax.swing.JTextField();
        tfIdRaca = new javax.swing.JTextField();
        tfDataNascimento = new javax.swing.JTextField();
        tfDataFalecimento = new javax.swing.JTextField();
        tfSexo = new javax.swing.JTextField();
        tfCor = new javax.swing.JTextField();
        tfMicrochip = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfCastrado = new javax.swing.JTextField();
        jlabel2 = new javax.swing.JLabel();
        tfObservacoes = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tfDataCadastro = new javax.swing.JTextField();
        tfIdEmpresa = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        pnIdCliente = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton10 = new javax.swing.JButton();
        pnIdTipoAnimal = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        pnIdRaca = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable13 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Incluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Consultar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Alterar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Excluir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Sair");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Novo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel12.setText("Observações");

        tfid.setEditable(false);

        tfCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCorActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jlabel2.setText("ID Cliente");

        jLabel3.setText("Nome Cliente");

        jLabel4.setText("ID Tipo Animal");

        jLabel5.setText("ID Raça");

        jLabel6.setText("Data Nascimento");

        jLabel7.setText("Data Falecimento");

        jLabel8.setText("Sexo");

        jLabel9.setText("Cor");

        jLabel10.setText("Microchip");

        jLabel11.setText("Castrado");

        jLabel13.setText("Data Cadastro");

        jLabel14.setText("ID Empresa");

        jButton7.setText("...");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("...");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("...");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Cliente", "ID Cliente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable2FocusGained(evt);
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton10.setBackground(new java.awt.Color(255, 0, 0));
        jButton10.setText("X");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnIdClienteLayout = new javax.swing.GroupLayout(pnIdCliente);
        pnIdCliente.setLayout(pnIdClienteLayout);
        pnIdClienteLayout.setHorizontalGroup(
            pnIdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnIdClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnIdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnIdClienteLayout.setVerticalGroup(
            pnIdClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnIdClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo Animal", "ID Tipo Animal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jButton11.setBackground(new java.awt.Color(204, 0, 0));
        jButton11.setText("X");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnIdTipoAnimalLayout = new javax.swing.GroupLayout(pnIdTipoAnimal);
        pnIdTipoAnimal.setLayout(pnIdTipoAnimalLayout);
        pnIdTipoAnimalLayout.setHorizontalGroup(
            pnIdTipoAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnIdTipoAnimalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnIdTipoAnimalLayout.setVerticalGroup(
            pnIdTipoAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnIdTipoAnimalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnIdTipoAnimalLayout.createSequentialGroup()
                .addComponent(jButton11)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButton21.setBackground(new java.awt.Color(204, 0, 0));
        jButton21.setText("X");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jTable13.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Raça", "ID Raça"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable13MouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(jTable13);

        javax.swing.GroupLayout pnIdRacaLayout = new javax.swing.GroupLayout(pnIdRaca);
        pnIdRaca.setLayout(pnIdRacaLayout);
        pnIdRacaLayout.setHorizontalGroup(
            pnIdRacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnIdRacaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton21)
                .addContainerGap())
            .addGroup(pnIdRacaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnIdRacaLayout.setVerticalGroup(
            pnIdRacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnIdRacaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jlabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tfDataNascimento, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfIdTipoAnimal, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfNome, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfIdCliente, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfMicrochip, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfDataFalecimento, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfid, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfIdRaca)
                        .addComponent(tfSexo)
                        .addComponent(tfCor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tfCastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfIdEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9)
                            .addComponent(jButton7)
                            .addComponent(jButton8)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButton5)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnIdCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnIdRaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnIdTipoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnIdRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfIdTipoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfIdRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addGap(28, 28, 28)
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDataFalecimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfMicrochip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfCastrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tfObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tfDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tfIdEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14)))
                                    .addComponent(jLabel11)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton3)
                                    .addComponent(jButton4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(pnIdTipoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String sql;
        String id, id_cliente, nome, id_tipo_animal, id_raca, data_nascimento, data_falecimento, sexo, cor, microchip, castrado, observacoes, data_cadastro, id_empresa;
        id = tfid.getText();
        id_cliente = tfIdCliente.getText();
        nome = tfNome.getText();
        id_tipo_animal = tfIdTipoAnimal.getText();
        id_raca = tfIdRaca.getText();
        data_nascimento = tfDataNascimento.getText();
        data_falecimento = tfDataFalecimento.getText();
        sexo = tfSexo.getText();
        cor = tfCor.getText();
        microchip = tfMicrochip.getText();
        castrado = tfCastrado.getText();
        observacoes = tfObservacoes.getText();
        data_cadastro = tfDataCadastro.getText();
        id_empresa = tfIdEmpresa.getText();

        sql="insert into animal (id_cliente, nome, id_tipo_animal, id_raca, dt_nasc, dt_falec, sexo, cor,"
        + " microchip, castrado, observacoes, dt_cadastro, id_empresa) values ('"   + id_cliente + "','" + nome
        +"','" + id_tipo_animal +"','" + id_raca +"','" + data_nascimento +"','"
        + data_falecimento + "','" + sexo + "','" + cor + "','" + microchip + "','"
        + castrado + "','"
        + observacoes + "','" + data_cadastro +  "','" + id_empresa + "')";

        System.out.println(sql);

        try{
            Statement stm = con.prepareStatement(sql);
            stm.execute(sql);
            tfid.setText("");
            tfIdCliente.setText("");
            tfNome.setText("");
            tfIdRaca.setText("");
            tfIdTipoAnimal.setText("");
            tfDataNascimento.setText("");
            tfDataFalecimento.setText("");
            tfSexo.setText("");
            tfCor.setText("");
            tfMicrochip.setText("");
            tfCastrado.setText("");
            tfObservacoes.setText("");
            tfDataCadastro.setText("");
            tfIdEmpresa.setText("");
            tfIdCliente.requestFocus();
            tfIdCliente.setEnabled(false);
            tfNome.setEnabled(false);
            tfIdTipoAnimal.setEnabled(false);
            tfIdRaca.setEnabled(false);
            tfDataNascimento.setEnabled(false);
            tfDataFalecimento.setEnabled(false);
            tfMicrochip.setEnabled(false);
            tfCor.setEnabled(false);
            tfSexo.setEnabled(false);
            tfCastrado.setEnabled(false);
            tfObservacoes.setEnabled(false);
            tfDataCadastro.setEnabled(false);
            tfIdEmpresa.setEnabled(false);
        }
        catch(Exception e){

            JOptionPane.showMessageDialog(null, "Erro ao incluir, tente novamente" + e,"ERRO",JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String sql;
 
        try{
            sql = "select * from animal where id_cliente = '" + tfIdCliente.getText() + "' order by id desc"; 


            Statement stm = con.createStatement(); 

            ResultSet rs = stm.executeQuery(sql);
            rs.next(); 


            String[] linha= new String[]{rs.getString("id"),rs.getString("id_cliente"),
            rs.getString("nome"),rs.getString("id_tipo_animal"),rs.getString("id_raca")
            ,rs.getString("dt_nasc"),rs.getString("dt_falec"),rs.getString("sexo"),rs.getString("cor")
            ,rs.getString("microchip"),rs.getString("castrado"),rs.getString("observacoes"),rs.getString("dt_cadastro"),rs.getString("id_empresa")}; 
        
        model.addRow(linha); 

        
            tfid.setText(rs.getString("id")); 
            tfIdCliente.setText(rs.getString("id_cliente"));
            tfNome.setText(rs.getString("nome"));
            tfIdTipoAnimal.setText(rs.getString("id_tipo_animal"));
            tfIdRaca.setText(rs.getString("id_raca"));
            tfDataNascimento.setText(rs.getString("dt_nasc"));
            tfDataFalecimento.setText(rs.getString("dt_falec"));
            tfSexo.setText(rs.getString("sexo"));
            tfCor.setText(rs.getString("cor"));
            tfMicrochip.setText(rs.getString("microchip"));
            tfCastrado.setText(rs.getString("castrado"));
            tfObservacoes.setText(rs.getString("observacoes"));
            tfDataCadastro.setText("dt_cadastro");
            tfIdEmpresa.setText("id_empresa");

            while(rs.next()){
            linha= new String[]{rs.getString("id"),rs.getString("id_cliente"),
                rs.getString("nome"),rs.getString("id_tipo_animal"),
                rs.getString("id_raca"),rs.getString("dt_nasc"),rs.getString("dt_falec")
                ,rs.getString("sexo"),rs.getString("cor"),rs.getString("microchip"),rs.getString("castrado"),rs.getString("observacoes"),rs.getString("dt_cadastro")
                ,rs.getString("id_empresa")}; 
            
            
            model.addRow(linha); 
            
        }
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao consultar, tente novamente"
                ,"ERRO",JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String sql;
        String id, id_cliente, nome, id_tipo_animal, id_raca, data_nascimento, data_falecimento, sexo, cor, microchip, castrado, observacoes, data_cadastro, id_empresa;
        id = tfid.getText();
        id_cliente = tfIdCliente.getText();
        nome = tfNome.getText();
        id_tipo_animal = tfIdTipoAnimal.getText();
        id_raca = tfIdRaca.getText();
        data_nascimento = tfDataNascimento.getText();
        data_falecimento = tfDataFalecimento.getText();
        sexo = tfSexo.getText();
        cor = tfCor.getText();
        microchip = tfMicrochip.getText();
        castrado = tfCastrado.getText();
        observacoes = tfObservacoes.getText();
        data_cadastro = tfDataCadastro.getText();
        id_empresa = tfIdEmpresa.getText();
        try{
            sql="update animal set id_cliente='" + id_cliente + "', nome='"
            + nome + "', id_tipo_animal='" + id_tipo_animal + "', id_raca='" + id_raca +"', dt_nasc='" + data_nascimento +"', dt_falec='" + data_falecimento +"', sexo='" + sexo
            +"', cor='" + cor +"', microchip='" + microchip +"', castrado='" + castrado +
            "', observacoes='" + observacoes +"', dt_cadastro='" + data_cadastro +"', id_empresa='" + id_empresa + " where id_empresa = " +id_empresa;

            Statement stm = con.prepareStatement(sql);
            stm.execute(sql);
            tfid.setText("");
            tfIdCliente.setText("");
            tfNome.setText("");
            tfIdTipoAnimal.setText("");
            tfIdRaca.setText("");
            tfDataNascimento.setText("");
            tfDataFalecimento.setText("");
            tfSexo.setText("");
            tfCor.setText("");
            tfMicrochip.setText("");
            tfCastrado.setText("");
            tfObservacoes.setText("");
            tfDataCadastro.setText("");
            tfIdEmpresa.setText("");
        }
        catch(Exception e){

            JOptionPane.showMessageDialog(null, "Erro ao alterar, tente novamente" + e,"ERRO",JOptionPane.INFORMATION_MESSAGE);

        }
        tfIdCliente.requestFocus();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        int opcao = JOptionPane.showConfirmDialog(null, "Confirma exclusão", "Excluindo...", JOptionPane.YES_NO_OPTION);

        String sql;
        String id = null, id_cliente, nome, id_tipo_animal, id_raca, data_nascimento, data_falecimento, sexo, cor, microchip, castrado, observacoes, data_cadastro, id_empresa;

        if (opcao==0){
            try{
                sql="delete from animal where id = " + id;

                Statement stm = con.prepareStatement(sql);
                stm.execute(sql);
            }
            catch(Exception e){

                JOptionPane.showMessageDialog(null, "Erro ao excluir, tente novamente" + e,"ERRO",JOptionPane.INFORMATION_MESSAGE);

            }
        }
        tfid.setText("");
        tfIdCliente.setText("");
        tfNome.setText("");
        tfIdTipoAnimal.setText("");
        tfIdRaca.setText("");
        tfDataNascimento.setText("");
        tfDataFalecimento.setText("");
        tfSexo.setText("");
        tfCor.setText("");
        tfMicrochip.setText("");
        tfCastrado.setText("");
        tfObservacoes.setText("");
        tfDataCadastro.setText("");
        tfIdEmpresa.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        try{
            Conexao.con.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
        Menu menu = new Menu();
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        tfIdCliente.setEnabled(true);
        tfNome.setEnabled(true);
        tfIdTipoAnimal.setEnabled(true);
        tfIdRaca.setEnabled(true);
        tfDataNascimento.setEnabled(true);
        tfDataFalecimento.setEnabled(true);
        tfMicrochip.setEnabled(true);
        tfCor.setEnabled(true);
        tfSexo.setEnabled(true);
        tfCastrado.setEnabled(true);
        tfObservacoes.setEnabled(true);
        tfDataCadastro.setEnabled(true);
        tfid.setText("");
        tfIdCliente.setText("");
        tfNome.setText("");
        tfIdRaca.setText("");
        tfIdTipoAnimal.setText("");
        tfDataNascimento.setText("");
        tfDataFalecimento.setText("");
        tfSexo.setText("");
        tfCor.setText("");
        tfMicrochip.setText("");
        tfCastrado.setText("");
        tfObservacoes.setText("");
        tfDataCadastro.setText("");
        tfIdEmpresa.setText("");
        tfIdCliente.requestFocus();
        model.setRowCount(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tfCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        pnIdCliente.setVisible(true);
        String sql, nome;
        id_cliente.setRowCount(0); 
        try{
            nome = tfNome.getText();
            sql = "select * from cliente where nome like  '%" + nome + "%'";

            Statement stmt = con.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
            
            ResultSet rs = stmt.executeQuery(sql); //
            if(rs.next()){  
                String[] linha= new String[]{rs.getString("nome"),
                    rs.getString("id")}; 

                id_cliente.addRow(linha); 
  
                while(rs.next()){
                    linha= new String[]{rs.getString("nome"),
                        rs.getString("id")};
         
                    id_cliente.addRow(linha); 
                }
            }
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao consultar, tente novamente" + e
                ,"ERRO",JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        pnIdTipoAnimal.setVisible(true);
        String sql, nome;
        id_tipo_animal.setRowCount(0); 
        try{
            sql = "select tipo_animal, id from tipo_animal";

            Statement stmt = con.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
          
                
            ResultSet rs = stmt.executeQuery(sql); //
            if(rs.first()){  
                String[] linha= new String[]{rs.getString("tipo_animal"),
                    rs.getString("id")}; 

                id_tipo_animal.addRow(linha); 
                while(rs.next()){
                    linha= new String[]{rs.getString("tipo_animal"),
                        rs.getString("id")};

                    id_tipo_animal.addRow(linha); 
                }
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao consultar, tente novamente" + e
                ,"ERRO",JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        pnIdRaca.setVisible(true);
        String sql, nome;
        id_raca.setRowCount(0); 
        try{
            sql = "select raca, id from raca";
    
            Statement stmt = con.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
            
            ResultSet rs = stmt.executeQuery(sql); 
            if(rs.first()){ 
                String[] linha= new String[]{rs.getString("raca"),
                    rs.getString("id")}; 

                id_raca.addRow(linha); 
                while(rs.next()){
                    linha= new String[]{rs.getString("raca"),
                        rs.getString("id")};
                    
                    id_raca.addRow(linha); 
                }
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao consultar, tente novamente" + e
                ,"ERRO",JOptionPane.INFORMATION_MESSAGE);
            
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTable2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable2FocusGained
      
    }//GEN-LAST:event_jTable2FocusGained

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int linha;
        String id;
        linha=jTable2.getSelectedRow();
        id = (String) jTable2.getValueAt(linha, 1);
        tfIdCliente.setText(id);
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        pnIdCliente.setVisible(false);
        id_cliente.setRowCount(0);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        pnIdRaca.setVisible(false);
        id_raca.setRowCount(0);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        pnIdTipoAnimal.setVisible(false);
        id_tipo_animal.setRowCount(0);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int l;
        String id_tipo_animal;
        l=jTable3.getSelectedRow();
        id_tipo_animal = (String) jTable3.getValueAt(l, 1);
        tfIdTipoAnimal.setText(id_tipo_animal);
    }//GEN-LAST:event_jTable3MouseClicked

    private void jTable13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable13MouseClicked
        int l;
        String id_raca;
        l=jTable13.getSelectedRow();
        id_raca = (String) jTable13.getValueAt(l, 1);
        tfIdRaca.setText(id_raca);
    }//GEN-LAST:event_jTable13MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Animal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable13;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JPanel pnIdCliente;
    private javax.swing.JPanel pnIdRaca;
    private javax.swing.JPanel pnIdTipoAnimal;
    private javax.swing.JTextField tfCastrado;
    private javax.swing.JTextField tfCor;
    private javax.swing.JTextField tfDataCadastro;
    private javax.swing.JTextField tfDataFalecimento;
    private javax.swing.JTextField tfDataNascimento;
    private javax.swing.JTextField tfIdCliente;
    private javax.swing.JTextField tfIdEmpresa;
    private javax.swing.JTextField tfIdRaca;
    private javax.swing.JTextField tfIdTipoAnimal;
    private javax.swing.JTextField tfMicrochip;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfObservacoes;
    private javax.swing.JTextField tfSexo;
    private javax.swing.JTextField tfid;
    // End of variables declaration//GEN-END:variables
}
