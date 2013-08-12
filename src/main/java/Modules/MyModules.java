package Modules;

import Interfaces.Man;
import InterfacesImpl.Chinese;
import InterfacesImpl.English;
import InterfacesImpl.German;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class MyModules extends AbstractModule {

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		bind(Man.class).annotatedWith(Names.named("Chinese")).to(Chinese.class);
		bind(Man.class).annotatedWith(Names.named("English")).to(English.class);
		bind(Man.class).annotatedWith(Names.named("German")).to(German.class);
	}

}
