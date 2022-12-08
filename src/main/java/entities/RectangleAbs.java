package entities;

import entities.enums.Color;

public class RectangleAbs extends Shape {
	//Atributos
	private Double width;     //Largura = base
    private Double height;
    
    //Construtores
    public RectangleAbs() {
    	super();    //Construtor de Shape define cor
    }
    
	public RectangleAbs(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
    
	//Getters and setters
	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}	
		
	//Outros métodos
	@Override 
	public double area(){
        return width * height ;
	}
    

}

