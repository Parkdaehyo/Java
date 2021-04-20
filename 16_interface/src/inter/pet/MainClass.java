package inter.pet;

public class MainClass {

	public static void main(String[] args) {
		
		Dog baduk = new Dog();
		Animal nabi = new Cat();
		Tiger hodol = new Tiger();
		
		Animal[] animals = {baduk, nabi, hodol};
		
		for(Animal a : animals) {
			a.eat();
		}
		
		System.out.println("----------------------");
		
		IPet[] pets = new IPet[3];
		
		pets[0] = baduk;	
//		pets[1] = (Cat)nabi; // 2.그래서 다시(Cat)타입으로 낮춰주면 들어갈 수 있다.
		pets[1] = (IPet)nabi; // 1. nabi타입을 Animal 타입으로 바꾸면 pets[1] = nabi;가 에러가 뜬다. // 3. 혹은 Animal타입이라고 해도 바로 (Ipet)타입으로 바꿔도 된다.  
//		pets[2] = (IPet)hodol; //runtime error
//		pets[2] = new Shark(); //compile error
		pets[2] = new GoldFish();
		
		for(IPet pet: pets) {
			pet.play();
		}
		
		System.out.println("-------------------------");
		
		PetShop shop = new PetShop();
		shop.carePet(baduk);
		shop.carePet((IPet)nabi);
		shop.carePet(pets[2]);
		
	} 

}


