package com.project.validation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

@Service
public class FileWriteService {
    @Bean
    private void createFile() {
        try {
            File myObj = new File("./resources/reports/filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }



    public void writeFile(Map<String,String> td,
                          Map<String,String> td_global,
                          Map<String,String> match,
                          Map<String,String> mismatch,
                          Map<String,String> notFound
    )
    {
        try {
            FileWriter myWriter = new FileWriter("./resources/reports/filename.txt");
            myWriter.write("Number of data coming from data.feedgma.com : " + td.size()+"\n");
            myWriter.write("Number of data coming from data-global-nv.feedgma.com : " +td_global.size()+"\n");
            myWriter.write("Number of data comparison success : " + match.size() +"\n");
            myWriter.write("Number of data comparison mismatch : " + mismatch.size()+ "\n");
            myWriter.write("Number of data comparison not found : " + notFound.size()+ "\n");

            myWriter.write("===================== Matched Data [EXCHANGE, SYMBOL]=====================" +"\n");
            myWriter.write(displayMap(match));

            myWriter.write("===================== Mismatched Data [EXCHANGE, SYMBOL]=====================" +"\n");
            myWriter.write(displayMap(mismatch));

            myWriter.write("===================== Not Found Data [EXCHANGE, SYMBOL]=====================" +"\n");
            myWriter.write(displayMap(notFound));




            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private String displayMap(Map<String,String> map){
        String output = "";
        for (String key: map.keySet()) {
            String[] pair = key.split("@");
            output += pair[0] + "  " + pair[1] +"\n";
        }
        return output;
    }

}
