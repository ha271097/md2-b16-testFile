package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExample {
    public void readFileText(String path){
        try{
            File file = new File(path);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            int line ;
            int sum = 0;
            while((line = br.read()) != -1 ){
               sum+=line;
            }
            br.close();
            System.out.println(" tong = " + sum);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
