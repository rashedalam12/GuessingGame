import java.util.Random; 

public class Jar{
private String itemInJar;
private int maxNumberOfItemInJar;
private int numberOfItemInJar;

public Jar(String itemInJar, int maxNumberOfItemInJar){
  this.itemInJar = itemInJar; 
  this.maxNumberOfItemInJar = maxNumberOfItemInJar;
  fillJar();
}
private void fillJar(){
  Random random = new Random();
  numberOfItemInJar = random.nextInt(maxNumberOfItemInJar - 1 +1)+ 1;
} 

public String getItemInJar(){return itemInJar;}
public int getMaxNumberOfItemInJar(){return maxNumberOfItemInJar;}
public int getNumberOfItemInJar(){return numberOfItemInJar;}


}