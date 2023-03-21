import java.io.*;

class Serialise implements Serializable {
    int id;
    String name;

     public Serialise(int id, String name) {
         this.id = id;
         this.name = name;
     }
 }
 class Demo{
     public static void main(String[] args) throws IOException {
         Serialise s=new Serialise(12,"khush");
         FileOutputStream fs=new FileOutputStream("Demo");
         ObjectOutputStream os=new ObjectOutputStream(fs);
         os.writeObject(s);
     }
 }
