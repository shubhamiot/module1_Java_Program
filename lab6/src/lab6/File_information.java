package lab6;

import java.io.File;
import java.util.Scanner;

public class File_information {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name");
		String s=sc.nextLine();
		File f1=new File(s);
		System.out.println("File Name:"+f1.getName());
		System.out.println("Path:"+f1.getPath());
		System.out.println("Abs Path:"+f1.getAbsolutePath());
		System.out.println("This file is:"+(f1.exists()?"Exists":"Does not exists"));
		System.out.println("Is file:"+f1.isFile());
		System.out.println("Is Directory:"+f1.isDirectory());
		System.out.println("Is Readable:"+f1.canRead());
		System.out.println("IS Writable:"+f1.canWrite());
		System.out.println("Is Absolute:"+f1.isAbsolute());
		System.out.println("File Size:"+f1.length()+"bytes");
	}
}
