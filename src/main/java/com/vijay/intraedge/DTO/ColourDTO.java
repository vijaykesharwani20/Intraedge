package com.vijay.intraedge.DTO;

import java.util.ArrayList;
import java.util.List;

public class ColourDTO {

	private String colorName;
	private String colorRGBCode;
	public String getColorName() {
		return colorName;
	}
	public void setColorName(String colorName) {
		this.colorName = colorName;
	}
	public String getColorRGBCode() {
		return colorRGBCode;
	}
	public void setColorRGBCode(String colorRGBCode) {
		this.colorRGBCode = colorRGBCode;
	}
	public static List<ColourDTO> getListOfColours(){
		ColourDTO c1 = new ColourDTO();
		c1.setColorName("Red"); c1.setColorRGBCode("#FF0000");
		ColourDTO c2 = new ColourDTO();
		c2.setColorName("Lime"); c2.setColorRGBCode("#00FF00");
		ColourDTO c3 = new ColourDTO();
		c3.setColorName("Blue"); c3.setColorRGBCode("#0000FF");
		List<ColourDTO> list = new ArrayList<>();
		list.add(c1); list.add(c2); list.add(c3);
		return list;
	}
	
}
