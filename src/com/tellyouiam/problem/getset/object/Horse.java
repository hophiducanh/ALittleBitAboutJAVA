package com.tellyouiam.problem.getset.object;

/**
 * @author : Ho Anh
 * @since : 09/10/2019, Wed
 **/
public class Horse {
	private Integer id;

	private Integer code;

	private String avatar;

	private Boolean archive;

	public Horse(){}

	public Horse(Integer id, Integer code, String avatar, Boolean archive) {
		this.id = id;
		this.code = code;
		this.avatar = avatar;
		this.archive = archive;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Boolean getArchive() {
		return archive;
	}

	public void setArchive(Boolean archive) {
		this.archive = archive;
	}

	@Override
	public String toString() {
		return "Horse{" +
			"id=" + id +
			", code=" + code +
			", avatar='" + avatar + '\'' +
			", archive=" + archive +
			'}';
	}
}
