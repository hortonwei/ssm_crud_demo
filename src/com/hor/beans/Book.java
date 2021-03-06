package com.hor.beans;

public class Book {
	
    @Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + ", sales=" + sales
				+ ", stock=" + stock + ", imgPath=" + imgPath + "]";
	}

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_books.id
     *
     * @mbggenerated Fri Mar 13 00:29:27 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_books.title
     *
     * @mbggenerated Fri Mar 13 00:29:27 CST 2020
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_books.author
     *
     * @mbggenerated Fri Mar 13 00:29:27 CST 2020
     */
    private String author;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_books.price
     *
     * @mbggenerated Fri Mar 13 00:29:27 CST 2020
     */
    private Double price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_books.sales
     *
     * @mbggenerated Fri Mar 13 00:29:27 CST 2020
     */
    private Integer sales;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_books.stock
     *
     * @mbggenerated Fri Mar 13 00:29:27 CST 2020
     */
    private Integer stock;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_books.img_path
     *
     * @mbggenerated Fri Mar 13 00:29:27 CST 2020
     */
    private String imgPath;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_books.id
     *
     * @return the value of bs_books.id
     *
     * @mbggenerated Fri Mar 13 00:29:27 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_books.id
     *
     * @param id the value for bs_books.id
     *
     * @mbggenerated Fri Mar 13 00:29:27 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_books.title
     *
     * @return the value of bs_books.title
     *
     * @mbggenerated Fri Mar 13 00:29:27 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_books.title
     *
     * @param title the value for bs_books.title
     *
     * @mbggenerated Fri Mar 13 00:29:27 CST 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_books.author
     *
     * @return the value of bs_books.author
     *
     * @mbggenerated Fri Mar 13 00:29:27 CST 2020
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_books.author
     *
     * @param author the value for bs_books.author
     *
     * @mbggenerated Fri Mar 13 00:29:27 CST 2020
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_books.price
     *
     * @return the value of bs_books.price
     *
     * @mbggenerated Fri Mar 13 00:29:27 CST 2020
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_books.price
     *
     * @param price the value for bs_books.price
     *
     * @mbggenerated Fri Mar 13 00:29:27 CST 2020
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_books.sales
     *
     * @return the value of bs_books.sales
     *
     * @mbggenerated Fri Mar 13 00:29:27 CST 2020
     */
    public Integer getSales() {
        return sales;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_books.sales
     *
     * @param sales the value for bs_books.sales
     *
     * @mbggenerated Fri Mar 13 00:29:27 CST 2020
     */
    public void setSales(Integer sales) {
        this.sales = sales;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_books.stock
     *
     * @return the value of bs_books.stock
     *
     * @mbggenerated Fri Mar 13 00:29:27 CST 2020
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_books.stock
     *
     * @param stock the value for bs_books.stock
     *
     * @mbggenerated Fri Mar 13 00:29:27 CST 2020
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_books.img_path
     *
     * @return the value of bs_books.img_path
     *
     * @mbggenerated Fri Mar 13 00:29:27 CST 2020
     */
    public String getImgPath() {
        return imgPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_books.img_path
     *
     * @param imgPath the value for bs_books.img_path
     *
     * @mbggenerated Fri Mar 13 00:29:27 CST 2020
     */
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath == null ? null : imgPath.trim();
    }
}