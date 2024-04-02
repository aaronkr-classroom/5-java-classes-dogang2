
public class Ex704 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studunt s1= new Studunt();
		Studunt s2= new Studunt();
		
		s1.id = 20221004;
		s1.name = "유재석";
		s1.printInfo();
		
		s2.insertRecord(20021005, "마동석");
		s2.printInfo();		
		
		Studunt s3 = new Studunt(20221006, "김유석");
	}

}
