

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args)throws IOException, ParseException {

    BookInfo[] book_info=new BookInfo[100];
    BufferedReader br=new BufferedReader(new FileReader("students_information.txt"));
    br.readLine();
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    for(int i=0;i<100;i++)
    {
        String line=br.readLine();
        String[] words=line.split("\\t");
        book_info[i]=new BookInfo(words[0],words[1],words[2],words[3],(Date)sdf.parse(words[4]),(Date)sdf.parse(words[5]));
    }
    new LibraryGui(book_info);
    }
}
