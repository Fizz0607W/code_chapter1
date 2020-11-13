import java.io.File;
import java.io.IOException;

public class code_chapter1{
    public static void main(String[] args) {
        File file = new File(".");
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsoluteFile().getParent());
        File file2 = new File("/Users/runchengwang/Desktop/MGMT2902");
        System.out.println("Is new file exist?" + " " + file2.exists());
    }
    }

