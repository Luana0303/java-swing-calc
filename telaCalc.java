import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaCalc extends JFrame{
    private JPanel pnlTelaCalc;
    private JButton btn01;
    private JButton bnt02;
    private JButton btn03;
    private JButton btn04;
    private JButton btn05;
    private JButton btn06;
    private JButton btnsubtrair;
    private JButton btnporcentagem;
    private JButton btn07;
    private JButton btn08;
    private JButton btn09;
    private JButton btnresultado;
    private JButton btn0;
    private JButton btnvirgula;
    private JButton btnlimpar;
    private JButton btnmultiplicar;
    private JButton btndividir;
    private JButton btnsoma;
    private JButton btnraizquadrada;
    private JTextField txtSaida;

    double valor1;
    double valor2;
    String operador;

public telaCalc() {
    iniciarComponentes();
    addListeners();
}


private void iniciarComponentes(){

    JPanel telaCalc = new JPanel();
    setSize(500, 350);
    setContentPane(pnlTelaCalc);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Calculadora");
    setVisible(true);
}
private void addListeners() {
    btn01.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtSaida.setText(txtSaida.getText()+"1");
        }
    });
    bnt02.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtSaida.setText(txtSaida.getText()+"2");
        }
    });
    btn03.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtSaida.setText(txtSaida.getText()+"3");
        }
    });
    btn04.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtSaida.setText(txtSaida.getText()+"4");
        }
    });
    btn05.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtSaida.setText(txtSaida.getText()+"5");
        }
    });
    btn06.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtSaida.setText(txtSaida.getText()+"6");
        }
    });
    btn07.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtSaida.setText(txtSaida.getText()+"7");
        }
    });
    btn08.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtSaida.setText(txtSaida.getText()+"8");
        }
    });
    btn09.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtSaida.setText(txtSaida.getText()+"9");
        }
    });
    btn0.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtSaida.setText(txtSaida.getText()+"0");
        }
    });
    btnvirgula.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtSaida.setText(txtSaida.getText()+"1");
        }
    });
    btnsoma.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            valor1 = Double.parseDouble(txtSaida.getText());
            txtSaida.setText("");
            operador = "+";
        }
    });
    btnsubtrair.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            valor1 = Double.parseDouble(txtSaida.getText());
            txtSaida.setText("");
            operador = "-";
        }
    });
    btnmultiplicar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            valor1 = Double.parseDouble(txtSaida.getText());
            txtSaida.setText("");
            operador = "*";
        }
    });
    btndividir.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            valor1 = Double.parseDouble(txtSaida.getText());
            txtSaida.setText("");
            operador = "/";
        }
    });
    btnporcentagem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            valor1 = Double.parseDouble(txtSaida.getText());
            txtSaida.setText("");
            operador = "%";
        }});
    btnraizquadrada.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            valor1 = Double.parseDouble(txtSaida.getText());
            txtSaida.setText("");
            operador = "sqrt";
            double sqrt = Math.sqrt(valor1);
            txtSaida.setText(String.valueOf(sqrt));



        }
    });
    btnlimpar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtSaida.setText("");
            operador = "";
        }
    });

    btnresultado.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            valor2 = Double.parseDouble(txtSaida.getText());
            txtSaida.setText("");

            switch (operador) {
                case "+":
                    txtSaida.setText(String.valueOf(valor1 + valor2));
                    break;

                case "-":
                    txtSaida.setText(String.valueOf(valor1 - valor2));
                    break;

                case "*":
                    txtSaida.setText(String.valueOf(valor1 * valor2));
                    break;

                case "/":
                    txtSaida.setText(String.valueOf(valor1 / valor2));
                    break;
                case "%":
                    txtSaida.setText(String.valueOf(valor1 *(valor2/100)));
                    break;
                default:
                    break;
            }


        }   });


}
    public static void main(String[] args){
    telaCalc calculadora = new telaCalc();
    }
}



