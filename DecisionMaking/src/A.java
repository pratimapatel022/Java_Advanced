
class A{
int x;
String y;
void show() {
	System.out.println("hi");

}
public class ClassObjectQues1 {
	public static void main(String[] args) {
		A a=new A();
		a.x=10;
		A b=new A();
		b.y="ram";
		a.show();
		b.show();
	}
}
}
