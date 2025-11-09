import java.util.Scanner;
public class HotelProject {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Pandia's\n2.A2B\n3.Thalapakatti\n4.Amma Canteen");
        System.out.println("------------------------------------------------------");
        System.out.print("Select Hotels : ");
        int a = sc.nextInt();
        switch(a) {
            case 1 :
            System.out.println("1.Pandia's");
            System.out.println("------------------------------------------------------");
            System.out.println("All Biriyani dishes are Available.");
            System.out.println("------------------------------------------------------");
            System.out.println("1.Mutton Biriyani\n2.Chicken Biriyani\n3.Prawn Biriyani\n4.Fish Biriyani");
            System.out.println("------------------------------------------------------");
            System.out.print("Select The dishes : ");
            int b = sc.nextInt();
            switch (b) {
                case 1 :
                System.out.println("1.Mutton Biriyani");
                System.out.println("------------------------------------------------------");
                System.out.println("Price is 250 Rs..");
                System.out.print("Select your Quantity : ");
                int quantity = sc.nextInt();
                double price = 250;
                double total = quantity*price;
                System.out.println("Total Price is : " + total);
                System.out.println("------------------------------------------------------");
                System.out.println("1.GPay\n2.PhonePay\n3.Paytm");
                System.out.println("------------------------------------------------------");
                System.out.print("Enter payment method : ");
                int payment = sc.nextInt();
                switch (payment) {
                    case 1 :
                    System.out.println("GPay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 2 :
                    System.out.println("PhonePay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 3 :
                    System.out.println("Paytm");
                    System.out.println("------------------------------------------------------");
                    break;
                    default :
                    System.out.println("Please Enter above payment method.");
                    System.out.println("------------------------------------------------------");
                    break;
                }
                int sys_otp = 100000 + (int)(Math.random()*900000);
                System.out.println("Sending otp to your registered mobile number...");
                Thread.sleep(1500);
                System.out.println(sys_otp);
                System.out.println("Enter the otp : ");
                int user_otp = sc.nextInt();
                System.out.println("OTP verification Successfully.");
                System.out.println("------------------------------------------------------");
                System.out.println(total + " Rupees Received.");
                System.out.println("------------------------------------------------------");
                System.out.println("Payment Process Successfully...");
                System.out.println("------------------------------------------------------");
                System.out.println("Thank You For Visiting This Hotel... See You Again...");
                System.out.println("------------------------------------------------------");
                break;
                case 2 :
                System.out.println("2.Chicken Biriyani");
                System.out.println("------------------------------------------------------");
                System.out.println("Price is 220 Rs..");
                System.out.print("Select your Quantity : ");
                int quantity1 = sc.nextInt();
                double price1 = 220;
                double total1 = quantity1*price1;
                System.out.println("Total Price is : " + total1);
                System.out.println("------------------------------------------------------");
                System.out.println("1.GPay\n2.PhonePay\n3.Paytm");
                System.out.println("------------------------------------------------------");
                System.out.print("Enter payment method : ");
                int payment1 = sc.nextInt();
                switch (payment1) {
                    case 1 :
                    System.out.println("GPay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 2 :
                    System.out.println("PhonePay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 3 :
                    System.out.println("Paytm");
                    System.out.println("------------------------------------------------------");
                    break;
                    default :
                    System.out.println("Please Enter above payment method.");
                    System.out.println("------------------------------------------------------");
                }
                int sys_otp1 = 100000 + (int)(Math.random()*900000);
                System.out.println("Sending otp to your registered mobile number...");
                Thread.sleep(1500);
                System.out.println(sys_otp1);
                System.out.println("Enter the otp : ");
                int user_otp1 = sc.nextInt();
                System.out.println("OTP verification Successfully.");
                System.out.println("------------------------------------------------------");
                System.out.println(total1 + " Rupees Received.");
                System.out.println("------------------------------------------------------");
                System.out.println("Payment Process Successfully...");
                System.out.println("------------------------------------------------------");
                System.out.println("Thank You For Visiting This Hotel... See You Again...");
                System.out.println("------------------------------------------------------");
                break;
                case 3 :
                System.out.println("3.Prawn Biriyani");
                System.out.println("------------------------------------------------------");
                System.out.println("Price is 250 Rs..");
                System.out.print("Select your Quantity : ");
                int quantity2 = sc.nextInt();
                double price2 = 250;
                double total2 = quantity2*price2;
                System.out.println("Total Price is : " + total2);
                System.out.println("------------------------------------------------------");
                System.out.println("1.GPay\n2.PhonePay\n3.Paytm");
                System.out.println("------------------------------------------------------");
                System.out.print("Enter payment method : ");
                int payment2 = sc.nextInt();
                switch (payment2) {
                    case 1 :
                    System.out.println("GPay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 2 :
                    System.out.println("PhonePay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 3 :
                    System.out.println("Paytm");
                    System.out.println("------------------------------------------------------");
                    break;
                    default :
                    System.out.println("Please Enter above payment method.");
                    System.out.println("------------------------------------------------------");
                }
                int sys_otp2 = 100000 + (int)(Math.random()*900000);
                System.out.println("Sending otp to your registered mobile number...");
                Thread.sleep(1500);
                System.out.println(sys_otp2);
                System.out.println("Enter the otp : ");
                int user_otp2 = sc.nextInt();
                System.out.println("OTP verification Successfully.");
                System.out.println("------------------------------------------------------");
                System.out.println(total2 + " Rupees Received.");
                System.out.println("------------------------------------------------------");
                System.out.println("Payment Process Successfully...");
                System.out.println("------------------------------------------------------");
                System.out.println("Thank You For Visiting This Hotel... See You Again...");
                System.out.println("------------------------------------------------------");
                break;
                case 4 :
                System.out.println("4.Fish Biriyani");
                System.out.println("------------------------------------------------------");
                System.out.println("Price is 240 Rs..");
                System.out.print("Select your Quantity : ");
                int quantity3 = sc.nextInt();
                double price3 = 240;
                double total3 = quantity3*price3;
                System.out.println("Total Price is : " + total3);
                System.out.println("------------------------------------------------------");
                System.out.println("1.GPay\n2.PhonePay\n3.Paytm");
                System.out.println("------------------------------------------------------");
                System.out.print("Enter payment method : ");
                int payment3 = sc.nextInt();
                switch (payment3) {
                    case 1 :
                    System.out.println("GPay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 2 :
                    System.out.println("PhonePay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 3 :
                    System.out.println("Paytm");
                    System.out.println("------------------------------------------------------");
                    break;
                    default :
                    System.out.println("Please Enter above payment method.");
                    System.out.println("------------------------------------------------------");
                }
                int sys_otp3 = 100000 + (int)(Math.random()*900000);
                System.out.println("Sending otp to your registered mobile number...");
                Thread.sleep(1500);
                System.out.println(sys_otp3);
                System.out.println("Enter the otp : ");
                int user_otp3 = sc.nextInt();
                System.out.println("OTP verification Successfully.");
                System.out.println("------------------------------------------------------");
                System.out.println(total3 + " Rupees Received.");
                System.out.println("------------------------------------------------------");
                System.out.println("Payment Process Successfully...");
                System.out.println("------------------------------------------------------");
                System.out.println("Thank You For Visiting This Hotel... See You Again...");
                System.out.println("------------------------------------------------------");
                break;
                default :
                System.out.println("Invalid dish name please try again another name.");
                break;
            }
            break;
            case 2 : System.out.println("2.A2B");
            System.out.println("------------------------------------------------------");
            System.out.println("All tiffin Dishes Are Available.");
            System.out.println("------------------------------------------------------");
            System.out.println("1.Idli\n2.Pongal\n3.Poori\n4.Dosa");
            System.out.println("------------------------------------------------------");
            System.out.print("Select The dishes : ");
            int c = sc.nextInt();
            switch (c) {
                case 1 :
                System.out.println("1.Idli");
                System.out.println("------------------------------------------------------");
                System.out.println("Price is 10 Rs..");
                System.out.print("Select your Quantity : ");
                int quantity = sc.nextInt();
                double price = 10;
                double total = quantity*price;
                System.out.println("Total Price is : " + total);
                System.out.println("------------------------------------------------------");
                System.out.println("1.GPay\n2.PhonePay\n3.Paytm");
                System.out.println("------------------------------------------------------");
                System.out.print("Enter payment method : ");
                int payment = sc.nextInt();
                switch (payment) {
                    case 1 :
                    System.out.println("GPay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 2 :
                    System.out.println("PhonePay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 3 :
                    System.out.println("Paytm");
                    System.out.println("------------------------------------------------------");
                    break;
                    default :
                    System.out.println("Please Enter above payment method.");
                    System.out.println("------------------------------------------------------");
                }
                int sys_otp = 100000 + (int)(Math.random()*900000);
                System.out.println("Sending otp to your registered mobile number...");
                Thread.sleep(1500);
                System.out.println(sys_otp);
                System.out.println("Enter the otp : ");
                int user_otp = sc.nextInt();
                System.out.println("OTP verification Successfully.");
                System.out.println("------------------------------------------------------");
                System.out.println(total + " Rupees Received.");
                System.out.println("------------------------------------------------------");
                System.out.println("Payment Process Successfully...");
                System.out.println("------------------------------------------------------");
                System.out.println("Thank You For Visiting This Hotel... See You Again...");
                System.out.println("------------------------------------------------------");
                break;
                case 2 :
                System.out.println("2.Pongal");
                System.out.println("------------------------------------------------------");
                System.out.println("Price is 40 Rs..");
                System.out.print("Select your Quantity : ");
                int quantity1 = sc.nextInt();
                double price1 = 40;
                double total1 = quantity1*price1;
                System.out.println("Total Price is : " + total1);
                System.out.println("------------------------------------------------------");
                System.out.println("1.GPay\n2.PhonePay\n3.Paytm");
                System.out.println("------------------------------------------------------");
                System.out.print("Enter payment method : ");
                int payment1 = sc.nextInt();
                switch (payment1) {
                    case 1 :
                    System.out.println("GPay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 2 :
                    System.out.println("PhonePay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 3 :
                    System.out.println("Paytm");
                    System.out.println("------------------------------------------------------");
                    break;
                    default :
                    System.out.println("Please Enter above payment method.");
                    System.out.println("------------------------------------------------------");
                }
                int sys_otp1 = 100000 + (int)(Math.random()*900000);
                System.out.println("Sending otp to your registered mobile number...");
                Thread.sleep(1500);
                System.out.println(sys_otp1);
                System.out.println("Enter the otp : ");
                int user_otp1 = sc.nextInt();
                System.out.println("OTP verification Successfully.");
                System.out.println("------------------------------------------------------");
                System.out.println(total1 + " Rupees Received.");
                System.out.println("------------------------------------------------------");
                System.out.println("Payment Process Successfully...");
                System.out.println("------------------------------------------------------");
                System.out.println("Thank You For Visiting This Hotel... See You Again...");
                System.out.println("------------------------------------------------------");
                break;
                case 3 :
                System.out.println("3.Poori");
                System.out.println("------------------------------------------------------");
                System.out.println("Price is 30 Rs..");
                System.out.print("Select your Quantity : ");
                int quantity2 = sc.nextInt();
                double price2 = 30;
                double total2 = quantity2*price2;
                System.out.println("Total Price is : " + total2);
                System.out.println("------------------------------------------------------");
                System.out.println("1.GPay\n2.PhonePay\n3.Paytm");
                System.out.println("------------------------------------------------------");
                System.out.print("Enter payment method : ");
                int payment2 = sc.nextInt();
                switch (payment2) {
                    case 1 :
                    System.out.println("GPay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 2 :
                    System.out.println("PhonePay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 3 :
                    System.out.println("Paytm");
                    System.out.println("------------------------------------------------------");
                    break;
                    default :
                    System.out.println("Please Enter above payment method.");
                    System.out.println("------------------------------------------------------");
                }
                int sys_otp2 = 100000 + (int)(Math.random()*900000);
                System.out.println("Sending otp to your registered mobile number...");
                Thread.sleep(1500);
                System.out.println(sys_otp2);
                System.out.println("Enter the otp : ");
                int user_otp2 = sc.nextInt();
                System.out.println("OTP verification Successfully.");
                System.out.println("------------------------------------------------------");
                System.out.println(total2 + " Rupees Received.");
                System.out.println("------------------------------------------------------");
                System.out.println("Payment Process Successfully...");
                System.out.println("------------------------------------------------------");
                System.out.println("Thank You For Visiting This Hotel... See You Again...");
                System.out.println("------------------------------------------------------");
                break;
                case 4 :
                System.out.println("4.Dosa");
                System.out.println("------------------------------------------------------");
                System.out.println("Price is 60 Rs..");
                System.out.print("Select your Quantity : ");
                int quantity3 = sc.nextInt();
                double price3 = 60;
                double total3 = quantity3*price3;
                System.out.println("Total Price is : " + total3);
                System.out.println("------------------------------------------------------");
                System.out.println("1.GPay\n2.PhonePay\n3.Paytm");
                System.out.println("------------------------------------------------------");
                System.out.print("Enter payment method : ");
                int payment3 = sc.nextInt();
                switch (payment3) {
                    case 1 :
                    System.out.println("GPay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 2 :
                    System.out.println("PhonePay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 3 :
                    System.out.println("Paytm");
                    System.out.println("------------------------------------------------------");
                    break;
                    default :
                    System.out.println("Please Enter above payment method.");
                    System.out.println("------------------------------------------------------");
                }
                int sys_otp3 = 100000 + (int)(Math.random()*900000);
                System.out.println("Sending otp to your registered mobile number...");
                Thread.sleep(1500);
                System.out.println(sys_otp3);
                System.out.println("Enter the otp : ");
                int user_otp3 = sc.nextInt();
                System.out.println("OTP verification Successfully.");
                System.out.println("------------------------------------------------------");
                System.out.println(total3 + " Rupees Received.");
                System.out.println("------------------------------------------------------");
                System.out.println("Payment Process Successfully...");
                System.out.println("------------------------------------------------------");
                System.out.println("Thank You For Visiting This Hotel... See You Again...");
                System.out.println("------------------------------------------------------");
                break;
                default :
                System.out.println("Invalid dish name please try again another name.");
                break;
            }
            break;
            case 3 : System.out.println("3.Thalapakatti");
            System.out.println("------------------------------------------------------");
            System.out.println("Biriyani Dishes Are Available.");
            System.out.println("------------------------------------------------------");
            System.out.println("1.Mutton Biriyani\n2.Chicken Biriyani\n3.Prawn Biriyani\n4.Fish Biriyani");
            System.out.println("------------------------------------------------------");
            System.out.print("Select The dishes : ");
            int d = sc.nextInt();
            switch (d) {
                case 1 :
                System.out.println("1.Mutton Biriyani");
                System.out.println("------------------------------------------------------");
                System.out.println("Price is 400 Rs..");
                System.out.print("Select your Quantity : ");
                int quantity = sc.nextInt();
                double price = 400;
                double total = quantity*price;
                System.out.println("Total Price is : " + total);
                System.out.println("------------------------------------------------------");
                System.out.println("1.GPay\n2.PhonePay\n3.Paytm");
                System.out.println("------------------------------------------------------");
                System.out.print("Enter payment method : ");
                int payment = sc.nextInt();
                switch (payment) {
                    case 1 :
                    System.out.println("GPay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 2 :
                    System.out.println("PhonePay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 3 :
                    System.out.println("Paytm");
                    System.out.println("------------------------------------------------------");
                    break;
                    default :
                    System.out.println("Please Enter above payment method.");
                    System.out.println("------------------------------------------------------");
                }
                int sys_otp = 100000 + (int)(Math.random()*900000);
                System.out.println("Sending otp to your registered mobile number...");
                Thread.sleep(1500);
                System.out.println(sys_otp);
                System.out.println("Enter the otp : ");
                int user_otp = sc.nextInt();
                System.out.println("OTP verification Successfully.");
                System.out.println("------------------------------------------------------");
                System.out.println(total + " Rupees Received.");
                System.out.println("------------------------------------------------------");
                System.out.println("Payment Process Successfully...");
                System.out.println("------------------------------------------------------");
                System.out.println("Thank You For Visiting This Hotel... See You Again...");
                System.out.println("------------------------------------------------------");
                break;
                case 2 :
                System.out.println("2.Chicken Biriyani");
                System.out.println("------------------------------------------------------");
                System.out.println("Price is 350 Rs..");
                System.out.print("Select your Quantity : ");
                int quantity1 = sc.nextInt();
                double price1 = 350;
                double total1 = quantity1*price1;
                System.out.println("Total Price is : " + total1);
                System.out.println("------------------------------------------------------");
                System.out.println("1.GPay\n2.PhonePay\n3.Paytm");
                System.out.println("------------------------------------------------------");
                System.out.print("Enter payment method : ");
                int payment1 = sc.nextInt();
                switch (payment1) {
                    case 1 :
                    System.out.println("GPay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 2 :
                    System.out.println("PhonePay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 3 :
                    System.out.println("Paytm");
                    System.out.println("------------------------------------------------------");
                    break;
                    default :
                    System.out.println("Please Enter above payment method.");
                    System.out.println("------------------------------------------------------");
                }
                int sys_otp1 = 100000 + (int)(Math.random()*900000);
                System.out.println("Sending otp to your registered mobile number...");
                Thread.sleep(1500);
                System.out.println(sys_otp1);
                System.out.println("Enter the otp : ");
                int user_otp1 = sc.nextInt();
                System.out.println("OTP verification Successfully.");
                System.out.println("------------------------------------------------------");
                System.out.println(total1 + " Rupees Received.");
                System.out.println("------------------------------------------------------");
                System.out.println("Payment Process Successfully...");
                System.out.println("------------------------------------------------------");
                System.out.println("Thank You For Visiting This Hotel... See You Again...");
                System.out.println("------------------------------------------------------");
                break;
                case 3 :
                System.out.println("3.Prawn Biriyani");
                System.out.println("------------------------------------------------------");
                System.out.println("Price is 390 Rs..");
                System.out.print("Select your Quantity : ");
                int quantity2 = sc.nextInt();
                double price2 = 390;
                double total2 = quantity2*price2;
                System.out.println("Total Price is : " + total2);
                System.out.println("------------------------------------------------------");
                System.out.println("1.GPay\n2.PhonePay\n3.Paytm");
                System.out.println("------------------------------------------------------");
                System.out.print("Enter payment method : ");
                int payment2 = sc.nextInt();
                switch (payment2) {
                    case 1 :
                    System.out.println("GPay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 2 :
                    System.out.println("PhonePay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 3 :
                    System.out.println("Paytm");
                    System.out.println("------------------------------------------------------");
                    break;
                    default :
                    System.out.println("Please Enter above payment method.");
                    System.out.println("------------------------------------------------------");
                }
                int sys_otp2 = 100000 + (int)(Math.random()*900000);
                System.out.println("Sending otp to your registered mobile number...");
                Thread.sleep(1500);
                System.out.println(sys_otp2);
                System.out.println("Enter the otp : ");
                int user_otp2 = sc.nextInt();
                System.out.println("OTP verification Successfully.");
                System.out.println("------------------------------------------------------");
                System.out.println(total2 + " Rupees Received.");
                System.out.println("------------------------------------------------------");
                System.out.println("Payment Process Successfully...");
                System.out.println("------------------------------------------------------");
                System.out.println("Thank You For Visiting This Hotel... See You Again...");
                System.out.println("------------------------------------------------------");
                break;
                case 4 :
                System.out.println("4.Fish Biriyani");
                System.out.println("------------------------------------------------------");
                System.out.println("Price is 380 Rs..");
                System.out.print("Select your Quantity : ");
                int quantity3 = sc.nextInt();
                double price3 = 380;
                double total3 = quantity3*price3;
                System.out.println("Total Price is : " + total3);
                System.out.println("------------------------------------------------------");
                System.out.println("1.GPay\n2.PhonePay\n3.Paytm");
                System.out.println("------------------------------------------------------");
                System.out.print("Enter payment method : ");
                int payment3 = sc.nextInt();
                switch (payment3) {
                    case 1 :
                    System.out.println("GPay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 2 :
                    System.out.println("PhonePay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 3 :
                    System.out.println("Paytm");
                    System.out.println("------------------------------------------------------");
                    break;
                    default :
                    System.out.println("Please Enter above payment method.");
                    System.out.println("------------------------------------------------------");
                }
                int sys_otp3 = 100000 + (int)(Math.random()*900000);
                System.out.println("Sending otp to your registered mobile number...");
                Thread.sleep(1500);
                System.out.println(sys_otp3);
                System.out.println("Enter the otp : ");
                int user_otp3 = sc.nextInt();
                System.out.println("OTP verification Successfully.");
                System.out.println("------------------------------------------------------");
                System.out.println(total3 + " Rupees Received.");
                System.out.println("------------------------------------------------------");
                System.out.println("Payment Process Successfully...");
                System.out.println("------------------------------------------------------");
                System.out.println("Thank You For Visiting This Hotel... See You Again...");
                System.out.println("------------------------------------------------------");
                break;
                default :
                System.out.println("Invalid dish name please try again another name.");
                break;
            }
            break;
            case 4 : System.out.println("4.Amma canteen");
            System.out.println("------------------------------------------------------");
            System.out.println("Lunch Dishes Are Available.");
            System.out.println("------------------------------------------------------");
            System.out.println("1.Meals\n2.Curd Rice\n3.Tomato Rice\n4.Lemon Rice");
            System.out.println("------------------------------------------------------");
            System.out.print("Select The dishes : ");
            int e = sc.nextInt();
            switch (e) {
                case 1 :
                System.out.println("1.Meals");
                System.out.println("------------------------------------------------------");
                System.out.println("Price is 20 Rs..");
                System.out.print("Select your Quantity : ");
                int quantity = sc.nextInt();
                double price = 20;
                double total = quantity*price;
                System.out.println("Total Price is : " + total);
                System.out.println("------------------------------------------------------");
                System.out.println("1.GPay\n2.PhonePay\n3.Paytm");
                System.out.println("------------------------------------------------------");
                System.out.print("Enter payment method : ");
                int payment = sc.nextInt();
                switch (payment) {
                    case 1 :
                    System.out.println("GPay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 2 :
                    System.out.println("PhonePay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 3 :
                    System.out.println("Paytm");
                    System.out.println("------------------------------------------------------");
                    break;
                    default :
                    System.out.println("Please Enter above payment method.");
                    System.out.println("------------------------------------------------------");
                }
                int sys_otp = 100000 + (int)(Math.random()*900000);
                System.out.println("Sending otp to your registered mobile number...");
                Thread.sleep(1500);
                System.out.println(sys_otp);
                System.out.println("Enter the otp : ");
                int user_otp = sc.nextInt();
                System.out.println("OTP verification Successfully.");
                System.out.println("------------------------------------------------------");
                System.out.println(total + " Rupees Received.");
                System.out.println("------------------------------------------------------");
                System.out.println("Payment Process Successfully...");
                System.out.println("------------------------------------------------------");
                System.out.println("Thank You For Visiting This Hotel... See You Again...");
                System.out.println("------------------------------------------------------");
                break;
                case 2 :
                System.out.println("2.Curd Rice");
                System.out.println("------------------------------------------------------");
                System.out.println("Price is 10 Rs..");
                System.out.print("Select your Quantity : ");
                int quantity1 = sc.nextInt();
                double price1 = 10;
                double total1 = quantity1*price1;
                System.out.println("Total Price is : " + total1);
                System.out.println("------------------------------------------------------");
                System.out.println("1.GPay\n2.PhonePay\n3.Paytm");
                System.out.println("------------------------------------------------------");
                System.out.print("Enter payment method : ");
                int payment1 = sc.nextInt();
                switch (payment1) {
                    case 1 :
                    System.out.println("GPay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 2 :
                    System.out.println("PhonePay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 3 :
                    System.out.println("Paytm");
                    System.out.println("------------------------------------------------------");
                    break;
                    default :
                    System.out.println("Please Enter above payment method.");
                    System.out.println("------------------------------------------------------");
                }
                int sys_otp1 = 100000 + (int)(Math.random()*900000);
                System.out.println("Sending otp to your registered mobile number...");
                Thread.sleep(1500);
                System.out.println(sys_otp1);
                System.out.println("Enter the otp : ");
                int user_otp1 = sc.nextInt();
                System.out.println("OTP verification Successfully.");
                System.out.println("------------------------------------------------------");
                System.out.println(total1 + " Rupees Received.");
                System.out.println("------------------------------------------------------");
                System.out.println("Payment Process Successfully...");
                System.out.println("------------------------------------------------------");
                System.out.println("Thank You For Visiting This Hotel... See You Again...");
                System.out.println("------------------------------------------------------");
                break;
                case 3 :
                System.out.println("3.Tomato Rice");
                System.out.println("------------------------------------------------------");
                System.out.println("Price is 15 Rs..");
                System.out.print("Select your Quantity : ");
                int quantity2 = sc.nextInt();
                double price2 = 15;
                double total2 = quantity2*price2;
                System.out.println("Total Price is : " + total2);
                System.out.println("------------------------------------------------------");
                System.out.println("1.GPay\n2.PhonePay\n3.Paytm");
                System.out.println("------------------------------------------------------");
                System.out.print("Enter payment method : ");
                int payment2 = sc.nextInt();
                switch (payment2) {
                    case 1 :
                    System.out.println("GPay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 2 :
                    System.out.println("PhonePay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 3 :
                    System.out.println("Paytm");
                    System.out.println("------------------------------------------------------");
                    break;
                    default :
                    System.out.println("Please Enter above payment method.");
                    System.out.println("------------------------------------------------------");
                }
                int sys_otp2 = 100000 + (int)(Math.random()*900000);
                System.out.println("Sending otp to your registered mobile number...");
                Thread.sleep(1500);
                System.out.println(sys_otp2);
                System.out.println("Enter the otp : ");
                int user_otp2 = sc.nextInt();
                System.out.println("OTP verification Successfully.");
                System.out.println("------------------------------------------------------");
                System.out.println(total2 + " Rupees Received.");
                System.out.println("------------------------------------------------------");
                System.out.println("Payment Process Successfully...");
                System.out.println("------------------------------------------------------");
                System.out.println("Thank You For Visiting This Hotel... See You Again...");
                System.out.println("------------------------------------------------------");
                break;
                case 4 :
                System.out.println("4.Lemon Rice");
                System.out.println("------------------------------------------------------");
                System.out.println("Price is 15 Rs..");
                System.out.print("Select your Quantity : ");
                int quantity3 = sc.nextInt();
                double price3 = 15;
                double total3 = quantity3*price3;
                System.out.println("Total Price is : " + total3);
                System.out.println("------------------------------------------------------");
                System.out.println("1.GPay\n2.PhonePay\n3.Paytm");
                System.out.println("------------------------------------------------------");
                System.out.print("Enter payment method : ");
                int payment3 = sc.nextInt();
                switch (payment3) {
                    case 1 :
                    System.out.println("GPay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 2 :
                    System.out.println("PhonePay");
                    System.out.println("------------------------------------------------------");
                    break;
                    case 3 :
                    System.out.println("Paytm");
                    System.out.println("------------------------------------------------------");
                    break;
                    default :
                    System.out.println("Please Enter above payment method.");
                    System.out.println("------------------------------------------------------");
                }
                int sys_otp3 = 100000 + (int)(Math.random()*900000);
                System.out.println("Sending otp to your registered mobile number...");
                Thread.sleep(1500);
                System.out.println(sys_otp3);
                System.out.println("Enter the otp : ");
                int user_otp3 = sc.nextInt();
                System.out.println("OTP verification Successfully.");
                System.out.println("------------------------------------------------------");
                System.out.println(total3 + " Rupees Received.");
                System.out.println("------------------------------------------------------");
                System.out.println("Payment Process Successfully...");
                System.out.println("------------------------------------------------------");
                System.out.println("Thank You For Visiting This Hotel... See You Again...");
                System.out.println("------------------------------------------------------");
                break;
                default :
                System.out.println("Invalid dish name please try again another name.");
            }
            break;
            default : System.out.println("Your Choosing Invalid Please Try Again...");
        }
    }
}