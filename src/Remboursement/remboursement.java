package Remboursement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double [] dept_21 = {2, 0.86, 1.72, 21.93, 1.29, 2.58, 21.93};
		double [] dept_25 = {2.1, 0.83, 1.66, 22.5, 1.2, 2.4, 22.5};
		double [] dept_39 = {2.1, 0.83, 1.66, 22.5, 1.23, 2.46, 25};
		double [] dept_44 = {2.2, 0.79,	1.58, 24.19, 1.19, 2.37, 24.19};
		double [] dept_72 = {2.15, 0.79, 1.58, 22.86, 1.19,	2.38, 22.86};
		double [] dept_73 = {2.4, 0.84,	1.68, 25.4,	1.26, 2.52,	25.4};
		double [] dept_74 = {3.15, 0.92, 1.84, 17.3, 1.38, 2.76, 17.3};
		double [] dept_75 = {2.5, 1, 1.24, 0, 1.5, 1.5, 0};
		double [] dept_85 = {2.3, 0.8, 1.6, 22.2, 1.2, 2.4,	22.2};
		double [] dept_90 = {2.2, 0.83,	1.66, 21, 1.15,	2.3, 21};

		Scanner deptart = new Scanner(System.in);
		System.out.println("Veuillez saisir le département :");
		int numDept = deptart.nextInt();

		switch (numDept){
			case 21 :
				calcul(dept_21);
			break;
			case 25 :
				calcul(dept_25);
			break;
			case 39 :
				calcul(dept_39);
			break;
			case 44 :
				calcul(dept_44);
			break;
			case 72 :
				calcul(dept_72);
			break;
			case 73 :
				calcul(dept_73);
			break;
			case 74 :
				calcul(dept_74);
			break;
			case 75 :
				calcul(dept_75);
			break;
			case 85 :
				calcul(dept_85);
			break;
			case 90 :
				calcul(dept_90);
			break;
		}
	}


	private static void calcul(double [] dept){
		Scanner deptObjet = new Scanner(System.in);
		System.out.println("Veuillez saisir le type de déplacement (AS ou AR) :");
		String trajet = deptObjet.next();
		//Aller simple
		if (trajet == "AS"){
			System.out.println("Veuillez saisir le jour de déplacement (S ou WE) :");
			String dateDep = deptObjet.next();
			//Aller simple en semaine
			if (dateDep == "S"){
				System.out.println("Veuillez saisir l'heure du déplacement (J ou N) :");
				String heureDep = deptObjet.next();
				//Aller simple en semaine de jour
				if (heureDep == "J"){
					System.out.println("Veuillez le temps du parcours (arrondi à l'heure inférieure :");
					int heurePar = deptObjet.nextInt();
					//Aller simple en semaine de jour pour une heure
					if (heurePar == 1){
						System.out.println("Veuillez le nombre km parcouru :");
						int nbKm = deptObjet.nextInt();
						double montantRemb = dept[0] + (nbKm * dept[2]);
						System.out.println("Le remboursement est de " + montantRemb);
					}
					//Aller simple en semaine de jour pour heure > 1
					else{
						System.out.println("Veuillez le nb km parcouru :");
						int nbKm = deptObjet.nextInt();
						double montantRemb = dept[0] + (nbKm * dept[2]) + (heurePar * dept[3]);
						System.out.println("Le remboursement est de " + montantRemb);
					}
				}
				//Aller simple en semaine de nuit
				else{
					System.out.println("Veuillez le temps du parcours (arrondi à l'heure inférieure :");
					int heurePar = deptObjet.nextInt();
					//Aller simple en semaine de nuit pour une heure
					if (heurePar == 1){
						System.out.println("Veuillez le nb km parcouru :");
						int nbKm = deptObjet.nextInt();
						double montantRemb = dept[0] + (nbKm * dept[5]);
						System.out.println("Le remboursement est de " + montantRemb);
					}
					//Aller simple en semaine de nuit pour heure > 1
					else{
						System.out.println("Veuillez le nb km parcouru :");
						int nbKm = deptObjet.nextInt();
						double montantRemb = dept[0] + (nbKm * dept[5]) + (heurePar * dept[6]);
						System.out.println("Le remboursement est de " + montantRemb);
					}
				}
			}
			//Aller simple en WE
			else{
				System.out.println("Veuillez le temps du parcours (arrondi à l'heure inférieure :");
				int heurePar = deptObjet.nextInt();
				//Aller simple en WE pour une heure
				if (heurePar == 1){
					System.out.println("Veuillez le nb km parcouru :");
					int nbKm = deptObjet.nextInt();
					double montantRemb = dept[0] + (nbKm * dept[5]);
					System.out.println("Le remboursement est de " + montantRemb);
				}
				//Aller simple en WE pour heure > 1
				else{
					System.out.println("Veuillez le nb km parcouru :");
					int nbKm = deptObjet.nextInt();
					double montantRemb = dept[0] + (nbKm * dept[5]) + (heurePar * dept[6]);
					System.out.println("Le remboursement est de " + montantRemb);
				}
			}
		}
		//Aller retour
		else{
			System.out.println("Veuillez saisir le jour de déplacement (S ou WE) :");
			String dateDep = deptObjet.next();
			//Aller retour en semaine
			if (dateDep == "S"){
				System.out.println("Veuillez saisir l'heure du déplacement (J ou N) :");
				String heureDep = deptObjet.next();
				//Aller retour en semaine de jour
				if (heureDep == "J"){
					System.out.println("Veuillez le temps du parcours (arrondi à l'heure inférieure :");
					int heurePar = deptObjet.nextInt();
					//Aller retour en semaine de jour pour une heure
					if (heurePar == 1){
						System.out.println("Veuillez le nb km parcouru :");
						int nbKm = deptObjet.nextInt();
						double montantRemb = dept[0] + (nbKm * dept[1]);
						System.out.println("Le remboursement est de " + montantRemb);
					}
					//Aller retour en semaine de jour pour heure > 1
					else{
						System.out.println("Veuillez le nb km parcouru :");
						int nbKm = deptObjet.nextInt();
						double montantRemb = dept[0] + (nbKm * dept[1]) + (heurePar * dept[3]);
						System.out.println("Le remboursement est de " + montantRemb);
					}
				}
				//Aller retour en semaine de nuit
				else{
					System.out.println("Veuillez le temps du parcours (arrondi à l'heure inférieure :");
					int heurePar = deptObjet.nextInt();
					//Aller retour en semaine de nuit pour une heure
					if (heurePar == 1){
						System.out.println("Veuillez le nb km parcouru :");
						int nbKm = deptObjet.nextInt();
						double montantRemb = dept[0] + (nbKm * dept[5]);
						System.out.println("Le remboursement est de " + montantRemb);
					}
					//Aller retour en semaine de nuit pour heure > 1
					else{
						System.out.println("Veuillez le nb km parcouru :");
						int nbKm = deptObjet.nextInt();
						double montantRemb = dept[0] + (nbKm * dept[5]) + (heurePar * dept[6]);
						System.out.println("Le remboursement est de " + montantRemb);
					}
				}
			}
			//Aller retour en WE
			else{
				System.out.println("Veuillez le temps du parcours (arrondi à l'heure inférieure :");
				int heurePar = deptObjet.nextInt();
				if (heurePar == 1){
					System.out.println("Veuillez le nb km parcouru :");
					int nbKm = deptObjet.nextInt();
					double montantRemb = dept[0] + (nbKm * dept[5]);
					System.out.println("Le remboursement est de " + montantRemb);
				}else{
					System.out.println("Veuillez le nb km parcouru :");
					int nbKm = deptObjet.nextInt();
					double montantRemb = dept[0] + (nbKm * dept[5]) + (heurePar * dept[6]);
					System.out.println("Le remboursement est de " + montantRemb);
				}
			}
		}
	}
}
