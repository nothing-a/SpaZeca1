package paineis;

import javax.swing.*;

public class PainelCadastro extends JPanel {

    private JLabel jlImagem;
    private ImageIcon imagem;
    private JTextField jtnome,jtcpf,jttelefone,jtservico,jtsexo;

    public PainelCadastro() {
        setLayout(null);

        iniciarComponentes();
        criarEventos();
    }

    private void iniciarComponentes() {
        //JTextField
        jtnome = new JTextField();
        add(jtnome);
        jtnome.setBounds(316,160,180,30);
        jtcpf = new JTextField();
        add(jtcpf);
        jtcpf.setBounds(316,240,180,30);
        jttelefone = new JTextField();
        add(jttelefone);
        jttelefone.setBounds(316,320,180,30);
        jtservico = new JTextField(); //ACHO QUE SERIA MELHOR COLOCAR UMA COMBOBOX, PQ SAO MUITOS SERVIÇOS
        add(jtservico);

        jtsexo = new JTextField(); //ACHO QUE SERIA MELHOR COLOCAR UMA COMBOBOX, PQ FICA MAIS BONITO SLA
        add(jtsexo);


        //Imagem
        imagem = new ImageIcon(getClass().getResource("/img/cadastro.png"));
        jlImagem = new JLabel(imagem);
        jlImagem.setBounds(0,0,1200,700);

        add(jlImagem);
    }

    private void criarEventos() {
    }
}
