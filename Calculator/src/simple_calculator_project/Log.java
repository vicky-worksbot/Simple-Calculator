package simple_calculator_project;

public class Log {
	private String UserName;
	private String passWord;
	Log(String UserName,String passWord)
	{
	 this.UserName=UserName;
	 this.passWord=passWord;
   }
 


    public String getUserName() {
		return this.UserName+this.passWord;
	}
@Override
public String toString() {
	return  this.UserName+this.passWord ;
}



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((UserName == null) ? 0 : UserName.hashCode());
	result = prime * result + ((passWord == null) ? 0 : passWord.hashCode());
	return result;
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Log other = (Log) obj;
	if (UserName == null) {
		if (other.UserName != null)
			return false;
	} else if (!UserName.equals(other.UserName))
		return false;
	if (passWord == null) {
		if (other.passWord != null)
			return false;
	} else if (!passWord.equals(other.passWord))
		return false;
	return true;
}
	
	
}