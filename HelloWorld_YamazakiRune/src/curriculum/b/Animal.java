package curriculum.b;

public class Animal {
  private String name;
  private double hight;
  private int speed;
  
  public Animal(String name, double hight, int speed) {
      this.name = name;
      this.hight = hight;
      this.speed = speed;
  }
  public Animal(){
  }
  
  public String getName() {
	  return name;
  }
  public double getHight() {
	  return hight;
  }
  public int getSpeed() {
	  return speed;
  }
  
  public void setName(String name) {
	  this.name = name;
  }
  public void setHight(double hight) {
	  this.hight = hight;
  }
  public void setSpeed(int speed) {
	  this.speed = speed;
  }
 }
