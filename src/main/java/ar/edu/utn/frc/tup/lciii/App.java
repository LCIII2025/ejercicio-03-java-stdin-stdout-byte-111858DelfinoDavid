package ar.edu.utn.frc.tup.lciii;

import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

/**
 * Stdin & Stdout!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        Optional<Byte> a=isByte(scan.nextLine());
        Optional<Byte> b=isByte(scan.nextLine());
        Optional<Byte> c=isByte(scan.nextLine());

        System.out.println(a.get().byteValue());
        System.out.println(b.get().byteValue());
        System.out.println(c.get().byteValue());

    }
    public static Optional<Byte> isByte(String  in){
        try{
            byte value= Byte.parseByte(in);
            return Optional.of(value);
        }catch(NumberFormatException e){
            throw new InputMismatchException();
        }
    }



}
