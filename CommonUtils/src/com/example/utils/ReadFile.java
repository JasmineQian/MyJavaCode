package com.example.utils;

import java.io.*;

public class ReadFile {

    public static String readToString(String fileName) {
        String encoding = "UTF-8";
        File file = new File(fileName);
        Long filelength = file.length();
        System.out.println(filelength);
        byte[] filecontent = new byte[filelength.intValue()];
        try {
            FileInputStream in = new FileInputStream(file);
            in.read(filecontent);
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            return new String(filecontent, encoding);
        } catch (UnsupportedEncodingException e) {
            System.err.println("The OS does not support " + encoding);
            e.printStackTrace();
            return null;
        }
    }


    public static void BufferedReaderFile(String filename) throws IOException {
        FileReader fileReader=new FileReader(filename);
        BufferedReader in = new BufferedReader(fileReader);
        String str;
        int a=0;
        while ((str = in.readLine()) != null) {
            a+=1;
            System.out.println("the " + a);
            System.out.println(str);
            }

    }

    public static void inputStreamFile(String filename) throws IOException {
        InputStream inputStream = new FileInputStream(filename);
/*
        int a = inputStream.read();
        String s=inputStream.toString();
        System.out.println(a);
        System.out.println(s);
*/

        byte[] b = new byte[200];//把所有的数据读取到这个字节当中
        //声明一个int存储每次读取到的数据
        int i = 0;
        //定义一个记录索引的变量
        int index = 0;
        //循环读取每个数据
        while((i=inputStream.read())!=-1){//把读取的数据放到i中
            b[index]=(byte) i;
            index++;
        }
        //把字节数组转成字符串
        System.out.println(new String(b));
        //关闭流
        inputStream.close();
        }


    public static void main(String[] args) throws IOException {
        //表示磁盘路径的两种表示方式：1、\\   2、/
        String filecontent = readToString("aaa.txt");
        System.out.println(filecontent);


        System.out.println("========我也开始读文件啦================");
        BufferedReaderFile("aaa.txt");


        System.out.println("========int是个什么鬼================");
        inputStreamFile("aaa.txt");
    }

}
