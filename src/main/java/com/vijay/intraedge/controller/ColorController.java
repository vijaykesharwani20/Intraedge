package com.vijay.intraedge.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.intraedge.DTO.ColourDTO;

@RestController
public class ColorController {

	@GetMapping(path = "/colours", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ColourDTO> getAllColours() {
		return ColourDTO.getListOfColours();
	}
}
