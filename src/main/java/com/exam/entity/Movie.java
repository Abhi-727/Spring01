package com.exam.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@RequiredArgsConstructor
@NoArgsConstructor
@Table(name = "MOVIE_REPO")
public class Movie implements Serializable {
	
	// Din't use this property any where
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "MID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer mid;
	@NonNull
	@Column(name = "NAME", length = 20)
	private String mname;
	@NonNull
	@Column(name = "YEAR", length = 20)
	private String year;
	@NonNull
	@Column(name ="RATING")
	private Float rating;
	
	
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Float getRating() {
		return rating;
	}
	public void setRating(Float rating) {
		this.rating = rating;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
