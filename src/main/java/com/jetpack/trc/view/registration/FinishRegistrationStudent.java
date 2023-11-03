//package view.registration;
//
//import com.jetpack.trc.Main;
//import model.User;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;
//
//public class FinishRegistrationStudent extends JFrame implements ActionListener, WindowListener {
//    private JLabel info;
//    private JLabel info1;
//    private JLabel test;
//    private Button no;
//    private Button yes;
//
//
//    public FinishRegistrationStudent(Window a) {
//        setSize(a.getSize());
//        setLocation(a.getLocation());
//        setLayout(null);
//        setVisible(true);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        info = new JLabel("Регистрация прошла успешно!");
//        info.setSize(135, 25);
//        info.setLocation(70, 105);
//        info.setVisible(true);
//
//        info1 = new JLabel("Ваш ID: " + Main.students.size());
//        info1.setSize(135, 25);
//        info1.setLocation(70, 130);
//        info1.setVisible(true);
//
////        test = new JLabel("Желаете пройти/пересдать тест?");
//        test = new JLabel("Желаете пройти тест?");
//        test.setSize(135, 25);
//        test.setLocation(70, 155);
//        test.setVisible(true);
//
//        yes = new Button("да");
//        yes.setSize(135, 25);
//        yes.setLocation(70, 180);
//        yes.setVisible(true);
//
//        no = new Button("нет");
//        no.setSize(135, 25);
//        no.setLocation(70, 210);
//        no.setVisible(true);
//
//        add(info);
//        add(info1);
//        add(test);
//        add(no);
//        add(yes);
//    }
//
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
