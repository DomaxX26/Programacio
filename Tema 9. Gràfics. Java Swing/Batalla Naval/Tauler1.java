import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javax.swing.border.EmptyBorder;

import javax.swing.border.LineBorder;

public class Tauler1 extends JFrame implements ActionListener {

    private JButton Botons[][] = new JButton[8][8];
    JButton[] tamany = new JButton[4];
    private JPanel contentPane;
    private JTextField textField;
    private JRadioButton btn_vertical;
    private ButtonGroup direccion;
    private JComboBox comboBox;
    private cPortavions p;
    private cDestructor d;
    private cCuirassat c;
    private cFragata f;
    private cSubmari s;
    private String coordenadas;
    private String is;
    private String js;
    public int fila;
    public int columna;
    public boolean direccio;
    //public int tamany;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Tauler1 frame = new Tauler1();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Tauler1() {
        p = new cPortavions();
        d = new cDestructor();
        f = new cFragata();
        c = new cCuirassat();
        s = new cSubmari();

        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 832, 589);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 813, 555);
        contentPane.add(panel);
        panel.setLayout(null);

        JButton btn_1 = new JButton("1");
        btn_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btn_1.setBounds(12, 72, 50, 50);
        panel.add(btn_1);

        JButton btn_2 = new JButton("2");
        btn_2.setBounds(12, 133, 50, 50);
        panel.add(btn_2);

        JButton btn_3 = new JButton("3");
        btn_3.setBounds(12, 194, 50, 50);
        panel.add(btn_3);

        JButton btn_4 = new JButton("4");
        btn_4.setBounds(12, 255, 50, 50);
        panel.add(btn_4);

        JButton btn_5 = new JButton("5");
        btn_5.setBounds(12, 316, 50, 50);
        panel.add(btn_5);

        JButton btn_6 = new JButton("6");
        btn_6.setBounds(12, 377, 50, 50);
        panel.add(btn_6);

        JButton btn_7 = new JButton("7");
        btn_7.setBounds(12, 438, 50, 50);
        panel.add(btn_7);

        JButton btn_8 = new JButton("8");
        btn_8.setBounds(12, 499, 50, 50);
        panel.add(btn_8);

        JButton btn_A = new JButton("A");
        btn_A.setBounds(72, 11, 50, 50);
        panel.add(btn_A);

        JButton btn_B = new JButton("B");
        btn_B.setBounds(132, 11, 50, 50);
        panel.add(btn_B);

        JButton btn_C = new JButton("C");
        btn_C.setBounds(192, 11, 50, 50);
        panel.add(btn_C);

        JButton btn_D = new JButton("D");
        btn_D.setBounds(252, 11, 50, 50);
        panel.add(btn_D);

        JButton btn_E = new JButton("E");
        btn_E.setBounds(312, 11, 50, 50);
        panel.add(btn_E);

        JButton btn_F = new JButton("F");
        btn_F.setBounds(372, 11, 50, 50);
        panel.add(btn_F);

        JButton btn_G = new JButton("G");
        btn_G.setBounds(432, 11, 50, 50);
        panel.add(btn_G);

        JButton btn_H = new JButton("H");
        btn_H.setBounds(492, 11, 50, 50);
        panel.add(btn_H);

        JPanel PanelBotones = new JPanel();
        PanelBotones.setBounds(74, 72, 468, 477);
        panel.add(PanelBotones);
        PanelBotones.setLayout(new GridLayout(8, 8, 10, 10));

        comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[]{"Portavions", "Destructor", "Cuirassat", "Fragata", "Submarí"}));
        comboBox.setBounds(609, 118, 180, 24);
        panel.add(comboBox);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(609, 179, 180, 150);
        panel.add(panel_1);
        panel_1.setLayout(null);

        direccion = new ButtonGroup();
        btn_vertical = new JRadioButton("Vertical",true);
        btn_vertical.setBounds(8, 38, 149, 23);
        panel_1.add(btn_vertical);
        
        btn_vertical.addActionListener(this);
        direccion.add(btn_vertical);

        JRadioButton btn_horizontal = new JRadioButton("Horizontal",false);
        btn_horizontal.setBounds(8, 84, 149, 23);
        panel_1.add(btn_horizontal);
        
        btn_horizontal.addActionListener(this);
        direccion.add(btn_horizontal);

        JButton btnNewButton = new JButton("Submit");
        btnNewButton.setBounds(609, 341, 85, 25);
        getContentPane().add(btnNewButton);
        btnNewButton.addActionListener(this);
        panel.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Jugar");
        btnNewButton_1.setBounds(704, 341, 85, 25);
        getContentPane().add(btnNewButton_1);
        btnNewButton_1.addActionListener(this);
        panel.add(btnNewButton_1);

        JPanel panel_2 = new JPanel();
        panel_2.setBounds(609, 32, 180, 74);
        panel.add(panel_2);
        panel_2.setLayout(null);

        textField = new JTextField();
        textField.setFont(new Font("Dialog", Font.BOLD, 18));
        textField.setEnabled(false);
        textField.setBounds(0, 0, 180, 74);
        panel_2.add(textField);
        textField.setColumns(10);

        for (int i = 0; i < Botons.length; i++) {
            for (int j = 0; j < Botons.length; j++) {
                is = Integer.toString(i);
                js = Integer.toString(j);
                Botons[i][j] = new JButton();
                PanelBotones.add(Botons[i][j]);
                Botons[i][j].setBackground(Color.white);
                Botons[i][j].setBorder(new LineBorder(Color.black));
                Botons[i][j].setActionCommand(is+js);
                Botons[i][j].addActionListener(this);
            }
        }

    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
    }
