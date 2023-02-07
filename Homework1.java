public class Homework1 {
    public static void main(String[] args) {
        Comparator c = new Comparator();
        c.setComparator(9, 2 ,8);
        c.highest();

        SalaryScale kamal = new SalaryScale();
        kamal.setSalary(60000);
        kamal.findScale();
        SalaryScale dawa = new SalaryScale();
        dawa.setSalary(-111);
        dawa.findScale();




    }
}

class Comparator {
    private int x;
    private int y;
    private int z;

    void setComparator(int a, int b, int c) {
        x = a;
        y = b;
        z = c;
    }

    void highest() {
        if (x >= y && x >= z) { //checks 5>=4 and 5>=8
            System.out.println("highest value is: " + x);
        } else if (y >= x && y >= z) { //checks 4>=5 and 4>=8
            System.out.println("highest value is: " + y);
        } else {
            System.out.println("highest value is: " + z); //prints 8
        }

    }

}
        class SalaryScale{
            private double salary;

            void setSalary(double x){
                salary = x;
            }

            char findScale(){
                if (salary < 0){
                    System.out.println("negative salary not possible");
                    return 'I';
                }
                else if (salary <= 45000){
                    System.out.println("Your salary scale is: " + 'L');
                    return 'L';
                } else if (salary <= 80000) {
                    System.out.println("Your salary scale is: " + 'M');
                    return 'M';
                }
                else {
                    System.out.println("Your salary scale is: " + 'H');
                    return 'H';
                }
            }
        }
