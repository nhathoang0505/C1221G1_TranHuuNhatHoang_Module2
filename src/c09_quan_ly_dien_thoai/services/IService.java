package c09_quan_ly_dien_thoai.services;

import c09_quan_ly_dien_thoai.utils.NotFoundProductException;

public interface IService {
    void add();

    void delete() throws NotFoundProductException;

    void display();

    void search();
}
