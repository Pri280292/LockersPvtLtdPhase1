package lockersPvtLtd;

import java.io.File;

public class DirectoryServiceProvider {
private static Directory fileDirectory = new Directory();
    
    public static void PrintFiles() {
    	
    	fileDirectory.fillFiles();

        for (File file : DirectoryServiceProvider.getFileDirectory().getFiles())
        {
            System.out.println(file.getName());
        }
    }
    public static Directory getFileDirectory() {
        return fileDirectory;
    }

    public static void setFileDirectory(Directory fileDirectory) {
        DirectoryServiceProvider.fileDirectory = fileDirectory;
    }


}
