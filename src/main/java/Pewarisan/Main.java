package Pewarisan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Daftar Handphone:");
        System.out.println("1. Huawei");
        System.out.println("2. iPhone");
        System.out.println("3. Samsung");
        System.out.println("4. Vivo");
        System.out.print("Masukkan pilihan : ");
        int pilihan = scanner.nextInt();

        Phone phone;
        switch (pilihan) {
            case 1:
                phone = new Vivo();
                break;
            case 2:
                phone = new Iphone();
                break;
            case 3:
                phone = new Samsung();
                break;
            case 4:
                phone = new Huawei();
                break;
            default:
                System.out.println("Pilihan tidak valid");
                return;
        }

        PhoneUser phoneUser = new PhoneUser(phone);

        System.out.println("Apakah Anda ingin mematikan HP? (y/n)");
        String input = scanner.next();
        if (input.equals("y")) {
            phoneUser.turnOffPhone();
        } else {
            phoneUser.turnOnPhone();
        }

        System.out.println("Apakah Anda ingin menaikkan volume HP? (y/n)");
        input = scanner.next();
        if (input.equals("y")) {
            phoneUser.makePhoneLouder();
        } else {
            phoneUser.makePhoneSilent();
        }

        System.out.println("Volume HP saat ini: " + phone.getVolume());
    }
}