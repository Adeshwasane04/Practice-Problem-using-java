package Accenture;

import java.io.File;

public class FileVersion {
 public static void main(String[] args) {
    String FileVersion[]={"File1","File3","File18","File15"};
    int length=FileVersion.length;
    System.out.println("Maximum vrsion of file is : "+isLatest(FileVersion, length));
 }
 static String isLatest(String str[],int length)
 {
    String latest="";
    int max=0;
    int versionNumber=0;
    
    for(String File :str)
    {
      versionNumber=Integer.parseInt(File.substring(4));
        
      
        if(versionNumber>max)
        {
            latest=File;
            max=versionNumber;
        }
    }
    System.out.println("Max version number: " + max);
    return latest;
 }
}
