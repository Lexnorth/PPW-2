package br.edu.iftm.aulajsf;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class ClasseBean implements Serializable {

	private String hello = "Olá java bean.";
	
	public String getHello() {
		return hello;
	}
	
}
