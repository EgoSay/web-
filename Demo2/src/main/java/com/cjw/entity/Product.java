package com.cjw.entity;



import javax.persistence.*;
import java.sql.Date;

/**
 * @author codeAC
 * @date 2018/5/15 18:18
 */
@Entity
//@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String pid;
    private String pname;
    private Double marketPrice;
    private Double shopPrice;
    private String pimage;
    private Date pdate;
    private Integer isHot;
    private String pdesc;
    private Integer pflag;
    private String cid;

    @Basic
//    @Column(name = "pid")
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    @Basic
//    @Column(name = "pname")
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Basic
//    @Column(name = "market_price")
    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    @Basic
//    @Column(name = "shop_price")
    public Double getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(Double shopPrice) {
        this.shopPrice = shopPrice;
    }

    @Basic
//    @Column(name = "pimage")
    public String getPimage() {
        return pimage;
    }

    public void setPimage(String pimage) {
        this.pimage = pimage;
    }

    @Basic
//    @Column(name = "pdate")
    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }

    @Basic
//    @Column(name = "is_hot")
    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    @Basic
//    @Column(name = "pdesc")
    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc;
    }

    @Basic
//    @Column(name = "pflag")
    public Integer getPflag() {
        return pflag;
    }

    public void setPflag(Integer pflag) {
        this.pflag = pflag;
    }

    @Basic
//    @Column(name = "cid")
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }


}
