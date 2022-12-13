/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int pembilang, penyebut, hasil;
System.out.print("Masukan pembilang >> ");
pembilang = input.nextInt();
System.out.print("Masukan penyebut >> ");
penyebut = input.nextInt();
hasil = pembilang / penyebut;
System.out.println(pembilang + " / " + penyebut + " = " + hasil);
}
}