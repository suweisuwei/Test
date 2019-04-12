package ch13;

import javax.swing.*;
import java.awt.*;

public class JComboBoxModelTest extends JFrame {
    JComboBox<String> jc = new JComboBox<>(new MyComboBox());
    JLabel jl = new JLabel("请选择证件");

    public JComboBoxModelTest() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(jc);
        c.add(jl);
        setBounds(200,200,300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JComboBoxModelTest();
    }

    class MyComboBox extends AbstractListModel<String> implements ComboBoxModel<String> {

        String selecteditem = null;
        String[] test = {"身份证", "军人证", "学生证", "工作证"};


        public String getElementAt(int index) {
            return test[index];
        }

        public int getSize() {
            return test.length;
        }

        public void setSelectedItem(Object item) {
            selecteditem = (String) item;
        }

        public Object getSelectedItem() {
            return selecteditem;
        }
    }
}
