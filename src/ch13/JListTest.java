package ch13;

import javax.swing.*;
import java.awt.*;

public class JListTest extends JFrame {
    public JListTest(){
        Container c = getContentPane();
        c.setLayout(null);
        JList<String> jl = new JList<>(new MyListModel());
        JScrollPane js = new JScrollPane(jl);
        js.setBounds(20,20,100,100);
        c.add(js);
        setBounds(200,200,300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JListTest();
    }
    class MyListModel extends AbstractListModel<String>{           //继承抽象类AbstractListModel
        //设置列表框内容
        private String[] contents = {"列表1","列表2","列表3","列表4","列表5","列表6"};
            public String getElementAt(int x){              //重写getElementAt()方法
                if(x<contents.length){
                    return contents[x++];
                }else {
                    return null;
                }

            }
        public int getSize(){               //重写getSize()方法
            return contents.length;
        }
    }
}
