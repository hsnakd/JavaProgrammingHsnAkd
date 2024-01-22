package practice;

import java.io.File;

public class BrowserUtils {


    public static void main(String[] args) {
        // Call this method to create the download folder
        createDownloadFolder();

        // Call this method to count the number of files in the download folder
        int fileCount = countFilesInDownloadFolder();
        System.out.println("Number of files in the download folder: " + fileCount);


        // Call this method to delete the download folder
        //deleteDownloadFolder();


    }

    // Method to create a folder
    public static void createDownloadFolder() {
        String folderPath = "src/test/java/com/cydeo/Download";
        File folder = new File(folderPath);

        if (!folder.exists()) {
            boolean folderCreated = folder.mkdirs();
            if (folderCreated) {
                System.out.println("Download folder created at: " + folder.getAbsolutePath());
            } else {
                System.err.println("Failed to create download folder.");
            }
        } else {
            System.out.println("Download folder already exists at: " + folder.getAbsolutePath());
        }
    }

    // Method to delete a folder
    public static void deleteDownloadFolder() {
        String folderPath = "src/test/java/com/cydeo/Download";
        File folder = new File(folderPath);

        if (folder.exists()) {
            boolean folderDeleted = deleteFolder(folder);
            if (folderDeleted) {
                System.out.println("Download folder deleted.");
            } else {
                System.err.println("Failed to delete download folder.");
            }
        } else {
            System.out.println("Download folder does not exist.");
        }
    }

    // Recursive method to delete a folder and its contents
    private static boolean deleteFolder(File folder) {
        if (folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        deleteFolder(file);
                    } else {
                        if (!file.delete()) {
                            System.err.println("Failed to delete file: " + file.getAbsolutePath());
                            return false;
                        }
                    }
                }
            }
        }
        return folder.delete();
    }

    // Method to count the number of files in a folder
    public static int countFilesInDownloadFolder() {
        String folderPath = "src/test/java/com/cydeo/Download";
        File folder = new File(folderPath);

        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                return files.length;
            }
        }
        // If the folder doesn't exist or is empty, return 0
        return 0;
    }




}
