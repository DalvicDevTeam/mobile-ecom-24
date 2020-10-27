package com.example.shopeIt.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Item implements Parcelable {
    private String title;
    private String publisher;
    private String description;
    private String item_id;
    private String image_url;
    private String brand;


    public Item(String title, String publisher, String description, String item_id, String image_url, String brand) {
        this.title = title;
        this.publisher = publisher;
        this.description = description;
        this.item_id = item_id;
        this.image_url = image_url;
        this.brand = brand;
    }

    public Item() {
    }

    protected Item(Parcel in) {
        title = in.readString();
        publisher = in.readString();
        description = in.readString();
        item_id = in.readString();
        image_url = in.readString();
        brand = in.readString();
    }

    public static final Creator<Item> CREATOR = new Creator<Item>() {
        @Override
        public Item createFromParcel(Parcel in) {
            return new Item(in);
        }

        @Override
        public Item[] newArray(int size) {
            return new Item[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", description='" + description + '\'' +
                ", item_id='" + item_id + '\'' +
                ", image_url='" + image_url + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(publisher);
        dest.writeString(description);
        dest.writeString(item_id);
        dest.writeString(image_url);
        dest.writeString(brand);
    }
}
