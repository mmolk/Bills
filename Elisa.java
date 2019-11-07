import java.util.Scanner;

public class Elisa {
	static	Scanner ui = new Scanner(System.in);
	static boolean loop = true;
	static boolean progress = false;
	static boolean finish = false;


	public static void main(String[] args) {

		user prviUporabnik = new user();
		
		
		System.out.println("Vpisi ime prvega placnika: ");
		String name1 = ui.nextLine();		
		prviUporabnik.userName = name1;		
		prviUporabnik.userBalance = 0;

		System.out.println("Vpisi ime drugega placnika: ");
		String name2 = ui.nextLine();
		user drugiUporabnik = new user();
		drugiUporabnik.userName = name2;
		drugiUporabnik.userBalance = 0;



		System.out.println("Razlika med "+ name1+" in "+name2+" znasa "+ (prviUporabnik.getS() - drugiUporabnik.getS()));		
		System.out.println("Znesek prvega racuna: ");
		double prviRacun = Double.parseDouble(ui.nextLine());



		while(loop) {

			System.out.println("Racun je placal: ");
			String name = ui.nextLine();
			if(name.equalsIgnoreCase(name1)) {				
				prviUporabnik.remove(prviRacun);
				loop = false;
				progress = true;
			}else if(name.equalsIgnoreCase(name2)) {				
				drugiUporabnik.remove(prviRacun);
				loop = false;
				progress = true;
			}
			else {
				loop = true;				
			}
		}


		while(progress) {

			System.out.println("Drugi racun? (Y/N)");
			String choice = ui.nextLine();

			if (choice.equalsIgnoreCase("y") ||  choice.equalsIgnoreCase("yes")){
				loop = true;
				progress = false;
			}
			else {
				double razlika = Math.abs(prviUporabnik.getS() - drugiUporabnik.getS());					
				System.out.println("\nRazlika: "+ razlika);

				String namez = prviUporabnik.getS() > drugiUporabnik.getS() ? name1 : name2;
				System.out.println(namez+" dolguje "+razlika);
				progress = false;
				loop = false;			
			}		
		}





		while(loop) {
			System.out.println("Znesek drugega racuna: ");
			double drugiRacun = Double.parseDouble(ui.nextLine());

			System.out.println("Racun je placal: ");
			String name = ui.nextLine();
			if(name.equalsIgnoreCase(name1)) {				
				prviUporabnik.remove(drugiRacun);
				loop = false;
				progress = true;
			}else if(name.equalsIgnoreCase(name2)) {				
				drugiUporabnik.remove(drugiRacun);
				loop = false;
				progress = true;
			}
			else {
				loop = true;				
			}
		}	


		while(progress) {

			System.out.println("Tretji racun? (Y/N)");
			String choice = ui.nextLine();

			if (choice.equalsIgnoreCase("y") ||  choice.equalsIgnoreCase("yes")){
				loop = true;
				progress = false;
			}
			else {
				double razlika = Math.abs(prviUporabnik.getS() - drugiUporabnik.getS());					
				System.out.println("\nRazlika: "+ razlika);

				String namez = prviUporabnik.getS() > drugiUporabnik.getS() ? name1 : name2;
				System.out.println(namez+" dolguje "+razlika);
				progress = false;
				loop = false;			
			}		
		}

		while(loop) {
			System.out.println("Znesek tretjega racuna: ");
			double tretjiRacun = Double.parseDouble(ui.nextLine());

			System.out.println("Racun je placal: ");
			String name = ui.nextLine();
			if(name.equalsIgnoreCase(name1)) {				
				prviUporabnik.remove(tretjiRacun);
				loop = false;
				progress = true;
			}else if(name.equalsIgnoreCase(name2)) {				
				drugiUporabnik.remove(tretjiRacun);
				loop = false;
				progress = true;
			}
			else {
				loop = true;				
			}
		}


		while(progress){

			double razlika = Math.abs(prviUporabnik.getS() - drugiUporabnik.getS());			
			String namez = prviUporabnik.getS() > drugiUporabnik.getS() ? name1 : name2;
			System.out.println(namez+" dolguje "+razlika);
			progress = false;

		}
	}

}

