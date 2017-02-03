import java.util.Scanner;

public class Zombie{

public int health=100;
public int ammo=50;  //ammunation
public int ammoLeft=50;
public String name;
int choice;
int zombies=3;






public Zombie(){
	System.out.println("What's your name?");
	Scanner keyboard=new Scanner(System.in);
	name=keyboard.nextLine();
	System.out.println("Welcome "+name+ "to the game! Prepare to die!!!!");
}

public void start(){

	System.out.println("Zombies are attacking!");
	System.out.println("Enter '1' to attack with gun. Enter '2' to attack with hands");
	Scanner keyboard=new Scanner(System.in);
	choice=keyboard.nextInt();

	while(zombies<=3&&zombies>0){
		if(health==0){
		System.out.println("You've lost the game!!!  :( ");
		break;
		}
	if(choice==1){
		System.out.println("Zombie is dead!");
		zombies--;
	}
	else if(choice==2){
		health-=50;
		System.out.println("Zombie is dead but you lost half your health!");
		zombies--;


}

	}
System.out.println("You've won the game!!!!!");
}


public void reloadGun(int x){
	ammoLeft=ammo-x;
}

public int getAmmo(){
	return ammoLeft;
}




public static void main(String[]args){

Zombie player1=new Zombie();
player1.start();
}



}