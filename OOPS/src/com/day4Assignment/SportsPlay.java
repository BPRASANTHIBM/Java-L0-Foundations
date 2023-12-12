package com.day4Assignment;

class Sports{
	
	void play() {
		
		System.out.println("Every Sports have to improve Stamina and Energy");
		
	}
}

class football extends Sports{
	

	void play() {
		super.play();
		System.out.println("footBall Can improve your leg strength");
		
	}
}

class Basketball extends football{
	
	void play(){
		super.play();
		System.out.println("BasketBall can improve your Hand power");
	}
}

class Rugby extends Basketball {
	
	void play() {
		super.play();
		System.out.println("Rugby can improve your mental as well as physical strength");
	}
}


public class SportsPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rugby r = new Rugby ();
		
		r.play();
		
		
	}

}
