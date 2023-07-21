package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, secim, newPassword;

        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı Adınızı Giriniz : ");
        userName= input.nextLine();

        System.out.println("Şifrenizi Giriniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("123")){
            System.out.println("Giriş Başarılı");
        }else if (!password.equals("123")){
            System.out.println("Şifreniz Yanlış. Değiştirmek İster misiniz ? (Evet veya Hayır Yazabilirsiniz) ");
            secim = input.nextLine();
            if (secim.equals("Evet")){
                System.out.println("Lütfen Yeni Şifrenizi Giriniz : ");
                newPassword = input.nextLine();
                if (newPassword.equals("123")){
                    System.out.println("Şifre Oluşturulamadı. Lütfen Tekrar Deneyiniz : ");
                }else {
                    System.out.println("Şifreniz Başarılı Bir Şekilde Oluşturuldu");
                }
            } else if (secim.equals("Hayır")) {
                System.out.println("Lütfen Şifrenizi Tekrar Giriniz : ");
                password = input.nextLine();

            }
        }else {
            System.out.println("Kullanıcı Adı ve Parola Giriniz : ");
        }
    }
}