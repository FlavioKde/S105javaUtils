package level1.exercise3.dataClass;

import java.io.File;

public class ListDirectoryWriteTxt {

        private File[] fileList;

    public ListDirectoryWriteTxt(String directoryPath){

        this.fileList = new File(directoryPath).listFiles();
    }


    public File[] getFileList() {
        return fileList;
    }

}

