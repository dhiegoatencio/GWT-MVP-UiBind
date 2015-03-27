package com.agenda.client;

import com.agenda.client.presenters.PersonPresenter.Display;
import com.agenda.client.presenters.PersonPresenter;
import com.agenda.client.presenters.Presenter;
import com.agenda.client.views.PersonView;
import com.agenda.shared.Person;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;


public class Agenda implements EntryPoint {

	public void onModuleLoad() {
		Person me = new Person();
		me.setFirstName("Dhiego");
		me.setLastname("Atencio Hendrix");
		
		Display view = new PersonView();
		Presenter presenter = new PersonPresenter(me, view);
		presenter.go(RootPanel.get());
	}
}
