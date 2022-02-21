public class App30 {
    public static void main(String[] args)  {
    int n, sodu, tong = 0;
Scanner Scanner = new Scanner(System.in);
System.out.println("nhap vao so nguyen duong bat ki: ");
n = Scanner.nextInt();
while (n > 0) {
    sodu = n % 10;
    n = n / 10;
    tong += sodu;
}
System.out.println("tong cac chu so =" + tong);
}
