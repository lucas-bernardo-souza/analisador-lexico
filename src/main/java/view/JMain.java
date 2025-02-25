/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author lucas-bernardo
 */
public class JMain extends javax.swing.JFrame {
    private javax.swing.JTabbedPane tabbedPane;
    private int contadorArquivos = 1;

    /**
     * Creates new form JMain
     */
    public JMain() {
        initComponents();
        initComponentsTwo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPainelDeSaida = new javax.swing.JTabbedPane();
        jPanelLogsCompilacao = new javax.swing.JPanel();
        jPanelTabelaLexemas = new javax.swing.JPanel();
        jPanelPrincipal = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuItemNovoArquivo = new javax.swing.JMenuItem();
        jMenuItemAbrirArquivo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSalvarArquivo = new javax.swing.JMenuItem();
        jMenuItemSalvarArquivoComo = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuEditar = new javax.swing.JMenu();
        jMenuCompilar = new javax.swing.JMenu();
        jMenuItemAnaliseLexica = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanelLogsCompilacaoLayout = new javax.swing.GroupLayout(jPanelLogsCompilacao);
        jPanelLogsCompilacao.setLayout(jPanelLogsCompilacaoLayout);
        jPanelLogsCompilacaoLayout.setHorizontalGroup(
            jPanelLogsCompilacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 847, Short.MAX_VALUE)
        );
        jPanelLogsCompilacaoLayout.setVerticalGroup(
            jPanelLogsCompilacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 87, Short.MAX_VALUE)
        );

        jTabbedPainelDeSaida.addTab("Logs de compilação", jPanelLogsCompilacao);

        javax.swing.GroupLayout jPanelTabelaLexemasLayout = new javax.swing.GroupLayout(jPanelTabelaLexemas);
        jPanelTabelaLexemas.setLayout(jPanelTabelaLexemasLayout);
        jPanelTabelaLexemasLayout.setHorizontalGroup(
            jPanelTabelaLexemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 847, Short.MAX_VALUE)
        );
        jPanelTabelaLexemasLayout.setVerticalGroup(
            jPanelTabelaLexemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 87, Short.MAX_VALUE)
        );

        jTabbedPainelDeSaida.addTab("Tabela de lexemas", jPanelTabelaLexemas);

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );

        jMenuArquivo.setText("Arquivo");

        jMenuItemNovoArquivo.setText("Novo arquivo");
        jMenuItemNovoArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNovoArquivoActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemNovoArquivo);

        jMenuItemAbrirArquivo.setText("Abrir arquivo");
        jMenuArquivo.add(jMenuItemAbrirArquivo);
        jMenuArquivo.add(jSeparator1);

        jMenuItemSalvarArquivo.setText("Salvar arquivo");
        jMenuArquivo.add(jMenuItemSalvarArquivo);

        jMenuItemSalvarArquivoComo.setText("Salvar arquivo como");
        jMenuArquivo.add(jMenuItemSalvarArquivoComo);
        jMenuArquivo.add(jSeparator2);

        jMenuItemSair.setText("Sair");
        jMenuArquivo.add(jMenuItemSair);

        jMenuBar1.add(jMenuArquivo);

        jMenuEditar.setText("Editar");
        jMenuBar1.add(jMenuEditar);

        jMenuCompilar.setText("Compilar");

        jMenuItemAnaliseLexica.setText("Análise léxica");
        jMenuCompilar.add(jMenuItemAnaliseLexica);

        jMenuBar1.add(jMenuCompilar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPainelDeSaida)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPainelDeSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void initComponentsTwo(){
        // Abas para multiplos arquivos
        tabbedPane = new javax.swing.JTabbedPane();
    }
    
    private void jMenuItemNovoArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovoArquivoActionPerformed
        // TODO add your handling code here:
        criarNovoArquivo();
    }//GEN-LAST:event_jMenuItemNovoArquivoActionPerformed

    private void criarNovoArquivo(){
        jPanelPrincipal.setLayout(new BorderLayout());
        jPanelPrincipal.add(tabbedPane, BorderLayout.CENTER);
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        String nomeAba = "Arquivo " + contadorArquivos++;
        tabbedPane.addTab(nomeAba, scrollPane);
    }
    
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
            java.util.logging.Logger.getLogger(JMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JMain().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCompilar;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenuItem jMenuItemAbrirArquivo;
    private javax.swing.JMenuItem jMenuItemAnaliseLexica;
    private javax.swing.JMenuItem jMenuItemNovoArquivo;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSalvarArquivo;
    private javax.swing.JMenuItem jMenuItemSalvarArquivoComo;
    private javax.swing.JPanel jPanelLogsCompilacao;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelTabelaLexemas;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPainelDeSaida;
    // End of variables declaration//GEN-END:variables
}
