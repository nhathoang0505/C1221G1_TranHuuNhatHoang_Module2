package c08_quan_ly_tai_khoan_ngan_hang.services;

import c08_quan_ly_tai_khoan_ngan_hang.utils.NotFoundBankAccountException;

public interface IService {
    void add();
    void display();
    void delete() throws NotFoundBankAccountException;
    void searching();
}
