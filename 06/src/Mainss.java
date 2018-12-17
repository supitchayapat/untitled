import java.util.Comparator;

public class Mainss {
    public static void main(String[] args) {
        BankAccount[] bankAccounts = {new BankAccount(12, "1232"), new BankAccount(45, "2131"),new BankAccount(5,"123")};
        sort(bankAccounts,new SortComparable());

        for (BankAccount bankAccount : bankAccounts) {
            System.out.println(bankAccount.getBalance());;
        }

    }

    public static void sort(Object[] a, Comparator cmp) {
        for (int i = 0; i < a.length - 1; i++) {// i แบ่งส่วนเรียงแล้วกับยังไม่เรียง
            int minPos = i;
            for (int j = i + 1; j < a.length; j++) { // วนลูปหาค่าน้อยสุด
                if (cmp.compare(a[j], a[minPos]) < 0) {
                    minPos = j;
                }
            }
// สลับข้อมูลใน minPos และ i ทําให้ข้อมูลใน minPos ไปอยู่ส่วนที่เรียงแล้ว
            Object temp = a[minPos];
            a[minPos] = a[i];
            a[i] = temp;
        }
    }
}
