/*
laborator 12 problema 1.1 Tolescu Eduard Ioan
. Implementați o aplicație Java care folosește GridLayout pentru aranjarea în pagină a componentelor unei aplicații de
calcul (TextField pt. intrare/ieșire, butoane pentru numere, operații matematice, ștergerea ecranului, etc.).
 */
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class calculator extends JFrame
{
    public calculator()
    {
        initializare_componente();
    }
    public void initializare_componente() {
        JPanel panelScreen = new JPanel(new GridLayout(0,1));

        JTextArea display = new JTextArea();
        panelScreen.add(display);

        JFrame frame = new JFrame("CALCULATOR");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel buttons = new JPanel(new GridLayout(5,5));

        JButton procentButon = new JButton("%");
        buttons.add(procentButon);

        JButton clearButon = new JButton("CE");
        buttons.add(clearButon);

        JButton cButon = new JButton("C");
        buttons.add(cButon);

        JButton impartireButon = new JButton(":");
        buttons.add(impartireButon);

        JButton sapteButton = new JButton("7");
        buttons.add(sapteButton);
        sapteButton.addActionListener(e -> display.append("7"));

        JButton optButton = new JButton("8");
        buttons.add(optButton);
        optButton.addActionListener(e -> display.append("8"));

        JButton nouaButton = new JButton("9");
        buttons.add(nouaButton);
        nouaButton.addActionListener(e -> display.append("9"));

        JButton inmultireButton = new JButton("x");
        buttons.add(inmultireButton);

        JButton patruButton = new JButton("4");
        buttons.add(patruButton);
        patruButton.addActionListener(e -> display.append("4"));;

        JButton cinciButton = new JButton("5");
        buttons.add(cinciButton);
        cinciButton.addActionListener(e -> display.append("5"));

        JButton saseButton = new JButton("6");
        buttons.add(saseButton);
        saseButton.addActionListener(e -> display.append("6"));

        JButton minusButton = new JButton("-");
        buttons.add(minusButton);

        JButton unuButton = new JButton("1");
        buttons.add(unuButton);
        unuButton.addActionListener(e -> display.append("1"));

        JButton doiButton = new JButton("2");
        buttons.add(doiButton);
        doiButton.addActionListener(e -> display.append("2"));

        JButton treiButton = new JButton("3");
        buttons.add(treiButton);
        treiButton.addActionListener(e -> display.append("3"));

        JButton plusButton = new JButton("+");
        buttons.add(plusButton);

        JButton zeroButton = new JButton("0");
        buttons.add(zeroButton);
        zeroButton.addActionListener(e -> display.append("0"));

        JButton punctButton = new JButton(".");
        buttons.add(punctButton);
        punctButton.addActionListener(e -> display.append("."));

        JButton radicalButton = new JButton("√");
        buttons.add(radicalButton);

        JButton egalButton = new JButton("=");
        buttons.add(egalButton);
        egalButton.addActionListener(e -> display.append("."));

        frame.getContentPane().add(panelScreen, BorderLayout.NORTH);
        frame.getContentPane().add(buttons, BorderLayout.SOUTH);
        frame.setBounds(100, 100, 400, 300);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    public static void main(String... strings)
    {
        new calculator();
    }
}