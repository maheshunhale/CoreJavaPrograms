import java.io.*;
class Dog implements Serializable{
	int i = 10;
	int j = 20;
}
class SerializaDemo{
	public static void main(String args[])throws Exception{
		Dog1 d1 = new Dog();
		FileOutputStream fos = new FileOutputStream("MU.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis = new FileInputStream("MU.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog)ois.readObject();
		
		System.out.println(d2.i+"........"+d2.i);//10..............20
	}
}