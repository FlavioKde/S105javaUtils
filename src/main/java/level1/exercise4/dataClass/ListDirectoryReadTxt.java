package level1.exercise4.dataClass;

import java.io.File;

public class ListDirectoryReadTxt {

        private File[] fileList;

    public ListDirectoryReadTxt(String directoryPath){

        this.fileList = new File(directoryPath).listFiles();
    }


    public File[] getFileList() {
        return fileList;
    }
}

