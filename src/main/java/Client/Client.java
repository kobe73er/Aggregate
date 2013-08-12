package Client;

import InjectionProvider.injectionProvider;
import Interfaces.Man;
import Modules.MyModules;

import com.google.inject.Guice;
import com.google.inject.Injector;
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Injector injector = Guice.createInjector(new MyModules());
		injectionProvider injectorprovider=(injectionProvider) injector.getInstance(injectionProvider.class);
		
		injectorprovider.getMan().sayHello();

	}

}
