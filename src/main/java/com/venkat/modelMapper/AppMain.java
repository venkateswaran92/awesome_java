package com.venkat.modelMapper;

import org.modelmapper.ModelMapper;

//http://modelmapper.org/getting-started

public class AppMain {

	public static void main(String[] args) {

		ModelMapper modelMapper = new ModelMapper();
		OrderDTO orderDTO = modelMapper.map(new Order(), OrderDTO.class);

		System.out.println(orderDTO);
	}

}
