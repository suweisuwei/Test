package ch15;

import java.io.File;

public class FileTest1 {
    public static void main(String[] args) {
        File file = new File("star.txt");
        if (file.exists()){
            String name = file.getName();
            long length = file.length();
            boolean hidden = file.isHidden();
            System.out.println("文件名称是："+name);
            System.out.println("文件长度是："+length);
            System.out.println("该文件是隐藏文件吗？"+hidden);
        }else {
            try {
                file.createNewFile();
                System.out.println("文件已创建");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
