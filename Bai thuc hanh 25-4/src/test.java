public class test {
	public static void main(String[] args) {
		person6 p1=new student();
		p1.dichuyen();
		person6 p2=new employee();
		p2.dichuyen();
		System.out.println("_______________");
		offlinestudent ost=new offlinestudent();
		ost.thihocki();;
		onlinestudent onst=new onlinestudent();
		onst.thihocki();;
		System.out.println("_______________");
		parttimeemlpoyee pe=new parttimeemlpoyee();
		pe.dichuyen();
		pe.thoigianlam();
		fulltimeemployee fe=new fulltimeemployee();
		fe.dichuyen();
		fe.thoigianlam();
		System.out.println("_______________");
		animal a1=new cat();
		a1.eat();
		a1.run();
		a1.walk();
		a1.sleep();
		a1.roar();
		System.out.println("_______________");
		animal a2=new dog();
		a2.eat();
		a2.run();
		a2.walk();
		a2.sleep();
		a2.roar();
		System.out.println("_______________");
		car c1=new taxicar();
		c1.move();
		c1.turnright();
		c1.turnleft();
		c1.reverse();
		c1.stop();
	}
}
