package level1.exercise1.logic;

import java.io.File;

import level1.exercise1.dataClass.ListDirectory;

import java.util.Arrays;

public class ManagementDirectory {
    private ListDirectory listDirectory;

    public ManagementDirectory(String relativePath){

        this.listDirectory = new ListDirectory(relativePath);
        loadDirectory();
    }
    public void loadDirectory(){

        String directoryPath = listDirectory.getDirectoryPath();

        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()){

            File[] files = directory.listFiles();
            if (files != null && files.length > 0){
                Arrays.sort(files);
                for (File file:files){
                    System.out.println(file.getName());
                }

            }else {
                System.out.println("The directory is empty");
            }
        }else{
            System.out.println("the directory does not exist");
        }
    }
}
