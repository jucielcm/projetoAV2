package com.example.demo.datahora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class FormataDataHora {
	
	public static Date converteDataHora(String dataHora) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		return sdf.parse(dataHora);
	}
}
