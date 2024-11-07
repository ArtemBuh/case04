import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner;
        System.out.print("Ввод с клавиатуры (Y/N):");
        char n=(char)System.in.read();

        try {
            if (n=='Y' || n=='y') {
                System.out.print("Введите числа через пробел и Z в конце: ");
                scanner = new Scanner(System.in);
            } else scanner = new Scanner(new File("data.txt"));

        }
        catch (Exception e)
        {
            System.out.println("IO Error");
            return;
        }

        jSorter sorter=new jSorter();
        while (scanner.hasNextInt()) {
            sorter.add(scanner.nextInt());
        }
        scanner.close();

        sorter.sort();

        FileWriter fw=new FileWriter("data.out",false);
        for(int i=0;i<sorter.getCount();i++)
            fw.append(sorter.get(i).toString()+" ");
        fw.close();
    }
}