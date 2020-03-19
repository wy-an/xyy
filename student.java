package yiqingchaxun;

import java.awt.EventQueue;
import javax.swing.JFrame;
import com.sun.tools.javac.Main;
public class student implements Comparable<student> {
	private String name;
	private String cardId ;
	private String  passWord;
	private int score;
	private String registDate;
	private float temperature;
	private String address;
	private String hubei;
	private String wuhan;
	private long phonenumber;
   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
  
        
        public student(String name, String main,float temperature,String CardId, long phonenumber,String address,String passWord, String hubei,String wuhan,
    			String registDate) {
    		super();
    		this.name = name;
    		this.cardId = CardId;
    		this.passWord = passWord;
    		this.score = score;
    		this.temperature=temperature;
    		this.registDate = registDate;
    		this.address=address;
    		this.hubei=hubei;
    		this.wuhan=wuhan;
    	}
        public student() {	
    	}

    	public String getCardId() {
    		return cardId;
    	}
    	public void setCardId(String cardId) {
    		this.cardId = cardId;
    	}
    	public String getPassWord() {
    		return passWord;
    	}
    	public void setPassWord(String passWord) {
    		this.passWord = passWord;
    	}
    	public int getScore() {
    		return score;
    	}

    	public void setScore(int score) {
    		this.score = score;
    	}
    	public String getRegistDate() {
    		return registDate;
    	}
    	public void setRegistDate(String registDate) {
    		this.registDate = registDate;
    	}
    	public String setWuhan() {
    		return wuhan;
    	}
    	public void setWuhan(String wuhan) {
    		this.wuhan = wuhan;
    	}
    	
    	public String setAddress() {
    		return address;
    	}
    	public void setAddress(String adress) {
    		this.address = address;
    		
    	}public int setPhonenumbe() {
    		return (int) phonenumber;
    	}
    	public void setPhonenumber(int phonenumber) {
    		this.phonenumber = phonenumber;
    	}
    	
    	public void setHubei(String hubei) {
    		this.hubei= hubei;
    	}
   

    public int compareTo(student o) {
       return this.name.compareTo(o.getName());
    }

    public String toString() {
        return  name+"\t"+cardId+"\t"+phonenumber+"\t"+hubei+"\t"+wuhan+"\t"+temperature+"\n";
    } 
    
	public String getPhoneumber() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getWuhan() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getAddress() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setTemperature(int nextInt) {
		// TODO Auto-generated method stub
		
	}
	
}



