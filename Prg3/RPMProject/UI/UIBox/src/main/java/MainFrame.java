import javax.swing.*;

public class MainFrame extends JFrame{
    private JTextField tfName;
    private JTextField tfAge;
    private JTextField tfHeight;
    private JTextField tfWeight;
    private JTextField tfBloodType;
    private JTextField tfEmergency;
    private JTextField tfInterval;
    private JComboBox comboBox1;
    private JButton CloseWindow;
    private JTextField tfHospitalized;
    private JPanel patientProfilePanel;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public MainFrame() {
        setContentPane(patientProfilePanel);
        setTitle("Patient's data");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    //Creating the main method
    public static void main(String[] args) {
        MainFrame patientProfileFrame = new MainFrame();
    }
}
