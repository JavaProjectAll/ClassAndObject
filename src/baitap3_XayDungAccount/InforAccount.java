package baitap3_XayDungAccount;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InforAccount {
    public static void main(String[] args) throws Exception{
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2004");

        Account acc = new Account(01, 1000000, 5.5, date);
        System.out.println("ID = " + acc.getId());
        System.out.println("Số tiền = " + acc.getBalance());
        System.out.println("Thời gian tạo tài khoản " + acc.getDateCreated());
        System.out.println("Phần trăm lãi theo năm " + acc.getAnnuallnterestRate() + " %");
        System.out.println("Phần trăm lãi hàng tháng " + acc.getMonthlyInteresRate() + " %");
        System.out.println("Tiền lãi hàng tháng " + acc.withdraw());
        System.out.println("Tiền gửi thêm " + acc.deposit(5000000));
    }
}
