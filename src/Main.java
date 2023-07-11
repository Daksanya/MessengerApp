import java.util.Scanner;

interface  MessagingService {
    void sendMessage();
}

class SMSMessagingService implements MessagingService{
    public void sendMessage(){
        System.out.println("Enter Mobile Number of the recipient:");
        Scanner sc = new Scanner(System.in);
        String phoneNum=sc.nextLine();
        String regex=("^\\d{10}$");
        if(phoneNum.matches(regex)){
            System.out.println("Enter Message:");
            String message=sc.nextLine();
            System.out.println("Message sent successfully");
        }
        else{
            System.out.println("Please enter a valid phone number");
        }
    }
}
class EmailMessagingService implements MessagingService{
        public void sendMessage(){
            System.out.println("Enter Email address of the recipient:");
            Scanner sc = new Scanner(System.in);
            String email=sc.nextLine();
            String regex=("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
            if(email.matches(regex)){
                System.out.println("Enter Subject:");
                String subject=sc.nextLine();
                System.out.println("Enter Message:");
                String message=sc.nextLine();
                System.out.println("Message sent successfully");
            }
            else{
                System.out.println("Please enter a valid email address");
            }
        }


}
class WhatsAppMessagingService implements MessagingService{
    public void sendMessage(){
        System.out.println("Enter Mobile Number of the recipient:");
        Scanner sc = new Scanner(System.in);
        String phoneNum=sc.nextLine();
        String regex=("^\\d{10}$");
        if(phoneNum.matches(regex)){
            System.out.println("Enter y if the contact is in WhatsApp and n if not:");
            String wtsap=sc.nextLine();
            if(wtsap.equals("y")) {
                System.out.println("Enter Message:");
                String message = sc.nextLine();
                System.out.println("Message sent successfully");
            }
            else{
                System.out.println("Enter a number registered in Whatsapp");
            }
        }
        else{
            System.out.println("Please enter a valid phone number");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MessagingService smsMessage=new SMSMessagingService();
        MessagingService emailMessage=new EmailMessagingService();
        MessagingService whatsAppMessage=new WhatsAppMessagingService();
        boolean t=true;
        while (t){
            System.out.println("Enter 1 for SMS Messaging Service");
            System.out.println("Enter 2 for Email Messaging Service");
            System.out.println("Enter 3 for Whatsapp Messaging Service");
            System.out.println("Enter 4 to exit");
            int option=sc.nextInt();
            switch (option){
                case 1:
                    smsMessage.sendMessage();
                    break;
                case 2:
                    emailMessage.sendMessage();
                    break;
                case 3:
                    whatsAppMessage.sendMessage();
                    break;
                case 4:
                    t=false;
                    break;
                default:
                    System.out.println("Enter a valid option");

            }

        }

    }
}