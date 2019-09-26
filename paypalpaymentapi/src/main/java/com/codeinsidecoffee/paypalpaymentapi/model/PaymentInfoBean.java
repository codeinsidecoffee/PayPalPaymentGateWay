
package com.codeinsidecoffee.paypalpaymentapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


@SuppressWarnings("unused")
public class PaymentInfoBean {

    @Expose
    private String cart;
    @SerializedName("create_time")
    private String createTime;
    @Expose
    private String id;
    @Expose
    private String intent;
    @Expose
    private List<Link> links;
    @Expose
    private Payer payer;
    @Expose
    private String state;
    @Expose
    private List<Transaction> transactions;
    @SerializedName("update_time")
    private String updateTime;

    public String getCart() {
        return cart;
    }

    public void setCart(String cart) {
        this.cart = cart;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public Payer getPayer() {
        return payer;
    }

    public void setPayer(Payer payer) {
        this.payer = payer;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @SuppressWarnings("unused")
    public static class Details {

        @SerializedName("handling_fee")
        private String handlingFee;
        @Expose
        private String insurance;
        @Expose
        private String shipping;
        @SerializedName("shipping_discount")
        private String shippingDiscount;
        @Expose
        private String subtotal;

        public String getHandlingFee() {
            return handlingFee;
        }

        public void setHandlingFee(String handlingFee) {
            this.handlingFee = handlingFee;
        }

        public String getInsurance() {
            return insurance;
        }

        public void setInsurance(String insurance) {
            this.insurance = insurance;
        }

        public String getShipping() {
            return shipping;
        }

        public void setShipping(String shipping) {
            this.shipping = shipping;
        }

        public String getShippingDiscount() {
            return shippingDiscount;
        }

        public void setShippingDiscount(String shippingDiscount) {
            this.shippingDiscount = shippingDiscount;
        }

        public String getSubtotal() {
            return subtotal;
        }

        public void setSubtotal(String subtotal) {
            this.subtotal = subtotal;
        }

        @Override
        public String toString() {
            return "Details{" +
                    "handlingFee='" + handlingFee + '\'' +
                    ", insurance='" + insurance + '\'' +
                    ", shipping='" + shipping + '\'' +
                    ", shippingDiscount='" + shippingDiscount + '\'' +
                    ", subtotal='" + subtotal + '\'' +
                    '}';
        }
    }

    @SuppressWarnings("unused")
    public static class ItemList {

        @SerializedName("shipping_address")
        private ShippingAddress shippingAddress;

        public ShippingAddress getShippingAddress() {
            return shippingAddress;
        }

        public void setShippingAddress(ShippingAddress shippingAddress) {
            this.shippingAddress = shippingAddress;
        }

        @Override
        public String toString() {
            return "ItemList{" +
                    "shippingAddress=" + shippingAddress +
                    '}';
        }
    }

    @SuppressWarnings("unused")
    public static class Payee {

        @Expose
        private String email;
        @SerializedName("merchant_id")
        private String merchantId;

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getMerchantId() {
            return merchantId;
        }

        public void setMerchantId(String merchantId) {
            this.merchantId = merchantId;
        }

        @Override
        public String toString() {
            return "Payee{" +
                    "email='" + email + '\'' +
                    ", merchantId='" + merchantId + '\'' +
                    '}';
        }
    }

    @SuppressWarnings("unused")
    public static class Transaction {

        @Expose
        private Amount amount;
        @Expose
        private String description;
        @SerializedName("item_list")
        private ItemList itemList;
        @Expose
        private Payee payee;
        @SerializedName("related_resources")
        private List<RelatedResource> relatedResources;
        @SerializedName("soft_descriptor")
        private String softDescriptor;

        public Amount getAmount() {
            return amount;
        }

        public void setAmount(Amount amount) {
            this.amount = amount;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public ItemList getItemList() {
            return itemList;
        }

        public void setItemList(ItemList itemList) {
            this.itemList = itemList;
        }

        public Payee getPayee() {
            return payee;
        }

        public void setPayee(Payee payee) {
            this.payee = payee;
        }

        public List<RelatedResource> getRelatedResources() {
            return relatedResources;
        }

        public void setRelatedResources(List<RelatedResource> relatedResources) {
            this.relatedResources = relatedResources;
        }

        public String getSoftDescriptor() {
            return softDescriptor;
        }

        public void setSoftDescriptor(String softDescriptor) {
            this.softDescriptor = softDescriptor;
        }

        @Override
        public String toString() {
            return "Transaction{" +
                    "amount=" + amount +
                    ", description='" + description + '\'' +
                    ", itemList=" + itemList +
                    ", payee=" + payee +
                    ", relatedResources=" + relatedResources +
                    ", softDescriptor='" + softDescriptor + '\'' +
                    '}';
        }
    }

    @SuppressWarnings("unused")
    public static class Amount {

        @Expose
        private String currency;
        @Expose
        private Details details;
        @Expose
        private String total;

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public Details getDetails() {
            return details;
        }

        public void setDetails(Details details) {
            this.details = details;
        }

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        @Override
        public String toString() {
            return "Amount{" +
                    "currency='" + currency + '\'' +
                    ", details=" + details +
                    ", total='" + total + '\'' +
                    '}';
        }
    }

    @SuppressWarnings("unused")
    public static class Link {

        @Expose
        private String href;
        @Expose
        private String method;
        @Expose
        private String rel;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

        public String getMethod() {
            return method;
        }

        public void setMethod(String method) {
            this.method = method;
        }

        public String getRel() {
            return rel;
        }

        public void setRel(String rel) {
            this.rel = rel;
        }

        @Override
        public String toString() {
            return "Link{" +
                    "href='" + href + '\'' +
                    ", method='" + method + '\'' +
                    ", rel='" + rel + '\'' +
                    '}';
        }
    }

    @SuppressWarnings("unused")
    public static class TransactionFee {

        @Expose
        private String currency;
        @Expose
        private String value;

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "TransactionFee{" +
                    "currency='" + currency + '\'' +
                    ", value='" + value + '\'' +
                    '}';
        }
    }

    @SuppressWarnings("unused")
    public static class PayerInfo {

        @SerializedName("country_code")
        private String countryCode;
        @Expose
        private String email;
        @SerializedName("first_name")
        private String firstName;
        @SerializedName("last_name")
        private String lastName;
        @SerializedName("payer_id")
        private String payerId;
        @Expose
        private String phone;
        @SerializedName("shipping_address")
        private ShippingAddress shippingAddress;

        public String getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getPayerId() {
            return payerId;
        }

        public void setPayerId(String payerId) {
            this.payerId = payerId;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public ShippingAddress getShippingAddress() {
            return shippingAddress;
        }

        public void setShippingAddress(ShippingAddress shippingAddress) {
            this.shippingAddress = shippingAddress;
        }

        @Override
        public String toString() {
            return "PayerInfo{" +
                    "countryCode='" + countryCode + '\'' +
                    ", email='" + email + '\'' +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", payerId='" + payerId + '\'' +
                    ", phone='" + phone + '\'' +
                    ", shippingAddress=" + shippingAddress +
                    '}';
        }
    }

    @SuppressWarnings("unused")
    public static class ShippingAddress {

        @SerializedName("recipient_name")
        private String recipientName;

        public String getRecipientName() {
            return recipientName;
        }

        public void setRecipientName(String recipientName) {
            this.recipientName = recipientName;
        }

        @Override
        public String toString() {
            return "ShippingAddress{" +
                    "recipientName='" + recipientName + '\'' +
                    '}';
        }
    }

    @SuppressWarnings("unused")
    public static class Sale {

        @Expose
        private Amount amount;
        @SerializedName("create_time")
        private String createTime;
        @Expose
        private String id;
        @Expose
        private List<Link> links;
        @SerializedName("parent_payment")
        private String parentPayment;
        @SerializedName("payment_mode")
        private String paymentMode;
        @SerializedName("protection_eligibility")
        private String protectionEligibility;
        @SerializedName("protection_eligibility_type")
        private String protectionEligibilityType;
        @SerializedName("soft_descriptor")
        private String softDescriptor;
        @Expose
        private String state;
        @SerializedName("transaction_fee")
        private TransactionFee transactionFee;
        @SerializedName("update_time")
        private String updateTime;

        public Amount getAmount() {
            return amount;
        }

        public void setAmount(Amount amount) {
            this.amount = amount;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<Link> getLinks() {
            return links;
        }

        public void setLinks(List<Link> links) {
            this.links = links;
        }

        public String getParentPayment() {
            return parentPayment;
        }

        public void setParentPayment(String parentPayment) {
            this.parentPayment = parentPayment;
        }

        public String getPaymentMode() {
            return paymentMode;
        }

        public void setPaymentMode(String paymentMode) {
            this.paymentMode = paymentMode;
        }

        public String getProtectionEligibility() {
            return protectionEligibility;
        }

        public void setProtectionEligibility(String protectionEligibility) {
            this.protectionEligibility = protectionEligibility;
        }

        public String getProtectionEligibilityType() {
            return protectionEligibilityType;
        }

        public void setProtectionEligibilityType(String protectionEligibilityType) {
            this.protectionEligibilityType = protectionEligibilityType;
        }

        public String getSoftDescriptor() {
            return softDescriptor;
        }

        public void setSoftDescriptor(String softDescriptor) {
            this.softDescriptor = softDescriptor;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public TransactionFee getTransactionFee() {
            return transactionFee;
        }

        public void setTransactionFee(TransactionFee transactionFee) {
            this.transactionFee = transactionFee;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        @Override
        public String toString() {
            return "Sale{" +
                    "amount=" + amount +
                    ", createTime='" + createTime + '\'' +
                    ", id='" + id + '\'' +
                    ", links=" + links +
                    ", parentPayment='" + parentPayment + '\'' +
                    ", paymentMode='" + paymentMode + '\'' +
                    ", protectionEligibility='" + protectionEligibility + '\'' +
                    ", protectionEligibilityType='" + protectionEligibilityType + '\'' +
                    ", softDescriptor='" + softDescriptor + '\'' +
                    ", state='" + state + '\'' +
                    ", transactionFee=" + transactionFee +
                    ", updateTime='" + updateTime + '\'' +
                    '}';
        }
    }

    @SuppressWarnings("unused")
    public static class RelatedResource {

        @Expose
        private Sale sale;

        public Sale getSale() {
            return sale;
        }

        public void setSale(Sale sale) {
            this.sale = sale;
        }

        @Override
        public String toString() {
            return "RelatedResource{" +
                    "sale=" + sale +
                    '}';
        }
    }

    @SuppressWarnings("unused")
    public static class Payer {

        @SerializedName("payer_info")
        private PayerInfo payerInfo;
        @SerializedName("payment_method")
        private String paymentMethod;
        @Expose
        private String status;

        public PayerInfo getPayerInfo() {
            return payerInfo;
        }

        public void setPayerInfo(PayerInfo payerInfo) {
            this.payerInfo = payerInfo;
        }

        public String getPaymentMethod() {
            return paymentMethod;
        }

        public void setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "Payer{" +
                    "payerInfo=" + payerInfo +
                    ", paymentMethod='" + paymentMethod + '\'' +
                    ", status='" + status + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "PaymentInfoBean{" +
                "cart='" + cart + '\'' +
                ", createTime='" + createTime + '\'' +
                ", id='" + id + '\'' +
                ", intent='" + intent + '\'' +
                ", links=" + links +
                ", payer=" + payer +
                ", state='" + state + '\'' +
                ", transactions=" + transactions +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
