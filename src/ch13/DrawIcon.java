package ch13;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class DrawIcon implements Icon {               //实现Icon接口
    private int width;                                //声明图标的宽
    private int height;                               //声明图标的长
    public int getIconHeight(){                       //实现getIconHeight()方法
        return this.height;
    }
    public int getIconWidth(){
        return this.width;
    }
    public DrawIcon(int width,int height){            //定义构造方法
        this.width = width;
        this.height = height;
    }

    //实现paintIcon()方法
    public void paintIcon(Component arg0,Graphics arg1,int x,int y){
        arg1.fillOval(x,y,width,height);                //绘制一个圆形
    }

    public static void main(String[] args) {
        DrawIcon icon = new DrawIcon(15,15);
        //创建一个标签，并设置标签上的文字在标签正中间
        JLabel j = new JLabel("测试",icon,SwingConstants.CENTER);
        JFrame jf = new JFrame();                       //创建一个JFrame窗口
        jf.setVisible(true);
        //使窗体居中
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        jf.setBounds(width/2 - 200,height/2 - 150,400,300);
        Container c = jf.getContentPane();
        c.add(j);
        //省略部分代码
    }
}
