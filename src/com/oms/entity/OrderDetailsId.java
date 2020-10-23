package com.oms.entity;
// Generated 23 Oct, 2020 10:00:41 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * OrderDetailsId generated by hbm2java
 */
@Embeddable
public class OrderDetailsId implements java.io.Serializable {

	private Integer orderId;
	private Integer itemId;
	private int quantity;
	private float subtotal;

	public OrderDetailsId() {
	}

	public OrderDetailsId(int quantity, float subtotal) {
		this.quantity = quantity;
		this.subtotal = subtotal;
	}

	public OrderDetailsId(Integer orderId, Integer itemId, int quantity, float subtotal) {
		this.orderId = orderId;
		this.itemId = itemId;
		this.quantity = quantity;
		this.subtotal = subtotal;
	}

	@Column(name = "order_id")
	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	@Column(name = "item_id")
	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	@Column(name = "quantity", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Column(name = "subtotal", nullable = false, precision = 12, scale = 0)
	public float getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OrderDetailsId))
			return false;
		OrderDetailsId castOther = (OrderDetailsId) other;

		return ((this.getOrderId() == castOther.getOrderId()) || (this.getOrderId() != null
				&& castOther.getOrderId() != null && this.getOrderId().equals(castOther.getOrderId())))
				&& ((this.getItemId() == castOther.getItemId()) || (this.getItemId() != null
						&& castOther.getItemId() != null && this.getItemId().equals(castOther.getItemId())))
				&& (this.getQuantity() == castOther.getQuantity()) && (this.getSubtotal() == castOther.getSubtotal());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getOrderId() == null ? 0 : this.getOrderId().hashCode());
		result = 37 * result + (getItemId() == null ? 0 : this.getItemId().hashCode());
		result = 37 * result + this.getQuantity();
		result = 37 * result + (int) this.getSubtotal();
		return result;
	}

}
