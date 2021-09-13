package com.example.ui_takeloan.domain;

import com.example.ui_takeloan.form.CustomerForm;
import com.example.ui_takeloan.service.CustomerService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;


@Route
public class MainView extends VerticalLayout {
    private CustomerService customerService = CustomerService.getInstance();
    private Grid<Customer> grid = new Grid<>(Customer.class);
    private TextField filter = new TextField();
    private CustomerForm form = new CustomerForm(this);


    public MainView(){
        filter.setPlaceholder("Filter by name");
        filter.setClearButtonVisible(true);
        filter.setValueChangeMode(ValueChangeMode.EAGER);
        filter.addValueChangeListener(e -> update());

//        grid.setColumns("name", "surname", "phoneNumber", "addressStreet", "addressNumber", "addressPostCode", "addressCity", "peselNumber", "nipNumber", "idType", "idNumber", "mailAddress",  "registrationDate", "closedDate");
        grid.setColumns("name", "surname",  "peselNumber", "idType");
        HorizontalLayout mainContent = new HorizontalLayout(grid, form);
        mainContent.setSizeFull();
        grid.setSizeFull();
//        add(grid);

//        add(filter, grid);
        add(filter, mainContent);
        setSizeFull();
        refresh();

    }

    public void  refresh() {
        grid.setItems(customerService.getCustomers());
    }

    public void update(){
        grid.setItems(customerService.findByName(filter.getValue()));
    }
}
