/*
* City.java
* Models a city
*/

package model;

public class City {
    String nome;
    float latitude;
    float longitude;
    // Constructs a randomly placed city
    public City(){
        this.latitude = (int)(Math.random()*200);
        this.longitude = (int)(Math.random()*200);
    }
    
    // Constructs a city at chosen x, y location
    public City(String name, float x, float y){
        this.nome = name;
        this.latitude = x;
        this.longitude = y;
    }
   public String getNome() {
        return nome;
    }

    //Get city's name
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // Gets city's x coordinate
    public float getLatitude(){
        return this.latitude;
    }
    
    // Gets city's y coordinate
    public float getLongitude(){
        return this.latitude;
    } 
    // Gets the distance to given city
    public double distanceTo(City city){
        float xDistance = Math.abs(getLongitude() - city.getLongitude());
        float yDistance = Math.abs(getLatitude() - city.getLongitude());
        double distance = Math.sqrt( (xDistance*xDistance) + (yDistance*yDistance) );
        return distance;
    }
    
    @Override
    public String toString(){
        return getNome()+": "+ Float.toString(getLongitude()) + ", " + Float.toString(getLatitude());
    }
}