package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        FileInputStream inputStream;
        byte[] streams;
        boolean forWhile = true;
        byte[] test = new byte[1000];
        ArrayList<FileInputStream> list = new ArrayList<>();
        while (forWhile) {
            inputStream = new FileInputStream((new BufferedReader(new InputStreamReader(System.in))).readLine());
            streams = new byte[inputStream.available()];
            list.add(inputStream);
            if (streams.length < test.length) {
                forWhile = false;
                for (FileInputStream inner : list) {
                    inner.close();
                }
                throw new DownloadException();
            }
        }
        }

    public static class DownloadException extends Exception {

    }
}
