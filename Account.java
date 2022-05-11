import java.util.Scanner;
public class Account {
    private String customerCode;
    private String customerName;
    private int accNumber;
    private long amount;
    public void input() {
        Scanner s1 = new Scanner(System.in);
        do {
            System.out.println("Hay nhap thong tin cua ban");
            System.out.println("Hay nhap ma ");
            customerCode = s1.nextLine();
            System.out.println("hay nhap ho va ten:");
            customerName = s1.nextLine();
            System.out.println("Hay nhap so tai khoan: ");
            accNumber = s1.nextInt();
            System.out.println("Hay nhap so tien: ");
            amount = s1.nextLong();
        }while ( accNumber > 109999 || accNumber<99999  || customerCode.length() < 5 );

    }
    public void depositAndWithdraw () {
        long money;int type;
        Scanner s1 = new Scanner(System.in);
        System.out.println("0.Nap tien \n  1.Rut tien");
        type = s1.nextInt();
        System.out.println("Hay nhap tien: ");
        money =s1.nextLong();

        if (type == 0) {
            System.out.println("Ban chon gui tien" + money );
            amount = money + amount;
            System.out.println("So tien cua ban la " + amount);
        }

        if (type == 1) {
            if (money > amount) {
                System.out.println("Khong du tien de thuc hien");
            } else if (money <= amount) {
                System.out.println("Ban chon rut tien " + money );
                amount =-money;
                System.out.println("So tien cua b la " + amount);
            }
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "customerCode='" + customerCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", accNumber=" + accNumber +
                ", amount=" + amount +
                '}';
    }
}
