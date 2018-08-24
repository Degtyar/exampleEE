package ru.degtyar.enterprise.interceptor;

import ru.degtyar.enterprise.dao.LogDAO;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;
import java.util.logging.Logger;

@ApplicationScoped
public class LogInterceptor {

    @Inject
    LogDAO logDAO = new LogDAO();

    private static final Logger LOGGER = Logger.getLogger(LogInterceptor.class.getSimpleName());

    @AroundInvoke
    public Object addLog(InvocationContext context) throws Exception {
        logDAO.logBD(context.getMethod().getName());
        LOGGER.info(context.getMethod().getName());
        return context.proceed();
    }

}
