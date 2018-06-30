package br.com.lambadadigital.osantosodia.api.entities;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="saints")
public class Saint implements Serializable {

	private static final long serialVersionUID = 4347033860578763760L;
	
	private Long id;
	private String name;
	private String nickname;
	private Date birthday;
	@Type(type="text")
	private String history;
	private String image;
	private String altImage;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getNickname() {
		return nickname;
	}
	public Date getBirthday() {
		return birthday;
	}
	public String getHistory() {
		return history;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAltImage() {
		return altImage;
	}
	public void setAltImage(String altImage) {
		this.altImage = altImage;
	}
	@Override
	public String toString() {
		return "Saint [id=" + id + ", name=" + name + ", nickname=" + nickname + ", birthday=" + birthday + ", history="
				+ history + ", image=" + image + ", altImage=" + altImage + "]";
	}
}
