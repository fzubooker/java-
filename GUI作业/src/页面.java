import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Fri Apr 08 11:22:54 CST 2022
 */



/**
 * @author 1
 */
public class 页面 extends JFrame  {
    public 页面() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menu2 = new JMenu();
        panelEast = new JPanel();
        buttonBack = new JButton();
        buttonEquals = new JButton();
        panelCenter = new JPanel();

        class numActionListener implements ActionListener{//数字按键的事件监听类,实现ActionListener接口
            int num;
            public numActionListener(int a) {
                num=a;
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("输出"+num);//后期修改
            }
        }
        num7 = new JButton();
        numActionListener num7actionlisten=new numActionListener(7);
        num7.addActionListener(num7actionlisten);//按键7加入事件监听

        num8 = new JButton();
        numActionListener num8actionlisten=new numActionListener(8);
        num8.addActionListener(num8actionlisten);//按键8加入事件监听

        num9 = new JButton();
        numActionListener num9actionlisten=new numActionListener(9);
        num9.addActionListener(num9actionlisten);//按键9加入事件监听

        num4 = new JButton();
        numActionListener num4actionlisten=new numActionListener(4);
        num4.addActionListener(num4actionlisten);//按键4加入事件监听

        num5 = new JButton();
        numActionListener num5actionlisten=new numActionListener(5);
        num5.addActionListener(num5actionlisten);//按键5加入事件监听

        num6 = new JButton();
        numActionListener num6actionlisten=new numActionListener(6);
        num6.addActionListener(num6actionlisten);//按键6加入事件监听

        num1 = new JButton();
        numActionListener num1actionlisten=new numActionListener(1);
        num1.addActionListener(num1actionlisten);//按键1加入事件监听

        num2 = new JButton();
        numActionListener num2actionlisten=new numActionListener(2);
        num2.addActionListener(num2actionlisten);//按键2加入事件监听

        num3 = new JButton();
        numActionListener num3actionlisten=new numActionListener(3);
        num3.addActionListener(num3actionlisten);//按键3加入事件监听

        num0 = new JButton();
        numActionListener num0actionlisten=new numActionListener(0);
        num0.addActionListener(num0actionlisten);//按键0加入事件监听

        buttonleft = new JButton();
        buttonRight = new JButton();
        panelNorth = new JPanel();
        textField1 = new JTextField();
        panelWest = new JPanel();
        buttonDivision = new JButton();
        buttonMutiplication = new JButton();
        buttonSubtraction = new JButton();
        buttonPlus = new JButton();
        panelSouth = new JPanel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("\u590d\u5236");
            }
            menuBar1.add(menu1);

            //======== menu2 ========
            {
                menu2.setText("\u7c98\u8d34");
            }
            menuBar1.add(menu2);
        }
        setJMenuBar(menuBar1);

        //======== panelEast ========
        {
            panelEast.setLayout(new GridLayout(2, 0));

            //---- buttonBack ----
            buttonBack.setText("backspace");
            panelEast.add(buttonBack);

            //---- buttonEquals ----
            buttonEquals.setText("=");
            panelEast.add(buttonEquals);
        }
        contentPane.add(panelEast, BorderLayout.EAST);

        //======== panelCenter ========
        {
            panelCenter.setForeground(new Color(153, 153, 255));
            panelCenter.setBackground(Color.white);
            panelCenter.setLayout(new GridLayout(4, 3));

            //---- num7 ----
            num7.setText("7");
            panelCenter.add(num7);

            //---- num8 ----
            num8.setText("8");
            panelCenter.add(num8);

            //---- num9 ----
            num9.setText("9");
            panelCenter.add(num9);

            //---- num4 ----
            num4.setText("4");
            panelCenter.add(num4);

            //---- num5 ----
            num5.setText("5");
            panelCenter.add(num5);

            //---- num6 ----
            num6.setText("6");
            panelCenter.add(num6);

            //---- num1 ----
            num1.setText("1");
            panelCenter.add(num1);

            //---- num2 ----
            num2.setText("2");
            panelCenter.add(num2);

            //---- num3 ----
            num3.setText("3");
            panelCenter.add(num3);

            //---- num0 ----
            num0.setText("0");
            panelCenter.add(num0);

            //---- buttonleft ----
            buttonleft.setText("(");
            panelCenter.add(buttonleft);

            //---- buttonRight ----
            buttonRight.setText(")");
            panelCenter.add(buttonRight);
        }
        contentPane.add(panelCenter, BorderLayout.CENTER);

        //======== panelNorth ========
        {
            panelNorth.setLayout(new GridLayout());
            panelNorth.add(textField1);
        }
        contentPane.add(panelNorth, BorderLayout.NORTH);

        //======== panelWest ========
        {
            panelWest.setLayout(new GridLayout(4, 0));

            //---- buttonDivision ----
            buttonDivision.setText("/");
            panelWest.add(buttonDivision);

            //---- buttonMutiplication ----
            buttonMutiplication.setText("*");
            panelWest.add(buttonMutiplication);

            //---- buttonSubtraction ----
            buttonSubtraction.setText("-");
            panelWest.add(buttonSubtraction);

            //---- buttonPlus ----
            buttonPlus.setText("+");
            panelWest.add(buttonPlus);
        }
        contentPane.add(panelWest, BorderLayout.WEST);

        //======== panelSouth ========
        {
            panelSouth.setLayout(new GridLayout());
        }
        contentPane.add(panelSouth, BorderLayout.SOUTH);
        setSize(730, 440);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenu menu2;
    private JPanel panelEast;
    private JButton buttonBack;
    private JButton buttonEquals;
    private JPanel panelCenter;
    private JButton num7;
    private JButton num8;
    private JButton num9;
    private JButton num4;
    private JButton num5;
    private JButton num6;
    private JButton num1;
    private JButton num2;
    private JButton num3;
    private JButton num0;
    private JButton buttonleft;
    private JButton buttonRight;
    private JPanel panelNorth;
    private JTextField textField1;
    private JPanel panelWest;
    private JButton buttonDivision;
    private JButton buttonMutiplication;
    private JButton buttonSubtraction;
    private JButton buttonPlus;
    private JPanel panelSouth;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
