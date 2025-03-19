package com.gft.interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AppLoginPage {

	public static final Target LIST_DOCUMENT_TYPE = Target.the("lista tipo de documento").locatedBy("//*[@class='select-text']");
	public static final Target CONTAINER_PASSWORD = Target.the("botones password").locatedBy("(//*[@class='fieldRow group'])[4]");
//	public static final Target BTN_PASSWORD = Target.the("botones password").locatedBy("//*[@name='{0}']");
	public static final Target BTN_ACCEPT = Target.the("botón aceptar password").locatedBy("name:accept");

	public AppLoginPage() {
		super();
	}

}
