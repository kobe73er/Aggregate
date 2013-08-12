package InjectionProvider;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import Interfaces.Man;

public class injectionProvider {
	@Inject
	@Named("English")
	Man man;

	public Man getMan() {
		return man;
	}
	/*
	 * @Inject
	 * 
	 * @Named("English") Man man;
	 * 
	 * public Man getMan(){ return man; }
	 * 
	 * @Inject
	 * 
	 * @Named("English") Man man;
	 * 
	 * public Man getMan(){ return man; }
	 */
}
