package yiqingchaxun;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import javax.swing.JPanel;


public class student1
{

private static ArrayList<student> studentlist;
	Scanner sc = new Scanner(System.in);
private static ArrayList<student> list;
private JPanel panel;
private JPanel buttonPanel;
private static final int DEFAULT_WITH = 600;
private static final int DEFAULT_HEIGHT = 300;
	List<student> list1  = new ArrayList<student>();
	public void menu(){
		System.out.println("��ӭʹ�������ϱ�ϵͳϵͳ");
		System.out.println("1 ��Ϣ¼��");
		System.out.println("2 ��Ϣ��ѯ");
		System.out.println("2 ����ͳ��");
		System.out.println("5 �˳�");
		System.out.println("��ѡ��");
	}
	public void start(){
		do{
			menu();
			int choose = sc.nextInt();
			switch(choose){
			case 1 :
				register();			
				continue;
			
			case 5:
				System.out.println("��лʹ�ô�ϵͳ����ӭ�´����ã�");
				break;
			default :
				System.out.println("���Ĳ������������²�����");
				continue;
			}  
			break;
		}while(true);
		
		
	}
	public student hasMember (String CardId ,String pwd){
		for (student member:list){
			if(member.getCardId()==CardId&&(member.getPassWord()).equals(pwd)){
				return member;
			}
		}
		return null;
	}
	public void register(){
		student member = new student();
	      System.out.println("������ѧ�ţ�");
	      member.setCardId(sc.next());
		  System.out.println("���������룺");
		  String pwd;
		  boolean flag = true;
		  do{
			  pwd = sc.next();
			  if(pwd.length()<6){
				  System.out.println("���벻��С��6λ������������һ�����룺");
				  flag = false;
			  }else{
				  flag = true;
				  member.setPassWord(pwd); 
			  }
		  }while(!flag);
		  member.setScore(100);
		  Date date = new Date();
		  SimpleDateFormat formater = new SimpleDateFormat("yyyy-mm-dd");
		  String sdate = formater.format(date);
		  member.setRegistDate(sdate);
		  list.add(member);
		  studentlist = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);
	        File file = new File("C:\\Users\\ASUS\\Desktop\\���֤��.txt");
	        try {
	            FileInputStream fis = new FileInputStream(file);
	            BufferedReader in = new BufferedReader(new InputStreamReader(fis));
	            String temp = null;
	            while ((temp = in.readLine()) != null) {

	                Scanner linescanner = new Scanner(temp);
			if(member!=null){
				student member1 = new student();
				System.out.println("������");
				 member1.setName(sc.next());
				  System.out.println("��ϵ�绰��");
				  member1.setPhonenumber(sc.nextInt());
				  System.out.println("���ڵأ�");
				  member1.setAddress(sc.next());
			      System.out.println("�Ƿ�Ϊ��������");
			      member1.setHubei(sc.next());
			      System.out.println("�Ƿ�Ϊ�人����");
			      member1.setWuhan(sc.next());
			      System.out.println("���£�");
			     // member1.setTemperature(sc.nextInt());
			      System.out.println("������Ϣ");
				System.out.println(member.getCardId()+"   ");
				System.out.println(member1.getName()+"   ");
				System.out.println(member1.getPhoneumber()+"   ");
				System.out.println(member1.getAddress()+"   ");
				//System.out.println(member1.getHubei()+"   ");
				System.out.println(member1.getWuhan()+"   ");
				System.out.println(member1.getRegistDate()+"   ");
				}else{
					System.out.println("������˼����ѧ�Ų����ڡ���Ϣ��ѯʧ�ܣ�");
				}
			}
	   }
	}
}  



