package level1.exercise2.dataClass;

import java.io.File;

public class ListDirectoryTree {

        private File[] fileList;

    public ListDirectoryTree(String directoryPath){

        this.fileList = new File(directoryPath).listFiles();
    }

}

