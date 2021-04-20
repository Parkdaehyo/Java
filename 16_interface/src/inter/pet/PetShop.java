package inter.pet;

public class PetShop {
	
	public void carePet(IPet pet) { //인터페이스 매개타입 가능
		
		if(pet instanceof Dog) {
			System.out.println("강아지를 돌봅니다.");
		} else if(pet instanceof Cat) {
			System.out.println("고양이를 돌봅니다.");			
		} else if(pet instanceof GoldFish) {
			System.out.println("금붕어를 돌봅니다.");
		}
	}
}
