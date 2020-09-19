package Television;
/** 
*The purpose of this class is to model a television
*Your name and today’s date
*/

public class Television {
final private String MANUFACTURER; //This holds the name of the TV manufacturer
final private int SCREEN_SIZE; //This represents the size of the TV
private boolean powerOn; //This helps in testing to see if the user wants the TV on
private int channel, volume; //This controls the channel and volume


//The point of this method is to initialize all the fields that were declared
public Television(String companyName, int tv_size) {
	MANUFACTURER = companyName;
	SCREEN_SIZE = tv_size;
	powerOn = false;
	channel = 2;
	volume = 20;
}

public int getChannel() {   //Gets the desired Channel	
	return channel;
}

public int getVolume() { //Gets the desired volume
	return volume;
}

public String getManufacturer() {  //gets the manufacturer's name
	return MANUFACTURER;
}

public int getScreenSize() {   //gets the Screen Size
	return SCREEN_SIZE;
}
public void setChannel(int number) {   //Sets the channel number
	channel = number;
}

public void power() {  //sets powerOn to either false or true
powerOn=!powerOn;
}

public void increaseVolume() {  //Increases the volume by 1
	volume += 1;
}

public void decreaseVolume() { //Decreases the volume by 1
	volume -= 1;
}


}
