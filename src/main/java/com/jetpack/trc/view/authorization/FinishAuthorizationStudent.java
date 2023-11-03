//package view.authorization;
//
//import controller.ControllerAdministrator;
//import controller.ControllerStudent;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;
//
//public class FinishAuthorizationStudent extends JFrame implements ActionListener, WindowListener {
//    private JLabel info;
//    private ControllerStudent controllerStudent = new ControllerStudent();
//    private TextField textField;
//
//    public FinishAuthorizationStudent(Window a, int t) {
//        setSize(1000, 1000);
//        setLocation(a.getLocation());
//        setLayout(null);
//        setVisible(true);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        info = new JLabel(controllerStudent.printResult(t));
//        info.setSize(5000, 25);
//        info.setLocation(70, 75);
//        info.setVisible(true);
//
//        addWindowListener(this);
//        add(info);
//    }
//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//    }
//
//    @Override
//    public void windowOpened(WindowEvent e) {
//
//    }
//
//    @Override
//    public void windowClosing(WindowEvent e) {
//
//    }
//
//    @Override
//    public void windowClosed(WindowEvent e) {
//
//    }
//
//    @Override
//    public void windowIconified(WindowEvent e) {
//
//    }
//
//    @Override
//    public void windowDeiconified(WindowEvent e) {
//
//    }
//
//    @Override
//    public void windowActivated(WindowEvent e) {
//
//    }
//
//    @Override
//    public void windowDeactivated(WindowEvent e) {
//
//    }
//}
