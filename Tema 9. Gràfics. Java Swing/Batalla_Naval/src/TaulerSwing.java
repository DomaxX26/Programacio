import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javax.swing.border.EmptyBorder;

import javax.swing.border.LineBorder;

public class TaulerSwing extends JFrame implements ActionListener {

    private JButton Botons[][] = new JButton[8][8];
    JButton[] btn_tamany = new JButton[4];
    private JPanel contentPane;
    private JTextField textField;
    private JRadioButton btn_vertical;
    private JRadioButton btn_horizontal;
    private ButtonGroup direccion;
    private JComboBox comboBox;
    private JButton btn_submit;
    private JButton btn_jugar;
    private cVaixell v;
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

    int tamany = v.tamany;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TaulerSwing frame = new TaulerSwing();
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
    public TaulerSwing() {
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
        comboBox.setModel(new DefaultComboBoxModel(new String[]{"Portavions", "Destructor", "Cuirassat", "Fragata", "Submarí", "Buit"}));
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
        getContentPane().add(btn_vertical);
        btn_vertical.addActionListener(this);
        direccion.add(btn_vertical);

        btn_horizontal = new JRadioButton("Horizontal",false);
        btn_horizontal.setBounds(8, 84, 149, 23);
        panel_1.add(btn_horizontal);
        getContentPane().add(btn_horizontal);
        btn_horizontal.addActionListener(this);
        direccion.add(btn_horizontal);

        btn_submit = new JButton("Submit");
        btn_submit.setBounds(609, 341, 85, 25);
        getContentPane().add(btn_submit);
        btn_submit.addActionListener(this);
        panel.add(btn_submit);

        btn_jugar = new JButton("Jugar");
        btn_jugar.setBounds(704, 341, 85, 25);
        getContentPane().add(btn_jugar);
        btn_jugar.addActionListener(this);
        panel.add(btn_jugar);

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
    public void actionPerformed(ActionEvent e) {
        insertarBarco(p, e);
        tamanyVaixells();
        validarPosicio(e);
        posicioVaixells(e);

    }

    public void insertarBarco(cVaixell v,ActionEvent e){

        for (int i = 0; i < Botons.length; i++) {
            for (int j = 0; j < Botons.length; j++) {
                if (e.getSource() == Botons[i][j]) {
                    if (direccio == false) {
                        for (int k = 0; k < v.tamany; k++) {
                            Botons[i + k][j].setBackground(Color.YELLOW);
                        }
                    }
                    else{
                        for (int k = 0; k < v.tamany; k++) {
                            Botons[i][j+4].setBackground(Color.YELLOW);
                        }
                    }
                    coordenadas = Botons[i][j].getActionCommand();
                    textField.setText(coordenadas);
                    //colorcarVaixells();
                }
            }
        }
    }

    /*public void colorcarVaixells(){
        boolean valid = false;
        String [] posicion = coordenadas.split("(?<=.)");
        String iString = posicion[0];
        String jString = posicion[1];
        int i = Integer.parseInt(iString);
        int j = Integer.parseInt(jString);

        if(comboBox.getSelectedItem() == "Portavions"){
            do {
                fila = i;
                columna = j;
                direccio = saberDireccion();
                p.colocar(fila,columna,direccio);
                valid = validarVaixell(p);
            }
            while(valid);
            introduixVaixeill(p);
        }

        if(comboBox.getSelectedItem() == "Destructor"){
            do {
                fila = i;
                columna = j;
                direccio = saberDireccion();
                d.colocar(fila,columna,direccio);
                valid = validarVaixell(d);
            }
            while(valid);
            introduixVaixeill(d);
        }

        if(comboBox.getSelectedItem() == "Cuirassat"){
            do {
                fila = i;
                columna = j;
                direccio = saberDireccion();
                c.colocar(fila,columna,direccio);
                valid = validarVaixell(c);
            }
            while(valid);
            introduixVaixeill(c);
        }

        if(comboBox.getSelectedItem() == "Fragata"){
            do {
                fila = i;
                columna = j;
                direccio = saberDireccion();
                f.colocar(fila,columna,direccio);
                valid = validarVaixell(f);
            }
            while(valid);
            introduixVaixeill(f);
        }

        if(comboBox.getSelectedItem() == "Submarí"){
            do {
                fila = i;
                columna = j;
                direccio = saberDireccion();
                s.colocar(fila,columna,direccio);
                valid = validarVaixell(s);
            }
            while(valid);
            introduixVaixeill(s);
        }
    }*/
    public void submit(ActionEvent w){
        if (w.getSource() == btn_submit && !comboBox.getSelectedItem().equals("Buit")){
            comboBox.removeItem(comboBox.getSelectedItem());
        }
        else if (w.getSource()==btn_submit && comboBox.getSelectedItem().equals("Buit")){
            textField.setText("No queden barcos per col·locar");
        }
        else if(w.getSource() == btn_submit && !textField.getText().equals("Posició correcta")){
            textField.setText("No s'ha pogut col·locar el vaixell");
        }
    }

    private void validarPosicio(ActionEvent w){
        for (int f = 0; f < Botons.length; f++) {
            for (int c = 0; c < Botons.length; c++) {
                if (w.getSource() == Botons[f][c]) {
                    String[] p = w.getActionCommand().split("(?<=.)"); //
                    int i = Integer.parseInt(p[0]); // Uso un split para separar los numeros de los botones para
                    // detectar la posicion de estos
                    int j = Integer.parseInt(p[1]); //

                    omplirAigua();

                    // Comprobar posicion
                    if (btn_horizontal.isSelected() && j + tamany < 9) {
                        for (int y = j; y < j + tamany; y++) {
                            if (Botons[i][y].getBackground() != Color.blue) {
                                textField.setText("Posicion ocupada");
                                omplirAigua();
                                break;
                            } else {
                                Botons[i][y].setBackground(Color.cyan);
                                textField.setText("Posicion valida");
                            }
                        }

                    } else if (btn_vertical.isSelected() && i + tamany < 9) {
                        for (int y = i; y < i + tamany; y++) {
                            if (Botons[y][j].getBackground() != Color.blue) {
                                textField.setText("Posicion ocupada");
                                omplirAigua();
                                break;
                            } else {
                                Botons[y][j].setBackground(Color.cyan);
                                textField.setText("Posicion valida");
                            }
                        }
                    } else {
                        textField.setText("Posicion invalida");
                    }
                } else if (w.getSource() == btn_submit) { // Colocar en la posicion confirmada
                    for (int a = 0; a < Botons.length; a++) {
                        for (int b = 0; b < Botons.length; b++) {
                            if (Botons[a][b].getBackground() == Color.cyan) {
                                Botons[a][b].setBackground(btn_tamany[0].getBackground());
                            }
                        }
                    }
                }
            }
        }
    }
    private void introduixVaixeill(cVaixell v){
        if(v.direccio == false){
            for (int i = 0; i < v.tamany; i++) {
                Botons[v.fila+i][v.columna] = v.ID;
            }
        }else{
            for (int i = 0; i < v.tamany; i++) {
                Botons[v.fila][v.columna+i] = v.ID;
            }
        }

    }

    /*public boolean saberDireccion(){
        if (btn_vertical.isSelected()){
            return false;
        }
        else {
            return true;
        }
    }*/

    private boolean validarVaixell(cVaixell v) {
        boolean posValida = false;
        if (v.direccio == false) {
            if ((v.tamany + v.fila) > 8) {
                System.out.println("El vaixell s'en ix de la fila");
                return posValida = false;
            } else {
                for (int i = 0; i < v.tamany; i++) {
                    if (Botons[v.fila+i][v.columna] != null) {
                        System.out.println("Ja hi ha un vaixell en aquesta posició");
                        return posValida = false;
                    }
                }
                return posValida = true;
            }
        }else{
            if ((v.tamany + v.columna) > 8) {
                System.out.println("Se sale por abajo");
                return posValida = false;
            } else {
                for (int i = 0; i < v.tamany; i++) {
                    if (Botons[v.fila][v.columna+i] != null) {
                        System.out.println("Ja hi ha un vaixell en aquesta posició");
                        return posValida = false;
                    }
                }
                return posValida = true;
            }
        }
    }

    public void tamanyVaixells(){
        for (int j = 0; j < 4; j++) {
            btn_tamany[j].setBackground(Color.blue);
        }
        if (comboBox.getSelectedItem().equals("Cuirassat")) {

            for (int i = 0; i < c.tamany; i++) {
                btn_tamany[i].setBackground(Color.white);
            }
        } else if (comboBox.getSelectedItem().equals("Destructor")) {

            for (int i = 0; i < d.tamany; i++) {
                btn_tamany[i].setBackground(Color.green);
            }
        } else if (comboBox.getSelectedItem().equals("Fragata")) {

            for (int i = 0; i < f.tamany; i++) {
                btn_tamany[i].setBackground(Color.yellow);
            }
        } else if (comboBox.getSelectedItem().equals("Portavions")) {

            for (int i = 0; i < p.tamany; i++) {
                btn_tamany[i].setBackground(Color.red);
            }
        } else if (comboBox.getSelectedItem().equals("Submarí")) {

            for (int i = 0; i < s.tamany; i++) {
                btn_tamany[i].setBackground(Color.magenta);
            }
        }
    }

    public void omplirAigua() {
        if (!comboBox.getSelectedItem().equals("Vacio")) {
            for (int a = 0; a < Botons.length; a++) {
                for (int b = 0; b < Botons.length; b++) {
                    if (Botons[a][b].getBackground() == Color.cyan) {
                        Botons[a][b].setBackground(Color.blue);
                    }
                }
            }
        }
    }
}
