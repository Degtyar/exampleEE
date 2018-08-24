package ru.degtyar.enterprise.service;
import org.jetbrains.annotations.NotNull;
import ru.degtyar.enterprise.dao.AbstractDAO;
import ru.degtyar.enterprise.dao.CategoryDAO;
import ru.degtyar.enterprise.dto.CategoryDTO;


import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;


@Path("/CategoryService")
@WebService
public class CategoryService extends AbstractDAO {

    @Inject
    private CategoryDAO categoryDAO;

    @GET
    @NotNull
    @Path("/getListCategory")
    @WebMethod(operationName = "getListCategory")
    @Produces(MediaType.APPLICATION_JSON)
    public List<CategoryDTO> getListCategory() {
        return categoryDAO.getCategorys().stream().map(CategoryDTO::new).collect(Collectors.toList());
    }

}
