package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(s)))
        {
            String text = br.readLine();
            while(!(text).equals("exit")){
                bw.write(text + "\n");
                bw.flush();
            }
            bw.write(text + "\n");
            bw.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}
