package controller;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import diq.Company;
import view.Me_n_u;

public class CompanyManagement extends Me_n_u {

    private Company company;

    public CompanyManagement() throws ParseException {

        super("danh sach lua chon", new String[]{"In ra danh sach khach hang", "Tim kiem khach hang", "Them khach hang moi", "Thay doi so dien thoai", "Thong ke khach hang", "Thoat"});
        company = new Company();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                company.PrintCustomer();
                break;
            case 2:
                company.searchCustomer();
                break;
            case 3: {
                try {
                    company.addNewCustomer();
                } catch (ParseException ex) {
                    Logger.getLogger(CompanyManagement.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;

            case 4:
                company.changephoneCustomer();

                break;
            case 5:
                company.customerStatistical();
                break;
            case 6:
                System.out.println("Bye!");
                break;
            default:
                System.out.println("Khong hop le vui long chon tu 1 den 5");
                break;
        }
    }
}
