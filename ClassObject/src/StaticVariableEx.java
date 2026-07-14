class Employe{
	String name;
	int salary;
	private static String cname="ABC";
	void show(){
		System.out.println(name+" "+salary+" "+cname);
	}
	public void input(String n,int s) {
		name=n;
		salary=s;
	}
	static void showCompany() {
		System.out.println(cname);
//		System.out.println(salary);
	}
	static void changeCompany(String newName) {
		cname = newName;
	}
}
public class StaticVariableEx {
	public static void main(String[] args) {
		//System.out.println(cname);//error
//		System.out.println(Employee.cname);
		Employe.showCompany();
		Employe a=new Employe();
		Employe b=new Employe();
		Employe c=new Employe();
		Employe d=new Employe();
		
		Employe.changeCompany("asdfdgfghg");
		a.show();
		b.show();
		c.show();
		d.show();
		
		a.input("Cheetah Khan",256000);
		b.input("Yoyo Gupta",125000);
		c.input("Gogo Singh",98000);
		d.input("Teja Seth",780000);

//		a.cname="XYZ";
//		Employee.cname="XYZ";//allowed
		
		a.show();
		b.show();
		c.show();
		d.show();
	}
}
