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
		System.out.println("欢迎使用疫情上报系统系统");
		System.out.println("1 信息录入");
		System.out.println("2 信息查询");
		System.out.println("2 疫情统计");
		System.out.println("5 退出");
		System.out.println("请选择：");
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
				System.out.println("感谢使用此系统，欢迎下次再用！");
				break;
			default :
				System.out.println("您的操作有误，请重新操作！");
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
	      System.out.println("请输入学号：");
	      member.setCardId(sc.next());
		  System.out.println("请输入密码：");
		  String pwd;
		  boolean flag = true;
		  do{
			  pwd = sc.next();
			  if(pwd.length()<6){
				  System.out.println("密码不能小于6位！请重新输入一个密码：");
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
	        File file = new File("C:\\Users\\ASUS\\Desktop\\身份证号.txt");
	        try {
	            FileInputStream fis = new FileInputStream(file);
	            BufferedReader in = new BufferedReader(new InputStreamReader(fis));
	            String temp = null;
	            while ((temp = in.readLine()) != null) {

	                Scanner linescanner = new Scanner(temp);
			if(member!=null){
				student member1 = new student();
				System.out.println("姓名：");
				 member1.setName(sc.next());
				  System.out.println("联系电话：");
				  member1.setPhonenumber(sc.nextInt());
				  System.out.println("所在地：");
				  member1.setAddress(sc.next());
			      System.out.println("是否为湖北籍：");
			      member1.setHubei(sc.next());
			      System.out.println("是否为武汉籍：");
			      member1.setWuhan(sc.next());
			      System.out.println("体温：");
			     // member1.setTemperature(sc.nextInt());
			      System.out.println("基本信息");
				System.out.println(member.getCardId()+"   ");
				System.out.println(member1.getName()+"   ");
				System.out.println(member1.getPhoneumber()+"   ");
				System.out.println(member1.getAddress()+"   ");
				//System.out.println(member1.getHubei()+"   ");
				System.out.println(member1.getWuhan()+"   ");
				System.out.println(member1.getRegistDate()+"   ");
				}else{
					System.out.println("不好意思、该学号不存在、信息查询失败！");
				}
			}
	   }
	}
}  



