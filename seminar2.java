// import java.io.*;

// public class seminar2 {
//     public static void main(String[] args) {
//         try(FileInputStream fin = new FileInputStream("note.txt"); 
//         FileOutputStream fos = new FileOutputStream(null, false)) {
//             byte[] buffer = new byte[256];
//             fin.read(buffer);
//             int i;
//             fos.write(buffer, 100, buffer.lenght);
//             //while((i = fin.read()) != -1) {

//                 // System.out.print((char)i);
//             }
//             System.out.print((char)buffer[3]);
//         }
//         catch(IOException ex) {
//             System.out.println(ex.getMessage());
//         }
//     }
// }

import java.io.*;
class Main {
  public static void main(String[] args) {
    
    try(FileInputStream fin = new FileInputStream("note.txt");      //чтение файла
       FileOutputStream fos=new FileOutputStream("notes_new.txt")){ //создание нового файла
      byte[] buffer = new byte[256]; //выделение памяти
      fin.read(buffer);
      fos.write(buffer,0,buffer.length);
      System.out.print((char)buffer[5]);
    }
    catch(IOException ex){      
            System.out.println(ex.getMessage());
        } 
  }
}

// import org.json.simple.JSONObject;

// class seminar2 {
//   public static void main(String[] args) {
//     JSONObject resultJson = new JSONObject();

//     resultJson.put("name","foo");
//     resultJson.put("num",100);
//     resultJson.put("is_vip",true);
//     resultJson.put("nickname",null);
//     System.out.print(resultJson.toString());
//   }
// }