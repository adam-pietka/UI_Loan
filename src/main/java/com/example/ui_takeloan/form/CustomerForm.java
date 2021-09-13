package com.example.ui_takeloan.form;

import com.example.ui_takeloan.domain.Customer;
import com.example.ui_takeloan.domain.IdType;
import com.example.ui_takeloan.domain.MainView;
import com.example.ui_takeloan.service.CustomerService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;

public class CustomerForm extends FormLayout {
    private MainView mainView;
    private CustomerService customerService = CustomerService.getInstance();
    private Binder<Customer> binder = new Binder<Customer>(Customer.class);
    private Button save = new Button("Save");
    private Button delete = new Button("Delete");

    private TextField name = new TextField("Name");
    private TextField surname = new TextField("Surname");
    private TextField peselNumber = new TextField("Number PESEL");
    private ComboBox<IdType> idType = new ComboBox<>("ID type");


    public CustomerForm(MainView mainView) {
        idType.setItems(IdType.values());
        HorizontalLayout buttons = new HorizontalLayout(save, delete);
        save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        add(name,surname,peselNumber,idType, buttons);
        binder.bindInstanceFields(this);
        this.mainView = mainView;
        save.addClickListener(event -> save());
        delete.addClickListener(event -> delete());
    }

    private void delete() {
        Customer customer = binder.getBean();
        customerService.delete(customer);
        mainView.refresh();
        setCustomer(null);
    }

    private void save() {
        Customer customer = binder.getBean();
        customerService.save(customer);
        mainView.refresh();
        setCustomer(null);
    }

    private void setCustomer(Customer customer) {
        binder.setBean(customer);
        if (customer == null){
            setVisible(false);
        } else {
            setVisible(true);
            name.focus();
        }
    }


}
