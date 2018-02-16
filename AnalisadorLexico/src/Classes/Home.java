/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author mdeme
 */
public final class Home extends javax.swing.JFrame {
    static ArrayList<PalavraReservada> palavraR;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        palavraR = new ArrayList<>();
        diretoNoCodigo();
        System.out.println("começou");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAnalisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAnalise = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        taCodigo = new javax.swing.JTextArea();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Código: ");

        btnAnalisar.setText("Analisar");
        btnAnalisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalisarActionPerformed(evt);
            }
        });

        tbAnalise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Token", "Identificação", "Posição"
            }
        ));
        jScrollPane1.setViewportView(tbAnalise);

        taCodigo.setColumns(20);
        taCodigo.setRows(5);
        jScrollPane2.setViewportView(taCodigo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(btnAnalisar))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 5, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAnalisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnalisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalisarActionPerformed
        analiseLexica();
        
    }//GEN-LAST:event_btnAnalisarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void diretoNoCodigo()
    {
        palavraR.add(new PalavraReservada("package", "Pacote"));
        palavraR.add(new PalavraReservada("new", "Novo"));
        palavraR.add(new PalavraReservada("class", "Classe"));
        palavraR.add(new PalavraReservada("extends", "Herança"));
        palavraR.add(new PalavraReservada("public", "Publico"));
        palavraR.add(new PalavraReservada("protected", "Protegido"));
        palavraR.add(new PalavraReservada("this", "Este"));
        palavraR.add(new PalavraReservada("do", "Fazer"));
        palavraR.add(new PalavraReservada("while", "Laço de Repetição"));
        palavraR.add(new PalavraReservada("switch", "Mudança"));
        palavraR.add(new PalavraReservada("case", "Caso"));
        palavraR.add(new PalavraReservada("return", "Retorno"));
        palavraR.add(new PalavraReservada("void", "Vazio"));
        palavraR.add(new PalavraReservada("int", "Tipo de Dado"));
        palavraR.add(new PalavraReservada("long", "Tipo de Dado"));
        palavraR.add(new PalavraReservada("double", "Tipo de Dado"));
        palavraR.add(new PalavraReservada("float", "Tipo de Dado"));
        palavraR.add(new PalavraReservada("String", "Tipo de Dado"));
        palavraR.add(new PalavraReservada("true", "Verdadeiro"));
        palavraR.add(new PalavraReservada("false", "Falso"));
        palavraR.add(new PalavraReservada("if", "Condicional"));
        palavraR.add(new PalavraReservada("else", "Condicional"));
        palavraR.add(new PalavraReservada("for", "Laço de Repetição"));
        palavraR.add(new PalavraReservada("break", "Qubra"));
        palavraR.add(new PalavraReservada("default", "Padrão"));
        palavraR.add(new PalavraReservada("boolean", "Tipo de Dado"));
        palavraR.add(new PalavraReservada("(", "Limitador"));
        palavraR.add(new PalavraReservada(")", "Limitador"));
        palavraR.add(new PalavraReservada("{", "Limitador"));
        palavraR.add(new PalavraReservada("}", "Limitador"));
        palavraR.add(new PalavraReservada(">", "Maior Que"));
        palavraR.add(new PalavraReservada("<", "Menor Que"));
        palavraR.add(new PalavraReservada(";", "Finalizador"));
        palavraR.add(new PalavraReservada(".", "Limitador"));
        palavraR.add(new PalavraReservada("=", "Atribuidor"));
        palavraR.add(new PalavraReservada("‘", "Limitador"));
        palavraR.add(new PalavraReservada("’", "Limitador"));
        palavraR.add(new PalavraReservada("\"", "Limitador"));
        
        //palavraR.add(new AlbumArtista(listaAlbuns.get(0), listaArtistas.get(0)));
    }
    
    private void preencheTabela(ArrayList<PalavraReservada_Posicao> listaPalavrasQueVaoPraTabela) {
        DefaultTableModel modelo = (DefaultTableModel) tbAnalise.getModel();
        
        for(PalavraReservada_Posicao palavra: listaPalavrasQueVaoPraTabela){
            String[] linha = {palavra.getPalavraReservada().getToken(), palavra.getPalavraReservada().getIdentificacao(), "(" + palavra.getColuna()+","+palavra.getLinha()+")"};
            System.out.print("Linha: " + linha);
            modelo.addRow(linha); 
        }
    }
    
    public PalavraReservada ehReservada(String palavraCache){
        PalavraReservada pReservada = new PalavraReservada();
       
        
        for(PalavraReservada palavra: palavraR){
//            System.out.println("cforache: " + palavraCache);
//            System.out.println("palavra: " + palavra.getToken());
//            System.out.println("iguais: " + palavraCache.equalsIgnoreCase(palavra.getToken()));            
            if (palavraCache.equals(palavra.getToken())){ 
                System.out.println("São iguais");
                return palavra;
            }
        }   
        return pReservada;
    }
    
    public void analiseLexica()
    {
        ArrayList<PalavraReservada_Posicao> listaPalavrasQueVaoPraTabela= new ArrayList<PalavraReservada_Posicao>();
        if (taCodigo.getText().equals(""))
            JOptionPane.showMessageDialog(null, "O campo código deve estar preenchido!");
        else
        {
            String linhas = taCodigo.getText();
            String[] linhasSplit = linhas.split("\n");
            
            for(int i=0; i<linhasSplit.length; i++){
                String palavraCache = "";
                
                for(int j = 0; j<linhasSplit[i].length(); j++){
                    PalavraReservada nova = new PalavraReservada();
                    try{
                        nova = ehReservada(palavraCache);
                    }
                    catch(Exception ex){
                       nova = new PalavraReservada();
                    }
                    try{
                        try{
                            if(!nova.toString().equalsIgnoreCase("PalavraReservada{token=null, identificacao=null}")){
                                System.out.println("Vai adicionar: " + nova.getToken());
                                listaPalavrasQueVaoPraTabela.add(new PalavraReservada_Posicao(nova, i, j));
                                palavraCache = "";
                            }
                            else{
                                if(linhasSplit[i].charAt(j) == ' '){
                                    PalavraReservada identificador = new PalavraReservada(palavraCache, "Token Identificador");
                                    listaPalavrasQueVaoPraTabela.add(new PalavraReservada_Posicao(identificador, i, j));
                                    palavraCache = "";
                                }
                                else if(j == linhasSplit[i].length()-1){
                                    PalavraReservada identificador = new PalavraReservada(palavraCache, "Token Identificador");
                                    listaPalavrasQueVaoPraTabela.add(new PalavraReservada_Posicao(identificador, i, j));
                                    palavraCache = "";
                                }
                                else{
                                    palavraCache = palavraCache + linhasSplit[i].charAt(j);
                                }
                            }
                        }
                        catch(Exception err){
                            if(linhasSplit[i].charAt(j) == ' '){
                                palavraCache = "";
                            }
                            else if(j == linhasSplit[i].length()-1){
                                PalavraReservada identificador = new PalavraReservada(palavraCache, "Token Identificador");
                                listaPalavrasQueVaoPraTabela.add(new PalavraReservada_Posicao(identificador, i, j));
                                palavraCache = "";
                            }
                            else{
                                palavraCache = palavraCache + linhasSplit[i].charAt(j);
                                System.out.println("foi pro else, palavra atual: " + palavraCache);
                            }
                        }
                    }
                    catch(Exception ex){
                        System.out.println("Erro: " + ex);
                    }
                    
                }
            }
            preencheTabela(listaPalavrasQueVaoPraTabela);
        }
    }
 
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
        
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea taCodigo;
    private javax.swing.JTable tbAnalise;
    // End of variables declaration//GEN-END:variables
}

