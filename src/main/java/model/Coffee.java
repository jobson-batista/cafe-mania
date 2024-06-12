package model;

import enums.RoastBean;
import enums.TypesCoffee;

public class Coffee {
	
	private Long id;
	private String name;
	private String description;
	private Double weight;
	private Double price;
	private TypesCoffee type;
	private RoastBean roast;
	
	public Coffee() {
		
	}

	public Coffee(Long id, String name, String description, Double weight, Double price, TypesCoffee type,
			RoastBean roast) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.weight = weight;
		this.price = price;
		this.type = type;
		this.roast = roast;
	}

	public Coffee(String name, String description, Double weight, Double price, TypesCoffee type, RoastBean roast) {
		this.name = name;
		this.description = description;
		this.weight = weight;
		this.price = price;
		this.type = type;
		this.roast = roast;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public TypesCoffee getType() {
		return type;
	}

	public void setType(TypesCoffee type) {
		this.type = type;
	}

	public RoastBean getRoast() {
		return roast;
	}

	public void setRoast(RoastBean roast) {
		this.roast = roast;
	}

	@Override
	public String toString() {
		return "Coffee [id=" + id + ", name=" + name + ", description=" + description + ", weight=" + weight
				+ ", price=" + price + ", type=" + type + ", roast=" + roast + "]";
	}

}
