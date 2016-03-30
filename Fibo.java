/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibo;

/**
 *
 * @author Praktikan
 */
import javax.swing.JOptionPane;
public class Fibo
{
 public static void main(String[]args)
 {
  int a = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai awal Deret Fibonacci"));
  int b = a;
  int c = Integer.parseInt(JOptionPane.showInputDialog("Masukkan deret Fibonacci yang Anda Inginkan: "));
  int d = c-1;
  int e = 1;
  System.out.print(a + " ");
  while(e <=d)
  {
   System.out.print(a +" ");
   a = a+b;
   b = a-b;
   e++;
  }
 }
}
