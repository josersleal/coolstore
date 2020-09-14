package com.workshops_diy.coolstore;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class ShoppingCart implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "SHOPPINGCART_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "SHOPPINGCART_ID_GENERATOR", sequenceName = "SHOPPINGCART_ID_SEQ")
	private java.lang.Long id;

	@org.kie.api.definition.type.Label(value = "Shopping Cart Item Promo Savings")
	private java.lang.Double cartItemPromoSavings;

	@org.kie.api.definition.type.Label(value = "Shopping Cart Item Total")
	private java.lang.Double cartItemTotal;

	@org.kie.api.definition.type.Label(value = "Shopping Cart Total")
	private java.lang.Double cartTotal;

	@org.kie.api.definition.type.Label(value = "Shopping Promotional Savings")
	private java.lang.Double shoppingPromoSavings;

	@org.kie.api.definition.type.Label(value = "Shipping Total")
	private java.lang.Double shippingTotal;

	public ShoppingCart() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.Double getCartItemPromoSavings() {
		return this.cartItemPromoSavings;
	}

	public void setCartItemPromoSavings(java.lang.Double cartItemPromoSavings) {
		this.cartItemPromoSavings = cartItemPromoSavings;
	}

	public java.lang.Double getCartItemTotal() {
		return this.cartItemTotal;
	}

	public void setCartItemTotal(java.lang.Double cartItemTotal) {
		this.cartItemTotal = cartItemTotal;
	}

	public java.lang.Double getCartTotal() {
		return this.cartTotal;
	}

	public void setCartTotal(java.lang.Double cartTotal) {
		this.cartTotal = cartTotal;
	}

	public java.lang.Double getShoppingPromoSavings() {
		return this.shoppingPromoSavings;
	}

	public void setShoppingPromoSavings(java.lang.Double shoppingPromoSavings) {
		this.shoppingPromoSavings = shoppingPromoSavings;
	}

	public java.lang.Double getShippingTotal() {
		return this.shippingTotal;
	}

	public void setShippingTotal(java.lang.Double shippingTotal) {
		this.shippingTotal = shippingTotal;
	}

	public ShoppingCart(java.lang.Long id,
			java.lang.Double cartItemPromoSavings,
			java.lang.Double cartItemTotal, java.lang.Double cartTotal,
			java.lang.Double shoppingPromoSavings,
			java.lang.Double shippingTotal) {
		this.id = id;
		this.cartItemPromoSavings = cartItemPromoSavings;
		this.cartItemTotal = cartItemTotal;
		this.cartTotal = cartTotal;
		this.shoppingPromoSavings = shoppingPromoSavings;
		this.shippingTotal = shippingTotal;
	}

}