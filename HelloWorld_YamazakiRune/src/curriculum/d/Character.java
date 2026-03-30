package curriculum.d;

class Character {
	String name;
	int hp;
	int at;
	int sp;
	
	public Character(String name, int hp, int at, int sp) {
		this.name = name;
		this.hp = hp;
		this.at = at;
		this.sp = sp;
	}
	public int getHp() {
	    return hp;
	}

	public int getAt() {
	    return at;
	}

	public int getSp() {
	    return sp;
	}

	public String getName() {
	    return name;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
}
	