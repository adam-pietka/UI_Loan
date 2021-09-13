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
    private Button addNewCustomer = new Button("Add new customer");


    public MainView(){
        filter.setPlaceholder("Filter by name");
        filter.setClearButtonVisible(true);
        filter.setValueChangeMode(ValueChangeMode.EAGER);
        filter.addValueChangeListener(e -> update());
        grid.setColumns("name", "surname",  "peselNumber", "idType");

        addNewCustomer.addClickListener(e-> {
            grid.asSingleSelect().clear();
            form.setCustomer(new Customer());
        });
        HorizontalLayout toolbar = new HorizontalLayout(filter, addNewCustomer);

//        grid.setColumns("name", "surname", "phoneNumber", "addressStreet", "addressNumber", "addressPostCode", "addressCity", "peselNumber", "nipNumber", "idType", "idNumber", "mailAddress",  "registrationDate", "closedDate");
        HorizontalLayout mainContent = new HorizontalLayout(grid, form);
        mainContent.setSizeFull();
        grid.setSizeFull();
        add(toolbar, mainContent);
        form.setCustomer(null);
        setSizeFull();
        refresh();
        grid.asSingleSelect().addValueChangeListener(event -> form.setCustomer(grid.asSingleSelect().getValue()));
    }

    public void  refresh() {
        grid.setItems(customerService.getCustomers());
    }

    public void update(){
        grid.setItems(customerService.findByName(filter.getValue()));
    }
}
