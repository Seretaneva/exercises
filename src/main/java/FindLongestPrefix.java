import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FindLongestPrefix {
    private static JTextArea textArea;
    private static JButton choice1;
    private static JButton choice2;

    public static void main(String[] args) {
        // Configurarea ferestrei principale
        JFrame frame = new JFrame("Visual Novel");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Afișarea textului
        textArea = new JTextArea();
        textArea.setBounds(50, 50, 300, 100);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        frame.add(textArea);

        // Buton pentru prima alegere
        choice1 = new JButton("Choice 1");
        choice1.setBounds(50, 200, 120, 30);
        frame.add(choice1);

        // Buton pentru a doua alegere
        choice2 = new JButton("Choice 2");
        choice2.setBounds(200, 200, 120, 30);
        frame.add(choice2);

        // Acțiuni pentru butoane
        choice1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scene2();
            }
        });

        choice2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scene3();
            }
        });

        // Afișarea ferestrei
        frame.setVisible(true);

        // Începem cu scena inițială
        scene1();
    }

    // Scena 1
    public static void scene1() {
        textArea.setText("E o zi frumoasă și soarele strălucește. Ce vrei să faci?");
        choice1.setText("Mergi în parc");
        choice2.setText("Stai acasă");
    }

    // Scena 2
    public static void scene2() {
        textArea.setText("Ajungi în parc și vezi o floare frumoasă.");
        choice1.setText("Culege floarea");
        choice2.setText("Pleacă");
    }

    // Scena 3
    public static void scene3() {
        textArea.setText("Decizi să rămâi acasă și să citești o carte.");
        choice1.setText("Continuă");
        choice2.setText("Ieși afară");
    }
}
