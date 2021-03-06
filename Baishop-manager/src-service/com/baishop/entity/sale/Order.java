package com.baishop.entity.sale;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Order implements Serializable {
	
	private static final long serialVersionUID = -8980739778988226992L;

	/**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.order_id
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private Long orderId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.order_sn
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private String orderSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.user_id
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private Long userId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.order_status
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private Byte orderStatus;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.shipping_status
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private Byte shippingStatus;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.pay_status
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private Byte payStatus;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.consignee
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private String consignee;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.email
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private String email;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.country
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private Integer country;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.province
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private Integer province;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.city
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private Integer city;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.district
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private Integer district;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.address
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private String address;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.zipcode
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private String zipcode;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.mobile
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private String mobile;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.telephone
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private String telephone;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.best_time
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private Date bestTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.pay_id
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private Integer payId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.pay_name
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private String payName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.shipping_time
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private Byte shippingTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.how_oos
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private Byte howOos;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.inv_type
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private Byte invType;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.inv_payee
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private String invPayee;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.inv_content
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private String invContent;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.inv_tax
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private BigDecimal invTax;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.goods_amount
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private BigDecimal goodsAmount;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.shipping_fee
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private BigDecimal shippingFee;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.insure_fee
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private BigDecimal insureFee;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.integral_money
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private BigDecimal integralMoney;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.discount_money
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private BigDecimal discountMoney;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.order_amount
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private BigDecimal orderAmount;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.create_time
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private Date createTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.confirm_time
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private Date confirmTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.pay_time
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private Date payTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.invoice_number
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private String invoiceNumber;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.buyer_note
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private String buyerNote;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.seller_note
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private String sellerNote;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_order.is_delete
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    private Byte isDelete;
    
    /**
     * 订单商品列表
     */
    private List<OrderGoods> orderGoods;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.order_id
     *
     * @return the value of bai_order.order_id
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.order_id
     *
     * @param orderId the value for bai_order.order_id
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.order_sn
     *
     * @return the value of bai_order.order_sn
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.order_sn
     *
     * @param orderSn the value for bai_order.order_sn
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.user_id
     *
     * @return the value of bai_order.user_id
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.user_id
     *
     * @param userId the value for bai_order.user_id
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.order_status
     *
     * @return the value of bai_order.order_status
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public Byte getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.order_status
     *
     * @param orderStatus the value for bai_order.order_status
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.shipping_status
     *
     * @return the value of bai_order.shipping_status
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public Byte getShippingStatus() {
        return shippingStatus;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.shipping_status
     *
     * @param shippingStatus the value for bai_order.shipping_status
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setShippingStatus(Byte shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.pay_status
     *
     * @return the value of bai_order.pay_status
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public Byte getPayStatus() {
        return payStatus;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.pay_status
     *
     * @param payStatus the value for bai_order.pay_status
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setPayStatus(Byte payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.consignee
     *
     * @return the value of bai_order.consignee
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.consignee
     *
     * @param consignee the value for bai_order.consignee
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.email
     *
     * @return the value of bai_order.email
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.email
     *
     * @param email the value for bai_order.email
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.country
     *
     * @return the value of bai_order.country
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public Integer getCountry() {
        return country;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.country
     *
     * @param country the value for bai_order.country
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setCountry(Integer country) {
        this.country = country;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.province
     *
     * @return the value of bai_order.province
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public Integer getProvince() {
        return province;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.province
     *
     * @param province the value for bai_order.province
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setProvince(Integer province) {
        this.province = province;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.city
     *
     * @return the value of bai_order.city
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public Integer getCity() {
        return city;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.city
     *
     * @param city the value for bai_order.city
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setCity(Integer city) {
        this.city = city;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.district
     *
     * @return the value of bai_order.district
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public Integer getDistrict() {
        return district;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.district
     *
     * @param district the value for bai_order.district
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setDistrict(Integer district) {
        this.district = district;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.address
     *
     * @return the value of bai_order.address
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.address
     *
     * @param address the value for bai_order.address
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.zipcode
     *
     * @return the value of bai_order.zipcode
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.zipcode
     *
     * @param zipcode the value for bai_order.zipcode
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.mobile
     *
     * @return the value of bai_order.mobile
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.mobile
     *
     * @param mobile the value for bai_order.mobile
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.telephone
     *
     * @return the value of bai_order.telephone
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.telephone
     *
     * @param telephone the value for bai_order.telephone
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.best_time
     *
     * @return the value of bai_order.best_time
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public Date getBestTime() {
        return bestTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.best_time
     *
     * @param bestTime the value for bai_order.best_time
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setBestTime(Date bestTime) {
        this.bestTime = bestTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.pay_id
     *
     * @return the value of bai_order.pay_id
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public Integer getPayId() {
        return payId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.pay_id
     *
     * @param payId the value for bai_order.pay_id
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setPayId(Integer payId) {
        this.payId = payId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.pay_name
     *
     * @return the value of bai_order.pay_name
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public String getPayName() {
        return payName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.pay_name
     *
     * @param payName the value for bai_order.pay_name
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setPayName(String payName) {
        this.payName = payName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.shipping_time
     *
     * @return the value of bai_order.shipping_time
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public Byte getShippingTime() {
        return shippingTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.shipping_time
     *
     * @param shippingTime the value for bai_order.shipping_time
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setShippingTime(Byte shippingTime) {
        this.shippingTime = shippingTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.how_oos
     *
     * @return the value of bai_order.how_oos
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public Byte getHowOos() {
        return howOos;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.how_oos
     *
     * @param howOos the value for bai_order.how_oos
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setHowOos(Byte howOos) {
        this.howOos = howOos;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.inv_type
     *
     * @return the value of bai_order.inv_type
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public Byte getInvType() {
        return invType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.inv_type
     *
     * @param invType the value for bai_order.inv_type
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setInvType(Byte invType) {
        this.invType = invType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.inv_payee
     *
     * @return the value of bai_order.inv_payee
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public String getInvPayee() {
        return invPayee;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.inv_payee
     *
     * @param invPayee the value for bai_order.inv_payee
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setInvPayee(String invPayee) {
        this.invPayee = invPayee;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.inv_content
     *
     * @return the value of bai_order.inv_content
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public String getInvContent() {
        return invContent;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.inv_content
     *
     * @param invContent the value for bai_order.inv_content
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setInvContent(String invContent) {
        this.invContent = invContent;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.inv_tax
     *
     * @return the value of bai_order.inv_tax
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public BigDecimal getInvTax() {
        return invTax;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.inv_tax
     *
     * @param invTax the value for bai_order.inv_tax
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setInvTax(BigDecimal invTax) {
        this.invTax = invTax;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.goods_amount
     *
     * @return the value of bai_order.goods_amount
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public BigDecimal getGoodsAmount() {
        return goodsAmount;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.goods_amount
     *
     * @param goodsAmount the value for bai_order.goods_amount
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setGoodsAmount(BigDecimal goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.shipping_fee
     *
     * @return the value of bai_order.shipping_fee
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public BigDecimal getShippingFee() {
        return shippingFee;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.shipping_fee
     *
     * @param shippingFee the value for bai_order.shipping_fee
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.insure_fee
     *
     * @return the value of bai_order.insure_fee
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public BigDecimal getInsureFee() {
        return insureFee;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.insure_fee
     *
     * @param insureFee the value for bai_order.insure_fee
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setInsureFee(BigDecimal insureFee) {
        this.insureFee = insureFee;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.integral_money
     *
     * @return the value of bai_order.integral_money
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public BigDecimal getIntegralMoney() {
        return integralMoney;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.integral_money
     *
     * @param integralMoney the value for bai_order.integral_money
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setIntegralMoney(BigDecimal integralMoney) {
        this.integralMoney = integralMoney;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.discount_money
     *
     * @return the value of bai_order.discount_money
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public BigDecimal getDiscountMoney() {
        return discountMoney;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.discount_money
     *
     * @param discountMoney the value for bai_order.discount_money
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setDiscountMoney(BigDecimal discountMoney) {
        this.discountMoney = discountMoney;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.order_amount
     *
     * @return the value of bai_order.order_amount
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.order_amount
     *
     * @param orderAmount the value for bai_order.order_amount
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.create_time
     *
     * @return the value of bai_order.create_time
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.create_time
     *
     * @param createTime the value for bai_order.create_time
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.confirm_time
     *
     * @return the value of bai_order.confirm_time
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public Date getConfirmTime() {
        return confirmTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.confirm_time
     *
     * @param confirmTime the value for bai_order.confirm_time
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.pay_time
     *
     * @return the value of bai_order.pay_time
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.pay_time
     *
     * @param payTime the value for bai_order.pay_time
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.invoice_number
     *
     * @return the value of bai_order.invoice_number
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.invoice_number
     *
     * @param invoiceNumber the value for bai_order.invoice_number
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.buyer_note
     *
     * @return the value of bai_order.buyer_note
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public String getBuyerNote() {
        return buyerNote;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.buyer_note
     *
     * @param buyerNote the value for bai_order.buyer_note
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setBuyerNote(String buyerNote) {
        this.buyerNote = buyerNote;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.seller_note
     *
     * @return the value of bai_order.seller_note
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public String getSellerNote() {
        return sellerNote;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.seller_note
     *
     * @param sellerNote the value for bai_order.seller_note
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setSellerNote(String sellerNote) {
        this.sellerNote = sellerNote;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_order.is_delete
     *
     * @return the value of bai_order.is_delete
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_order.is_delete
     *
     * @param isDelete the value for bai_order.is_delete
     *
     * @ibatorgenerated Sat Oct 15 15:28:51 CST 2011
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

	public List<OrderGoods> getOrderGoods() {
		return orderGoods;
	}

	public void setOrderGoods(List<OrderGoods> orderGoods) {
		this.orderGoods = orderGoods;
	}
}