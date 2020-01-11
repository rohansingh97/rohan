package com.rakuten.prj.entity;

/**
 * 
 * @author rohan
 *
 */

public class Product implements Comparable<Product> {
	/**
	 * 
	 */
	private int id;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private double price;
	/**
	 * 
	 */
	private String category;

	/**
	 * 
	 */
	public Product() {
		/**
		 * 
		 */

	}

	/**
	 * 
	 * @param id
	 * @param name
	 * @param price
	 * @param category
	 */
	public Product(int id, String name, double price, String category) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}

	/**
	 * 
	 * @return
	 */

	public int getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 */

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return
	 */

	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return
	 */

	public double getPrice() {
		return price;
	}

	/**
	 * 
	 * @param price
	 */

	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * 
	 * @return
	 */

	public String getCategory() {
		return category;
	}

	/**
	 * 
	 * @param category
	 */

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public int compareTo(Product o) {
		return this.id - o.id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
