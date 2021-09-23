package main;

public enum PlanetEnum {
	
	Earth(1),
	Jupiter(1.2),
	Mercury(1.3),
	Moon(1.4),
	Neptun(1.5),
	Venus(1.6);
	
public final double value;
	
	private PlanetEnum(double value) {
        this.value = value;
    }

}
