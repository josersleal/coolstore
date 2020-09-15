package com.workshops_diy.coolstore;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class ShoppingCartItem implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "SHOPPINGCARTITEM_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "SHOPPINGCARTITEM_ID_GENERATOR", sequenceName = "SHOPPINGCARTITEM_ID_SEQ")
	private java.lang.Long id;

	@org.kie.api.definition.type.Label("Item ID")
	private java.lang.String itemId;

	@org.kie.api.definition.type.Label("Name")
	private java.lang.String name;

	@org.kie.api.definition.type.Label("Price")
	private java.lang.Double price;

	@org.kie.api.definition.type.Label("Promotional Savings")
	private Double promoSavings;

	@org.kie.api.definition.type.Label("Quantity")
	private java.lang.Integer quantity;

	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label("Shopping Cart")
	private com.workshops_diy.coolstore.ShoppingCart shoppingCart;

	public ShoppingCartItem() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getItemId() {
		return this.itemId;
	}

	public void setItemId(java.lang.String itemId) {
		this.itemId = itemId;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.Double getPrice() {
		return this.price;
	}

	public void setPrice(java.lang.Double price) {
		this.price = price;
	}

	public java.lang.Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(java.lang.Integer quantity) {
		this.quantity = quantity;
	}

	public com.workshops_diy.coolstore.ShoppingCart getShoppingCart() {
		return this.shoppingCart;
	}

	public void setShoppingCart(
			com.workshops_diy.coolstore.ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	public java.lang.Double getPromoSavings() {
		return this.promoSavings;
	}

	public void setPromoSavings(java.lang.Double promoSavings) {
		this.promoSavings = promoSavings;
	}

	public ShoppingCartItem(java.lang.Long id, java.lang.String itemId,
			java.lang.String name, java.lang.Double price,
			java.lang.Double promoSavings, java.lang.Integer quantity,
			com.workshops_diy.coolstore.ShoppingCart shoppingCart) {
		this.id = id;
		this.itemId = itemId;
		this.name = name;
		this.price = price;
		this.promoSavings = promoSavings;
		this.quantity = quantity;
		this.shoppingCart = shoppingCart;
	}

}