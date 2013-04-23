// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * 
 * The offer type of the Best Offer.
 * 
 */
public enum BestOfferTypeCodeType {

    /**
     * 
   * The buyer has made a Best Offer on the item.
   * 
     */
    BUYER_BEST_OFFER("BuyerBestOffer"),
  

    /**
     * 
   * The buyer has made a counter offer against the seller's counter offer.
   * 
     */
    BUYER_COUNTER_OFFER("BuyerCounterOffer"),
  

    /**
     * 
   * The seller has made a counter offer to the buyer's Best Offer.
   * 
     */
    SELLER_COUNTER_OFFER("SellerCounterOffer"),
  

    /**
     * 
   * (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    BestOfferTypeCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static BestOfferTypeCodeType fromValue(String v) {
        if (v != null) {
            for (BestOfferTypeCodeType c: BestOfferTypeCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}