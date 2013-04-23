// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Type defining the <b>VATRateType</b> container, which is used by
 * <b>ReviseSellingManagerSaleRecord</b> to modify the VAT percentage for an
 * order line item. This container is also retrieved by
 * <b>GetSellingManagerSaleRecord</b> if Value-Added Tax has been applied to
 * the order line item.
 * 
 */
public class VATRateType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ItemID")
	@Order(value=0)
	public String itemID;	
	
	@Element(name = "TransactionID")
	@Order(value=1)
	public String transactionID;	
	
	@Element(name = "VATPercent")
	@Order(value=2)
	public Float vatPercent;	
	
	@Element(name = "OrderLineItemID")
	@Order(value=3)
	public String orderLineItemID;	
	
	@AnyElement
	@Order(value=4)
	public List<Object> any;	
	
    
}