package com.idangdev.catalog.dto;

import java.io.Serializable;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UserDetailResponseDTO implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = -1183561122237645361L;

	private String username;
	
}
