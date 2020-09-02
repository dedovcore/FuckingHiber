package DAO;

import models.Model;

public interface ModelDAO {
    public boolean addModel(Model model);
    public Model getModel(String name);
}
