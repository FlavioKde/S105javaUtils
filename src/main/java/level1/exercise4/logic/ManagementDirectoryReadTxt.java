package level1.exercise4.logic;

import level1.exercise4.dataClass.ListDirectoryReadTxt;


import java.io.File;
import java.util.Arrays;

public class ManagementDirectoryReadTxt {
      private ListDirectoryReadTxt listDirectoryReadTxt;

    public ManagementDirectoryReadTxt(String directoryPath) {

        this.listDirectoryReadTxt = new ListDirectoryReadTxt(directoryPath);

    }

    public void loadDirectory() {


        File [] files = listDirectoryReadTxt.getFileList();
            if (files != null && files.length > 0){
                Arrays.sort(files);
                for (File file:files){
                    System.out.println(file.getName());


                    if (file.isFile() && file.getName().toLowerCase().endsWith(".txt")) {
                        TxtReader.readTxt(file.getPath());
                    }
                }

            }else {
                System.out.println("The directory is empty");
            }

        }
    }



