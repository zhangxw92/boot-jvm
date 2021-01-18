package com.athome.suanfa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

/**
 * 计算一个字符串在一个文件中出现的次数
 */
public class TestIndexworld {

    public static void main(String[] args) throws IOException {
        int idex = 0;
        String str = "this is my first apple my a b c d my";
        while (true) {
            idex = str.indexOf("my", idex + 1);
            if (idex > 0) {
                System.out.println(idex);
            } else {
                break;
            }
        }

//        String path = TestIndexworld.class.getResource("/hello.txt").getPath();
//        System.out.println(path);
//        int happy = TestIndexworld.read(path, "happy");
//        System.out.println(happy);
    }

    public static int read(String fileName, String helloword) throws IOException {

        FileReader fileReader = new FileReader(fileName);

        BufferedReader bufferedReader = new BufferedReader(fileReader);


        StringBuilder stringBuilder = new StringBuilder();

        while (true) {
            String s = bufferedReader.readLine();
            if (s == null) {
                break;
            }

            stringBuilder.append(s);
        }

        String result = stringBuilder.toString();

        int index = 0;
        int count = 0;
        while (true) {
            index = result.indexOf(helloword, index + 1);
            if (index > 0) {
                count++;
            } else {
                break;
            }
        }

        bufferedReader.close();
        return count;
    }
}


