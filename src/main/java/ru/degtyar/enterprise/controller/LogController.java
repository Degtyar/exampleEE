package ru.degtyar.enterprise.controller;

import ru.degtyar.enterprise.dao.LogDAO;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ViewScoped
@ManagedBean
public class LogController {

    @Inject
    private LogDAO logDAO;

}