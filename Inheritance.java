public class Parent {
String eyecolor="Blue";
public void hobby() {
	System.out.println("Singing");
}
}
public class Child extends Parent {

}

public class ParentChildApp {
public static void main(String[] args) {
	Child child= new Child();
	System.out.println(child.eyecolor());
	child.hobby();
}
}
