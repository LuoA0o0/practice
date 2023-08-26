package com.ly;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Practice1 {
    public static void main(String[] args) {

//        InputStream inputStream = new InputStream();
        //D:\Study\Project\practice
        String path1 = "D:\\Study\\Project\\practice\\newFile1.txt";

        File file = new File(path1);

        String fileName = "newFile2.txt";
        String path2 = "D:\\Study\\Project\\practice";

        File file2 = new File(path2);
        File file3 = new File(file2,fileName);

        try {
            boolean newFile = file.createNewFile();
            boolean newFile3 = file3.createNewFile();
            if (newFile){
                System.out.println("文件创建成功");
            }else {
                System.out.println("文件创建失败");
            }
        } catch (IOException e) {
            e.printStackTrace();
//        asdaasd


        }

    }

    @Test
    public void getFile(){

        File file = new File("D:\\Study\\Project\\practice\\newFile0.txt");

        System.out.println("绝对路径：" + file.getAbsoluteFile());
        System.out.println("文件大小：" + file.length());
        System.out.println("是否存在：" + file.exists());

    }
}
