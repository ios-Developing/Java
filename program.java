import java.util.Scanner;
import java.io.UnsupportedEncodingException;

public class program
{
    public static Integer DO(Integer b){
        b+=10;
        return b;
    }
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Как вас зовут ?");
	    String name = in.nextLine();
	    System.out.println("Сколько вам лет ?");
	    int age = in.nextInt();
	    
	    System.out.println("Hello " + name);
	    int x = 9;
	    String num = "12343567";
        int c = 10;
	    //boolean flag = true;
	    //int a = Integer.parseInt(num);
	    //Integer a = Integer.parseInt(num);
	    Integer b = new Integer(c);
	    b = DO(b);
	    System.out.println(b + 10);
	    System.out.println(!((x > 10) && (x < 20)) ^ ( num == "Ivan") || !(x < 20));
	    System.out.println("bghjmhmrewrt4r8wt ehaspfj");
	    System.out.print("vbs");
	    System.out.printf("%n Hello %s!%nЧисло х = %s", "World", b);
	    int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 30) - 1);
            System.out.println(array[i]);
        }
	}
}

