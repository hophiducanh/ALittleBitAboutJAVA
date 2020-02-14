package com.tellyouiam.problem.getset.object;

/**
 * @author : Ho Anh
 * @since : 09/10/2019, Wed
 **/
public class HorseBonusScheme {
	private Integer id;

	private Horse horse;

	public HorseBonusScheme(){}

	public HorseBonusScheme(Integer id, Horse horse) {
		this.id = id;
		this.horse = horse;
	}

	@Override
	public String toString() {
		return "HorseBonusScheme{" +
			"id=" + id +
			", horse=" + horse +
			'}';
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Horse getHorse() {
		return horse;
	}

	public void setHorse(Horse horse) {
		this.horse = horse;
	}
}
