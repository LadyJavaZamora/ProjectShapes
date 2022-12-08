package entities;

import entities.enums.Color;

public class  CircleAbs extends Shape{
	
	//Atributos
	private Double radius;
    
	//Construtores
	public CircleAbs () {
		super();
	}
	
	public CircleAbs(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}
	
	//Getters and setters
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	//Outros métodos
		@Override 
		public double area(){
	        return Math.PI * radius*radius ;
		}	

}
