import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner inp=new Scanner(System.in);

        String userName,password,password1,tercih;

        System.out.print("Kullanıcı Adınızı Giriniz:");
        userName=inp.nextLine();
        System.out.print("Parolanızı Giriniz:");
        password=inp.nextLine();

        if(userName.equals("isa") && password.equals("Password1")){
            System.out.print("Tebrikler Giriş Yaptınız.");
        }
       else{
            System.out.print("Hatalı giriş.Şifrenizi sıfırlamak istermisiniz? 'evet' & 'hayır':");
            tercih=inp.nextLine();
            if(tercih.equals("evet")){
                System.out.print("Lütfen yeni şifrenizi giriniz?" +
                        "(Yeni oluşturacağınız şifre bir önceki şifrenizle aynı olmamalıdır!"
                +"Şifreniz:");
                password1=inp.nextLine();
                if(password1.equals("Password1")){
                    System.out.print("Girmiş olduğunuz şifre bir önceki şifrenizle aynı." +
                            "Başka bir şifre belirleyin");
                    while(password1.equals("Password1")){
                        System.out.print("Girmiş olduğunuz şifre bir önceki şifrenizle aynı.");
                        System.out.println("Başka bir şifre belirleyin:");
                        password1=inp.nextLine();
                    }

                    
                }else{
                    System.out.print("Şifre değiştirme işlemi başarılı.");
                }
            }
        }

    }
}